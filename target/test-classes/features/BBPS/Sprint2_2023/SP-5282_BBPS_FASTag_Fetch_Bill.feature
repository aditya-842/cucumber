Feature: BBPS FASTag through Cash

  @sprint2_2023 @epic-5277 @SP-5282 @SP_5282_TC_01 @SP_5282_TC_02 
  Scenario: To check when select FASTag then Validation for Axis Bank FASTag biller.
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Axis Bank Fastag"
    Then Enter In_First_TextField On PayBill Page "9090909090"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    
    @sprint2_2023 @epic-5277 @SP-5282 @SP_5282_TC_03 
  Scenario: To check fetch bill when cash payment is selected
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Axis Bank Fastag"
    Then Enter In_First_TextField On PayBill Page "9090909090"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    
    @sprint2_2023 @epic-5277 @SP-5282 @SP_5282_TC_04 @SP_5282_TC_05
  Scenario: To verify confirm payment page when cash payment is selected
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Axis Bank Fastag"
    Then Enter In_First_TextField On PayBill Page "9090909090"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Verify Field Avialble On Confirm Payment Page "Amount"
    Then Verify Field Avialble On Confirm Payment Page "Customer Convenience Fee"
    Then Verify Field Avialble On Confirm Payment Page "Total"
    Then Verify Field Avialble On Confirm Payment Page "Payment Mode"
    
    @sprint2_2023 @epic-5277 @SP-5282 @SP_5282_TC_06 @SP_5282_TC_07 @SP_5282_TC_08 @SP_5282_TC_09
  Scenario: To change payment mode acc Transfer
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Axis Bank Fastag"
    Then Select Payment Mode as "Account Transfer"
    Then Enter In_First_TextField On PayBill Page "9090909090"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Verify Field Avialble On Confirm Payment Page "Amount"
    Then Verify Field Avialble On Confirm Payment Page "Customer Convenience Fee"
    Then Verify Field Avialble On Confirm Payment Page "Total"
    Then Verify Field Avialble On Confirm Payment Page "Payment Mode"
    
   
    