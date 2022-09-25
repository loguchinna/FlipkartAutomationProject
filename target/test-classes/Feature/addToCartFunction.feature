@E2E
Feature: Order the Product from Flipkart Website

  @order
  Scenario Outline: To order a any product from the list of samsung mobile 
  
    Given Launch the URL 
    Then Validate the URL
    When Do a Product search
    And Select any product & Add that to the cart
    Then Check the right product is added with respective prices
    When Place Order & Login to the application by using "<Username>" and "<Password>"   
    And Select Address & Select Payment option
    When Remove the product from the cart
    Then Check the Product is removed from the cart
    
    Examples:
        |Username|Password|
        |7200178755|endurance|
    