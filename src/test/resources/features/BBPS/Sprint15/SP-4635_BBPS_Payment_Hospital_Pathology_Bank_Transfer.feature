Feature: BBPS - H&P Payment of Hospital and Pathology through Bank Transfer

  @sprint15 @epic-4627 @SP-4635 @SP_4635_TC_01
  Scenario: login as a Agent User, Verify Hospital & Pathology Payment mode as Account Transfer CSS/UI issue
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then select Biller From Dropdown "B.K. Arogyam and Research Pvt. Ltd"
    Then Select mode of payment "Account Transfer"

  @sprint15 @epic-4627 @SP-4635 @SP_4635_TC_02
  Scenario: login as a Agent User, Verify Hospital & Pathology FETCH BILL button for Account Transfer
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then select Biller From Dropdown "B.K. Arogyam and Research Pvt. Ltd"
    Then Enter Mobile Number for Card Number "9876543210"
    Then Select mode of payment "Account Transfer"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then enter account number On Confirm Payment page "120733"
    Then click On Confirm Button On Confirm Payment page
    Then Click on logout button

  @sprint15 @epic-4627 @SP-4635 @SP_4635_TC_03
  Scenario: login as a Agent User, verified when the agent enters the Account Transfer receipt number and clicks on confirm bill then agents wallet will be checked
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then select Biller From Dropdown "B.K. Arogyam and Research Pvt. Ltd"
    Then Enter Mobile Number for Card Number "9876543210"
    Then Select mode of payment "Account Transfer"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Click on Fetch Bill Button to verify details
    Then Verify wallet present on confirmation page with Amount "37,262.85"
    Then enter account number On Confirm Payment page "120457"
    Then click On Confirm Button On Confirm Payment page
    Then Click on logout button

  @sprint15 @epic-4627 @SP-4635 @SP_4635_TC_04
  Scenario: To check whether success amount deducted from the Agent wallet by switch button for Account Transfer
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then select Biller From Dropdown "B.K. Arogyam and Research Pvt. Ltd"
    Then Enter Mobile Number for Card Number "9876543210"
    Then Select mode of payment "Account Transfer"
    Then Enter payer emailid "abc@gmail.com"
    Then Click on Fetch Bill Button to verify details
    Then Verify wallet present on confirmation page with Amount "37,262.85"
    Then enter account number On Confirm Payment page "120457"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Transaction Details Header
    Then Verify Field Avialble On Transaction Details Page "Customer Name"
    Then Verify Field Avialble On Transaction Details Page "Bill Date"
    Then Verify Field Avialble On Transaction Details Page "Amount"
    Then Verify Field Avialble On Transaction Details Page "Mode of Payment"
    Then Verify Field Avialble On Transaction Details Page "Customer Convenience Fee"
    Then Verify Field Avialble On Transaction Details Page "Total"
    Then Verify Field Avialble On Transaction Details Page "Transaction Status"
    Then Verify Field Avialble On Transaction Details Page "Transaction Date"
    Then Verify Field Avialble On Transaction Details Page "Transaction Reference"
    Then Verify Field Avialble On Transaction Details Page "Payment Remarks"
    Then Verify Field Avialble On Transaction Details Page "Extra Details"
    Then Click on logout button

  @sprint15 @epic-4627 @SP-4635 @SP_4635_TC_05
  Scenario: To check whether when select Hospital and Pathology then verify biller
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then select Biller From Dropdown "B.K. Arogyam and Research Pvt. Ltd"
    Then Enter Mobile Number for Card Number "9876543210"
    Then Select mode of payment "Account Transfer"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Verify wallet present on confirmation page with Amount "37,262.85"
    Then enter account number On Confirm Payment page "120347"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Transaction Details Header
    Then Click on logout button

  @sprint15 @epic-4627 @SP-4635 @SP_4635_TC_06
  Scenario: To check whether Hospital & Pathology verified Failed transaction for payment mode Account Transfer
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then select Biller From Dropdown "Billroth Hospitals Pvt Ltd"
    Then Enter In_First_TextField On PayBill Page "9876543210"
    Then Select mode of payment "Account Transfer"
    Then enter Payer Mobile Number On PayBill Page "9876543210"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Verify wallet present on confirmation page with Amount "37,262.85"
    Then enter account number On Confirm Payment page "120745"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Transaction Details Header
    Then Verify Transaction Status Failed Avialble On Transaction Details Page
    Then Click on logout button

  @sprint15 @epic-4627 @SP-4635 @SP_4635_TC_07
  Scenario: To check whether Verify Hospital & Pathology verified user can download the receipt for payment mode Account Transfer
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then select Biller From Dropdown "B.K. Arogyam and Research Pvt. Ltd"
    Then Enter Mobile Number for Card Number "9876543210"
    Then Select mode of payment "Account Transfer"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then enter account number On Confirm Payment page "120745"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Transaction Details Header

  #Then Click On Print button
  @sprint15 @epic-4627 @SP-4635 @SP_4635_TC_08
  Scenario: To check whether Verify Hospital & Pathology verified Complain Register.
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Register Complaint Icon
    Then Select Complaint Type "Transaction"
    Then Enter Mobile Number for Register Complaint "7890789090"
    Then Enter Transaction ID "COM12345"
    Then Select the reason "Others, provide details in description"
    Then Enter the Description "QA Testing"
    Then Click On Submit button
    Then Verify Print Button On Register Complaint_Page
    Then Click on logout button

  @sprint15 @epic-4627 @SP-4635 @SP_4635_TC_09
  Scenario: To check whether the Agent admin user can check the complaint tracking status.
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Complaint Tracking Icon
    Then Select BBPS Radio Button
    Then Select Complaint Type for complaint tracking status "Transaction"
    Then Enter Customer Mobile Number for Complain Tracking "7972324814"
    Then Enter Complaint ID "AP1582803253486"
    Then Click on View Status Button
    Then Verify Print Button On Register Complaint_Page

  @sprint15 @epic-4627 @SP-4635 @SP_4635_TC_10
  Scenario: To check whether Agent admin user can view transaction history.
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then select Biller From Dropdown "B.K. Arogyam and Research Pvt. Ltd"
    Then Enter Mobile Number for Card Number "7878787878"
    Then Select mode of payment "Account Transfer"
    Then Enter payer emailid "abc@gmail.com"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then enter account number On Confirm Payment page "120745"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Transaction Details Header
    Then Click on Home icon
    Given Click on Transaction History Icon
    Then Select User "pkagent"
    Then Select Duration "Today"
    Then Select Search Parameter "Customer Mobile"
    Then Enter Customer Mobile Number for Search Parameter "7878787878"
    Then Click on Search Button
    Then Click on Download button

  @sprint15 @epic-4627 @SP-4635 @SP_4635_TC_11
  Scenario: To check whether Hospital & Pathology verified Search Transaction
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on transaction search Icon
    Then Select Radio Button Transaction
    Then Enter TransactionId "COM12345"
    Then Click on Proceed Button
    Then Viery Print Icon On Transaction Search Page

  @sprint15 @epic-4627 @SP-4635 @SP_4635_TC_12
  Scenario: To check whether Hospital & Pathology verified Wallet Statement
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Wallet Statement Icon
    Then Click on Submit button
    Then Click on Download button

  @sprint15 @epic-4627 @SP-4635 @SP_4635_TC_13
  Scenario: To check whether Hospital & Pathology PAY BILL button for Account Transfer
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then Select Biller or provider "TSTX"
    Then Enter "1" field value "123"
    Then Enter "2" field value "123"
    Then Enter "3" field value "123"
    Then Enter "4" field value "123"
    Then Enter "5" field value "123"
    Then Select mode of payment "Account Transfer"
    Then Enter mobile number "9876543210"
    Then Enter Amount In TextField On PayBill Page "100"
    Then Enter payer emailid "abc@gmail.com"
    Then Click on Fetch Bill Button to verify details
    Then enter account number On Confirm Payment page "120745"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Transaction Details Header
    Then Click on logout button

  @sprint15 @epic-4627 @SP-4635 @SP_4635_TC_14
  Scenario: To check whether Hospital & Pathology Validate BILL button for Account Transfer
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then select Biller From Dropdown "BSES Yamuna Prepaid Meter Recharge"
    Then Enter "1" field value "343434434"
    Then Enter "2" field value "500"
    Then Select mode of payment "Account Transfer"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Enter Amount "500"
    Then Click on Validate Bill button
    Then Click on Pay Bill button
    Then enter account number On Confirm Payment page "120745"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Transaction Details Header
    Then Click on logout button

  @sprint15 @epic-4627 @SP-4635 @SP_4635_TC_15
  Scenario: To check whether Hospital & Pathology Validate BILL & Pay Bill button for Account Transfer
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then select Biller From Dropdown "Uttar Gujarat Vij Company Limited (UGVCL)"
    Then Enter "1" field value "1234"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Enter Amount "500"
    Then Click on Validate Bill button
    Then Click on Pay Bill button
    Then Enter Cash Receipt Number "1207"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Transaction Details Header
    Then Click on logout button

  @sprint15 @epic-4627 @SP-4635 @SP_4635_TC_16
  Scenario: To check whether Hospital & Pathology Fetch BILL & Pay Bill via Fetch payment button for Account Transfer
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then Select Biller or provider "TSTX"
    Then Enter "1" field value "123"
    Then Enter "2" field value "123"
    Then Enter "3" field value "123"
    Then Enter "4" field value "123"
    Then Enter "5" field value "123"
    Then Select mode of payment "Account Transfer"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Enter Amount "500"
    Then Click on Fetch Bill Button to verify details
    Then enter account number On Confirm Payment page "120745"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Transaction Details Header
    Then Click on logout button

  @sprint15 @epic-4627 @SP-4635 @SP_4635_TC_17
  Scenario: To check whether Verify Hospital & Pathology Fetch BILL & Pay Bill via Pay BIll payment button for Account Transfer
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then Select Biller or provider "TSTX"
    Then Enter "1" field value "123"
    Then Enter "2" field value "123"
    Then Enter "3" field value "123"
    Then Enter "4" field value "123"
    Then Enter "5" field value "123"
    Then Select mode of payment "Account Transfer"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Enter Amount "1000"
    Then Click on Pay Bill button
    Then enter account number On Confirm Payment page "120745"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Transaction Details Header
    Then Click on logout button
