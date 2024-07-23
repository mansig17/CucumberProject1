Feature: To add product to the cart and buy

@AddProduct
Scenario Outline: To search for a product and add it to the cart and verify 
Given i am in the dashboard page of the website
When i search for <name> in search bar
And add 3 units of the product
Then the cart displays the same number 
And i am able to place the order
Examples:
|name|
|tom|