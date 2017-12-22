$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Sample.feature");
formatter.feature({
  "line": 1,
  "name": "Purchase of a product",
  "description": "\r\nThis feature is use to search new product on amazon website and add the same to CART.\r\nIf the product is available, then add it to cart.\r\nIf the product is not available then do Pre-Order.",
  "id": "purchase-of-a-product",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "In stock Product",
  "description": "",
  "id": "purchase-of-a-product;in-stock-product",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I am able to access the http://www.flipkart.com",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I search for a \u003cProduct\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I choose the first Autofill option",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I add the first product to Cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should be able to checkout the cart",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "purchase-of-a-product;in-stock-product;",
  "rows": [
    {
      "cells": [
        "Product"
      ],
      "line": 16,
      "id": "purchase-of-a-product;in-stock-product;;1"
    },
    {
      "cells": [
        "Apple Phone"
      ],
      "line": 17,
      "id": "purchase-of-a-product;in-stock-product;;2"
    },
    {
      "cells": [
        "Samsung Tv"
      ],
      "line": 18,
      "id": "purchase-of-a-product;in-stock-product;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4517553392,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "In stock Product",
  "description": "",
  "id": "purchase-of-a-product;in-stock-product;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I am able to access the http://www.flipkart.com",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I search for a Apple Phone",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I choose the first Autofill option",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I add the first product to Cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should be able to checkout the cart",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.flipkart.com",
      "offset": 24
    }
  ],
  "location": "StepDefination.i_am_able_to_access_the_http_www_flipkart_com(String)"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 6686995983,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apple Phone",
      "offset": 15
    }
  ],
  "location": "StepDefination.i_search_for_a_Apple_Phone(String)"
});
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "duration": 1020682351,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_choose_the_first_Autofill_option()"
});
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "duration": 3331764348,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_add_the_first_product_to_Cart()"
});
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "duration": 6391185546,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_should_be_able_to_checkout_the_cart()"
});
formatter.result({
  "duration": 26053,
  "status": "passed"
});
formatter.after({
  "duration": 70660,
  "status": "passed"
});
formatter.before({
  "duration": 4700354996,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "In stock Product",
  "description": "",
  "id": "purchase-of-a-product;in-stock-product;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I am able to access the http://www.flipkart.com",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I search for a Samsung Tv",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I choose the first Autofill option",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I add the first product to Cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should be able to checkout the cart",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.flipkart.com",
      "offset": 24
    }
  ],
  "location": "StepDefination.i_am_able_to_access_the_http_www_flipkart_com(String)"
});
formatter.embedding("image/png", "embedded4.png");
formatter.result({
  "duration": 11140572406,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Samsung Tv",
      "offset": 15
    }
  ],
  "location": "StepDefination.i_search_for_a_Apple_Phone(String)"
});
formatter.embedding("image/png", "embedded5.png");
formatter.result({
  "duration": 990437659,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_choose_the_first_Autofill_option()"
});
formatter.embedding("image/png", "embedded6.png");
formatter.result({
  "duration": 3131277704,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_add_the_first_product_to_Cart()"
});
formatter.embedding("image/png", "embedded7.png");
formatter.result({
  "duration": 6528565637,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_should_be_able_to_checkout_the_cart()"
});
formatter.result({
  "duration": 22106,
  "status": "passed"
});
formatter.after({
  "duration": 43817,
  "status": "passed"
});
});