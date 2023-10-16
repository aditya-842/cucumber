Feature: BBPS - H&P Validations of customer params

  @sprint15 @epic-3580 @SP_4634 @TC_02 @TC_03 @TC_04
  Scenario: To check whether Bill Payer Information available for all biller of H&P category
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then select Biller From Dropdown "B.K. Arogyam and Research Pvt. Ltd"
    Then enter Registered Mobile Number On PayBill Page "8878767876"
    Then enter Payer Mobile Number On PayBill Page "9989890987"
    Then Click on Fetch Bill Button to verify details
    Then enter Cash Receipt Number On Confirm Payment page "1234"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Msg On Confirm Payment Page "Transaction processed successfully."
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
