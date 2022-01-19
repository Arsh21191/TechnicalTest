# TechnicalTest
Automation Test Framework
**** End to End Framework Agenda

Selenium-Java-Page object Model Framework
A Maven framework in which to build Selenium tests written in Java with Extent reports of test results.

Getting Started
Copy the repo into your local machine.

Run tests locally
Right click the HomePage.java file and Run as  "1 TestNG test".

Logging

Logging can be easily added to tests by using the static methods from the Log class.
Available logging levels are:

Logging Level
Method

Info
Log.Info("This is an info level message");

Warn
Log.Warn("This is a warning level message");

Error
Log.Info("This is an error level message");

Debug
Log.Info("This is a debug level message");

Reporting
The default reporting provided by the framework is ExtentReports.
By default, screenshots are taken after each step and after a failure (if any), which will display on each step of the report.

Built With

Selenium - Browser automation framework

Maven - Dependency management

TestNG - Testing framework

ExtentReports - Reporting framework

log4j - logging

Errors in Framework:
1. Verified all the top Navigation links in the Navigation Bar except for More Link, the script fails to open the sub-links of More Menu.
2. There are total 10 cookies on BBC page, getting error to delete all the cookies.
3. Unable to run the testNG file as the there is extentreports error which needs to be rectified.
4. Was not able to match the current day and date displayed on the BBC site with the system day and date to verify whether it is correct or not.
