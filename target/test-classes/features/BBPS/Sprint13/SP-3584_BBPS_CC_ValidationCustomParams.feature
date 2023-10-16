Feature: BBPS Credit Card - Validations of customer params

  @sprint13 @epic-3580 @SP-3584 @SP_3584_TC_01
  Scenario: To check whether Agent group admin user can Register Complaint.
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Verify Custom Params "Mobile Number"
    Then Verify Custom Params "Last 4 Digits of Card Number"

  @sprint13 @epic-3580 @SP-3584 @SP_3584_TC_02
  Scenario: To check whether Agent group admin user can Register Complaint.
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Verify Error message "Please enter valid Mobile Number" for Custom Param "Mobile Number"
    Then Verify Error message "Please enter valid Last 4 Digits of Card Number" for Custom Param "Last 4 Digits of Card Number"
    Then Verify Error message "Mobile is mandatory" for Custom Param "Payer Mobile"

  @sprint13 @epic-3580 @SP-3584 @SP_3584_TC_03 @SP_3584_TC_04 @SP_3584_TC_05
  Scenario Outline: To check whether Agent group admin user can Register Complaint.
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Verify error for invalid data "<Data1>" , "<Error_Message1>" and "<Custom_Param1>"
    Then Verify error for invalid data "<Data2>" , "<Error_Message2>" and "<Custom_Param2>"
    Then Verify error for invalid data "<Data3>" , "<Error_Messag3>" and "<Custom_Param3>"

    Examples: 
      | Custom_Param1 | Data1  | Error_Message1                         | Custom_Param2                | Data2 | Error_Message2                                  | Custom_Param3 | Data3      | Error_Messag3                                                   |
      | Mobile Number |   9765 | Please enter valid Mobile Number - min | Last 4 Digits of Card Number | !434  | Please enter valid Last 4 Digits of Card Number | Payer Mobile  | $89878765  | Mobile number does not meet the requirements. Please try again. |
      | Mobile Number |   9765 | Please enter valid Mobile Number - min | Last 4 Digits of Card Number | 43!4  | Please enter valid Last 4 Digits of Card Number | Payer Mobile  | 9898&98765 | Mobile number does not meet the requirements. Please try again. |
      | Mobile Number | 392765 | Please enter valid Mobile Number - min | Last 4 Digits of Card Number | 434$  | Please enter valid Last 4 Digits of Card Number | Payer Mobile  | 989878765! | Mobile number does not meet the requirements. Please try again. |

  @sprint13 @epic-3580 @SP-3584 @SP_3584_TC_06
  Scenario: login as a Agent User, Verify Error messages when enter data with space.
    Given User is on LoginPage
    When Enter the UserNM "test_agent3" and Pass "Test@123" and click on LOGIN as "test_agent3"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Enter In_First_TextField On PayBill Page "23 423"
    Then Enter In_Second_TextField On PayBill Page "3 21"
    Then enter Payer Mobile Number On PayBill Page "879 879"
    Then Verify Error Msg On PayBill Page "Please enter valid Mobile Number - min"
    Then Verify Error Msg On PayBill Page "Please enter valid Last 4 Digits of Card Number"
    Then Verify Error Msg On PayBill Page "Mobile number does not meet the requirements. Please try again."

  @sprint13 @epic-3580 @SP-3584 @SP_3584_TC_08
  Scenario: login as a Agent User, default "Cash" option selected in Payment mode dropdown.
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Select Payment Mode "Cash"

  @sprint13 @epic-3580 @SP-3584 @SP_3584_TC_09
  Scenario: Verify Payment mode dropdown Options.
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Select Payment Mode "Cash"
    Then Select Payment Mode "Account Number"

  @sprint13 @epic-3580 @SP-3584 @SP_3584_TC_11
  Scenario: ogin as a Agent User, Verify user able to enter valid data
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Select Payment Mode "Cash"
    Then Enter Mobile Number "9867899898"
    Then Enter In_Second_TextField On PayBill Page "8765"
    Then enter Payer Mobile Number On PayBill Page "9887986756"
