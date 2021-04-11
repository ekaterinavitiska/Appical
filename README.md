# **Appical Automation task**
-   implemented using Selenide, Cucumber and Junit frameworks
`https://cucumber.io/`, `https://junit.org/`, `https://selenide.org/`

## After cloning the repo

Navigate to Appical folder.

-   run the command `mvn clean install`. It will download required dependencies

## To execute the tests locally

-   run the command `mvn test` or open the project in IDE and run either `TestRunner` class, either `BasicTest.Feature`

## Test report

-   test report is generated  after test execution and placed in \target\cucumber\index.html

## Task description
Test-Case
A: Go to the website “https://appical.net/en/”

B: Change the language to English

C. In the the ‘Customer Cases’ menu choose the ‘Pepsico’ menu item

D:Choose ‘Next case’ by scrolling down

Automation Conditions
-Perform an assertion on page B to confirm the language is indeed English
-Perform an assertion on step C to confirm you are on the right page
-Perform an assertion on step D to confirm that you are on the right page.

Technology Constraints
Choose one of the following to write your code in C# or Java using the Selenium Web Driver.
Note: Please ensure that all necessary source code files are attached with your submission.
