Feature: User should be able to login as Agent Admin User B2B and B2C

  @Sprint-1 @SP-02 @SP_02_TC_01 @SP_02_TC_02
  Scenario: User should be able to see Housing Society bill icon
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Then Click on Pay Bill module
    Then Check Housing Society bill icon

  @Sprint-1 @SP-03 @SP_03_TC_05
  Scenario: User should be able to select Housing Society Biller b2b
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Then Click on Pay Bill module
    Then Select category "Housing Society"
    Then Select state "MAHARASHTRA" from select state dropdown
    Then Submit the state and city selection
    Then Select the biller "Darshan Ricco" from the list of society billers

  @Sprint-1 @SP-03 @SP_03_TC_30 @SP_03_TC_31
  Scenario: User should be able to select Housing Society Biller b2c
    When Enter the UserNM "bbps_agent_b2c" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2c"
    Then Click on Pay Bill module
    Then Select category "Housing Society"
    Then Select state "MAHARASHTRA" from select state dropdown
    Then Submit the state and city selection
    Then Select the biller "Amrut Ganga" from the list of society billers
    Then Enter flat number "G5"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Click on Fetch Bill Button to verify details

  @SPrint-1 @SP-04 @SP_04_TC_07 @SP_04_TC_08
  Scenario: User should be able to click on fetch bill button
    When Enter the UserNM "AgentAJ05" and Pass "Test@123" and click on LOGIN as "AgentAJ05"
    Then Click on Pay Bill module
    Then Select category "Housing Society"
    Then Select state "MAHARASHTRA" from select state dropdown
    Then Submit the state and city selection
    Then Select the biller "Amrut Ganga" from the list of society billers
    Then Enter flat number "G5"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Click on Fetch Bill Button to verify details

  @SPrint-1 @SP-04 @SP_04_TC_09
  Scenario: User should be able to click on Validate bill button
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Then Click on Pay Bill module
    Then Select category "Housing Society"
    Then Select state "MAHARASHTRA" from select state dropdown
    Then Submit the state and city selection
    Then Select the biller "Sushobha Apartment Condominium" from the list of society billers
    Then Enter flat number "101"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Enter amount "1000"
    Then Click on Validate Bill button

  @SPrint-1 @SP-05 @SP_05_TC_13 @SP_05_TC_14 @SP_05_TC_15
  Scenario: User should perform pay bill for biller through payment mode cash(Pay bill)
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Then Click on Pay Bill module
    Then Select category "Housing Society"
    Then Select state "MAHARASHTRA" from select state dropdown
    Then Submit the state and city selection
    Then Select the biller "Sushobha Apartment Condominium - BHIM" from the list of society billers
    Then Enter flat number "101"
    Then Select mode of payment "Cash"
    Then Enter Payer Mobile No "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    #Then Enter amount "1000"
    Then Click on Fetch Bill Button to verify details
    Then Enter valid Reciept number "1234"
    Then Click on Confirm button
    Then Print the Reciept after successful transaction

  @SPrint-1 @SP-17 @SP_17_TC_19 @SP_17_TC_20
  Scenario: User should perform pay bill for biller through payment mode cash(Pay bill)
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Then Click on Pay Bill module
    Then Select category "Housing Society"
    Then Select state "MAHARASHTRA" from select state dropdown
    Then Submit the state and city selection
    Then Select the biller "Sushobha Apartment Condominium - BHIM" from the list of society billers
    Then Enter flat number "101"
    Then Select mode of payment "Account Transfer"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Click on Fetch Bill Button to verify details
    Then enter account number On Confirm Payment page "55555555"
    Then Click on Confirm button
    Then Print the Reciept after successful transaction

  @SPrint-1 @SP-17 @SP_17_TC_21
  Scenario: User should perform pay bill for biller through payment mode cash(Pay bill)
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Then Click on Pay Bill module
    Then Select category "Housing Society"
    Then Select state "MAHARASHTRA" from select state dropdown
    Then Submit the state and city selection
    Then Select the biller "Sushobha Apartment Condominium - BHIM" from the list of society billers
    Then Enter flat number "101"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Click on Fetch Bill Button to verify details
    Then Enter valid Reciept number "1234"
    Then Click on Confirm button
    Then Print the Reciept after successful transaction

  @Sprint-1 @SP-02 @SP_02_TC_03 @SP_02_TC_04
  Scenario: User should be able to see Housing Society bill icon
    When Enter the UserNM "bbps_agent_b2c" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2c"
    Then Click on Pay Bill module
    Then Check Housing Society bill icon

  @Sprint-1 @SP-03 @SP_02_TC_06
  Scenario: User should be able to select Housing Society Biller
    When Enter the UserNM "bbps_agent_b2c" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2c"
    Then Click on Pay Bill module
    Then Select category "Housing Society"
    Then Select state "MAHARASHTRA" from select state dropdown
    Then Submit the state and city selection
    Then Select the biller "Darshan Ricco" from the list of society billers

  @Sprint-1 @SP-01 @sp-03 @TC_30
  Scenario: User should be able to select Housing Society Biller
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Then Click on Pay Bill module
    Then Select category "Housing Society"
    Then Select state "MAHARASHTRA" from select state dropdown
    Then Submit the state and city selection
    Then Select the biller "Amrut Ganga" from the list of society billers
    Then Enter flat number "G5"
    Then Enter mobile number "9876543210"

  @SPrint-1 @SP-04 @SP_04_TC_10 @SP_04_TC_11
  Scenario: User should be able to click on fetch bill button
    When Enter the UserNM "b2c_agent_bbps" and Pass "Test@123" and click on LOGIN as "b2c_agent_bbps"
    Then Click on Pay Bill module
    Then Select category "Housing Society"
    Then Select state "MAHARASHTRA" from select state dropdown
    Then Submit the state and city selection
    Then Select the biller "Amrut Ganga" from the list of society billers
    Then Enter flat number "G5"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Click on Fetch Bill Button to verify details

  @SPrint-1 @SP-04 @SP_04_TC_12
  Scenario: User should be able to click on Validate bill button
    When Enter the UserNM "b2c_agent_bbps" and Pass "Test@123" and click on LOGIN as "b2c_agent_bbps"
    Then Click on Pay Bill module
    Then Select category "Housing Society"
    Then Select state "MAHARASHTRA" from select state dropdown
    Then Submit the state and city selection
    Then Select the biller "Sushobha Apartment Condominium" from the list of society billers
    Then Enter flat number "101"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Enter amount "1000"
    Then Click on Validate Bill button

  @SPrint-1 @SP-17 @TC_19
  Scenario: User should perform pay bill for biller through payment mode cash(Pay bill)
    When Enter the UserNM "b2c_agent_bbps" and Pass "Test@123" and click on LOGIN as "b2c_agent_bbps"
    Then Click on Pay Bill module
    Then Select category "Housing Society"
    Then Select state "MAHARASHTRA" from select state dropdown
    Then Submit the state and city selection
    Then Select the biller "Sushobha Apartment Condominium - BHIM" from the list of society billers
    Then Enter flat number "101"
    Then Select mode of payment "Cash"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Click on Fetch Bill Button to verify details
    Then Enter valid Reciept number "1234"
    Then Click on Confirm button
    Then Print the Reciept after successful transaction

  @SPrint-1 @SP-17 @SP_17_TC_22 @SP_17_TC_23
  Scenario: User should perform pay bill for biller through payment mode Account Transfer(Pay bill)
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Then Click on Pay Bill module
    Then Select category "Housing Society"
    Then Select state "MAHARASHTRA" from select state dropdown
    Then Submit the state and city selection
    Then Select the biller "Sushobha Apartment Condominium - BHIM" from the list of society billers
    Then Enter flat number "101"
    Then Select mode of payment "Account Transfer"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Click on Fetch Bill Button to verify details
    Then Verify Confirm Payment Header
    Then enter account number On Confirm Payment page "55555555"
    Then Click on Confirm button
    Then Print the Reciept after successful transaction

  @SPrint-1 @SP-17 @SP_17_TC_24
  Scenario: User should perform pay bill for biller through payment mode cash(Pay bill)
    When Enter the UserNM "b2c_agent_bbps" and Pass "Test@123" and click on LOGIN as "b2c_agent_bbps"
    Then Click on Pay Bill module
    Then Check Housing Society bill icon
    Then Click on Housing Society bill icon
    Then Select state "MAHARASHTRA" from select state dropdown
    Then Submit the state and city selection
    Then Select the biller "Sushobha Apartment Condominium - BHIM" from the list of society billers
    Then Enter flat number "101"
    Then Enter mobile number "9876543210"
    Then Enter payer emailid "abc@gmail.com"
    Then Click on Fetch Bill Button to verify details
    Then Enter valid Reciept number "1234"
    Then Click on Confirm button
    Then Print the Reciept after successful transaction

  @Sprint-1 @SP-16 @SP_17_TC_29
  Scenario: User should be able to successfully login as Agent Admin User
    #Give blank user name and working password
    When Enter the UserNM "" and Pass "Test@123" and click on LOGIN
    Then Check for valid error messages for blank username "Please enter valid Username"
    #Give blank password and working userid
    When Enter the UserNM "agent" and Pass "" and click on LOGIN
    Then Check for valid error messages for blank password "Please enter Password"
    #Give both invalid
    When Enter the UserNM "agent" and Pass "Test@12" and click on LOGIN
    Then Check for valid error messages for invalid username "Invalid Username or Password"

  @Sprint-1 @SP-16 @SP_17_TC_29
  Scenario: User should be able to successfully login as Agent Admin User2
    #Give valid password and invalid username
    When Enter the UserNM "agent_" and Pass "Test@123" and click on LOGIN
    Then Check for valid error messages for invalid username "Invalid Username or Password"
    When Enter the UserNM "A" and Pass "B" and click on LOGIN
    #In line 14 using same step too reduce redundancy.
    Then Check for valid error messages for invalid username "Invalid Username or Password"
