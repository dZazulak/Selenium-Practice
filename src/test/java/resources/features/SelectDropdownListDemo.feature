@Regression
Feature: Select Dropdown lists
  Scenario: As a user, I want to be able to select which day of the week it is
    Given The user is on the Selenium Easy website
    When The user clicks on Input forms dropdown
    When The user clicks on the Select Dropdown List
    When The user clicks on the select day dropdown
    When The user clicks on the the day in the select day dropdown
    Then The user should see a message with the day selected
