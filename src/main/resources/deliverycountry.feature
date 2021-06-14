Feature: Delivery Country
  As a user
  I want to change delivery country
  So that I can know whether product is delivered to this country

  Scenario Outline: Check changing delivery country from drop-down list
    Given User opens '<homePage>' page
    When User clicks on 'Deliver to' button
    And User checks that 'Choose your location' popup is visible
    And User clicks on drop-down list with countries
    And User clicks on country 'Sweden'
    And User clicks on 'Done' button
    Then User checks that chosen country '<country>' is written under 'Deliver to' title

    Examples:
      | homePage                | country |
      | https://www.amazon.com/ | Sweden  |