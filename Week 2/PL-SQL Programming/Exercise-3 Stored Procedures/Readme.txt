# PL/SQL Stored Procedures

This repository contains stored procedures for common banking operations, as described in Exercise 3.

## Scenario 1: Monthly Interest Processing
**Procedure Name:** `ProcessMonthlyInterest`
- Applies a 1% interest to all savings account balances.

## Scenario 2: Employee Bonus Update
**Procedure Name:** `UpdateEmployeeBonus`
- Increases employee salaries in a specified department based on a bonus percentage.
- Parameters:
  - `dept_id` (NUMBER): Department ID.
  - `bonus_pct` (NUMBER): Bonus percentage to be applied.

## Scenario 3: Fund Transfer
**Procedure Name:** `TransferFunds`
- Transfers a specified amount from one account to another after verifying sufficient balance in the source account.
- Parameters:
  - `from_account_id` (NUMBER): Source account ID.
  - `to_account_id` (NUMBER): Destination account ID.
  - `amount` (NUMBER): Amount to transfer.
