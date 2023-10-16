Feature: BBPS - H&P category Display of customer params

  @sprint15 @epic-3580 @SP-4630 @TC_02 @TC_03 @TC_04 @TC_06
  Scenario: To check whether Bill Payer Information available for all biller of H&P category
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then select Biller From Dropdown "B.K. Arogyam and Research Pvt. Ltd"
    Then Verify Payer Mobile Number Field On PayBill Page
    Then Verify Payer Email Field On PayBill Page
    Then Click On Payment Mode Field On PayBill Page
    Then Verify Payment Mode Field On PayBill Page "Cash"
    Then Verify Payment Mode Field On PayBill Page "Account Transfer"
    Then Select Payment Mode Field On PayBill Page "Cash"
    Then Verify Fetch bill Button On PayBill Page
    Then Verify Registered Mobile Number On PayBill Page
    
   @sprint15 @epic-3580 @SP-4630 @TC_05
  Scenario: To check whether Bill Payer Information available for all biller of H&P category
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then select Biller From Dropdown "Billroth Hospitals Pvt Ltd"
    Then Verify Payer Mobile Number Field On PayBill Page
    Then Verify Payer Email Field On PayBill Page
    Then Verify UHID On PayBill Page
    Then Verify Fetch bill Button On PayBill Page