# Selenium Java Legacy Test Pack 
 
![CI](https://github.com/kallurayaankit/selenium-java-legacy/actions/workflows/ci.yml/badge.svg) 
 
A test automation framework using **Selenium WebDriver with Java**, **Maven**, **TestNG**, and the **Page Object Model**. Tests the [SauceDemo](https://www.saucedemo.com) website. 
 
## Features 
- Page Object Model (LoginPage, InventoryPage) 
- Data-driven tests with TestNG DataProvider 
- Automatic browser driver management via WebDriverManager 
- Headless execution in CI (Chrome headless mode) 
- GitHub Actions CI/CD pipeline 
 
## Tech Stack 
- Java 17 
- Maven 
- Selenium WebDriver 
- TestNG 
- WebDriverManager 
 
## How to run locally 
```bash 
# Clone the repository 
git clone https://github.com/kallurayaankit/selenium-java-legacy.git 
cd selenium-java-legacy 
 
# Run all tests (with browser UI) 
mvn clean test 
 
# Run tests in headless mode (for CI) 
mvn clean test -Dheadless=true 
``` 
 
## CI Badge 
The badge above shows the latest test status. Click it to see the full GitHub Actions workflow and download TestNG reports. 
