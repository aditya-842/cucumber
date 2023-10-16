Feature: BBPS FASTag through Cash

  @sprint2_2023 @epic-5277 @SP-5285 @SP_5285_TC_02
  Scenario: To check when select FASTag then Validation for Axis Bank FASTag - BHIM biller.
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Axis Bank FASTag - BHIM"
    Then Verify Error Msg On PayBill Page "Please enter valid Vehicle Registration Number"
    Then Verify Error Msg On PayBill Page "Please enter valid Amount"
    Then Verify Error Msg On PayBill Page "Mobile is mandatory"
    Then Enter Vehicle Registration Number On PayBill Page "9090909090"
    Then Enter In_Second_TextField On PayBill Page "@4545"
    Then enter Payer Mobile Number On PayBill Page "@9090909090"
    Then Verify Error Msg On PayBill Page "Please enter valid Amount"
    Then Verify Error Msg On PayBill Page "Mobile number does not meet the requirements. Please try again."
    Then Enter In_Second_TextField On PayBill Page "45#45"
    Then enter Payer Mobile Number On PayBill Page "90909#09090"
    Then Verify Error Msg On PayBill Page "Please enter valid Amount"
    Then Verify Error Msg On PayBill Page "Mobile number does not meet the requirements. Please try again."
    Then Enter In_Second_TextField On PayBill Page "4545#"
    Then enter Payer Mobile Number On PayBill Page "9090909090$"
    Then Verify Error Msg On PayBill Page "Please enter valid Amount"
    Then Verify Error Msg On PayBill Page "Mobile number does not meet the requirements. Please try again."
    Then Enter In_Second_TextField On PayBill Page "45 45"
    Then enter Payer Mobile Number On PayBill Page "90909 09090"
    Then Verify Error Msg On PayBill Page "Please enter valid Amount"
    Then Verify Error Msg On PayBill Page "Mobile number does not meet the requirements. Please try again."

  @sprint2_2023 @epic-5277 @SP-5285 @SP_5285_TC_03 @SP_5285_TC_07 @SP_5285_TC_13 @SP_5285_TC_14 @SP_5285_TC_18 @SP_5285_TC_22 @SP_5285_TC_24
  Scenario: When user enter valid data and click on fetch bill then user navigate on confirm page.
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Axis Bank Fastag"
    Then Enter In_First_TextField On PayBill Page "68569769"
    Then enter Payer Mobile Number On PayBill Page "9090909090"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Verify Field Avialble On Confirm Payment Page "Amount"
    Then Verify Field Avialble On Confirm Payment Page "Customer Convenience Fee"
    Then Verify Field Avialble On Confirm Payment Page "Total"
    Then Verify Field Avialble On Confirm Payment Page "Payment Mode"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Error Msg On PayBill Page "Cash Receipt Number is mandatory"
    Then enter Cash Receipt Number On Confirm Payment page "567@"
    Then Verify Error Msg On PayBill Page "ReceiptNo should be of 1 to 4 character with no special characters."
    Then enter Cash Receipt Number On Confirm Payment page "5671"
    Then Enter Other value On Confirm Payment page "100"
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

  @sprint2_2023 @epic-5277 @SP-5285 @SP_5285_TC_04 @SP_5285_TC_06 @SP_5285_TC_11
  Scenario: Validation for Fastag1 biller.
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Fastag1"
    Then Verify Error Msg On PayBill Page "Please enter valid a"
    Then Verify Error Msg On PayBill Page "Please enter valid a b"
    Then Verify Error Msg On PayBill Page "Please enter valid a b c"
    Then Verify Error Msg On PayBill Page "Please enter valid a b c d"
    Then Verify Error Msg On PayBill Page "Please enter valid a b c d e"
    Then Enter In_First_TextField On PayBill Page "981"
    Then Enter In_Second_TextField On PayBill Page "100"
    Then Enter In_Third_TextField On PayBill Page "123"
    Then Enter In_Fourth_TextField On PayBill Page "154"
    Then Enter In_Fifth_TextField On PayBill Page "459"
    Then enter Payer Mobile Number On PayBill Page "9090909090"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Verify Field Avialble On Confirm Payment Page "Amount"
    Then Verify Field Avialble On Confirm Payment Page "Customer Convenience Fee"
    Then Verify Field Avialble On Confirm Payment Page "Total"
    Then Verify Field Avialble On Confirm Payment Page "Payment Mode"

  @sprint2_2023 @epic-5277 @SP-5285 @SP_5285_TC_05 @SP_5285_TC_09
  Scenario: Validation for Fastag1 biller.
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "OU12 FASTag"
    Then Enter In_First_TextField On PayBill Page "9877879869"
    Then Enter In_Second_TextField On PayBill Page "100"
    Then enter Payer Mobile Number On PayBill Page "9090909090"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Verify Confirm Payment Header
    Then Verify Field Avialble On Confirm Payment Page "Amount"
    Then Verify Field Avialble On Confirm Payment Page "Customer Convenience Fee"
    Then Verify Field Avialble On Confirm Payment Page "Total"
    Then Verify Field Avialble On Confirm Payment Page "Payment Mode"

  @sprint2_2023 @epic-5277 @SP_5285_TC_08 @SP_5285_TC_15 @SP_5285_TC_19 @SP_5285_TC_23 @SP_5285_TC_25
  Scenario: When user enter valid data and click on fetch bill then user navigate on confirm page.
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2c" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2c"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Axis Bank Fastag"
    Then Enter In_First_TextField On PayBill Page "68569769"
    Then enter Payer Mobile Number On PayBill Page "9090909090"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Verify Field Avialble On Confirm Payment Page "Amount"
    Then Verify Field Avialble On Confirm Payment Page "Customer Convenience Fee"
    Then Verify Field Avialble On Confirm Payment Page "Total"
    Then Verify Field Avialble On Confirm Payment Page "Payment Mode"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Error Msg On PayBill Page "Cash Receipt Number is mandatory"
    Then enter Cash Receipt Number On Confirm Payment page "567@"
    Then Verify Error Msg On PayBill Page "ReceiptNo should be of 1 to 4 character with no special characters."
    Then enter Cash Receipt Number On Confirm Payment page "5671"
    Then Enter Other value On Confirm Payment page "100"
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

  @sprint2_2023 @epic-5277 @SP-5285 @SP_5285_TC_10
  Scenario: verify confirmation page fields with cash mode for b2c
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2c" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2c"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "OU12 FASTag"
    Then Enter In_First_TextField On PayBill Page "9877879869"
    Then Enter In_Second_TextField On PayBill Page "100"
    Then enter Payer Mobile Number On PayBill Page "9090909090"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Verify Field Avialble On Confirm Payment Page "Amount"
    Then Verify Field Avialble On Confirm Payment Page "Customer Convenience Fee"
    Then Verify Field Avialble On Confirm Payment Page "Total"
    Then Verify Field Avialble On Confirm Payment Page "Payment Mode"

  @sprint2_2023 @epic-5277 @SP-5285 @SP_5285_TC_12
  Scenario: Validation for Fastag1 biller.
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2c" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2c"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Fastag1"
    Then Verify Error Msg On PayBill Page "Please enter valid a"
    Then Verify Error Msg On PayBill Page "Please enter valid a b"
    Then Verify Error Msg On PayBill Page "Please enter valid a b c"
    Then Verify Error Msg On PayBill Page "Please enter valid a b c d"
    Then Verify Error Msg On PayBill Page "Please enter valid a b c d e"
    Then Enter In_First_TextField On PayBill Page "981"
    Then Enter In_Second_TextField On PayBill Page "100"
    Then Enter In_Third_TextField On PayBill Page "123"
    Then Enter In_Fourth_TextField On PayBill Page "154"
    Then Enter In_Fifth_TextField On PayBill Page "459"
    Then enter Payer Mobile Number On PayBill Page "9090909090"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Verify Field Avialble On Confirm Payment Page "Amount"
    Then Verify Field Avialble On Confirm Payment Page "Customer Convenience Fee"
    Then Verify Field Avialble On Confirm Payment Page "Total"
    Then Verify Field Avialble On Confirm Payment Page "Payment Mode"

  @sprint2_2023 @epic-5277 @SP-5285 @SP_5285_TC_16
  Scenario: verify cancel field on confirmation page b2b
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Axis Bank Fastag"
    Then Enter In_First_TextField On PayBill Page "68569769"
    Then enter Payer Mobile Number On PayBill Page "9090909090"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Verify Field Avialble On Confirm Payment Page "Amount"
    Then Verify Field Avialble On Confirm Payment Page "Customer Convenience Fee"
    Then Verify Field Avialble On Confirm Payment Page "Total"
    Then Verify Field Avialble On Confirm Payment Page "Payment Mode"
    Then click On Cancel Button On Confirm Payment page

  @sprint2_2023 @epic-5277 @SP-5285 @SP_5285_TC_17
  Scenario: verify cancel field on confirmation page b2c
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2c" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2c"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Axis Bank Fastag"
    Then Enter In_First_TextField On PayBill Page "68569769"
    Then enter Payer Mobile Number On PayBill Page "9090909090"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then Verify Field Avialble On Confirm Payment Page "Amount"
    Then Verify Field Avialble On Confirm Payment Page "Customer Convenience Fee"
    Then Verify Field Avialble On Confirm Payment Page "Total"
    Then Verify Field Avialble On Confirm Payment Page "Payment Mode"
    Then click On Cancel Button On Confirm Payment page

  @sprint2_2023 @epic-5277 @SP_5285_TC_28
  Scenario: verify transaction page for failed transaction
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Bank  - Fastag"
    Then Enter In_First_TextField On PayBill Page "68569769"
    Then enter Payer Mobile Number On PayBill Page "9090909090"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then enter Cash Receipt Number On Confirm Payment page "5671"
    Then Enter Other value On Confirm Payment page "100"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Transaction Status Failed Avialble On Transaction Details Page
