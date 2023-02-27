Feature: Retail Order Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email "shukria.iqbal@tekschool.us" and password "Tek@2221"
    And User click on login button
    And User click on order section
    And User click on first order in list

  @smokeTest
  Scenario: Verify user can cancel the order
    And User click on Cancel The Order button
    And User select the cancelation Reason 'Bought wrong item'
    And User click on Cancel Order button
    And A cancelation message should be displayed 'Your Order Has Been Cancelled'

  @smokeTest
  Scenario: Verify user can place order again
    And User click on buy again button
    Then User click on place your order

  #2
  #@smokeTest
  Scenario: Verify user can Return the order
   #And User click on Second order in list
    And User click on Return items button
    And User select the Return Reason 'Item damaged'
    And User select the drop off service 'FedEx'
    And User click on return Order button
    Then Cancelation message should be displayed 'Return was successfull'

  #3
  #@smokeTest
  Scenario: Verify user can write a review on order placed
  
    And User click on Review button
    And User write Review headline
      | headline     | review standard message |
      | Apex Legends | Less then standard      |
    And User click Add your Review button
    Then A review message should be displayed 'Your review was added successfully'
