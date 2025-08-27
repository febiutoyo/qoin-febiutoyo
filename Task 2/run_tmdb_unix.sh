#!/usr/bin/env bash
# Run JMeter load test for TMDB endpoint and generate HTML dashboard
set -euo pipefail

TESTPLAN="tmdb_person_changes.jmx"
RESULTS="results.jtl"
REPORT_DIR="report"

rm -rf "$REPORT_DIR" || true
rm -f "$RESULTS" || true

echo "Running JMeter..."
jmeter -n -t "$TESTPLAN" -l "$RESULTS" -e -o "$REPORT_DIR"
echo "Report generated in $REPORT_DIR"
