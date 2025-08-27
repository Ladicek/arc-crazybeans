#!/usr/bin/env bash
set -euo pipefail

if [ -z "${PATH_TO_ASYNC_PROFILER:-}" ]; then
    echo "Error: Please point PATH_TO_ASYNC_PROFILER to your AsyncProfiler installation"
    exit 1
fi

if [ $# -lt 1 ]; then
    echo "Usage: $0 <output-file-base-name>"
    exit 1
fi
FILE="$1"

JFR_FILE="${FILE}.jfr"
REPORT_FILE="${FILE}.html"
REPORT_FILE_REVERSE="${FILE}-reverse.html"

if [ -f "$JFR_FILE" ]; then
    echo "Error: File '$JFR_FILE' already exists, choose a different name"
    exit 1
fi
if [ -f "$REPORT_FILE" ]; then
    echo "Error: File '$REPORT_FILE' already exists, choose a different name"
    exit 1
fi

PROFILER_ARG_LINE="-agentpath:${PATH_TO_ASYNC_PROFILER}/lib/libasyncProfiler.so=start,alloc=100,total,event=alloc,file=$JFR_FILE" \
    mvn clean verify -Dit.test=ArcBuildTimeMeasurement -Dmeasurements=5

"${PATH_TO_ASYNC_PROFILER}/bin/jfrconv" "$JFR_FILE" --alloc --total "${REPORT_FILE}"
"${PATH_TO_ASYNC_PROFILER}/bin/jfrconv" "$JFR_FILE" --alloc --total --reverse "${REPORT_FILE_REVERSE}"

echo "Profile written to: ${REPORT_FILE}"
echo "Reverse profile written to: ${REPORT_FILE_REVERSE}"

xdg-open "${REPORT_FILE}"
xdg-open "${REPORT_FILE_REVERSE}"
