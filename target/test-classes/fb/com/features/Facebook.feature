Feature: fb login function testcase

  Scenario: fb login with valid details
    Given user lauch the "chrome" browser
    And user navigate to te url "https://www.facebook.com/"
    And user verify the login page
    And user enter the valid user name "ANISH"
    And user enter the valid password "ANISH KUMAR"
  
