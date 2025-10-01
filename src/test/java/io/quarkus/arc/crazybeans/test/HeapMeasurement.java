package io.quarkus.arc.crazybeans.test;

import com.sun.tools.attach.VirtualMachine;

import javax.management.MBeanServerConnection;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.util.function.Supplier;

public class HeapMeasurement extends MultiMeasurement {
    private final Supplier<Process> processBuilder;

    public HeapMeasurement(Supplier<Process> processBuilder) {
        this.processBuilder = processBuilder;
    }

    @Override
    protected int size() {
        return 2;
    }

    @Override
    protected int[] measure() throws Exception {
        long start = System.currentTimeMillis();

        // stability on kB granularity takes too long to achieve, but it's fine on the granularity of 1/4 MB
        MeasurementBuffer heapBuffer = new MeasurementBuffer(10, v -> v / 256);
        MeasurementBuffer nonHeapBuffer = new MeasurementBuffer(10, v -> v / 256);
        Process process = processBuilder.get();
        connectToJmx(process.pid(), ManagementFactory.MEMORY_MXBEAN_NAME, MemoryMXBean.class, memory -> {
            while (!(heapBuffer.isStable() && nonHeapBuffer.isStable())) {
                memory.gc();
                long usedBytesHeap = memory.getHeapMemoryUsage().getUsed();
                heapBuffer.add((int) (usedBytesHeap / 1024));
                long usedBytesNonHeap = memory.getNonHeapMemoryUsage().getUsed();
                nonHeapBuffer.add((int) (usedBytesNonHeap / 1024));
                Thread.sleep(100);
            }
        });

        long end = System.currentTimeMillis();

        int heapResult = heapBuffer.getStableValue();
        int nonHeapResult = nonHeapBuffer.getStableValue();
        System.out.println(heapResult + " kB heap, " + nonHeapResult + " kB non-heap (in " + (end - start) + " millis)");

        process.destroy();
        process.waitFor();

        return new int[]{heapResult, nonHeapResult};
    }

    private static final String CONNECTOR_ADDRESS = "com.sun.management.jmxremote.localConnectorAddress";

    private static <T> void connectToJmx(long pid, String mbeanName, Class<T> mbeanInterface, ConsumerEx<T> action) throws Exception {
        VirtualMachine vm = VirtualMachine.attach("" + pid);

        String connectorAddress = vm.getAgentProperties().getProperty(CONNECTOR_ADDRESS);
        if (connectorAddress == null) {
            vm.startLocalManagementAgent();
            connectorAddress = vm.getAgentProperties().getProperty(CONNECTOR_ADDRESS);
        }

        JMXServiceURL url = new JMXServiceURL(connectorAddress);
        try (JMXConnector connector = JMXConnectorFactory.connect(url)) {
            MBeanServerConnection connection = connector.getMBeanServerConnection();

            T mbean = ManagementFactory.newPlatformMXBeanProxy(connection, mbeanName, mbeanInterface);
            action.accept(mbean);
        }
    }
}
