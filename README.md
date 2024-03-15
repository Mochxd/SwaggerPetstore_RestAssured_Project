# SwaggerPetstore_RestAssured_ApisProject
## Introduction
This project is a test automation framework designed to interact with a website's user management system through RESTful APIs. It provides functionalities for creating, retrieving, updating, and deleting users using RestAssured library.
## Table of Contents

- [Technologies Used](#Technologies-Used)
- [Prerequisites](#Prerequisites)
- [Overview](#Overview)
- [Installation](#Installation)
- [Project Structure](#Project-Structure)
- [Running Tests](#Running-Tests)
- [Conclusion](#Conclusion)
- [Contact](#Contact)

## Technologies Used
<a href="https://selenium.dev"><img src="https://selenium.dev/images/selenium_logo_square_green.png" width="40" height="40" alt="Selenium"/></a>
<a href="https://testng.org/"><img src="https://github.com/Mochxd/TAU_InternetDemoWebsite/assets/122634626/86a31183-1950-4cf4-bbbe-c1c1d6dc2567" width="40" height="40" alt="TestNG"/></a>
<a href="https://rest-assured.io/"><img src="https://github.com/Mochxd/SwaggerPetstore_RestAssured_Project/assets/122634626/735af872-df76-4f8e-84ff-28795f8d28f4" width="40" height="40" alt="RestAssured"/></a>
<a href="https://allurereport.org/"><img src="https://github.com/Mochxd/SwaggerPetstore_RestAssured_Project/assets/122634626/fe07103e-be9b-4b9f-9164-e7509d90f56f" width="40" height="40" alt="allure"/></a>

## Prerequisites

Before diving into the project, ensure you have the following prerequisites:

- Java (Version 8 or higher).
- Maven for project management.
- An IDE like Eclipse or IntelliJ.
- Selenium WebDriver (Java bindings).
- RestAssured.
- TestNG.
- Optionally, Allure Reports for enhanced reporting.

## Overview

The SwaggerPetstore_RestAssured_ApisProject is a test automation framework that utilizes RestAssured to interact with a website's user management system. It provides a streamlined approach to testing and validating various user-related functionalities through RESTful API requests.

## Installation

To set up the project, follow these steps:

1. Clone the repository to your local machine:
    ```
    git clone https://github.com/Mochxd/SwaggerPetstore_RestAssured_Project.git
    ```

2. Open the project in your preferred Java IDE (e.g., IntelliJ, Eclipse).
3. Install the required dependencies (Selenium WebDriver, TestNG, RestAssured) using Maven. You can do this by right-clicking on the project and selecting "Maven" -> "Update Project."

## Project Structure

The project structure is organized as follows:

- `EndPoints`: containing API endpoints.
    - `URLS.java`: Defines base URLs for API requests.
    - `UserEndPointsCRUD.java`: Defines endpoints related to user CRUD operations.
- `Payload`: Package containing classes for payload data.
    - `User.java`: Defines the structure of a user object.
- `Tests`: Contains test automation scripts.
  - `DataDrivenTests`: Package containing data-driven tests.
  - `UserTests`: Package containing tests related to user management.
- `utilities`: Package containing utility classes.
  - `DataProviders.java`: Provides data for data-driven tests.
  - `ExcelFileUtilities.java`: Contains methods for interacting with Excel files.
- `TestData`: Package containing test data.
  - `UserData.xlsx`: Excel spreadsheet containing user data.

## Running Tests

Tests are executed using TestNG. You can monitor the progress in your IDE's console.

## Conclusion

In conclusion, the SwaggerPetstore_RestAssured_ApisProject provides a robust framework for automating interactions with a website's user management system. By following the installation and setup instructions provided, you can quickly start testing and validating user-related functionalities through RESTful API requests.

## Contact

For any queries or assistance, feel free to contact me via email at [mohamedbadrxd@gmail.com](mailto:mohamedbadrxd@gmail.com). Your feedback and suggestions are greatly appreciated.
