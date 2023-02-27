Feature: Retail Home feature

  #1`@smokeTest
  Scenario: Verify user can search a product
    Given User is on retail website
    When User search for "pokemon" product
    Then The product should be displayed

  #@smokeTest
  Scenario: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on All section
    Then below options are present in shop by department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  #@smokeTest
  Scenario Outline: Verify Department sidebar option
    Given User is on retail website
    When User click on All section
    And User is on '<department>'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo               |
      | Electrinocs | TV & Video                     | Video Game              |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets       |
      | Sports      | Athletic Clothing              | Exercise & Fitness      |
      | Automative  | Automative Parts & Accessories | MotoCycle & Powersports |
#@smokeTest
  Scenario: Verify User can add an item to cart 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'shukria.iqbal@tekschool.us' and password 'Tek@2221'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2' 
#@smokeTest
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
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
      | Country       | Fullname      | PhoneNumber | StreetAddress       | Apt  | City       | State    | ZipCode |
      | United States | Gul Jan |  7000778897 | 4654 Chantilly BLVD | 2323 | Alexandria | Virginia |   33201 |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or Credit Card information
      | cardNumber       | nameOnCard    | expirationMonth | expirationYear | securityCode |
      | 0045032112300321 | sherin Jan |              12 |           2025 |          234 |
    And User click on add your card button
    And User click on Place Your Order
    Then a Message Should be Displayed For order purpose 'Order Placed, Thanks'
#@smokeTest
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'shukria.iqbal@tekschool.us' and password 'Tek@2221'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on the item
    And User select quantity '5'
    And User click add to Cart button
    Then the cart icon quantity should change to '5'
    And User click on Cart option
    And User click on proceed to checkout button
    And User click on Place Your Order
