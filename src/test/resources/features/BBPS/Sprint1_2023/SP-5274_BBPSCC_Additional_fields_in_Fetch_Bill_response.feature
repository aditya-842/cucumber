Feature: BBPS CC – Additional fields in Fetch Bill response

  @sprint1_2023 @epic-3580 @SP-5274 @SP_5274_TC_01
  Scenario: Verify Credit card of Fetch Bill - biller should display for all biller
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Bank of Baroda test"
    Then Verify Fetch Bill Button for Credit Card Biller
    Then Enter cardNumber for Card Number "4567"
    Then Enter Payer Mobile No "8998989898"
    Then Enter In_First_TextField On PayBill Page "8989898989"
    Then Click on Fetch Bill Button For Credit Card
    Then Verify radio button "Total outstanding amount"
    Then Verify radio button "Other"
    Then Verify radio button "Current outstanding amount"
    Then Verify radio button "Minimum due amount"

  @sprint1_2023 @epic-3580 @SP-5274 @SP_5274_TC_02
  Scenario: Verify Credit card of Fetch Bill - biller should display for all biller
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Axis Bank Limited-Credit Card"
    Then Enter In_First_TextField On PayBill Page "5478"
    Then Enter In_Second_TextField On PayBill Page "919187654321"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then verify Radio Button On Confirm Payment page "Current outstanding amount"

  @sprint1_2023 @epic-3580 @SP-5274 @SP_5274_TC_03
  Scenario: To verify radio buttons on confirmation page if only Current Outstanding Amount field is missing in additional tag
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Bank of Baroda"
    Then Enter In_First_TextField On PayBill Page "9087654321"
    Then Enter In_Second_TextField On PayBill Page "4321"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then Verify radio button "Minimum due amount"
    Then Verify radio button "Total outstanding amount"

  @sprint1_2023 @epic-3580 @SP-5274 @SP_5274_TC_04 @SP_5274_TC_07
  Scenario: To verify Minimum due amount field
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Axis Bank Limited-Credit Card"
    Then Enter In_First_TextField On PayBill Page "5478"
    Then Enter In_Second_TextField On PayBill Page "919187654321"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then verify Radio Button On Confirm Payment page "Minimum due amount"
    Then click On Radio Button On Confirm Payment page "Minimum due amount"
    Then Enter Cash Receipt Number "6789"
    Then click On Confirm Button On Confirm Payment page

  @sprint1_2023 @epic-3580 @SP-5274 @SP_5274_TC_06 @SP_5274_TC_11
  Scenario: To verify Current Outstanding Amount field
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Axis Bank Limited-Credit Card"
    Then Enter In_First_TextField On PayBill Page "5478"
    Then Enter In_Second_TextField On PayBill Page "919187654321"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then verify Radio Button On Confirm Payment page "Total outstanding amount"
    Then click On Radio Button On Confirm Payment page "Total outstanding amount"
    Then Enter Cash Receipt Number "6789"
    Then click On Confirm Button On Confirm Payment page

  @sprint1_2023 @epic-3580 @SP-5274 @SP_5274_TC_08
  Scenario: To verify Minimum due amount field
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Axis Bank Limited-Credit Card"
    Then Enter In_First_TextField On PayBill Page "5478"
    Then Enter In_Second_TextField On PayBill Page "919187654321"
    Then Select Payment Mode as "Account Transfer"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then verify Radio Button On Confirm Payment page "Total outstanding amount"
    Then click On Radio Button On Confirm Payment page "Total outstanding amount"
    Then enter account number On Confirm Payment page "78787878"
    Then click On Confirm Button On Confirm Payment page

  @sprint1_2023 @epic-3580 @SP-5274 @SP_5274_TC_12
  Scenario: To verify Current Outstanding Amount field
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Bank of Baroda"
    Then Enter In_First_TextField On PayBill Page "78879899898"
    Then Enter In_Second_TextField On PayBill Page "919187654321"
    Then Select Payment Mode as "Account Transfer"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then verify Radio Button On Confirm Payment page "Current outstanding amount"
    Then click On Radio Button On Confirm Payment page "Current outstanding amount"
    Then enter account number On Confirm Payment page "78787878"
    Then click On Confirm Button On Confirm Payment page
