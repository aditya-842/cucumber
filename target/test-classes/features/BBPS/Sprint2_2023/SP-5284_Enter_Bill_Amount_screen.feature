Feature: Enter Bill Amount screen

  @sprint2_2023 @epic-5277 @SP-5284 @SP_5284_TC_01
  Scenario: To Verify other amount field displayed on comfirmation page for all FASTag billers
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Union Bank of India Fastag"
    Then Enter In_First_TextField On PayBill Page "9090909090"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Verify Field Avialble On Confirm Payment Page "Amount"
    Then Verify Field Avialble On Confirm Payment Page "Customer Convenience Fee"
    Then Verify Field Avialble On Confirm Payment Page "Total"
    Then Verify Field Avialble On Confirm Payment Page "Payment Mode"

  @sprint2_2023 @epic-5277 @SP-5284 @SP_5284_TC_02
  Scenario: To Verify pay bill without filling the value in other amount field
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Union Bank of India Fastag"
    Then Enter In_First_TextField On PayBill Page "9090909090"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Verify Field Avialble On Confirm Payment Page "Amount"
    Then Verify Field Avialble On Confirm Payment Page "Customer Convenience Fee"
    Then Verify Field Avialble On Confirm Payment Page "Total"
    Then Verify Field Avialble On Confirm Payment Page "Payment Mode"
    Then Enter Other value On Confirm Payment page "100"
    Then enter Cash Receipt Number On Confirm Payment page "5674"
    Then click On Confirm Button On Confirm Payment page

  @sprint2_2023 @epic-5277 @SP-5284 @SP_5284_TC_03 @SP_5284_TC_04
  Scenario: To Verify error message for other amount field for value less than "Minimum Recharge Amount" and for value more than "Maximum Recharge Amount"
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Union Bank of India Fastag"
    Then Enter In_First_TextField On PayBill Page "9090909090"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then Enter Other value On Confirm Payment page "0"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Error Msg On Comfirm Payment Page "Please enter Amount higher than minimum top-up amount"
    Then Enter Other value On Confirm Payment page "9366"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Error Msg On Comfirm Payment Page "Please enter Amount lower than Maximum Permissible Recharge amount"

  @sprint2_2023 @epic-5277 @SP-5284 @SP_5284_TC_05
  Scenario: To Verify other amount field for value in between field values of Maximum Recharge Amount and Minimum Recharge Amount
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Union Bank of India Fastag"
    Then Enter In_First_TextField On PayBill Page "9090909090"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then Enter Other value On Confirm Payment page "100"
    Then enter Cash Receipt Number On Confirm Payment page "5674"
    Then click On Confirm Button On Confirm Payment page

  @sprint2_2023 @epic-5277 @SP-5284 @SP_5284_TC_08
  Scenario: To Verify other amount field for value exact to "Minimum Recharge Amount"
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Union Bank of India Fastag"
    Then Enter In_First_TextField On PayBill Page "9090909090"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then Enter Other value On Confirm Payment page "1"
    Then enter Cash Receipt Number On Confirm Payment page "5674"
    Then click On Confirm Button On Confirm Payment page

  @sprint2_2023 @epic-5277 @SP-5284 @SP_5284_TC_09
  Scenario: To Verify other amount field for value exact to "Maximum Recharge Amount"
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Union Bank of India Fastag"
    Then Enter In_First_TextField On PayBill Page "9090909090"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then Enter Other value On Confirm Payment page "9365"
    Then enter Cash Receipt Number On Confirm Payment page "5674"
    Then click On Confirm Button On Confirm Payment page

  @sprint2_2023 @epic-5277 @SP-5284 @SP_5284_TC_10
  Scenario: To Verify other amount field for value in between field values of Maximum Recharge Amount and Minimum Recharge Amount for biller with exactness as "exact & above"
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "HDFC - FASTag"
    Then Enter In_First_TextField On PayBill Page "9090909090"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then Enter Other value On Confirm Payment page "5000"
    Then enter Cash Receipt Number On Confirm Payment page "5674"
    Then click On Confirm Button On Confirm Payment page

  @sprint2_2023 @epic-5277 @SP-5284 @SP_5284_TC_11
  Scenario: Verify other amount field for value in between field values of Maximum Recharge Amount and Minimum Recharge Amount for biller with exactness as exact
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Bank of Baroda - Fastag"
    Then Enter In_First_TextField On PayBill Page "9090909090"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then Enter Other value On Confirm Payment page "5000"
    Then enter Cash Receipt Number On Confirm Payment page "5674"
    Then click On Confirm Button On Confirm Payment page

  @sprint2_2023 @epic-5277 @SP-5284 @SP_5284_TC_12
  Scenario: Verify other amount field for value in between field values of Maximum Recharge Amount and Minimum Recharge Amount for biller with exactness as null
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Axis Bank FASTag - BHIM"
    Then Enter In_First_TextField On PayBill Page "9090909090"
    Then Enter In_Second_TextField On PayBill Page "100"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then Enter Other value On Confirm Payment page "5000"
    Then enter Cash Receipt Number On Confirm Payment page "5674"
    Then click On Confirm Button On Confirm Payment page
