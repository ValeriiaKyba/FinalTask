Feature: Searching on website
  As a user
  I want to able to search on the webpage
  So that I can find necessary information

  Scenario Outline: Search for an item by its name
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks on search button
    Then User checks that products names, which are shown on Search Results page, match entered '<keyword>'

    Examples:
      | homePage                | keyword |
      | https://www.amazon.com/ | Xbox    |