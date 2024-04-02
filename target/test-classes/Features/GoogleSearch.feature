Feature: test google search functionality

  Scenario: Validate google search is working fine
    Given browser is opened
    And user is on google page
    When user enter texts in text box
    And user hits enter
    Then user is navigate to search result
