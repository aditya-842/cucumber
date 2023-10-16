Feature: BBPS - H&P Validations of customer params

  @sprint15 @epic-3580 @SP-4632 @SP_4632_TC_01 @SP_4632_TC_03
  Scenario: verify the confirm page CSS/UI when Cash payment is selected
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then select Biller From Dropdown "Billroth Hospitals Pvt Ltd"
    Then enter UHID Number On PayBill Page "9876543210"
    Then enter Payer Mobile Number On PayBill Page "9989890987"
    Then Click on Fetch Bill Button to verify details

  @sprint15 @epic-3580 @SP-4632 @SP_4632_TC_02 @SP_4632_TC_04
  Scenario: verify the confirm page CSS/UI when Account Transfer payment is selected
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then select Biller From Dropdown "Billroth Hospitals Pvt Ltd"
    Then enter UHID Number On PayBill Page "9876543210"
    Then Select Payment Mode as "Account Transfer"
    Then enter Payer Mobile Number On PayBill Page "9989890987"
    Then Click on Fetch Bill Button to verify details

  @sprint15 @epic-3580 @SP-4632 @SP_4632_TC_05
  Scenario: verify Additional information tag details Field if cash payment is selected
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then select Biller From Dropdown "Billroth Hospitals Pvt Ltd"
    Then enter UHID Number On PayBill Page "9876543210"
    Then enter Payer Mobile Number On PayBill Page "9989890987"
    Then Click on Fetch Bill Button to verify details
    Then Verify AdditionalInfo Field "Late Payment Amount"
    Then Verify AdditionalInfo Field "Late Payment Expiry Day"
    Then Verify AdditionalInfo Field "Minimum due amount"
    Then Verify AdditionalInfo Field "Early Payment Expiry Day"

  @sprint15 @epic-3580 @SP-4632 @SP_4632_TC_06
  Scenario: verify Additional information tag details Field if Acc Transfer payment is selected
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then select Biller From Dropdown "Billroth Hospitals Pvt Ltd"
    Then enter UHID Number On PayBill Page "9876543210"
    Then Select Payment Mode as "Account Transfer"
    Then enter Payer Mobile Number On PayBill Page "9989890987"
    Then Click on Fetch Bill Button to verify details
    Then Verify AdditionalInfo Field "Late Payment Amount"
    Then Verify AdditionalInfo Field "Late Payment Expiry Day"
    Then Verify AdditionalInfo Field "Minimum due amount"
    Then Verify AdditionalInfo Field "Early Payment Expiry Day"

  @sprint15 @epic-3580 @SP-4632 @SP_4632_TC_07
  Scenario: To check whether Bill Payer Information available for all biller of H&P category
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then select Biller From Dropdown "B.K. Arogyam and Research Pvt. Ltd"
    Then enter Registered Mobile Number On PayBill Page "8878767876"
    Then enter Payer Mobile Number On PayBill Page "9989890987"
    Then Click on Fetch Bill Button to verify details
    Then Verify Cash Receipt Number On Confirm Payment page

  @sprint15 @epic-3580 @SP-4632 @SP_4632_TC_08
  Scenario: To check whether Bill Payer Information available for all biller of H&P category
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then select Biller From Dropdown "B.K. Arogyam and Research Pvt. Ltd"
    Then enter Registered Mobile Number On PayBill Page "8878767876"
    Then enter Payer Mobile Number On PayBill Page "9989890987"
    Then Click On Payment Mode Field On PayBill Page
    Then Select Payment Mode Field On PayBill Page "Account Transfer"
    Then Click on Fetch Bill Button to verify details
    Then Verify Account Number Field On Confirm Payment page
