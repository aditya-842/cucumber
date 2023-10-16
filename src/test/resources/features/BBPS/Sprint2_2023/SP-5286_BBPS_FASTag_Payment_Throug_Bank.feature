Feature: BBPS FASTag - Payment of FASTag through Bank

  @sprint2_2023 @epic-5277 @SP-5286 @SP_5286_TC_02
  Scenario: login as a Agent User, Verify FASTag FETCH BILL button for Account Transfer
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "Test@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Axis Bank Fastag"
    Then Enter In_First_TextField On PayBill Page "68569769"
    Then Select Payment Mode as "Account Transfer"
    Then enter Payer Mobile Number On PayBill Page "9090909090"
    Then Click on Fetch Bill Button to verify details

  @sprint2_2023 @epic-5277 @SP-5286 @SP_5286_TC_03
  Scenario: When the agent enters the Account Transfer receipt number and clicks on confirm bill then agent’s wallet will be checked by switch for the available balance for payment mode Account Transfer
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "Test@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Axis Bank Fastag"
    Then Enter In_First_TextField On PayBill Page "68569769"
    Then Select Payment Mode as "Account Transfer"
    Then enter Payer Mobile Number On PayBill Page "9090909090"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Enter Other value On Confirm Payment page "100"
    Then enter account number On Confirm Payment page "123456"
    Then click On Confirm Button On Confirm Payment page

  @sprint2_2023 @epic-5277 @SP-5286 @SP_5286_TC_04
  Scenario: To Verify payemt success amount deducted from the Agent wallet by switch button for Account Transfer
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "Test@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Axis Bank Fastag"
    Then Enter In_First_TextField On PayBill Page "68569769"
    Then Select Payment Mode as "Account Transfer"
    Then enter Payer Mobile Number On PayBill Page "9090909090"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Enter Other value On Confirm Payment page "100"
    Then enter account number On Confirm Payment page "123456"
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
    Then verify Print On Transaction Details Page
    Then click On View Extra Details On Transaction Details page
    Then verify Extra Details Popup Avialble On Transaction Details Page
    Then click On Extra Details Popup Close Button On Transaction Details page
    Then click On Back Button On Transaction Details page
    
   ## @sprint2_2023 @epic-5277 @SP-5286 @SP_5286_TC_05
 ## Scenario: When the agent enters the Account Transfer receipt number and clicks on confirm bill then agent’s wallet will be checked by switch for the available balance for payment mode Account Transfer
   ## Given User is on LoginPage
    ##When Enter the UserNM "ab_agent" and Pass "Test@123" and click on LOGIN as "ab_agent"
    ##Given Click on Pay Bill Icon
    ##Then Select category "FASTag"
    ##Then Verify Category Available On PayBill Page "FASTag"
    ##Then select Biller From Dropdown "Axis Bank Fastag"
    ##Then Enter In_First_TextField On PayBill Page "68569769"
    ##Then Select Payment Mode as "Account Transfer"
    ##Then enter Payer Mobile Number On PayBill Page "9090909090"
    ##Then Click on Fetch Bill Button to verify details
    ##Then Verify Confirm Payment Header
    ##Then Enter Other value On Confirm Payment page "100"
    ##Then enter account number On Confirm Payment page "123456"
    ##Then click On Confirm Button On Confirm Payment page
    
    @sprint2_2023 @epic-5277 @SP-5286 @SP_5286_TC_06
  Scenario: When the agent enters the Account Transfer receipt number and clicks on confirm bill then agent’s wallet will be checked by switch for the available balance for payment mode Account Transfer
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "Test@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Bank  - Fastag"
    Then Enter In_First_TextField On PayBill Page "68569769"
    Then Select Payment Mode as "Account Transfer"
    Then enter Payer Mobile Number On PayBill Page "9090909090"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Enter Other value On Confirm Payment page "100"
    Then enter account number On Confirm Payment page "123456"
    Then click On Confirm Button On Confirm Payment page

  @sprint2_2023 @epic-5277 @SP-5286 @SP_5286_TC_07
  Scenario: To Verify FASTag verified user can download the receipt for payment mode Account Transfer
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "Test@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Axis Bank Fastag"
    Then Enter In_First_TextField On PayBill Page "68569769"
    Then Select Payment Mode as "Account Transfer"
    Then enter Payer Mobile Number On PayBill Page "9090909090"
    Then Click on Fetch Bill Button to verify details
    Then Enter Other value On Confirm Payment page "100"
    Then enter account number On Confirm Payment page "123456"
    Then click On Confirm Button On Confirm Payment page

  @sprint2_2023 @epic-5277 @SP-5286 @SP_5286_TC_08
  Scenario: To Verify FASTag verified Complain Register
    When Enter the UserNM "ab_agent" and Pass "Test@123" and click on LOGIN as "ab_agent"
    Given Click on Register Complaint Icon
    Then Select Complaint Type "Transaction"
    Then Enter Mobile Number for Register Complaint "9090909090"
    Then Enter Transaction ID "4567"
    Then Select the reason "Transaction Successful, account not updated"
    Then Enter the Description "Transation report was not generated"
    Then Click On Submit button

  @sprint2_2023 @epic-5277 @SP-5286 @SP_5286_TC_09
  Scenario: To Verify FASTag verified Complain Tracking
    When Enter the UserNM "ab_agent" and Pass "Test@123" and click on LOGIN as "ab_agent"
    Given Click on Complaint Tracking Icon
    Then Select BBPS Radio Button
    Then Select Complaint Type for complaint tracking status "Service"
    Then Enter Customer Mobile Number for Complain Tracking "9090909090"
    Then Enter Complaint ID "34567"
    Then Click on View Status Button

  @sprint2_2023 @epic-5277 @SP-5286 @SP_5286_TC_10
  Scenario: To Verify FASTag verified Transaction History
    When Enter the UserNM "ab_agent" and Pass "Test@123" and click on LOGIN as "ab_agent"
    Given Click on Transaction History Icon
    Then Select User "All"
    Then Select Duration "Month"
    Then Click on Search Button

  @sprint2_2023 @epic-5277 @SP-5286 @SP_5286_TC_11
  Scenario: To Verify FASTag verified Search Transaction
    When Enter the UserNM "ab_agent" and Pass "Test@123" and click on LOGIN as "ab_agent"
    Given Click on transaction search Icon
    Then Select Radio Button Transaction
    Then Enter TransactionId "2345"
    Then Click on Proceed Button

  @sprint2_2023 @epic-5277 @SP-5286 @SP_5286_TC_12
  Scenario: To Verify FASTag verified Wallet Statement
    When Enter the UserNM "ab_agent" and Pass "Test@123" and click on LOGIN as "ab_agent"
    Given Click on Wallet Statement Icon
    Then Click on Submit button
