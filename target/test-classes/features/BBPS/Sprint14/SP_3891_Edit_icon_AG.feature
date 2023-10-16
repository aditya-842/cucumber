Feature: BBPS - Edit function icon of AG

  @sprint14 @epic-3891 @SP_3891_TC_01
  Scenario: Login as Admin user and verify edit function on view entity details page- b2b (Dombivali-sarvatra)
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Babaji date Bank"
    Then Verify edit icon is displayed

  @sprint14 @epic-3891 @SP_3891_TC_02
  Scenario: Login as AI user and verify edit function on view entity details page- b2b (Dombivali-sarvatra)
    Given User is on LoginPage
    When Enter the UserNM "ai_user1" and Pass "Test@12" and click on LOGIN as "ai_user1"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Babaji date Bank"
    Then Verify edit icon is displayed
