Feature: BBPS - Aadhar linking message for TNEB

  @Sprint8_2023 @epic-2825 @SP-8528 @SP_8528_TC_01
  Scenario: As an Agent, verify error message for 'Tamil Nadu Electricity Board' TNEB Fetch bill time
    Given User is on LoginPage
    When Enter the UserNM "agent_b2b_bbps" and Pass "Test@123" and click on LOGIN as "agent_b2b_bbps"
    Given Click on Pay Bill Icon
    Then Select category "Electricity"
    Then select Biller From Dropdown "Tamil Nadu Electricity Board"
    Then Enter In_First_TextField On PayBill Page "8999197404"
    Then enter Payer Mobile Number On PayBill Page "8999197404"
    Then Click on Fetch Bill Button to verify details
    Then Verify Error Message On PayBill Page "Kindly link your Aadhaar Number at Billers end and try again!"

  @Sprint8_2023 @epic-2825 @SP-8528 @SP_8528_TC_02
  Scenario: As an Agent, verify error message for 'Tamil Nadu Electricity Board' TNEB Pay bill time
    Given User is on LoginPage
    When Enter the UserNM "agent_b2b_bbps" and Pass "Test@123" and click on LOGIN as "agent_b2b_bbps"
    Given Click on Pay Bill Icon
    Then Select category "Electricity"
    Then select Biller From Dropdown "Tamil Nadu Electricity Board"
    Then Enter In_First_TextField On PayBill Page "9876543210"
    Then enter Payer Mobile Number On PayBill Page "9876543210"
    Then Click on Fetch Bill Button to verify details
    Then enter Cash Receipt Number On Confirm Payment page "1234"
    Then click On Confirm Button On Confirm Payment page
    Then Verify Error Message On PayBill Page "Kindly link your Aadhaar Number at Billers end and try again!"
