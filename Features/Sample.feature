@f1
Feature: Purchase of a product

This feature is use to search new product on amazon website and add the same to CART.
If the product is available, then add it to cart.
If the product is not available then do Pre-Order.

Background:
Given I am able to access the http://www.flipkart.com

@tag1
Scenario Outline: In stock Product
When I search for a <Product>
And I choose the first Autofill option
And I add the first product to Cart
Then I should be able to checkout the cart

Examples:
|Product|
|Apple Phone|
|Samsung Tv|
@WSX2wsx
@WSX2wsx
#@tag2 @tag1
@tag2
Scenario: In stock Product
When I search for a Water bottles
And I choose the first Autofill option
And I add the first product to Cart
Then I should be able to checkout the cart

