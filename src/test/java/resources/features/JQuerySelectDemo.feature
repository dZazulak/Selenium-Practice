@Regression
Feature: JQuery Select

  Background: The user is on JQuery Select page
    Given The user is on the Selenium Easy website
    When The user clicks on Input forms dropdown
    When The user clicks on JQuery Select dropdown
  Scenario: As a user, I want to be able to select a country from a dropdown menu
    When The user clicks on the select country dropdown
    When The user clicks on the United States of America
    Then The user should see the dropdown populated with United States of America

  Scenario: As a user, I want to be able to select multiple states from the select state dropdown
    When The user clicks on the select state dropdown
    When The user clicks on Louisiana
    When The user clicks on the select state dropdown
    When The user clicks on Maine
    Then The user should see Louisiana and Maine populated in the dropdown

  Scenario: As a user, I want to be able to select one of US Outlying Territories from a dropdown
    When The user clicks on the US Outlying Territories dropdown
    When The user clicks on Puerto Rico
    Then The user should see Puerto Rico populated in the dropdown

  Scenario: As a user, I want to select which type of languages my file is
    When The user clicks on the select file dropdown
    When The user clicks on Java
    Then The user should see Java populated in the dropdown