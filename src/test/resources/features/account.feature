Feature: Account

  Scenario: User deposits money into the account
    Given the user balance is 150 dollars
    When the user desposits 1000 dollars
    Then balance should be 1150 dollars