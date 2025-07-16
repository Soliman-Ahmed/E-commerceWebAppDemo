Feature: Login Functionality
  Scenario: Login with Valid Data
    Given Click on Login button
    When User Enter Valid Email Address
    And User Enter Valid Password and click on login button
    Then Assert that user login successfully


  Scenario: Login with InValid Data
    Given tap on Login button
    When Enter InValid Email Address
    And Enter Valid Password and click on login button
    Then Assert that the Login failed