Feature: Enter Bill Amount screen - II

  @sprint2_2023 @epic-5277 @SP-6457 @SP_6457_TC_01
  Scenario: To verify radio buttons on confirmation page if all the additional tag fields are available with cash pay mode
    Given User is on LoginPage
    When Enter the UserNM "vn_agent" and Pass "Test@123" and click on LOGIN as "vn_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Axis Bank Limited-Credit Card"
    Then Enter In_First_TextField On PayBill Page "5478"
    Then Enter In_Second_TextField On PayBill Page "919187654321"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then Verify radio button "Minimum due amount"
    Then Verify radio button "Total outstanding amount"
    Then Verify radio button "Current outstanding amount"
    Then Verify radio button "Other"

  @sprint2_2023 @epic-5277 @SP-6457 @SP_6457_TC_02
  Scenario: To verify radio buttons on confirmation page if all the additional tag firlds are available with acc transfer pay mode
    Given User is on LoginPage
    When Enter the UserNM "vn_agent" and Pass "Test@123" and click on LOGIN as "vn_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "BHIM BBPS Credit Card"
    Then Enter In_First_TextField On PayBill Page "919187654321"
    Then Enter In_Second_TextField On PayBill Page "5478 "
    Then Select Payment Mode as "Account Transfer"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then Verify radio button "Minimum due amount"
    Then Verify radio button "Total outstanding amount"
    Then Verify radio button "Current outstanding amount"
    Then Verify radio button "Other"
    Then click On Radio Button On Confirm Payment page "Minimum due amount"
    Then click On Radio Button On Confirm Payment page "Total outstanding amount"
    Then click On Radio Button On Confirm Payment page "Current outstanding amount"
    

  @sprint2_2023 @epic-5277 @SP-6457 @SP_6457_TC_03
  Scenario: To verify radio buttons on confirmation page if only Minimum Amount Due field is missing in additional tag
    Given User is on LoginPage
    When Enter the UserNM "vn_agent" and Pass "Test@123" and click on LOGIN as "vn_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "CCardBiller2"
    Then Enter custom param a field "1"
    Then Enter custom param ab field "12"
    Then Enter custom param abc field "21"
    Then Enter custom param abcd field "123"
    Then Enter custom param abcde field "321"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then Verify radio button "Total outstanding amount"
    Then Verify radio button "Current outstanding amount"
    Then click On Radio Button On Confirm Payment page "Total outstanding amount"
    Then click On Radio Button On Confirm Payment page "Current outstanding amount"

  @sprint2_2023 @epic-5277 @SP-6457 @SP_6457_TC_04
  Scenario: To verify radio buttons on confirmation page if only Current Outstanding Amount field is missing in additional tag
    Given User is on LoginPage
    When Enter the UserNM "vn_agent" and Pass "Test@123" and click on LOGIN as "vn_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Bank of Baroda"
    Then Enter In_First_TextField On PayBill Page "9087654321"
    Then Enter In_Second_TextField On PayBill Page "4321"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then Verify radio button "Minimum due amount"
    Then Verify radio button "Total outstanding amount"

  @sprint2_2023 @epic-5277 @SP-6457 @SP_6457_TC_05 @SP_6457_TC_08
  Scenario: To verify radio buttons on confirmation page if only unbilled Amount field is missing in additional tag
    Given User is on LoginPage
    When Enter the UserNM "vn_agent" and Pass "Test@123" and click on LOGIN as "vn_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Bank of Baroda"
    Then Enter In_First_TextField On PayBill Page "9087654321"
    Then Enter In_Second_TextField On PayBill Page "4321"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then Verify radio button "Minimum due amount"
    Then Verify radio button "Total outstanding amount"
    Then Verify radio button "Current outstanding amount"
    Then Verify radio button "Other"
    Then click On Radio Button On Confirm Payment page "Minimum due amount"
    Then click On Radio Button On Confirm Payment page "Total outstanding amount"
    Then click On Radio Button On Confirm Payment page "Current outstanding amount"
    Then click On Radio Button On Confirm Payment page "Other"

  @sprint2_2023 @epic-5277 @SP-6457 @SP_6457_TC_06
  Scenario: To verify radio buttons on confirmation page if Current Outstanding Amount and Minimum Amount Due fields missing in additional tag or additonal tag is blank
    Given User is on LoginPage
    When Enter the UserNM "vn_agent" and Pass "Test@123" and click on LOGIN as "vn_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "CCardBiller1"
    Then Enter custom param a field "1"
    Then Enter custom param ab field "12"
    Then Enter custom param abc field "21"
    Then Enter custom param abcd field "123"
    Then Enter custom param abcde field "321"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then Verify radio button "Total outstanding amount"
    Then click On Radio Button On Confirm Payment page "Total outstanding amount"

  @sprint2_2023 @epic-5277 @SP-6457 @SP_6457_TC_07
  Scenario: To verify other radio buttons on confirmation page for biller having exactness as exact
    Given User is on LoginPage
    When Enter the UserNM "vn_agent" and Pass "Test@123" and click on LOGIN as "vn_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Axis Bank Limited-Credit Card"
    Then Enter In_First_TextField On PayBill Page "5478"
    Then Enter In_Second_TextField On PayBill Page "919187654321"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then Verify radio button "Other"

  @sprint2_2023 @epic-5277 @SP-6457 @SP_6457_TC_09
  Scenario: To verify Minimum due amount field
    Given User is on LoginPage
    When Enter the UserNM "vn_agent" and Pass "Test@123" and click on LOGIN as "vn_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Axis Bank Limited-Credit Card"
    Then Enter In_First_TextField On PayBill Page "5478"
    Then Enter In_Second_TextField On PayBill Page "919187654321"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then verify Radio Button On Confirm Payment page "Minimum due amount"
    Then click On Radio Button On Confirm Payment page "Minimum due amount"

  @sprint2_2023 @epic-5277 @SP-6457 @SP_6457_TC_10
  Scenario: To verify Current Outstanding Amount field
    Given User is on LoginPage
    When Enter the UserNM "vn_agent" and Pass "Test@123" and click on LOGIN as "vn_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Axis Bank Limited-Credit Card"
    Then Enter In_First_TextField On PayBill Page "5478"
    Then Enter In_Second_TextField On PayBill Page "919187654321"
    Then enter Payer Mobile Number On PayBill Page "9087654321"
    Then Click on Fetch Bill Button to verify details
    Then verify Radio Button On Confirm Payment page "Current outstanding amount"
    Then click On Radio Button On Confirm Payment page "Current outstanding amount"
