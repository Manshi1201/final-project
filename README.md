# final-project

# SauceDemo Automation Testing Project

## Project Overview
This project demonstrates automated UI testing of the SauceDemo website using Selenium IDE, Selenium WebDriver, Maven, TestNG, Jenkins, and GitHub integration.

The automation flow includes:
- User login
- Product selection
- Add to cart functionality
- Cart navigation
- Logout functionality

---

## Tools & Technologies Used

- Java
- Selenium IDE
- Selenium WebDriver
- Eclipse IDE
- Maven
- TestNG
- Jenkins
- GitHub
- Microsoft Edge / Chrome Browser

---

## Website Tested

https://www.saucedemo.com/

---

## Test Scenario

The automated test performs the following actions:

1. Open SauceDemo website
2. Enter valid username and password
3. Login successfully
4. Add products to cart
5. Open cart page
6. Open side menu
7. Logout from application

---

## Project Workflow

1. Test case recorded using Selenium IDE
2. Java code exported from Selenium IDE
3. Maven project created in Eclipse IDE
4. Selenium WebDriver and TestNG configured
5. Automated test executed successfully
6. Project pushed to GitHub repository
7. Jenkins integrated with GitHub for CI/CD automation
8. Jenkins build executed successfully using Maven

---

## Maven Dependencies Used

- Selenium Java
- WebDriverManager
- TestNG

---

## Jenkins Integration

Jenkins was configured with:
- GitHub repository integration
- Maven test execution
- Automated build process

Build command used:

```bash
mvn test
