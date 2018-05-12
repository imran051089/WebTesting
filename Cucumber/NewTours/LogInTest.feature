Feature: NewTours Application LogIn Functionality Testing
Scenario Outline: Validate the LogIn Functionality

Given Open Firefox Browser and naivate to NewTours Application
When I enter Valid "<UserName>" and "<Password>" and click on SignIn button
Then User should be able to successfully login and Close the Application

Examples:
 
  |      UserName    |    Password   |
  |      tutorial    |    tutorial   |
  |      admin       |    mercury    |
  |      tutorial    |    tutorial   |
  |      admin       |    mercury    |