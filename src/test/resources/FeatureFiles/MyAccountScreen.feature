@Regression
Feature: Validating the Email and Password field

  Background: 
    Given user launch the nopcommerce website

  @ValidatingEmailPassword_001
  Scenario: Ui Validation of the Email and password field
    When user click the myaccount link on footer
    Then user verify that "Welcome, Please Sign In!" heading is displayed on the page
    And user verify that Email input box is displayed on the My account page
    And user verify that password input box is displayed on the My account page
    And user verify that remember me check box is displayed on the My account page
    And user verify that forgot password link is displayed on the My account page
    And user verify that login button is displayed on the My account page

  @ValidatingEmailPassword_002
  Scenario: Negative Validation of the Email and password field
    When user click the myaccount link on footer
    Then user verify that "Welcome, Please Sign In!" heading is displayed on the page
    When user enters the invalid "email" and "password"
    And user click the login button
    Then user verify the error "Wrong email" message has been displayed below the email input box field

  @ValidatingEmailPassword_003
  Scenario: Validation of the valid and unregistered Email and password field
    When user click the myaccount link on footer
    Then user verify that "Welcome, Please Sign In!" heading is displayed on the page
    When user enters the valid and unregistered "email@gmail.com" and "password@2023"
    And user click the login button
    Then user verify the error message "Login was unsuccessful. Please correct the errors and try again." has been displayed on the page
