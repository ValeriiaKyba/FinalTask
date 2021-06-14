Feature: Login
  As a registered user
  I want to login with my email and password
  So that I can access my personal profile

  Scenario Outline: Check login into a system with registered account
    Given User opens '<homePage>' page
    And User clicks on 'Sign in' button
    When User enters email '<email>' in Email field
    And User clicks on 'Continue' button
    And User enters password '<password>' in Password field
    And User clicks on 'Submit' button
    Then User checks that there is welcome phrase '<welcomePhrase>' on Home page

    Examples:
      | homePage                | email                   | password | welcomePhrase |
      | https://www.amazon.com/ | jebagop343@bbsaili.com  | test1234 | Hello, Test   |

  Scenario Outline: Check login into a system with non-registered email
    Given User opens '<homePage>' page
    And User clicks on 'Sign in' button
    When User enters email '<email>' in Email field
    And User clicks on 'Continue' button
    Then User checks that there is error message '<errorMessage>' on Login page

    Examples:
      | homePage                | email               | errorMessage                                      |
      | https://www.amazon.com/ | qwe1234@qwerty.com  | We cannot find an account with that email address |

