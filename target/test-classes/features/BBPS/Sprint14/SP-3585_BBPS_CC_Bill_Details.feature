Feature: BBPS CC - Bill Details

  @sprint14 @epic-3580 @SP-3585 @SP_3585_TC_02
  Scenario: To check whether BBPS CC - enter valid data for fetch details
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then Enter Payer Mobile Number for Card Number "9898989898"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header

  @sprint14 @epic-3580 @SP-3585 @SP_3585_TC_03
  Scenario: To check whether BBPS CC - verify radio button on confirm payment page minimum due amount, total outstanding amount and other
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then Enter Payer Mobile Number for Card Number "9898989898"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then verify Radio Button On Confirm Payment page "Minimum due amount"
    Then verify Radio Button On Confirm Payment page "Total outstanding amount"
    Then verify Radio Button On Confirm Payment page "Other"

  @sprint14 @epic-3580 @SP-3585 @SP_3585_TC_04
  Scenario: To check whether BBPS CC - confirm page 2 fields should be visilble & payment mode is cash
    Given User is on LoginPage
    When Enter the UserNM "AgentAJ05" and Pass "Test@123" and click on LOGIN as "AgentAJ05"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then Enter Payer Mobile Number for Card Number "9898989898"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Verify Cash Receipt Number On Confirm Payment page
    Then Verify_Amount_field_On_Confirm_Payment_page

  @sprint14 @epic-3580 @SP-3585 @SP_3585_TC_05
  Scenario: To check whether BBPS CC - confirm page 2 fields should be visilble & payment mode is account transfer
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then Enter Payer Mobile Number for Card Number "9898989898"
    Then Select Payment Mode as "Account Transfer"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Verify account number field On Confirm Payment page
    Then Verify_Amount_field_On_Confirm_Payment_page

  @sprint14 @epic-3580 @SP-3585 @SP_3585_TC_06
  Scenario: To check whether BBPS CC - confirm page 2 fields should be visilble & payment mode is account transfer
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Bank of Baroda test"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then Enter Payer Mobile Number for Card Number "9898989898"
    Then Select Payment Mode as "Account Transfer"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then click On Radio Button On Confirm Payment page "Other"
    Then enter Amount On Confirm Payment page "160"
