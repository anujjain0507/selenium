Feature: DGSL Application Testing

@SmokeTest @RegressionTest
Scenario: Login with correct username and correct password
Given Valid Login Test

@RegressionTest
Scenario: Create Manual Vendor Registration
Given This is a Vendor Test Case


@SmokeTest
Scenario: Change the currunt activity
Given This is a Self Registraion Test Case

Scenario: Approve the Vendor
Given This is a approve vendor Test Case

Scenario: Close the Transaction
Given Transaction close Test Case

Scenario: Logout the Vendor
Given This is a Logout vendor Test Case

Scenario: Close the Browser
Given this is close browser test

Scenario: Read The Excel Sheet
Given Excel sheet test