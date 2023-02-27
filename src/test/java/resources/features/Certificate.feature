@Regression
Feature: Certificate - Connection is not private page
  Scenario: As a user, I want to be able to get past the connection is not private
    Given The user is on the Selenium Easy website
    When The certificate error pops up
    When The user clicks on the advanced button
    When The user clicks on proceed to demo.seleniumeasy.com
    Then The user should be brought to the selenium easy home page