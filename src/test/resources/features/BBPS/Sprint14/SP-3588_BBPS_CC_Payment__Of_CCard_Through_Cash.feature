Feature: BBPS CC - Payment of Credit card through Cash

  @sprint14 @epic-3580 @SP-3588 @SP_3588_TC_02 @SP_3588_TC_03
  Scenario: To check whether BBPS CC - Display of customer params
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then Enter Payer Mobile Number for Card Number "9898989898"
    Then Click on Fetch Bill Button For Credit Card
    Then Verify Confirm Payment Header
    Then click On Radio Button On Confirm Payment page "Minimum due amount"
    Then Verify Cash Receipt Number On Confirm Payment page
    Then enter Cash Receipt Number On Confirm Payment page "5678"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Transaction Details Header

  @sprint14 @epic-3580 @SP-3588 @SP_3588_TC_04 @SP_3588_TC_05
  Scenario: To check whether BBPS CC - Display of customer params
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then Enter Payer Mobile Number for Card Number "9898989898"
    Then Click on Fetch Bill Button For Credit Card
    Then Verify Confirm Payment Header
    Then click On Radio Button On Confirm Payment page "Total outstanding amount"
    Then Verify Cash Receipt Number On Confirm Payment page
    Then enter Cash Receipt Number On Confirm Payment page "5678"
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

  @sprint14 @epic-3580 @SP-3588 @SP_3588_TC_07
  Scenario: To check whether user select total outstanding amount & enter valid cash receipt number to navigate Transaction Details page
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2c" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2c"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then Enter Payer Mobile Number for Card Number "9898989898"
    Then Click on Fetch Bill Button For Credit Card
    Then Verify Confirm Payment Header
    Then click On Radio Button On Confirm Payment page "Minimum due amount"
    Then Verify Cash Receipt Number On Confirm Payment page
    Then enter Cash Receipt Number On Confirm Payment page "5678"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Transaction Details Header

  @sprint14 @epic-3580 @SP_3588_SP-3588 @SP_3588_TC_08
  Scenario: To check whether user select total outstanding amount & enter valid cash receipt number to navigate Transaction Details page
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "CCardBiller1"
    Then Enter value of a "1"
    Then Enter value of ab "2"
    Then Enter value of abc "1"
    Then Enter value of abcd "2"
    Then Enter value of abcde "1"
    Then Enter Payer Mobile Number for Card Number "9898989898"
    Then Click on Fetch Bill Button For Credit Card
    Then Verify Confirm Payment Header
    Then click On Radio Button On Confirm Payment page "Total outstanding amount"
    Then Verify Cash Receipt Number On Confirm Payment page
    Then enter Cash Receipt Number On Confirm Payment page "5678"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Transaction Details Header
    Then Verify Transaction Status Failed Avialble On Transaction Details Page

  @sprint14 @epic-3580 @SP-3588 @SP_3588_TC_09
  Scenario: To check whether BBPS CC - Display of customer params
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Then Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Bank of Baroda"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then Enter Payer Mobile Number for Card Number "9898989898"
    Then Click on Fetch Bill Button For Credit Card
    Then Verify Confirm Payment Header
    Then click On Radio Button On Confirm Payment page "Other"
    Then Verify Cash Receipt Number On Confirm Payment page
    Then enter Amount On Confirm Payment page "160"
    Then enter Cash Receipt Number On Confirm Payment page "5678"
    Then Verify Eorror Msg On Confirm Payment Page "Please enter amount higher than minimum due amount"

  @sprint14 @epic-3580 @SP-3588 @SP_3588_TC_10
  Scenario: To check amount is greater then total outstanding amount, popup window shown & enter valid cash receipt number to navigate Transaction Details page
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Bank of Baroda"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then Enter Payer Mobile Number for Card Number "9898989898"
    Then Click on Fetch Bill Button For Credit Card
    Then Verify Confirm Payment Header
    Then click On Radio Button On Confirm Payment page "Other"
    Then Verify Cash Receipt Number On Confirm Payment page
    Then enter Amount On Confirm Payment page "1250"
    Then enter Cash Receipt Number On Confirm Payment page "5678"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Transaction Details Header