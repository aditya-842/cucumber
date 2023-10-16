Feature: Validate the functionality of Mobile Prepaid Page for BBPS agent User

  Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"

  @sprint5 @MobileNumberFormat @TC_BBPS_AOM_UI_01 @TC_BBPS_AOM_UI_05
  Scenario: To check whether the Agent admin user can login and Alteration of valid Mobile Number format for Postpaid.
    Given Click on Pay Bill Icon
    Then Select Mobile Postpaid Icon
    Then Select Biller or provider "BSNL"
    Then Enter Mobile Number "87878787878"
    Then Enter Payer Mobile Number "898787"
    Then Click on Fetch Bill button
    Then Enter Cash Receipt Number "120"
    Then Click on logout button

  @sprint5 @MobileNumberFormat @TC_BBPS_AOM_UI_02 @TC_BBPS_AOM_UI_03 @TC_BBPS_AOM_UI_04
  Scenario Outline: To check whether the Agent admin user can login and Alteration of invalid Mobile Number format for Postpaid.
    Given Click on Pay Bill Icon
    Then Select Mobile Postpaid Icon
    Then Select Biller or provider "BSNL Mobile Postpaid"
    Then Enter Mobile Number "87878787878"
    Then Enter Payer Mobile Number "<MobileNumber>"
    Then Verify Payer Mobile Number error
    Then Click on logout button

    Examples: 
      | MobileNumber  |
      | @56475986     |
      | 5679856@      |
      | 5679856@42763 |

  @sprint5 @MobileNumberFormat @TC_BBPS_AOM_UI_06 @TC_BBPS_AOM_UI_10
  Scenario: To check whether the Agent admin user can login and Alteration of valid Mobile Number format for Prepaid.
    Given Click on Pay Bill Icon
    #Then Scroll right to category
    Then Select category "Mobile Prepaid"
    Then Select Biller
    Then Enter Mobile Number "8787878787"
    Then Select Circle
    Then Click on Fetch Plan button
    Then Select Smart Recharge
    Then Click on logout button

  @sprint5 @MobileNumberFormat @TC_BBPS_AOM_UI_07 @TC_BBPS_AOM_UI_09
  Scenario Outline: To check whether the Agent admin user can login and Alteration of invalid Mobile Number format for Prepaid.
    Given Click on Pay Bill Icon
    #Then Scroll right to category
    Then Select category "Mobile Prepaid"
    Then Select Biller
    Then Enter Mobile Number "8787878787"
    Then Select Circle
    Then Enter Payer Mobile Number "<MobileNumber>"
    Then Verify Payer Mobile Number error
    Then Click on logout button

    Examples: 
      | MobileNumber |
      |        98787 |
      |     12398787 |
