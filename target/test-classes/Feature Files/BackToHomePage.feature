Feature: Back to home page validation
Background:
Given user launch the nopcommerce website
@BackToHomePage_001
Scenario: Validation to check if user has navigated to home page from registration page
When user clicks continue,user verify if the title is "nopCommerce demo store"
Then user searches for product using the search button
Then user selects the third item displayed from the featured products and clicks the same
Then user clicks Add To Cart in PDP page



