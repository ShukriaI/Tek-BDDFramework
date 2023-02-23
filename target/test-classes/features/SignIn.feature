Feature: TEK Retail Application SignIn feature


  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'shukria.iqbal@tekschool.us' and password 'Tek@2221'
    And User click on login button
    Then User should be logged in into Account

  Scenario Outline: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email '<email>' and password '<password>'
    And User click on login button
    Then User should be logged in into Account

    Examples: 
      | email                      | password  |
      | shukria.iqbal@tekschool.us | Tek@2323  |
      | phantom.tester@gmail.com     | Tek@1234 |
      | test@tekschool.com         | Tek@1234 |



  Scenario: Verify user can create an account into Retail website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name    | email                      | password | confirmPassword |
      | Noori | noori.tester@gmail.com | Tek@5550 | Tek@5550        |
    And User click on SignUp button
    Then User should be logged in into Account page 
