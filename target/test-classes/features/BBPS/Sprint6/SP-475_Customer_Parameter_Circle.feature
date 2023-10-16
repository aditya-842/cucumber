Feature: Validate the functionality of Mobile Prepaid Page for BBPS agent User

  Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"

  @sprint5 @verifyingCircle @SP-475
  Scenario: To check whether the Host admin user can login and verify circle.
    Given Click on Pay Bill Icon
    # Then Scroll right to category
    Then Select category "Mobile Prepaid"
    Then Select Biller or provider "BSNL"
    Then Enter Mobile Number "8787878788"
    Then verify circle
    Then Click on logout button

  @sprint5 @verifyingCityList @SP-475
  Scenario: To check whether the Host admin user can login and verify city list.
    Given Click on Pay Bill Icon
    Then Select Electricity Icon
    Then Select Biller or provider "Torrent Power Test"
    Then Enter Service Number "89989598"
    Then verify city List
    Then Select Payment Mode "Cash"
    Then Enter Payer Mobile Number "8987121287"
    Then Click on Fetch Bill button
    Then verify Selected City
    Then Enter Cash Receipt Number "120"
    Then Click on Payment CONFIRM button
    Then Click on logout button
