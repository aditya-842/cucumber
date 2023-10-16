Feature: Validate the functionality of Verify that customer parameter

  Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "Test@123" and click on LOGIN as "Auto_Agent"

  @sprint7 @epic-496 @SP-476 @SP_476_TC_01
  Scenario: To check whether the Host agent user can login and Verify that customer parameter should behave based on the customerParamGroups column
    Given Click on Pay Bill Icon
    Then Select category "LPG Gas"
    Then Select Biller or provider "Hindustan Petroleum Corporation Ltd (HPCL)"
    Then Enter a Consumer Number "44444444"
    Then Enter Distributor ID "44444444"
    Then Enter Payer Mobile Number "8987878787"
    Then Click on Fetch Bill button
    Then verify Key Value Pair On Confirm Payment "Consumer Number" "4444444"
    Then verify Key Value Pair On Confirm Payment "Distributor ID" "44444444"
    Then Enter Cash Receipt Number "120"
    Then Click on Payment CONFIRM button
    Then Verify some fields
    Then Click on logout button

  @sprint7 @epic-496 @SP-476 @SP_476_TC_02
  Scenario: To check whether the Host agent user can login and Verify that mandatory and optional should be decided based on customerParamGroups column
    Given Click on Pay Bill Icon
    Then Select category "LPG Gas"
    Then Select Biller or provider "Hindustan Petroleum Corporation Ltd (HPCL)"
    Then Enter Mobile Number "8787878781"
    Then Enter Payer Mobile Number "8987878787"
    Then Click on Fetch Bill button
    Then verify Key Value Pair On Confirm Payment "Mobile Number" "8787878781"
    Then Enter Cash Receipt Number "120"
    Then Click on Payment CONFIRM button
    Then Verify some fields
    Then Click on logout button

  @sprint7 @epic-496 @SP-476 @SP_476_TC_03
  Scenario: To check whether the Host agent user can login and Verify that if customerParamGroups details are missing in the database for the existing biller, then transaction should be successful.
    Given Click on Pay Bill Icon
    Then Select category "LPG Gas"
    Then Select Biller or provider "SIB BOU"
    Then Enter a Consumer Number "9898989898"
    Then Enter Distributor ID "89898676"
    Then Enter Mobile Number "87878787878"
    Then Enter Payer Mobile Number "8987878787"
    Then Enter Unique Consumer ID "23546575664756467"
    Then Enter Amount "1000"
    Then Click on Pay Bill button
    Then Enter Cash Receipt Number "120"
    Then Click on Payment CONFIRM button
    Then Verify some fields
    Then Click on logout button

  @sprint7 @epic-496 @SP-476 @SP_476_TC_05
  Scenario: To check whether the Host agent user can login and   Verify that if customerParamGroups details are missing in the database for the existing biller, then transaction should be successful.
    Given Click on Pay Bill Icon
    Then Select category "Broadband Postpaid"
    Then Select Biller or provider "DNSB Bank5"
    Then Enter Customer Reference Field1 "768768"
    Then Enter Customer Reference Field2 "6986989"
    Then Enter Payer Mobile Number "8987878787"
    Then Enter Amount "1000"
    Then Click on Validate Bill button
    Then Click on Pay Bill button
    Then verify Key Value Pair On Confirm Payment "Customer Reference Field1" "768768"
    Then verify Key Value Pair On Confirm Payment "Customer Reference Field2" "6986989"
    Then Enter Cash Receipt Number "120"
    Then Click on Payment CONFIRM button
    Then Verify some fields
    Then Click on logout button
