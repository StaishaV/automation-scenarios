@automation-exercise
  Feature: Test Scenarios for Automation Exercise website

    @automation-exercise1
    Scenario: Register User
      Given AE I navigate to "Automation Exercise" website
      Then AE I verify that Home page is visible
      When AE I navigate to "Signup/Login" page
#      finish step with verifying heading
      Then AE I verify "New User Signup!" heading is visible
      When AE I enter name as "" and email as ""
      And AE I click Signup button
#      Then AE I verify "ENTER ACCOUNT INFORMATION" is visible
#      When AE I fill out Title, Name, Email, Password, DOB
#      And AE I Select checkbox Sign up for our newsletter
#      And AE I select checkbox