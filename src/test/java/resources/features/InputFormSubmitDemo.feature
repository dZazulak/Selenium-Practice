@Regression
Feature: Input form submit with validations
  Scenario: As a user, I want to fill out an input form with all my information
    Given The user is on the Selenium Easy website
    When The user clicks on Input forms dropdown
    When The user clicks on the Input Form Submit
    When The user inputs their first name
    When The user inputs their last name
    When The user inputs their email
    When The user inputs their phone number
    When The user inputs their address
    When The user inputs their city
    When The user clicks on the state dropdown
    When The user clicks on their state
    When The user inputs their zip code
    When The user inputs their website
    When The user clicks on if they have hosting or not
    When The user inputs a project description
    Then The user clicks on the Send form button