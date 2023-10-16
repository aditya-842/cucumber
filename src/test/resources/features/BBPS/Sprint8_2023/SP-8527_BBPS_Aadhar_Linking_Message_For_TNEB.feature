Feature: BBPS - Aadhar linking message for TNEB

  @Sprint8_2023 @epic-2825 @SP-8527 @SP_8527_TC_01 @SP_8527_TC_02
  Scenario: As an Agent, verify Adhar linking MSG for 'Tamil Nadu Electricity Board'
    Given User is on LoginPage
    When Enter the UserNM "agent_b2b_bbps" and Pass "Test@123" and click on LOGIN as "agent_b2b_bbps"
    Given Click on Pay Bill Icon
    Then Select category "Electricity"
    Then select Biller From Dropdown "Tamil Nadu Electricity Board"
    Then Verify Error Message On PayBill Page "Kindly link your Aadhaar Number with SCNO at TNEB (TANGEDCO) website / offices as per Govt. Order to avoid payment failures in future. Please ignore if already linked!"
