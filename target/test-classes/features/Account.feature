Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'shukria.iqbal@tekschool.us' and password 'Tek@2221'
    And User click on login button
    And User should be logged in into Account 
    
  Scenario: Verify user can update Profile Information
    When User click on Account option
    And User update Name 'NoorNoor' and Phone '9345432310'
    And User click on Update button
    And User profile information should be updated
    Scenario: Verify User can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on sign in option
    And User enter email 'shukria.iqbal@tekschool.us' and password 'Tek@2221'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User Click On item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2' 
    And User click on Cart option
    And User click on proceed to checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information
      | country       | fullName      | phoneNumber | streetAddress       | apt  | city       | state    | zipCode |
      | United States | Gulsherin Jan |  7038778897 | 4654 Chantilly BLVD | 2323 | Alexandria | Virginia |   33201 |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or Credit Card information
      | cardNumber       | nameOnCard    | expirationMonth | expirationYear | securityCode |
      | 2345432112344321 | Gulsherin Jan |              12 |           2025 |          234 |
    And User click on add your card button
    And User click on Place Your Order

  #Then a Message Should be Displayed 'Order Placed, Thanks'
  
  
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    Given User is on retail website
    When User click on sign in option
    And User enter email 'shukria.iqbal@tekschool.us' and password 'Tek@2221'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on item
    And User select quantity '5'
    And User click add to Cart button
    Then the cart icon quantity should change to '5'
    And User click on Cart option
    And User click on proceed to checkout button
    And User click on Place Your Order
    #Then a message should be displayed 'Order Placed, Thanks'
    
    