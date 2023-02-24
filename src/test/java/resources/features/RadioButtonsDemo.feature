@Regression
Feature: Radio Buttons Demo
  Scenario: As a user, I want to be able to click on a radio button
    Given The user is on the Selenium Easy website
    When The user clicks on Input forms dropdown
    When The user clicks on Radio Buttons Demo
    When The user clicks on the Male radio button
    When The user clicks on the Get Checked value button
    Then The user should see a message that the Male radio button is checked

  Scenario: As a user I want to be able to click on multiple radio buttons
    Given The user is on the Selenium Easy website
    When The user clicks on Input forms dropdown
    When The user clicks on Radio Buttons Demo
    When The user clicks on the Female Radio button
    When The user clicks on the age group radio button
    When The user clicks on the Get values button
    Then The user should see a message with their sex and age group