# Suitsupply project

## Deliverables  MUST HAVE

The following deliverables are available:
* automated application tests, available in `Suitsupply/src/test/tests`
* instructions on how to run automated tests, available in `README.md`
* further framework to get complete coverage description, available in `Further framework to get complete coverage.md`
* list of improvements that I would like to see on CM configurators,  available in `List of improvements for CM configurators.md`
* list of findings in the CM Jacket configurator,  available in `CM Jacket configurator findings.md`
* test cases for the CM Jacket configurator are in Excel file: `Test cases (Suitsupply)`

## Test Execution

There are two options used for automation test execution:
- execution via the OS terminal
- execution via IDE

### Running from the command line

To start all tests, the following command should be executed (for Selenide, the Chrome browser is the default one so that UI tests will be launched in it):
```
mvn clean test
```
To run tests in firefox or IE, the following parameters should be passed as command line argument's value:
```
mvn clean test -Dselenide.browser=firefox
```
or
```
mvn clean test -Dselenide.browser=ie
```
 
### Allure report

 Report on results of testing could be generated based on the Maven Surefire plugin.
 To run report generation, it is necessary to start tests using the following command:
 ```
 mvn clean test
```
Reports could be generated using the following command (allure should be installed according to your OS: https://docs.qameta.io/allure/#_installing_a_commandline):
```
allure serve /target/surefire-reports
```
