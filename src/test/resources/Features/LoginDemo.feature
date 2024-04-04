Feature: test login functionality

  Background: user is logged in
    Given user is on login page
    When When user enters <username> and <password> sucessfully
    Then user is in homepage

  @smoketest
  Scenario Outline: check log in is successfull with valid credentails
    Given browser is opened sucessfully
    And user is on login page sucessfully
    When user enters <username> and <password> sucessfully
    And user clicks on login sucessfully
    Then user navigate to the home page sucessfully

    Examples: 
      | username      | password |
      | sok@gmail.com | abc123   |

  @regressiontest
  Scenario Outline: check log in is successfull with valid credentails
    Given browser is opened sucessfully
    And user is on login page sucessfully
    When user enters <username> and <password> sucessfully
    And user clicks on login sucessfully
    Then user navigate to the home page sucessfully

    Examples: 
      | username      | password |
      | sok@gmail.com | abc123   |

  @regressiontest @smoketest
  Scenario Outline: check log in is successfull with valid credentails
    Given browser is opened sucessfully
    And user is on login page sucessfully
    When user enters <username> and <password> sucessfully
    And user clicks on login sucessfully
    Then user navigate to the home page sucessfully

    Examples: 
      | username      | password |
      | sok@gmail.com | abc123   |

  @important
  Scenario Outline: check log in is successfull with valid credentails
    Given browser is opened sucessfully
    And user is on login page sucessfully
    When user enters <username> and <password> sucessfully
    And user clicks on login sucessfully
    Then user navigate to the home page sucessfully

    Examples: 
      | username      | password |
      | sok@gmail.com | abc123   |
