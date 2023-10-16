Feature: Validate the functionality of Change in Bill Payment Response API

  Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "Test@123" and click on LOGIN as "Auto_Agent"

  @sprint5 @epic-496 @SP-476 @SP_498_TC_02
  Scenario: To check whether the Host agent user can login and Extra data should be displayed under the payment screen (via fetch-bill)
    Given Click on Pay Bill Icon
    Then Select Electricity Icon
    Then Select Biller or provider "Adani Electricity Mumbai Limited"
    Then Enter Consumer Number "9898989898"
    Then Select Payment Mode "Cash"
    Then Enter Payer Mobile Number "8987878787"
    Then Click on Fetch Bill button
    Then Enter Cash Receipt Number "120"
    Then Click on Payment CONFIRM button
    Then Verify some fields
    Then Click on logout button

  @sprint5 @epic-496 @SP-498 @SP_498_TC_02
  Scenario: To check whether the Host agent user can login and Extra data should be displayed under the payment screen (via fetch-Adhoc)
    Given Click on Pay Bill Icon
    Then Select category "LPG Gas"
    Then Select Biller or provider "Axis Bank BOU"
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

  @sprint5 @epic-496 @SP-498 @SP_498_TC_04 @SP_498_TC_03
  Scenario: To check whether the Host agent user can login and Extra data should not displayed under the payment screen (via fetch-adhoc)
    Given Click on Pay Bill Icon
    Then Select category "Electricity"
    Then Select Biller or provider "Ajmer Vidyut Vitran Nigam Limited"
    Then Enter k Number "56"
    Then Enter Payer Mobile Number "8987878787"
    Then Click on Fetch Bill button
    Then Enter Cash Receipt Number "120"
    Then Click on Payment CONFIRM button
    Then Verify View Extra details Disabled
    Then Click on logout button

