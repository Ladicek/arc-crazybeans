package io.quarkus.arc.crazybeans.test;

import com.sun.tools.attach.VirtualMachine;

import javax.management.MBeanServerConnection;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import java.lang.management.ManagementFactory;

final class JMX {
    private static final String CONNECTOR_ADDRESS = "com.sun.management.jmxremote.localConnectorAddress";

    static <T> void connectAndRun(long pid, String mbeanName, Class<T> mbeanInterface, ConsumerEx<T> action) throws Exception {
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
