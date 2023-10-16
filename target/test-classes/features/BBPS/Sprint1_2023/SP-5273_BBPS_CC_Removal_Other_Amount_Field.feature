Feature: BBPS CC removal of the other amount field

  @sprint1_2023 @epic-3580 @SP-5273 @SP_5273_TC_01
  Scenario: Verify other amount field should not display for credit card biller
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Bank of Baroda test"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then Enter Payer Mobile Number for Card Number "9898989898"
    Then Click on Fetch Bill Button For Credit Card
    Then Verify Confirm Payment Header
    Then Verify Other Field not Avialble On Confirm Payment Page

  @sprint1_2023 @epic-3580 @SP-5273 @SP_5273_TC_02
  Scenario: To check whether When user click on Pay bill then FASTag icon avaialble.
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then select Biller From Dropdown "Axis Bank Fastag"
    Then Enter In_First_TextField On PayBill Page "9898989898"
    Then Enter Payer Mobile Number for Card Number "9898989898"
    Then Click on Fetch Bill Button For Credit Card
    Then Verify Confirm Payment Header
    Then Verify Other Field Avialble On Confirm Payment Page
