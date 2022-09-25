$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/addToCartFunction.feature");
formatter.feature({
  "name": "Order the Product from Flipkart Website",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@E2E"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To order a any product from the list of samsung mobile",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@order"
    }
  ]
});
formatter.step({
  "name": "Launch the URL",
  "keyword": "Given "
});
formatter.step({
  "name": "Validate the URL",
  "keyword": "Then "
});
formatter.step({
  "name": "Do a Product search",
  "keyword": "When "
});
formatter.step({
  "name": "Select any product \u0026 Add that to the cart",
  "keyword": "And "
});
formatter.step({
  "name": "Check the right product is added with respective prices",
  "keyword": "Then "
});
formatter.step({
  "name": "Place Order \u0026 Login to the application by using \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Select Address \u0026 Select Payment option",
  "keyword": "And "
});
formatter.step({
  "name": "Remove the product from the cart",
  "keyword": "When "
});
formatter.step({
  "name": "Check the Product is removed from the cart",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "7200178755",
        "endurance"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To order a any product from the list of samsung mobile",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@E2E"
    },
    {
      "name": "@order"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "AddToCart.launch_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the URL",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCart.validate_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Do a Product search",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCart.do_a_Product_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any product \u0026 Add that to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCart.select_any_product_Add_that_to_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the right product is added with respective prices",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCart.check_the_right_product_is_added_with_respective_prices()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Place Order \u0026 Login to the application by using \"7200178755\" and \"endurance\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCart.place_Order_Login_to_the_application_by_using_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Address \u0026 Select Payment option",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCart.select_Address_Select_Payment_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Remove the product from the cart",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCart.remove_the_product_from_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the Product is removed from the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCart.check_the_Product_is_removed_from_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});