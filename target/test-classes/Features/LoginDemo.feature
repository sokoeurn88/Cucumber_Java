
Feature: test login functionality

  Scenario: check log in is successfull with valid credentails
    Given browser is opened sucessfully
    And user is on login page sucessfully
    When user enters username and password sucessfully
    And user clicks on login sucessfully
    Then user navigate to the home page sucessfully
