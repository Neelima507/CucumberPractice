Feature: place the order for products
@PlaceOrder
Scenario Outline: Search experience for product search in both home and offers page
Given User is on Greencart landing page
When user searched with Shortname <name> and extracted actual name of product
And user added 3 items of the selected product to the cart
Then user proceeds to checkout and validate <name> items in checkout page
And verify user has ability to enter promo code and place order
Examples:
|name|
|Tom|
|Beet|