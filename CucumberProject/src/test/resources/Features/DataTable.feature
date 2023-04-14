Feature: Test the login functionality of SwagLab using DataTable

  Scenario: Test the valid login using DataTable
    Given user is on login page
    When user enter credentials using DataTable
      | standard_user | secret_sauce |
    And click on login button
    Then user should land on login page
