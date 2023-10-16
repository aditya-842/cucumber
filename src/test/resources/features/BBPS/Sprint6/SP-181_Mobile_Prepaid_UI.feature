Feature: Validate the functionality of Mobile Prepaid Page for BBPS agent User

  Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"

  @sprint5 @MobilePrepaid @SP_181
  Scenario: To check whether the Host admin user can login and see HomePage.
    Given Click on Pay Bill Icon
    Then Select category "Mobile Prepaid"
    Then Select Biller
    Then Enter Mobile Number "87878787878"
    Then Select Circle
    Then Select Payment Mode "Account Transfer"
    Then Click on Fetch Plan button
    Then Select Smart Recharge
    Then Click on Pay Bill button
    Then Validate Confimation Page
    When Validate Payment Confirmation page "878987"
    Then Click on CONFIRM button
    Then Validate Transaction Details SUCCESS Page
    Then Click on logout button

  @sprint5 @MobilePrepaid @SP_181
  Scenario: To check whether the Host admin user can login and see HomePage.
    Given Click on Pay Bill Icon
    Then Select category "Mobile Prepaid"
    Then Select Optional Biller when Support plan is "Maditory_True"
    #Then Enter Mobile Number "87878787878"
    Then Enter Plan ID "3"
    #Then Select Circle
    Then Enter Payer Mobile Number for Card Number "9898989898"
    Then Click on Pay Bill button
    Then Validate Confimation Page
    When Validate Payment Confirmation page "8787"
    Then Click on CONFIRM button
    Then Validate Transaction Details SUCCESS Page
    Then Click on logout button

  @sprint5 @MobilePrepaid @SP_181
  Scenario: To check whether the Host admin user can login and see HomePage.
    Given Click on Pay Bill Icon
    Then Select category "Mobile Prepaid"
    Then Select Optional Biller when Support plan is "Optional"
    Then Enter Mobile Number "8787878787"
    Then Select Circle
    Then Click on Fetch Plan button
    Then Select Smart Recharge
    Then Click on Pay Bill button
    Then Validate Confimation Page
    When Validate Payment Confirmation page "8787"
    Then Click on CONFIRM button
    Then Validate Transaction Details SUCCESS Page
    Then Click on logout button
