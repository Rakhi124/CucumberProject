Feature: Test the login functionality of OrangeHRM

Scenario: Test the valid login

Given user is on login page
When user enter username and password
And click on login button
Then user should land on login page
