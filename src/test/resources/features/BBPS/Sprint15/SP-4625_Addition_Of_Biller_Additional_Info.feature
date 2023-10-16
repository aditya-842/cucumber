Feature: BBPS - Addition Of Biller Additional Info

  @sprint15 @epic-2825 @SP-4625 @SP_4625_TC_01
  Scenario: Verify Biller Additional info field for cash payment
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Electricity"
    Then Verify Biller Dropdown On PayBill Page
    Then select Biller From Dropdown "Adani Electricity Mumbai Limited"
    Then Enter In_First_TextField On PayBill Page "878676786"
    Then Enter Payer Mobile No "9898789898"
    Then enter Payer Email On PayBill Page "testing@payee.com"
    Then Click on Fetch Bill Button to verify details
    Then Verify AdditionalInfo Field "Early Payment Date"

  @sprint15 @epic-2825 @SP-4625 @SP_4625_TC_02
  Scenario: Verify Biller Additional info field for Acc transfer payment
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Electricity"
    Then Verify Biller Dropdown On PayBill Page
    Then select Biller From Dropdown "Adani Electricity Mumbai Limited"
    Then Enter In_First_TextField On PayBill Page "878676786"
    Then Select Payment Mode as "Account Transfer"
    Then Enter Payer Mobile No "9898789898"
    Then enter Payer Email On PayBill Page "testing@payee.com"
    Then Click on Fetch Bill Button to verify details
    Then Verify AdditionalInfo Field "Early Payment Date"

  @sprint15 @epic-2825 @SP-4625 @SP_4625_TC_03
  Scenario: Verify Biller Additional info field with null value for cash payment
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Water"
    Then Verify Biller Dropdown On PayBill Page
    Then select Biller From Dropdown "Ahmedabad Municipal Corporation"
    Then Enter a Tenement No "898789798789798"
    Then Enter Payer Mobile No "9898789898"
    Then enter Payer Email On PayBill Page "testing@payee.com"
    Then Click on Fetch Bill Button to verify details
    Then Verify AdditionalInfo Field "Early Payment Date" with its null value

  @sprint15 @epic-2825 @SP-4625 @SP_4625_TC_04
  Scenario: Verify Biller Additional info field for Acc transfer payment
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Water"
    Then Verify Biller Dropdown On PayBill Page
    Then select Biller From Dropdown "Ahmedabad Municipal Corporation"
    Then Enter a Tenement No "898789798789798"
    Then Select Payment Mode as "Account Transfer"
    Then Enter Payer Mobile No "9898789898"
    Then enter Payer Email On PayBill Page "testing@payee.com"
    Then Click on Fetch Bill Button to verify details
    Then Verify AdditionalInfo Field "Early Payment Date" with its null value
