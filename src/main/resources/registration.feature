Feature: Registration
  As a new user
  I want to create my personal account
  So that I can have access to all functionality of website

  Scenario Outline: Check registration with invalid email
    Given User opens '<homePage>' page
    And User clicks on 'Start here' button
    When User enters username '<username>'
    And User enters email '<email>'
    And User enters password '<password>'
    And User enters password check '<password>'
    And User clicks on 'Create Account' button
    Then User checks that there is error message about invalid email '<errorMessage>' on Registration page

    Examples:
      | homePage                | username | email             | password  | errorMessage                |
      | https://www.amazon.com/ | Test123  | qwe1234qwerty.com | test1234  | Enter a valid email address |