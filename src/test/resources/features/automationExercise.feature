@automation-exercise
  Feature: Test Scenarios for Automation Exercise website

    @automation-exercise1
    Scenario: Register User
      Given AE I navigate to "Automation Exercise" website
      Then AE I verify that Home page is visible
      When AE I navigate to "Signup/Login" page
      Then AE I verify "New User Signup!" heading is visible
      When AE I enter name and email for new user
      And AE I click Signup button
      Then AE I verify ENTER ACCOUNT INFORMATION header is visible
      When AE I set Title, Password, DOB and checkboxes
#      And AE I Select checkbox Sign up for our newsletter
#      And AE I select checkbox