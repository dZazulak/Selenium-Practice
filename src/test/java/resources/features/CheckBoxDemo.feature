@Functional
Feature: Checkbox Demo
  Scenario: As a user I want to be able to click on a checkbox to get the success message
    Given The user is on the Selenium Easy website
    When The user clicks on Input forms dropdown
    When The user clicks on Checkbox Demo
    When The user clicks on the Click on this check box
    Then The user should see a success message


  Scenario: As a user I want to be able to click on multiple different checkboxes to see if the button will change
    Given The user is on the Selenium Easy website
    When The user clicks on Input forms dropdown
    When The user clicks on Checkbox Demo
    When The user clicks on the Option one checkbox
    When The user clicks on the Option two checkbox
    When The user clicks on the Option three checkbox
    When The user clicks on the Option four checkbox
    Then The user should see that the button says Uncheck All