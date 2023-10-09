Feature: Register in the nopcommerce website for first time user
Background:
Given user launch the nopcommerce website
@FillUserRegistrationForm_001
Scenario: UI validation of the registration form
When user click the Register link on the nopcommerce web page
And user verifies "Register" heading is displayed in the page
And user verifies "Your Personal Details" is displayed in the page
And user verifies Gender check box options are displayed
And user verifies First name input box is displayed in the Register page
And user verifies Last name input box is displayed in the Register page
And user verifies Date of birth dropdown is displayed in the Register page
And user verifies Email input box is displayed in the Register page
And user verifies "Company Details" is dispalyed in the page
And user verifies Company name is diaplyed in the page
And user verifies "Options" is displayed in the registration page
And user verifies Newsletter is displayed in the page
And user verifies "Your Password" is displayed in register  page
And user verifies Password input box is displayed in the page 
And user verifies Confirm Password input box is displayed in the page