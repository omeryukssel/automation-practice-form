<div align="center">
  <h1><br>✨ Automation Practice Form Filling Tests ✨<br></h1>
  <h3>DemoQA Form Automation with Selenium WebDriver and JUnit 5</h3>
</div>

<br/>

<p align="center">
  <a href="https://www.selenium.dev/" target="_blank">
    <img src="https://raw.githubusercontent.com/detaysoft/selenium-java-dersleri/main/images/selenium-logo.png" alt="Selenium" width="100">
  </a>
  <a href="https://junit.org/junit5/" target="_blank">
    <img src="https://junit.org/junit5/assets/img/junit5-logo.png" alt="JUnit 5" width="100">
  </a>
  <a href="https://maven.apache.org/" target="_blank">
    <img src="https://maven.apache.org/images/maven-logo-black-on-white.png" alt="Maven" width="100">
  </a>
  <a href="https://www.java.com/en/" target="_blank">
    <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Java_logo.svg/1200px-Java_logo.svg.png" alt="Java" width="100">
  </a>
</p>

<br/>

**This project aims to automatically fill and test the interactive "Automation Practice Form" page on the [DemoQA](https://demoqa.com/automation-practice-form) website using Selenium WebDriver and JUnit 5. Our goal is to demonstrate modern web automation techniques through a practical example.**

## 🚀 Table of Contents

- [🎯 Project Purpose](#-project-purpose)
- [🛠️ Technologies](#️-technologies)
- [👨‍💻 Usage](#-usage)
- [🧪 Test Scenarios](#-test-scenarios)
- [📂 File Structure](#-file-structure)

## 🎯 Project Purpose

This project showcases the power of combining Selenium WebDriver and JUnit 5 for web automation testing in a live demonstration. Our primary objectives are to:

- ✨ Automate the filling of web forms effortlessly.
- 🖱️ Simulate interactions with various input types (text fields, radio buttons, checkboxes, date pickers, file uploads, dropdowns).
- ✅ Create reliable and readable test scenarios.
- 🏗️ Enhance code organization and maintainability through the Page Object Model (POM) design pattern.

## 🛠️ Technologies

The core technologies used in this project include:

- **☕ Java:** A robust and widely-used programming language.
- **<img src="https://raw.githubusercontent.com/detaysoft/selenium-java-dersleri/main/images/selenium-logo.png" alt="Selenium" width="20"> Selenium WebDriver:** A powerful toolset for controlling web browsers programmatically.
- **<img src="https://junit.org/junit5/assets/img/junit5-logo.png" alt="JUnit 5" width="20"> JUnit 5:** A modern and flexible testing framework for Java applications.
- **📦 Maven:** A build automation and dependency management tool for Java projects.
- **⚙️ WebDriverManager:** A library that simplifies the automatic downloading and management of Selenium WebDriver drivers.

## 👨‍💻 Usage

You have a couple of options to run the test scenarios:

1.  **Run with IDE (Recommended):** Open the project in a Java IDE like IntelliJ IDEA or Eclipse. Locate the `FormDoldurmaTest.java` file in the `src/test/java/Test` directory and run the test using the IDE's JUnit runner.

2.  **Run with Maven:** Open a terminal in the project directory and execute the following Maven command:
    ```bash
    mvn test
    ```
    This command will automatically compile and run all the tests in the project.

## 🧪 Test Scenarios

Currently, the project includes the following primary test scenario:

- **`formDoldurTest()`:** Automatically fills various input fields (first name, last name, email, gender, phone number, date of birth, subjects, hobbies, picture upload, current address) on the [DemoQA Automation Practice Form](https://demoqa.com/automation-practice-form) page and simulates the form submission.

Additionally, there's a simple demonstration test method named `test()`.

## 📂 File Structure

The organized file structure of the project:

```
├── src/
│   ├── main/
│   │   └── java/
│   │       └── Sayfalar/
│   │           ├── FormAnasayfa.java  # Elements and interaction methods for the form page
│   │           └── Sayfa.java         # Base class with common methods for all page classes
│   └── test/
│       └── java/
│           └── Test/
│               └── FormDoldurmaTest.java # Test scenarios for filling the form
├── pom.xml                             # Maven configuration file (dependencies, build settings)
└── README.md                           # This file (project description)
```

