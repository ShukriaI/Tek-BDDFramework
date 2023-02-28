Feature: Change Password

  
  Scenario: Verify user can create an account into Retail website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name  | email                | password | confirmPassword |
      | Moshak | morgh.sdet@gmail.com | Tek@2222 | Tek@2222       |
    And User click on SignUp button
    Then User should be logged in into Account 
 
  Scenario: Verify User can Update password
        Given User is on retail website
        When User click on Sign in option
        And User enter email 'morgh.sdet@gmail.com' and password 'Tek@2222'
        And User click on login button
        Then User should be logged in into Account
        When User click on account option
        And User enter below information
          | previousPassword | newPassword | confirmPassword |
          | Tek@2222      | Tek@1111   | Tek@1111       |
        And User click on Change password button
        Then a message should be displayed 'Password Updated Successfully'

