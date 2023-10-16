Feature: Validate the functionality of Mobile Prepaid Page for BBPS agent User

  Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"

  @sprint6 @ElectrictyBill @SP-734 @SP_734_TC_01
  Scenario: To check whether the Host admin user can login and Pay Electricity bill via cash.
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

  @sprint6 @ElectrictyBill @SP-734 @SP_734_TC_02
  Scenario: To check whether the Host admin user can login and Pay Electricity bill via cash.
    Given Click on Pay Bill Icon
    Then Select Electricity Icon
    Then Select Biller or provider "Adani Electricity Mumbai Limited"
    Then Enter Consumer Number "9898989898"
    Then Select Payment Mode "Account Transfer"
    Then Enter Payer Mobile Number "98766554586"
    Then Click on Fetch Bill button
    Then Enter Account Number "876543"
    Then Click on Payment CONFIRM button
    Then Verify some fields
    Then Click on logout button

  @sprint6 @ElectrictyBill @TransactionHistory @SP-734 @SP_734_TC_03
  Scenario: To check whether the Host admin user can login and Transaction History.
    Given Click on Transaction History
    Then Select User
    Then Select Param
    Then Enter Customer Mobile Number "8987878787"
    Then Click on Search button
    Then Click on Searched Mobile Number for Bill
    Then Verify View Extra details
    Then Click on logout button
