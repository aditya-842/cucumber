Feature: BBPS - FASTag Billers

  @sprint1_2023 @epic-5277 @SP-5279 @SP_5279_TC_02 @SP_5279_TC_03 @SP_5279_TC_04
  Scenario: To check when select FASTag then verify dropdown
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then Verify Biller Dropdown On PayBill Page
    Then Verify Biller Available In Dropdown "Bank  - Fastag"

  @sprint1_2023 @epic-5277 @SP-5279 @SP_5279_TC_05
  Scenario: To check whether when select FASTag then verify text field of biller with inavalid text
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then Verify Biller Dropdown On PayBill Page
    Then Enter Biller On PayBill Page "qtrt455"
    Then Verify Biller Not Available In Dropdown On PayBill Page "qtrt455"
