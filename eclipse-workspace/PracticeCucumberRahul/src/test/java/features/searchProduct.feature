Feature: Search and place the order
@OffersPage
Scenario Outline: Search experience for product search in both home and offers page
Given User is on Greencart landing page
When user searched with Shortname <name> and extracted actual name of product
Then user searched for <name> in offers page to check  product exist with same name
And validate product name in offers page matches with landing page
Examples:
|name|
|Tom|
|Beet|