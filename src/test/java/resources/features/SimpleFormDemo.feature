Feature: Simple Forms Demo
  Scenario: As a user, I want to be able to input information into simple forms to show a message
    Given The user is on the Selenium Easy website
    When The user clicks on Input forms dropdown
    When The user clicks on Simple Form Demo
    When The user inputs a message into the message input box
    When The user clicks on the Show Message button
    Then The user can see the message appear in the your message output

  Scenario: As a user, I want to input values into the simple forms to show the total
    Given The user is on the Selenium Easy website
    When The user clicks on Input forms dropdown
    When The user clicks on Simple Form Demo
    When The user inputs a value into the first input box
    When the user inputs a value into the second input box
    When The user clicks on the Get Total button
    Then The user can see the value appear in the total output
