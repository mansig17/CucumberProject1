Feature: To search for product in home and offer pages

@Search
Scenario Outline: To search for a product in the home and offer pages
Given i am in the dashboard page of the website
When i search for <name> in search bar
Then i am able to see <Full name> in the results
And When I search for <name>  in the offers pages
Then I am able to see <Full name> in the offers
Examples:
|name|Full name|
|tom|Tomato|
|beet|Beetroot|