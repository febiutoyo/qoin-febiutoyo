@echo off
REM === Run JMeter load test for TMDB endpoint and generate HTML dashboard ===
setlocal

REM Change this if JMETER_HOME is not on PATH
if "%JMETER_HOME%"=="" (
  echo JMETER_HOME not set. Trying to use jmeter from PATH...
)

set TESTPLAN=tmdb_person_changes.jmx
set RESULTS=results.jtl
set REPORT_DIR=report

if exist "%REPORT_DIR%" rmdir /S /Q "%REPORT_DIR%"
if exist "%RESULTS%" del /Q "%RESULTS%"

echo Running JMeter...
jmeter -n -t "%TESTPLAN%" -l "%RESULTS%" -e -o "%REPORT_DIR%"
echo.
echo Report generated in %REPORT_DIR%

endlocal
