Feature: BBPS - Edit fields of AI

  @sprint14 @epic-3890 @SP_3890_TC_01
  Scenario: login as a admin, when user click on edit icon user navigate Agent institute Details - BPPS details page and existing data should displayed
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Edit Icon
    Then Verify Agent Institution Details page

  @sprint14 @epic-3890 @SP_3890_TC_03 @SP_3890_TC_04
  Scenario: login as a admin, user can save with valid email id and contact number.
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Edit Icon
    Then Enter Support Email ID "Abcdef@gmail.com;1bcdef@gmail.com;2bcdef@gmail.com;3bcdef@gmail.com;4bcdef@gmail.com;5bcdef@gmail.com;61abcdef@gmail.com"
    Then Enter Support Contact Number "9809809800;9809809800;9809809800;98098098009809809800;9809809800;98098098009809809800;9809809800;9809809800;980980980011"
    Then Click on save button

  @sprint14 @epic-3890 @SP_3890_TC_05
  Scenario: login as a admin, user can save with valid email id and contact number.
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Edit Icon
    Then Enter Support Email ID "11Abcdef@gmail.com;1bcdef@gmail.com;2bcdef@gmail.com;3bcdef@gmail.com;4bcdef@gmail.com;5bcdef@gmail.com;61abcdef@gmail.com"
    Then Enter Support Contact Number "90119809809800;9809809800;9809809800;98098098009809809800;9809809800;98098098009809809800;9809809800;9809809800;980980980011"
    Then Click on save button
    Then Verify Error msg displayed as "Invalid Email Address-> Valid emails:user@gmail.com or my.user@domain.com etc, Multiple Email Ids cannot exceed 120 chars long." on Agent Group Details
    Then Verify Error msg displayed as "min length 8 numbers, max 20 numbers, valid contact numbers will separated by semicolon." on Agent Group Details for mobile number

  @sprint14 @epic-3890 @SP_3890_TC_06
  Scenario: login as a admin, user can save with valid email id and contact number.
    Given User is on LoginPage
    When Enter the UserNM "ou_user" and Pass "Test@123" and click on LOGIN as "ou_user"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Edit Icon
    Then Enter Support Email ID "Abcdef@gmail.com;1bcdef@gmail.com;2bcdef@gmail.com;3bcdef@gmail.com;4bcdef@gmail.com;5bcdef@gmail.com;61abcdef@gmail.com"
    Then Enter Support Contact Number "9809809800;9809809800;9809809800;98098098009809809800;9809809800;98098098009809809800;9809809800;9809809800;980980980011"

  @sprint14 @epic-3890 @SP_3890_TC_08 @SP_3890_TC_09
  Scenario: login as a OU, when user click on edit icon then verify Support Email ID and Support Contact fields.
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Edit Icon
    Then Enter Support Email ID "Abcdef@gmail.com;1bcdef@gmail.com;2bcdef@gmail.com;3bcdef@gmail.com;4bcdef@gmail.com;5bcdef@gmail.com;61abcdef@gmail.com"
    Then Enter Support Contact Number "9809809800;9809809800;9809809800;98098098009809809800;9809809800;98098098009809809800;9809809800;9809809800;980980980011"
    Then Click on save button

  @sprint14 @epic-3890 @SP_3890_TC_10
  Scenario: login as a admin, user can save with valid email id and contact number.
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Edit Icon
    Then Enter Support Email ID "11Abcdef@gmail.com;1bcdef@gmail.com;2bcdef@gmail.com;3bcdef@gmail.com;4bcdef@gmail.com;5bcdef@gmail.com;61abcdef@gmail.com"
    Then Enter Support Contact Number "90119809809800;9809809800;9809809800;98098098009809809800;9809809800;98098098009809809800;9809809800;9809809800;980980980011"
    Then Click on save button
    Then Verify Error msg displayed as "Invalid Email Address-> Valid emails:user@gmail.com or my.user@domain.com etc, Multiple Email Ids cannot exceed 120 chars long." on Agent Group Details
    Then Verify Error msg displayed as "min length 8 numbers, max 20 numbers, valid contact numbers will separated by semicolon." on Agent Group Details for mobile number

  @sprint14 @epic-3890 @SP_3890_TC_11
  Scenario: login as a admin, user can save with valid email id and contact number.
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Edit Icon
    Then Enter Support Email ID "Abcdef@gmail.com"
    Then Click on save button

  @sprint14 @epic-3890 @SP_3890_TC_12
  Scenario: login as a admin, user can save with valid email id and contact number.
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Edit Icon
    Then Enter Support Contact Number "9011980980980"
    Then Click on save button

  @sprint14 @epic-3890 @SP_3890_TC_13
  Scenario: login as a admin, user can save with valid email id and contact number.
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Edit Icon
    Then Enter Support Email ID "Abcdef@gmail.com;test@gmail.com"
    Then Click on save button

  @sprint14 @epic-3890 @SP_3890_TC_14
  Scenario: login as a admin, user can save with valid email id and contact number.
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Edit Icon
    Then Enter Support Contact Number "9011980980980;89453725162"
    Then Click on save button

  @sprint14 @epic-3890 @SP_3890_TC_15
  Scenario: login as a admin, user can save with valid email id and contact number.
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Edit Icon
    Then Enter Support Email ID "Abcdef@gmail.com;test@gmail.com"
    Then Click on save button

  @sprint14 @epic-3890 @SP_3890_TC_16
  Scenario: login as a admin, user can save with valid email id and contact number.
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Edit Icon
    Then Enter Support Contact Number "9011980980980;89453725162"
    Then Click on save button
