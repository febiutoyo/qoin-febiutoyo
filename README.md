# Qoin Technical Test Project

This repository contains automated testing projects for Qoin technical test, consisting of two main tasks:

## Task 1: API Automation Testing with Katalon Studio

The first task contains API automation tests implemented using Katalon Studio. The project structure includes:

- `/Test Cases`: Contains all test case implementations
- `/Object Repository`: Stores API element mappings and object definitions
- `/Scripts`: Contains test scripts
- `/Keywords`: Custom keywords and reusable functions
- `/Test Suites`: Test suite configurations
- `/Reports`: Test execution reports
- `/Include`: Contains configuration files, features, and scripts

### Setup and Configuration
1. Install Katalon Studio
2. Open the project from Task 1 folder
3. Configure test environment in `console.properties`
4. Run tests through Katalon Studio GUI or command line

## Task 2: API Performance Testing with JMeter

The second task contains performance tests implemented using Apache JMeter, specifically testing TMDB API endpoints.

### Files:
- `tmdb_person_changes.jmx` - Main JMeter test script
- `run_tmdb_windows.bat` - Windows execution script
- `run_tmdb_unix.sh` - Unix/Linux execution script
- `results.jtl` - Test results file
- `/report` - Contains generated test reports

### Running Performance Tests
#### Windows:
```batch
run_tmdb_windows.bat
```

#### Unix/Linux:
```bash
./run_tmdb_unix.sh
```

## Requirements
- Katalon Studio (for Task 1)
- Apache JMeter (for Task 2)
- Java Runtime Environment (JRE)

## Reports
- Katalon test reports can be found in Task 1/Reports
- JMeter test reports are generated in Task 2/report

## Author
Febiutoyo