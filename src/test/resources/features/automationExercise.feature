@automation-exercise
  Feature: Test Scenarios for Automation Exercise website

    @automation-exercise1
    Scenario: Register User
      Given I navigate to "Automation Exercise" website
      Then AE I verify that Home page is visible
      When AE I navigate to "Signup/Login" page
      Then AE I verify "New User Signup!" heading is visible
      When AE I enter name and email for new user
      And AE I click Signup button
      Then AE I verify ENTER ACCOUNT INFORMATION header is visible
      When AE I set Title, Password, DOB and checkboxes
      And AE I Select checkbox Sign up for our newsletter
      And AE I select checkbox Receive special offers
      And AE I fill fields under Address Details
      And AE I click Create Account button
      Then AE I verify ACCOUNT CREATED header is visible
      When AE I click Continue button
#      Then AE I verify LOGGED IN AS USRNAME is visible
#      When AE I click Delete Account button
#      Then AE I verify ACCOUNT DELETED is visible
#      todo: add remaining steps, finish scenario
#      todo: add elements that appear after usr logged in for header class