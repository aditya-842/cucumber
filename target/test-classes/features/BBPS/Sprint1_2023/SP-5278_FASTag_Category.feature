Feature: BBPS - FASTag category

  @sprint1_2023 @epic-5277 @SP-5278 @SP_5278_TC_01
  Scenario: To check whether When user click on Pay bill then FASTag icon avaialble.
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"