# Android-Automation-Testing-Project

## Overview
The objective of this E-commerce mobile app testing project is to thoroughly assess the functionality, usability, and reliability of the Sauce Labs E-commerce application. To automate testing for the E-commerce mobile app (Sauce Labs) and project aims to ensure that the application meets its intended purpose and provides a seamless and satisfying experience for end-users.

## Features:- 
  Add products to the cart
  Adjust quantity and remove items
  Calculate total cost
  User-friendly interface
 
## Project Setup
  Getting Started
  Follow these steps to set up the project locally:
### APK File
Download the mobile application APK file from the following link:
APK File : https://github.com/saucelabs/sample-app-mobile/releases/download/2.2.0/Android.SauceLabs.Mobile.Sample.app.2.2.0.apk
### Test Requirements
- Java
- Maven
- Appium
- TestNG
- NodeJs
- Appium Inspector
- Android Studio
- Sauce Labs account (for parallel execution)--> username=standard_user; password=secret_sauce
 - Open the project in your preferred code editor.

# Design Patterns:
  -Page Object Model (through Page Factory)
# Customize product catalog:
Update the products.json file with your product information, including names, prices, and any additional details.
# Run the application:
# Open the terminal and navigate to the project directory - Run
# npm install
# npm start
# Visit http://localhost:4723 in your browser to use the SauceLabs Mobile App.

## Test Cases
 
### Test case-1: Login with Valid username and Password
 
- Objective: Verify successful login with valid credentials.
- Overview: This test case validates the ability to log in with a valid username and password.
- Steps:
1. Open the Sauce Labs mobile app.
2. Enter a valid username and password.
3. Click on the login button.
4. Validate that the login is performed successfully.
   
### Test case-2: Login with Invalid username or Password
 
- Objective: Validate the application's response to invalid login attempts.
- Overview: This test case checks the app's behavior when attempting to log in with invalid credentials.
- Steps:
1. Open the Sauce Labs mobile app.
2. Enter an invalid username or password.
3. Click on the login button.
4. Validate the display of an appropriate error message (Username and password do not match any user in this service).
### Test case-: Add Any Item to the Cart
 
- Objective: Ensure the ability to add items to the shopping cart.
- Overview: This test case adds an item to the cart and validates the displayed details.
- Steps:
1. Open the Sauce Labs mobile app.
2. Browse through the items.
3. Add any item to the cart.
4. Navigate to the home page.
5. Validate that the title and price of the item on the home page match the cart.
### Test case-4: Validate Removing Items from the Cart
 
- Objective: Verify the ability to remove items from the shopping cart.
- Overview: This test case ensures users can successfully remove items from the cart.
- Steps:
1. Open the Sauce Labs mobile app.
2. Add an item to the cart.
3. Navigate to the cart.
4. Remove the item from the cart.
5. Validate that the cart is empty.
### Test case-5: Online Ordering and Checkout
 
- Objective: Complete the online ordering and checkout process.
- Overview: This test case covers the end-to-end flow from adding items to the cart to successful checkout.
- Steps:
1. Open the Sauce Labs mobile app.
2. Browse through the items.
3. Add items to the cart.
4. Navigate to the cart.
5. Proceed to checkout.
6. Complete the checkout flow, providing necessary information.(First Name,Last Name,PostalCode)
7. Validate the final price and success purchase.
## Running the Tests
 
1. Ensure the project dependencies are installed using Maven:
   here are the dependency:-
<dependencies>
<!-- https://mvnrepository.com/artifact/io.appium/java-client -->
<dependency>
<groupId>io.appium</groupId>
<artifactId>java-client</artifactId>
<version>9.0.0</version>
</dependency>
 
 
        <!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
<groupId>org.testng</groupId>
<artifactId>testng</artifactId>
<version>7.6.1</version>
<scope>test</scope>
</dependency>
 
    </dependencies>

2. Adjust the Appium server configurations in the test code.
   
3. Adjust the Appium Inspector to find the locators of the element.
   ![Appium Inspector Capabilities](https://github.com/rksahani/Android-Automation-Testing-Project/assets/108575531/f7334de1-9d36-4d7b-9770-8978aa7c3286)

4. Using Android Studio to monitor the work Flow.
   Here is one example for complete purchage of an item.
   

https://github.com/rksahani/Android-Automation-Testing-Project/assets/108575531/00b4d4a2-d10b-4236-88d1-ff59d7249251


5. Finally, execute the tests! 
