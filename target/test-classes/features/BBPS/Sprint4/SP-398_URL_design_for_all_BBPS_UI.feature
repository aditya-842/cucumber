Feature: URL design for all BBPS UI

  @sprint4 @epic-42 @SP-398 @TC_BBPS_B2B_004
  Scenario: To check whether Agent group admin user can Register Complaint.
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "Test@123" and click on LOGIN as "Auto_Agent"
    Given Click on Register Complaint Icon
    Then Select Complaint Type "Transaction"
    Then Enter Mobile Number for Register Complaint "7890789090"
    Then Enter Transaction ID "COM12345"
    Then Select the reason "Others, provide details in description"
    Then Enter the Description "QA Testing"
    Then Click On Submit button

  @sprint4 @epic-42 @SP-398 @TC_BBPS_B2B_007
  Scenario: To check whether the Agent group admin user can view and download the wallet statement.
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "Test@123" and click on LOGIN as "Auto_Agent"
    Given Click on Wallet Statement Icon
    Then Click on Submit button
    Then Click on Download button

  @sprint4 @epic-42 @SP-398 @TC_BBPS_B2B_008
  Scenario: To check whether the Agent admin user can create a admin/non admin user for its own entity.
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "Test@123" and click on LOGIN as "Auto_Agent"
    When Click on Entities in Configurations Menu
    Then Click on Add User Button
    Then Enter Login Id "Agent_User_04"
    Then Enter Display Name "Agent_User_04"
    Then Enter Mobile Number for new admin user "7890789098"
    Then Enter Email "agent_user@test.com"
    Then Click on Active Dropdown and Select Value "Y"
    Then Click on Admin Checkbox
    Then Click on Default Permission for new admin user
    Then Click on Save Button

  @sprint4 @epic-42 @SP-398 @TC_BBPS_B2C_001
  Scenario: To check whether Agent admin user can perform pay bill for different billers.
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "Test@123" and click on LOGIN as "Auto_Agent"
    Then Click on Pay Bill module
    Then Select Electricity Icon
    Then Select Biller or provider "shin Gujarat Vij Company Limited (DGVCL) "
    Then Enter In_First_TextField On PayBill Page "45372324814"
    Then Enter Payer Mobile Number "9423846211"
    Then Enter Payer Email "ehub.testing@sarvatra.in"
    Then Enter Amount for payer "500"
    Then Click on Pay Bill button and View bill details
    Then Enter Cash Receipt Number "4321"
    Then Click on Payment CONFIRM button
    Then Click on print button for receipt to download the receipt on system

  @sprint4 @epic-42 @SP-398 @TC_BBPS_B2C_002
  Scenario: To check whether Agent admin user can perform pay bill for different billers.(Validate bill)
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "Test@123" and click on LOGIN as "Auto_Agent"
    Then Click on Pay Bill module
    Then Select Mobile Postpaid Icon
    Then Click on Biller Field and Provide Biller "Idea Postpaid" - IDEA00000NAT01
    Then Enter Consumer Mobile Number "7972324814"
    Then Enter Payer Mobile Number "9423846211" for mobile postpaid
    Then Enter Payer Email "ehub.testing@sarvatra.in" for mobile postpaid
    Then Enter Amount for payer "500" for mobile postpaid
    Then Click on Validate Bill button and Bill gets Validate
    Then Click on Pay Bill Button for mobile postpaid
    Then Enter cash reciept no "3245" for mobile postpaid
    Then Click on Confirm Button

  @sprint4 @epic-42 @SP-398 @TC_BBPS_B2C_003
  Scenario: To check whether Agent admin user can perform pay bill for different billers.(Education Fees Category)
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "Test@123" and click on LOGIN as "Auto_Agent"
    Then Click on Pay Bill module
    Then Select Education Fees Icon
    Then Enter The State "MAHARASHTRA"
    Then Enter The City "Pune"
    Then Click On Submit Button
    Then Enter Education Fees Payments "Aaryans School" - EDU010027MAH01
    Then Enter Student Unique ID "54634573567357"
    Then Enter Mobile Number Of Parent "9878709879"
    Then Enter DOB of Student "14052003"
    Then Select Payment Mode as "Account Transfer"
    Then Enter Payer Mobile No "7870989800"
    Then Enter Payer Email "payer@email.com" for the education fees
    Then Click on Fetch Bill Button to verify details
    Then Enter Account Number "656565"
    Then Click on Confirm Button for the education fees

  @sprint4 @epic-42 @SP-398 @TC_BBPS_B2C_004
  Scenario: To check whether Agent admin user can view transaction history.
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Transaction History Icon
    Then Select User "All"
    Then Select Duration "Month"
    Then Click on Search Button
    Then Click on Download button
 #print Window
 # @sprint4 @epic-42 @SP-398 @TC_BBPS_B2C_007
 # Scenario: To check whether Agent group admin user can search transaction.
 #   Given User is on LoginPage
 #   When Enter the UserNM "Auto_Agent" and Pass "Test@123" and click on LOGIN as "Auto_Agent"
 #   Given Click on transaction search Icon
 #   Then Select Radio Button Transaction
 #   Then Enter TransactionId "1234567890"
 #   Then Click on Proceed Button
 #   Then Click on Print Icon
