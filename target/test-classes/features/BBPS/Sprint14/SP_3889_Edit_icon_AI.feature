Feature: BBPS - Edit function icon of AI

  @sprint14 @epic-3889 @SP_3889_TC_01
  Scenario: Login as Admin user and verify edit function on view entity details page- b2c (Capital)
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Verify edit icon is displayed

  @sprint14 @epic-3889 @SP_3889_TC_02
  Scenario: Login as Admin user and verify edit function on view entity details page- b2b (Dombivali-sarvatra)
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Verify edit icon is displayed 

  @sprint14 @epic-3889 @SP_3889_TC_03
  Scenario: Login as OU user and verify edit function on view entity details page- b2c (Capital)
    Given User is on LoginPage
    When Enter the UserNM "ou_admin" and Pass "TEst@123" and click on LOGIN as "ou_admin"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Verify edit icon is displayed
