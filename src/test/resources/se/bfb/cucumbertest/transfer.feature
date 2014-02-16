Feature: Transfer money between two account

  @UserAccounts
  Scenario: Depositing money in to User's account should add money to the User's current balance
    Given a source account with balance £100
    Given a target account with balance £200
    When £100 is transfered from source to target
    Then the source balance should be £0
    Then the target balance should be £300