Feature: BBPS - Edit fields of AG

  @sprint14 @epic-2825 @SP_3892_TC_02
  Scenario: login as a admin, when user click on edit icon user navigate Agent institute Details - BPPS details page and existing data should displayed
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Babaji date Bank"
    Then Click On Edit Icon

  @sprint14 @epic-2825 @SP_3892_TC_03
  Scenario: login as a admin, user can save with valid email id and contact number.
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Babaji date Bank"
    Then Click On Edit Icon
    Then Enter Support Email ID "email-test@123?.mail"
    Then Enter Support Contact Number "9087&^54322"
    Then Click on save button
    Then Verify Error msg displayed as "Invalid Email Address-> Valid emails:user@gmail.com or my.user@domain.com etc, Multiple Email Ids cannot exceed 120 chars long." on Agent Group Details
    Then Verify Error msg displayed as "min length 8 numbers, max 20 numbers, valid contact numbers will separated by semicolon." on Agent Group Details for mobile number

  @sprint14 @epic-2825 @SP_3892_TC_04
  Scenario: login as a admin, user can save with valid email id and contact number.
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Babaji date Bank"
    Then Click On Edit Icon
    Then Enter Support Email ID " "
    Then Enter Support Contact Number " "
    Then Click on save button

  @sprint14 @epic-2825 @SP_3892_TC_05
  Scenario: login as a admin, user can save with valid email id and contact number.
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Babaji date Bank"
    Then Click On Edit Icon
    Then Enter Support Email ID " "
    Then Enter Support Contact Number "9087654321;9087654322;9087622321"
    Then Click on save button

  @sprint14 @epic-2825 @SP_3892_TC_06
  Scenario: login as a admin, user can save with valid email id and contact number.
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Babaji date Bank"
    Then Click On Edit Icon
    Then Enter Support Email ID "test@mail.com;testing@mail.com;test123@mail.com"
    Then Enter Support Contact Number " "
    Then Click on save button

  @sprint14 @epic-2825 @SP_3892_TC_08
  Scenario: login as a admin, when user click on edit icon user navigate Agent institute Details - BPPS details page and existing data should displayed
    Given User is on LoginPage
    When Enter the UserNM "ai_user1" and Pass "Test@12" and click on LOGIN as "ai_user1"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Babaji date Bank"
    Then Click On Edit Icon
    Then Verify Agent Group Details Header

  @sprint14 @epic-2825 @SP_3892_TC_09
  Scenario: login as a admin, user can save with valid email id and contact number.
    Given User is on LoginPage
    When Enter the UserNM "ai_user1" and Pass "Test@12" and click on LOGIN as "ai_user1"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Babaji date Bank"
    Then Click On Edit Icon
    Then Enter Support Email ID "email-test@123?.mail"
    Then Enter Support Contact Number "9087&^54322"
    Then Click on save button
    Then Verify Error msg displayed as "Invalid Email Address-> Valid emails:user@gmail.com or my.user@domain.com etc, Multiple Email Ids cannot exceed 120 chars long." on Agent Group Details
    Then Verify Error msg displayed as "min length 8 numbers, max 20 numbers, valid contact numbers will separated by semicolon." on Agent Group Details for mobile number

  @sprint14 @epic-2825 @SP_3892_TC_10
  Scenario: login as a admin, user can save with valid email id and contact number.
    Given User is on LoginPage
    When Enter the UserNM "ai_user1" and Pass "Test@12" and click on LOGIN as "ai_user1"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Babaji date Bank"
    Then Click On Edit Icon
    Then Enter Support Email ID " "
    Then Enter Support Contact Number " "
    Then Click on save button

  @sprint14 @epic-2825 @SP_3892_TC_11
  Scenario: login as a admin, user can save with valid email id and contact number.
    Given User is on LoginPage
    When Enter the UserNM "ai_user1" and Pass "Test@12" and click on LOGIN as "ai_user1"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Babaji date Bank"
    Then Click On Edit Icon
    Then Enter Support Email ID " "
    Then Enter Support Contact Number "9087654321;9087654322;9087622321"
    Then Click on save button

  @sprint14 @epic-2825 @SP_3892_TC_12
  Scenario: login as a admin, user can save with valid email id and contact number.
    Given User is on LoginPage
    When Enter the UserNM "ai_user1" and Pass "Test@12" and click on LOGIN as "ai_user1"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Babaji date Bank"
    Then Click On Edit Icon
    Then Enter Support Email ID "test@mail.com;testing@mail.com;test123@mail.com"
    Then Enter Support Contact Number " "
    Then Click on save button
