
## 📂 JUnit Practice Exercises
Welcome to my **JUnit Practice Repository!** 🎉 This repository contains a collection of exercises I completed during my training sessions to strengthen my skills in JUnit testing. Each exercise showcases a practical implementation of various testing concepts, providing insights into how to ensure code quality and reliability using JUnit.

## 📑 Table of Contents

1. [📜 About the Repository](#-about-the-repository)
2. [🛠️ Key Features](#-key-features)
3. [🚀 How to Use](#-how-to-use)
4. [📓 Class Notes](#-class-notes)


## 📜 About the Repository

- **Purpose**: To demonstrate my learning and hands-on experience with JUnit, covering essential concepts such as unit testing, assertions, test annotations, and lifecycle methods.
- **Scope**: Exercises range from basic test cases to more advanced scenarios, ensuring a well-rounded understanding of JUnit testing.
- **Tools Used**:
  - **Programming Language**: Java
  - **Testing Framework**: JUnit
  - **IDE**: IntelliJ IDEA / Eclipse (as applicable)
 

## 🛠️ Key Features

- **Web Driver Initialization**:  
  A global `WebDriver` instance is used for seamless browser interaction, with `@BeforeAll` and `@AfterAll` annotations ensuring proper setup and teardown.

- **Dynamic Locator Strategies**:  
  Demonstrates diverse locator strategies for finding elements, such as:
  - **ID, CSS Selectors, Tag Names, Class Names, and XPaths**.
  - Practical use of `findElement` and `findElements` for single or multiple element selection.

- **Form Handling**:  
  Efficient form submission and validation by interacting with input fields and buttons, showcasing:
  - Data entry via locators.
  - Result validation with `Assertions`.

- **Mouse and Keyboard Actions**:  
  Implementation of advanced interactions using the `Actions` class, including:
  - Double-click, right-click, and single-click actions.
  - Keyboard input handling with `Keys`.

- **Alert Handling**:  
  Comprehensive handling of browser alerts with methods for accepting or dismissing alerts and waiting mechanisms.

- **Date Picker Interaction**:  
  Simulates user interactions with a calendar widget to select a specific date.

- **Dropdown Management**:  
  Demonstrates:
  - Static dropdown selection using the `Select` class.
  - Dynamic dropdown handling with scrolling and keyboard navigation.

- **Mouse Hover Operations**:  
  Enables hover effects using the `Actions` class for triggering dropdown menus.

- **Window and Tab Management**:  
  Efficient handling of multiple browser tabs/windows, including:
  - Switching between windows using `getWindowHandles`.
  - Managing parent and child windows separately.

- **File Uploads**:  
  Automates file uploads by specifying file paths dynamically using `System.getProperty`.

- **Web Table Scraping**:  
  Extracts and prints data from web tables, demonstrating:
  - Iteration through rows and cells.
  - CSS selectors are used for precise data extraction.

- **Frame Handling**:  
  Interacts with iframe elements by switching contexts using `driver.switchTo().frame`.

- **Implicit Waits**:  
  Uses `driver.manage().timeouts().implicitlyWait` to handle synchronization and improve test stability.

- **Page Scrolling**:  
  It includes a utility for scrolling to specific web page sections to enable seamless element interaction.


## 📓 Class Notes

I’ve documented my learning journey and insights in a detailed Google Docs file. You can explore the notes for a deeper understanding of the concepts I’ve covered.

[📝 View My Class Notes on Google Docs](https://docs.google.com/document/d/1Iz0V3nOK6YBPFcquhw01vjkpY17q-muXz_Ol6lAHjPU/edit?usp=sharing) 



## 🚀 How to Use

1. Clone the repository:

    ```bash
    git clone https://github.com/rashadkhan97/Junit-Practice-Exercise.git
    ```

2. Navigate to the project directory:

    ```bash
    cd Junit-practice-exercises
    ```

3. Open the project in your favorite Java IDE and explore the exercises!

---

This repository reflects my dedication to learning and mastering software testing using JUnit. If you find any insights or improvements, feel free to raise an issue or contribute through a pull request. 🌟
