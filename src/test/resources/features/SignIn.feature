Feature: TEK Retail Application SignIn feature

@smokeTest1
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'shukria.iqbal@tekschool.us' and password 'Tek@2221'
    And User click on login button
    Then User should be logged in into Account
#@smokeTest
  Scenario Outline: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email '<email>' and password '<password>'
    And User click on login button
    Then User should be logged in into Account

    Examples: 
      | email                      | password  |
      | shukria.iqbal@tekschool.us | Tek@2221  |
      #| phantom.tester@gmail.com     | Tek@1234 |
      #| test@tekschool.com         | Tek@1234 |


 

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    