Feature: BBPS - H&P Validations of customer params

  @sprint15 @epic-3580 @SP-4631 @TC_01 @TC_03 @TC_04 @TC_05 @TC_06 @TC_07 @TC_09 @TC_10
  Scenario: To check whether Bill Payer Information available for all biller of H&P category
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then select Biller From Dropdown "B.K. Arogyam and Research Pvt. Ltd"
    Then Verify Error Msg On PayBill Page "Please enter valid Registered Mobile Number"
    Then Verify Error Msg On PayBill Page "Mobile is mandatory"
    Then enter Registered Mobile Number On PayBill Page "@878767876"
    Then Verify Error Msg On PayBill Page "Please enter valid Registered Mobile Number"
    Then enter Payer Mobile Number On PayBill Page "@989890987"
    Then Verify Error Msg On PayBill Page "Mobile number does not meet the requirements. Please try again."
    Then enter Registered Mobile Number On PayBill Page "87876#7876"
    Then Verify Error Msg On PayBill Page "Please enter valid Registered Mobile Number"
    Then enter Payer Mobile Number On PayBill Page "9898#90987"
    Then Verify Error Msg On PayBill Page "Mobile number does not meet the requirements. Please try again."
    Then enter Registered Mobile Number On PayBill Page "878767876@"
    Then Verify Error Msg On PayBill Page "Please enter valid Registered Mobile Number"
    Then enter Payer Mobile Number On PayBill Page "989890987@"
    Then Verify Error Msg On PayBill Page "Mobile number does not meet the requirements. Please try again."
    Then enter Registered Mobile Number On PayBill Page "87876 7876"
    Then Verify Error Msg On PayBill Page "Please enter valid Registered Mobile Number"
    Then enter Payer Mobile Number On PayBill Page "98989 0987"
    Then Verify Error Msg On PayBill Page "Mobile number does not meet the requirements. Please try again."
    Then enter Registered Mobile Number On PayBill Page "684378857765467"
    Then Verify Registered Mobile Number Not More Then 10 Digit On PayBill Page "684378857765467"
    Then enter Registered Mobile Number On PayBill Page "7876"
    Then Verify Error Msg On PayBill Page "Please enter valid Registered Mobile Number - min"
    Then enter Payer Mobile Number On PayBill Page "0987"
    Then Verify Error Msg On PayBill Page "Mobile number does not meet the requirements. Please try again."
    
   @sprint15 @epic-3580 @SP-4631 @TC_02 @TC_03 @TC_04 @TC_05 @TC_06 @TC_07 @TC_08 @TC_09 @TC_10
  Scenario: To check whether Bill Payer Information available for all biller of H&P category
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then select Biller From Dropdown "Billroth Hospitals Pvt Ltd"
    Then Verify Error Msg On PayBill Page "Please enter valid UHID"
    Then Verify Error Msg On PayBill Page "Mobile is mandatory"
    Then enter UHID On PayBill Page "@87876djahghfs"
    Then Verify Error Msg On PayBill Page "Please enter valid UHID"
    Then enter UHID On PayBill Page "87876dj@ahghfs"
    Then Verify Error Msg On PayBill Page "Please enter valid UHID"
    Then enter UHID On PayBill Page "87876djahghfs$"
    Then Verify Error Msg On PayBill Page "Please enter valid UHID"
    Then enter UHID On PayBill Page "87876dj ahghfs"
    Then Verify Error Msg On PayBill Page "Please enter valid UHID"
    Then enter UHID On PayBill Page "97887877668769669669696989869"
    Then Verify UHID Not More Then 20 Digit On PayBill Page "97887877668769669669696989869"
     Then Click On Payment Mode Field On PayBill Page
    Then Verify Payment Mode Field On PayBill Page "Cash"
    Then Verify Payment Mode Field On PayBill Page "Account Transfer"
    Then Select Payment Mode Field On PayBill Page "Cash"