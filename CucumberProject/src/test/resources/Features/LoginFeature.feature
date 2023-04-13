Feature: Test the login functionality of OrangeHRM

  Scenario Outline: Test the valid login
    Given user is on login page
    When user enter <username> and <password>
    And click on login button
    Then user should land on login page

    Examples: 
      | username        | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |
