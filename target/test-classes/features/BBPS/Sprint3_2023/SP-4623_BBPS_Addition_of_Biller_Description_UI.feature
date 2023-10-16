Feature: BBPS - Addition of Biller Description - UI

  @Sprint3_2023 @epic-2825 @SP-4623 @SP_4623_TC_01
  Scenario: login as a Agent User, When user select any biller Description available below cash field.
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Then Click on Pay Bill Icon
    Then Select category "FASTag"
    Then Verify Biller Dropdown On PayBill Page
    Then select Biller From Dropdown "Axis Bank Fastag"
    Then Verify Payer Mobile Number Field On PayBill Page
    Then Verify Payer Email Field On PayBill Page
    Then Click On Payment Mode Field On PayBill Page
    Then Verify Payment Mode Field On PayBill Page "Cash"
    Then Verify Payment Mode Field On PayBill Page "Account Transfer"
    
