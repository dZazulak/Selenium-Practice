@Regression
Feature: Ajax Form Submit

  Background: User is able to click past the Certificate error
    Given The user is on the Selenium Easy website
    When The certificate error pops up
    When The user clicks on the advanced button
    When The user clicks on proceed to demo.seleniumeasy.com
    Then The user should be brought to the selenium easy home page

  Scenario: As a user, I want to submit an ajax form with my name and a comment
    Given The user is on the Selenium Easy website
    When The user clicks on Input forms dropdown
    When The user clicks on the Ajax Form Submit
    When The user inputs their name in the form
    When The user inputs a comment into the form
    When The user clicks the submit button for ajax
    Then The user will see a loading icon
