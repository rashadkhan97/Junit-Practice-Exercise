
## 📂 JUnit Practice Exercises
Welcome to my **JUnit Practice Repository!** 🎉 This repository contains a collection of exercises I completed during my training sessions to strengthen my skills in JUnit testing. Each exercise showcases a practical implementation of various testing concepts, providing insights into how to ensure code quality and reliability using JUnit.

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
  - Use of CSS selectors for precise data extraction.

- **Frame Handling**:  
  Interacts with iframe elements by switching contexts using `driver.switchTo().frame`.

- **Implicit Waits**:  
  Uses `driver.manage().timeouts().implicitlyWait` to handle synchronization and improve test stability.

- **Page Scrolling**:  
  Includes utility for scrolling to specific sections of a webpage to enable seamless element interaction.
