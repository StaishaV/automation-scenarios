@automation-exercise
  Feature: Test Scenarios for Automation Exercise website

    @automation-exercise1
    Scenario: Register User
      Given I navigate to "Automation Exercise" website
      And I wait for 3 sec
      Then I verify that home page is visible
      When I click on Signup/Login button
      Then I verify "New User Signup!" is visible
      When I enter name as "" and email as ""
      And I click Signup button
#      Then I verify "ENTER ACCOUNT INFORMATION" is visible
#      When I fill out Title, Name, Email, Password, DOB
#      And I Select checkbox Sign up for our newsletter
#      And I select checkbox