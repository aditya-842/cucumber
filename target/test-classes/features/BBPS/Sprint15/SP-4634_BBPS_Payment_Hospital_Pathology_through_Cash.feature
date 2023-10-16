Feature: BBPS - H&P Payment of Hospital and Pathology through Cash

  @sprint15 @epic-4627 @SP-4634 @SP_4634_TC_01
  Scenario: To check whether when select Hospital and Pathology then verify biller1
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then Verify Biller Dropdown On PayBill Page
    Then select Biller From Dropdown "B.K. Arogyam and Research Pvt. Ltd"
    Then Select mode of payment "Cash"

  @sprint15 @epic-4627 @SP-4634 @SP_4634_TC_02
  Scenario: To check whether when select Hospital and Pathology then verify biller2
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then Verify Biller Dropdown On PayBill Page
    Then Select Biller or provider "B.K. Arogyam and Research"
    Then Enter Mobile Number for Card Number "9876543210"
    Then Enter mobile number "9876543210"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Enter Cash Receipt Number "1207"
    Then Click on Payment CONFIRM button
    Then Click on logout button

  @sprint15 @epic-4627 @SP-4634 @SP_4634_TC_03
  Scenario: To check whether when select Hospital and Pathology then verify biller3
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then Select Biller or provider "B.K. Arogyam and Research"
    Then Enter Mobile Number for Card Number "9876543210"
    Then Select mode of payment "Cash"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Click on Fetch Bill Button to verify details
    Then Verify wallet present on confirmation page with Amount "37,262.85"
    Then Enter Cash Receipt Number "1207"
    Then Click on Payment CONFIRM button
    Then Click on logout button

  @sprint15 @epic-4627 @SP-4634 @SP_4634_TC_04
  Scenario: To check whether when select Hospital and Pathology then verify biller4
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then Select Biller or provider "B.K. Arogyam and Research"
    Then Enter Mobile Number for Card Number "9876543210"
    Then Select mode of payment "Cash"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Click on Fetch Bill Button to verify details
    Then Verify wallet present on confirmation page with Amount "37,262.85"
    Then Enter Cash Receipt Number "1207"
    Then Click on Payment CONFIRM button
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

  @sprint15 @epic-4627 @SP-4634 @SP_4634_TC_05
  Scenario: To check whether when select Hospital and Pathology then verify biller5
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then Select Biller or provider "B.K. Arogyam and Research"
    Then Enter Mobile Number for Card Number "9876543210"
    Then Select mode of payment "Cash"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Click on Fetch Bill Button to verify details
    Then Verify wallet present on confirmation page with Amount "37,262.85"
    Then Enter Cash Receipt Number "1207"
    Then Click on Payment CONFIRM button
    Then Verify Transaction Details Header
    Then Click on logout button

  @sprint15 @epic-4627 @SP-4634 @SP_4634_TC_06
  Scenario: To check whether when select Hospital and Pathology then verify biller6
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then Select Biller or provider "Billroth Hospitals Pvt Ltd"
    Then enter UHID On PayBill Page "7676767676"
    Then Select mode of payment "Cash"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Click on Fetch Bill Button to verify details
    Then Enter Cash Receipt Number "1207"
    Then Click on Payment CONFIRM button
    Then Verify Transaction Details Header
    Then Verify Field Avialble On Transaction Details Page "Payment Remarks"
    Then Verify Transaction Status Failed Avialble On Transaction Details Page
    Then Click on logout button

 # @sprint15 @epic-4627 @SP-4634 @SP_4634_TC_07
 # Scenario: To check whether when select Hospital and Pathology then verify biller7
 #   Given User is on LoginPage
 #   When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
 #   Given Click on Pay Bill Icon
 #   Then Select category "Hospital and Pathology"
 #   Then Select Biller or provider "B.K. Arogyam and Research"
 #   Then Enter Mobile Number for Card Number "9876543210"
 #   Then Select mode of payment "Cash"
 #   Then Enter mobile number "9876543210"
 #   Then Enter payer emailid "abc@gmail.com"
 #   Then Click on Fetch Bill button
 #   Then Enter Cash Receipt Number "1207"
 #   Then Click on Payment CONFIRM button
 #   Then Verify Transaction Details Header
 #   Then click On Print Button On Transaction Details page

 # @sprint15 @epic-4627 @SP-4634 @SP_4634_TC_08
 # Scenario: To check whether the agent admin user can register a complaint against service or transaction.
 #   Given User is on LoginPage
 #   When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
 #   Given Click on Register Complaint Icon
 #   Then Select Complaint Type "Transaction"
 #   Then Enter Mobile Number for Register Complaint "7890789090"
 #   Then Enter Transaction ID "COM12345"
 #   Then Select the reason "Others, provide details in description"
 #   Then Enter the Description "QA Testing"
 #   Then Click On Submit button
 #   Then Click On Print button

  @sprint15 @epic-4627 @SP-4634 @SP_4634_TC_09
  Scenario: To check whether the Agent admin user can check the complaint tracking status.
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Complaint Tracking Icon
    Then Select BBPS Radio Button
    Then Select Complaint Type for complaint tracking status "Transaction"
    Then Enter Customer Mobile Number for Complain Tracking "7972324814"
    Then Enter Complaint ID "AP1582803253486"
    Then Click on View Status Button
    #Then Click On Print button

  @sprint15 @epic-4627 @SP-4634 @SP_4634_TC_10
  Scenario: To check whether Agent admin user can view transaction history.
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Transaction History Icon
    Then Select User "pkagent"
    Then Select Duration "Month"
    Then Select Search Parameter "Customer Mobile"
    Then Enter Customer Mobile Number for Search Parameter "7878787878"
    Then Click on Search Button
    Then Click on Download button

  @sprint15 @epic-4627 @SP-4634 @SP_4634_TC_11
  Scenario: To check whether when select Hospital and Pathology then verify biller8
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on transaction search Icon
    Then Select Radio Button Transaction
    Then Enter TransactionId "COM12345"
    Then Click on Proceed Button
    Then Click on Print Icon

  @sprint15 @epic-4627 @SP-4634 @SP_4634_TC_12
  Scenario: To check whether when select Hospital and Pathology then verify biller9
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Wallet Statement Icon
    Then Click on Submit button
    Then Click on Download button

  @sprint15 @epic-4627 @SP-4634 @SP_4634_TC_13
  Scenario: To check whether when select Hospital and Pathology then verify biller10
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then Select Biller or provider "OCNS"
    Then Enter "1" field value "1"
    Then Enter "2" field value "12"
    Then Enter "3" field value "123"
    Then Enter "4" field value "1234"
    Then Enter "5" field value "12345"
    Then Select mode of payment "Cash"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Enter Amount In TextField On PayBill Page "987"
    Then Click on Pay Bill button
    Then Enter Cash Receipt Number "1207"
    Then Click on Payment CONFIRM button
    Then Verify Transaction Details Header
    Then Click on logout button

  @sprint15 @epic-4627 @SP-4634 @SP_4634_TC_14
  Scenario: To check whether when select Hospital and Pathology then verify biller11
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then Select Biller or provider "BSES Yamuna Prepaid Meter Recharge"
    Then Enter "1" field value "2834"
    Then Enter "1" field value "500876543"
    Then Enter Amount on 3rd InputField "987"
    Then Select mode of payment "Cash"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Enter Amount In TextField On PayBill Page "987"
    Then Click on Validate Bill button
    Then Click on Pay Bill button
    Then Enter Cash Receipt Number "1207"
    Then Click on Payment CONFIRM button
    Then Verify Transaction Details Header
    Then Click on logout button

  @sprint15 @epic-4627 @SP-4634 @SP_4634_TC_15
  Scenario: To check whether when select Hospital and Pathology then verify biller12
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then Select Biller or provider "Uttar Gujarat Vij Company Limited (UGVCL)"
    Then Enter "1" field value "1234"
    Then Select mode of payment "Cash"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Enter Amount In TextField On PayBill Page "987"
    Then Click on Validate Bill button
    Then Click on Pay Bill button
    Then Enter Cash Receipt Number "1207"
    Then Click on Payment CONFIRM button
    Then Verify Transaction Details Header
    Then Click on logout button

  @sprint15 @epic-4627 @SP-4634 @SP_4634_TC_16
  Scenario: To check whether when select Hospital and Pathology then verify biller13
    Given User is on LoginPage
    When Enter the UserNM "pkagent" and Pass "Test@123" and click on LOGIN as "pkagent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then Select Biller or provider "TSTX"
    Then Enter "1" field value "123"
    Then Enter "2" field value "123"
    Then Enter "3" field value "123"
    Then Enter "4" field value "1234"
    Then Enter "5" field value "12345"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Enter Amount "500"
    Then Click on Fetch Bill Button to verify details
    Then Enter Cash Receipt Number "1207"
    Then Click on Payment CONFIRM button
    Then Verify Transaction Details Header
    Then Click on logout button

  @sprint15 @epic-4627 @SP-4634 @SP_4634_TC_17
  Scenario: To check whether when select Hospital and Pathology then verify biller14
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
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Enter Amount "1000"
    Then Click on Pay Bill button
    Then Enter Cash Receipt Number "1207"
    Then Click on Payment CONFIRM button
    Then Verify Transaction Details Header
    Then Click on logout button
