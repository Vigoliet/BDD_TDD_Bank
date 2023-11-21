Feature: Account

  Scenario: The user deposits money into their account
    Given the users balance is 100 dollar
    When the user deposits 50 dollar
    Then the users balance is 150 dollar