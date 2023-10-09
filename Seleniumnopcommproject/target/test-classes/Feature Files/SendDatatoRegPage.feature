@Regression
Feature: Send data to fields in the Registration Page
Background:
Given user launch the nopcommerce website

@SendDataRegistrationForm_001
Scenario: UI validation of the registration of nop website
When user click the Register link on the nopcommerce web page
Then user verifies if the page is opened correctly by checking the title as "nopCommerce demo store. Register"
Then user selects gender using the given checkbox
Then user sends data for the First name TextBox
Then user sends data for the Last name TextBox
Then user selects the day from drop down date of birth
Then user selects the month from drop down date of birth
Then user selects the year from drop down date of birth
Then user sends data for email
Then user sends company name 
Then user sends data to password field 
Then user sends data to confirm password field
Then user clicks the register button
Then get the title page of the registration completed page "nopCommerce demo store. Register"
Then validate if the text "Register" is present

Then click the Continue button on the page