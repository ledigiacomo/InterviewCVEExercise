# CVE Resolution Exercise

## Overview
This Spring Boot application contains several known CVEs that need to be resolved. Your task is to identify and fix these vulnerabilities while ensuring the application continues to build and all tests pass.

## Initial Setup

### Clone this repository

git clone https://github.com/ledigiacomo/InterviewCVEExercise.git

### Ensure application builds

* Run ./gradlew clean build to verify the application builds
* Run ./gradlew test to verify all tests pass
* Application can start: ./gradlew bootRun

## Your Task

This application contains 5 CVEs that need to be addressed:

### CVE #1: Direct Dependency Vulnerability

CVE-2025-48924 - commons-lang3 vulnerability

### CVE #2: Transitive Dependency via BOM

CVE-2025-52999 - Jackson vulnerability

### CVE #3-4: Spring Framework Vulnerabilities

* CVE-2022-22965 (Spring4Shell) - Remote Code Execution
* CVE-2022-22950 - Spring Framework DoS vulnerability

### CVE #5: Spring Boot

CVE-2025-22235 - Spring Boot vulnerability

## Success Criteria

* All 5 CVEs are resolved or have resolution plans
* Application builds successfully: ./gradlew clean build
* All tests pass: ./gradlew test
* Application can start: ./gradlew bootRun

## Tips

* Use ./gradlew dependencies to inspect the dependency tree
* Use ./gradlew dependencyInsight --dependency <name> to trace specific dependencies

## Questions to Consider

* What strategies did you use to identify which dependencies needed updating?
* Where should vulnerability resolution be handled?
* When upgrading a third-party dependency how do yu determine which version you should go to?
* How would you prevent similar vulnerabilities in a production environment?

## Resources

* Spring Boot Release Notes: https://github.com/spring-projects/spring-boot/wiki
* Spring Boot Support Policy: https://spring.io/support-policy
* National Vulnerability Database: https://nvd.nist.gov/
* Maven Central (spring-boot-dependencies): https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-dependencies/2.6.6 
