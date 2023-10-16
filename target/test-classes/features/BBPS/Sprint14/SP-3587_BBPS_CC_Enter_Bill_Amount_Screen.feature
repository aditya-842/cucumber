Feature: BBPS CC - Enter Bill Amount Screen

  @sprint14 @epic-3580 @SP-3587 @SP_3587_TC_02
  Scenario: To check whether BBPS CC - enter valid data for fetch details
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Enter Mobile Number for Card Number "7897897890"
    Then Enter cardNumber for Card Number "6789"
    Then enter Payer Mobile Number On PayBill Page "9898989898"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header

  @sprint14 @epic-3580 @SP-3587 @SP_3587_TC_03
  Scenario: To check whether BBPS CC - Display of customer params
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then enter Payer Mobile Number On PayBill Page "9898989898"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Verify Cash Receipt Number On Confirm Payment page
    Then Verify_Amount_field_On_Confirm_Payment_page

  @sprint14 @epic-3580 @SP-3587 @SP_3587_TC_04
  Scenario: To check whether BBPS CC - Display of customer params
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then Select Payment Mode as "Account Transfer"
    Then enter Payer Mobile Number On PayBill Page "9898989898"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Verify account number field On Confirm Payment page
    Then Verify_Amount_field_On_Confirm_Payment_page

  @sprint14 @epic-3580 @SP-3587 @SP_3587_TC_05 @SP_3587_TC_06 @SP_3587_TC_16
  Scenario: To check whether BBPS CC - Display of customer params
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then enter Payer Mobile Number On PayBill Page "9898989898"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then verify Radio Button On Confirm Payment page "Minimum due amount"
    Then verify Radio Button On Confirm Payment page "Total outstanding amount"
    Then verify Radio Button On Confirm Payment page "Other"

  @sprint14 @epic-3580 @SP-3587 @SP_3587_TC_07
  Scenario: To check whether BBPS CC - Agent can Select only one radio button
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Bank of Baroda"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then enter Payer Mobile Number On PayBill Page "9898989898"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then click On Radio Button On Confirm Payment page "Minimum due amount"
    Then click On Radio Button On Confirm Payment page "Total outstanding amount"
    Then click On Radio Button On Confirm Payment page "Other"

  @sprint14 @epic-3580 @SP-3587 @SP_3587_TC_08
  Scenario: To check whether BBPS CC - If Minimum Due button is chosen then minimum due amount will be populated in amount field
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then enter Payer Mobile Number On PayBill Page "9898989898"
    Then Enter Payer Email for Card Number "payer@test.com"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then click On Radio Button On Confirm Payment page "Minimum due amount"
    Then Verify the Amount Field Is Not Empty

  @sprint14 @epic-3580 @SP-3587 @SP_3587_TC_09
  Scenario: To check whether BBPS CC - Total outstanding is chosen then total outstanding amount value will be populated in amount field
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Then Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then enter Payer Mobile Number On PayBill Page "9898989898"
    Then Enter Payer Email for Card Number "payer@test.com"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then click On Radio Button On Confirm Payment page "Total outstanding amount"
    Then Verify the Amount Field Is Not Empty

  @sprint14 @epic-3580 @SP-3587 @SP_3587_TC_10
  Scenario: To check whether BBPS CC - other is chosen then agent can enter any amount below
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Then Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Bank of Baroda"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then enter Payer Mobile Number On PayBill Page "9898989898"
    Then Enter Payer Email for Card Number "payer@test.com"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then click On Radio Button On Confirm Payment page "Other"
    Then enter Amount On Confirm Payment page "220"

  @sprint14 @epic-3580 @SP-3587 @SP_3587_TC_11
  Scenario: To check whether BBPS CC - EEntered amount value should be higher than MinimumDueAmount
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Bank of Baroda"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then enter Payer Mobile Number On PayBill Page "9898989898"
    Then Enter Payer Email for Card Number "payer@test.com"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then click On Radio Button On Confirm Payment page "Other"
    Then enter Amount On Confirm Payment page "201"
    Then enter Cash Receipt Number On Confirm Payment page "5678"

  @sprint14 @epic-3580 @SP-3587 @SP_3587_TC_12
  Scenario: To check whether BBPS CC - error message Please enter Amount higher than minimum due amount
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Bank of Baroda"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then enter Payer Mobile Number On PayBill Page "9898989898"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then click On Radio Button On Confirm Payment page "Other"
    Then enter Amount On Confirm Payment page "199"
    Then enter Cash Receipt Number On Confirm Payment page "5678"
    Then Verify Eorror Msg On Confirm Payment Page "Please enter amount higher than minimum due amount"

  @sprint14 @epic-3580 @SP-3587 @SP_3587_TC_13 @SP_3587_TC_15
  Scenario: To check whether BBPS CC - minimum due amount: Y, total outstanding: Y & other: N
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then enter Payer Mobile Number On PayBill Page "9898989898"
    Then Enter Payer Email for Card Number "payer@test.com"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then verify Radio Button On Confirm Payment page "Other" is disable

  @sprint14 @epic-3580 @SP-3587 @SP_3587_TC_14 @SP_3587_TC_17
  Scenario: To check whether BBPS CC - user can enter amount above total outstanding amount
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Bank of Baroda test"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then enter Payer Mobile Number On PayBill Page "9898989898"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then click On Radio Button On Confirm Payment page "Other"
    Then enter Amount On Confirm Payment page "1600"
    Then enter Cash Receipt Number On Confirm Payment page "5678"
    Then click On Confirm Button On Confirm Payment page
    Then click On Yes or No Button On Confirm Payment page For Popup "Yes"
