Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'shukria.iqbal@tekschool.us' and password 'Tek@2221'
    And User click on login button
    And User click on account option
    And User should be logged in into Account

  @smokeTest
  Scenario: Verify user can update Profile Information
    When User click on account option
    And User update Name 'Nazawoli' and Phone '7042039900'
    And User click on Update button
    And User profile information should be updated

  @smokeTest
  Scenario: Verify User can add Debit or Credit card
    
         And User click on bank card
         And User click on add option of card section
         And User fill Debit or Credit Card information 
           | cardNumber       | nameOnCard     | expirationMonth | expirationYear | securityCode |
           | 8009990011001239 | SheirnGull |              6 |           2026 |          112 |
         And user click on add Your Card button
         Then Message should be displayed added card 'Payment Method added sucessfully'


  @smokeTest
  Scenario: Verify User can edit Debit or Credit card
        And User click on bank card
        And User click on Edit option of card section
        And user edit information with below data
          | cardNumber       | nameOnCard     | expirationMonth | expirationYear | securityCode |
          | 9901199991190600 | GullShiren |              10 |           2026 |          702 |
        And User click on Update Your Card button
        Then a message should be displayed card edited 'Payment Method updated Successfully'  


  @smokeTest
  Scenario: Verify User can remove Debit or Credit card
        And User click on bank card
        And User click on remove option of card section
        Then payment details should be removed


  @smokeTest
  Scenario: Verify user can add and Address
    When User click on account option
    And User click on add address option
    And User fill new address form with below information
      | Country       | Fullname | PhoneNumber | StreetAddress  | Apt  | City      | State      | ZipCode |
      | United States | GullJan  |  9018900411 | 23Vermella way | 2209 | Lyndhurst | New Jersey |   07022 |
    And User click add address button
    Then A message should be displayed for added address 'Address Added Successfully'

  @smokeTest
  Scenario: Verify User can edit an Address added on account
    When User click on account option
    And User click on edit address option
    And user fill edit address form with below information
      | country       | FullName | phoneNumber | streetAddress | apt | city   | state   | zipCode |
      | United States | Steiner  |  9140999112 | boggy Street  | 232 | berary | Florida |   22133 |
    And User click update Your Address button
    Then A message should be displayed for edit address 'Address Updated Successfully'

  @smokeTest
  Scenario: Verify User can remove Address from Account
    When User click on account option
    And User click on remove option of Address section
    Then Address details should be removed
