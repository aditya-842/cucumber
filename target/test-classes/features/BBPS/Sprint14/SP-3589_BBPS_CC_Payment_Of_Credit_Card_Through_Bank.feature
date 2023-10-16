Feature: BBPS CC - Payment of Credit card through Bank

  @sprint14 @epic-3580 @SP-3589 @SP_3589_TC_02 @SP_3589_TC_03
  Scenario: To check whether BBPS CC - user select minimum due amount, enter valid account number & navigate to Transaction Details page
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "Test@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Enter Mobile Number for Card Number "7897897890"
    Then Enter cardNumber for Card Number "6789"
    Then Select Payment Mode as "Account Transfer"
    Then Enter Payer Mobile Number for Card Number "9898989898"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then click On Radio Button On Confirm Payment page "Minimum due amount"
    Then Verify account number field On Confirm Payment page
    Then enter account number On Confirm Payment page "123456"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Transaction Details Header

  @sprint14 @epic-3580 @SP-3589 @SP_3589_TC_04
  Scenario: To check whether BBPS CC - verify transaction page details
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "Test@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then Select Payment Mode as "Account Transfer"
    Then Enter Payer Mobile Number for Card Number "9898989898"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then click On Radio Button On Confirm Payment page "Minimum due amount"
    Then Verify account number field On Confirm Payment page
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

  @sprint14 @epic-3580 @SP-3589 @SP_3589_TC_05
  Scenario: payment is unsuccessful then transaction gets failed
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "Test@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "CCardBiller1"
    Then Enter value of a "1"
    Then Enter value of ab "2"
    Then Enter value of abc "1"
    Then Enter value of abcd "2"
    Then Enter value of abcde "1"
    Then Select Payment Mode as "Account Transfer"
    Then Enter Payer Mobile Number for Card Number "9898989898"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then click On Radio Button On Confirm Payment page "Total outstanding amount"
    Then Verify account number field On Confirm Payment page
    Then enter account number On Confirm Payment page "123456"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Transaction Details Header
    Then Verify Transaction Status Failed Avialble On Transaction Details Page

  @sprint14 @epic-3580 @SP-3589 @SP_3589_TC_06
  Scenario: To check whether BBPS CC - select outstanding amount, enter valid account number & navigate to Transaction Details page
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "Test@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Enter Mobile Number for Card Number "7897897890"
    Then Enter cardNumber for Card Number "6789"
    Then Select Payment Mode as "Account Transfer"
    Then Enter Payer Mobile Number for Card Number "9898989898"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then click On Radio Button On Confirm Payment page "Total outstanding amount"
    Then Verify account number field On Confirm Payment page
    Then enter account number On Confirm Payment page "123456"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Transaction Details Header

  @sprint14 @epic-3580 @SP-3589 @SP_3589_TC_07
  Scenario: To check whether BBPS CC - amount is higher then the total outstanding amount , error should be displayed
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "Test@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Bank of Baroda"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then Select Payment Mode as "Account Transfer"
    Then Enter Payer Mobile Number for Card Number "9898989898"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then click On Radio Button On Confirm Payment page "Other"
    Then enter Amount On Confirm Payment page "9999"
    Then Verify account number field On Confirm Payment page
    Then enter account number On Confirm Payment page "123456"
    Then Verify Eorror Msg On Confirm Payment Page "Please enter amount lower than total outstanding amount"

  @sprint14 @epic-3580 @SP-3589 @SP_3589_TC_08
  Scenario: To check whether BBPS CC - amount is higher then the total outstanding amount , error should be displayed
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "Test@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Bank of Baroda test"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then Select Payment Mode as "Account Transfer"
    Then Enter Payer Mobile Number for Card Number "9898989898"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then click On Radio Button On Confirm Payment page "Other"
    Then enter Amount On Confirm Payment page "1510"
    Then Verify account number field On Confirm Payment page
    Then enter account number On Confirm Payment page "123456"
    Then click On Confirm Button On Confirm Payment page
    Then click On Yes or No Button On Confirm Payment page For Popup "Yes"
    Then Verify Transaction Details Header
