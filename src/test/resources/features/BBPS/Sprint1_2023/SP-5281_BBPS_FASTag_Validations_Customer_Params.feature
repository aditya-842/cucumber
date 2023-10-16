Feature: BBPS FASTag - Validation Custom perams

  @sprint1_2023 @epic-5277 @SP-5281 @SP_5281_TC_02
  Scenario: verify Error messages for biller with 1 field
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Axis Bank FASTag - BHIM"
    Then Verify Error Msg On PayBill Page "Please enter valid Vehicle Registration Number"
    Then Enter In_First_TextField On PayBill Page "6856"
    Then Verify Error Msg On PayBill Page "Please enter valid Vehicle Registration Number - min"

  @sprint1_2023 @epic-5277 @SP-5281 @SP_5281_TC_03 @SP_5281_TC_04 @SP_5281_TC_05 @SP_5281_TC_06
  Scenario: verify Error messages for biller with 1 field
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Category Available On PayBill Page "FASTag"
    Then select Biller From Dropdown "Fastag1"
    Then Verify Error Msg On PayBill Page "Please enter valid a"
    Then Verify Error Msg On PayBill Page "Please enter valid a b"
    Then Verify Error Msg On PayBill Page "Please enter valid a b c"
    Then Verify Error Msg On PayBill Page "Please enter valid a b c d"
    Then Verify Error Msg On PayBill Page "Please enter valid a b c d e"
    Then Verify Error Msg On PayBill Page "Mobile is mandatory"
    Then enter Payer Mobile Number On PayBill Page "@9090909090"
    Then Verify Error Msg On PayBill Page "Mobile number does not meet the requirements. Please try again."
    Then enter Payer Mobile Number On PayBill Page "9090"
    Then Verify Error Msg On PayBill Page "Mobile number does not meet the requirements. Please try again."
    Then enter Payer Email On PayBill Page "fjksd"
    Then enter Payer Mobile Number On PayBill Page "9090909090"
    Then Verify Error Msg On PayBill Page "Please enter valid Email"
    Then enter Payer Email On PayBill Page "tyrtyuy@gmail.c"
    Then Verify Error Msg On PayBill Page "Invalid Email Address-> Valid emails:user@gmail.com or my.user@domain.com etc."
