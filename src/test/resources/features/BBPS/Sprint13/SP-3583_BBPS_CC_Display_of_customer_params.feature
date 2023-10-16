Feature: BBPS CC - Display of customer params

  @sprint13 @epic-3580 @SP-3583 @SP_3583_TC_02
  Scenario: To check whether BBPS CC - Display of customer params
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Bank of Baroda"
    Then Verify Biller For Credit Card "Bank of Baroda"

  @sprint13 @epic-3580 @SP-3583 @SP_3583_TC_03
  Scenario: To check whether BBPS CC - verify Bill Payer Information
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Bank of Baroda"
    Then Verify Bill Payer Information Mobile and EamilID

  @sprint13 @epic-3580 @SP-3583 @SP_3583_TC_04
  Scenario: To check whether BBPS CC - verify payment mode for biller
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Bank of Baroda"
    Then Verify Payment Mode for credit card biller

  @sprint13 @epic-3580 @SP-3583 @SP_3583_TC_05
  Scenario: To check whether BBPS CC - verify fetch bill button
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Bank of Baroda"
    Then Verify Fetch Bill Button for Credit Card Biller

  @sprint13 @epic-3580 @SP-3583 @SP_3583_TC_06
  Scenario: To check whether BBPS CC - verify pay bill button
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "CCardBiller2"

  @sprint13 @epic-3580 @SP-3583 @SP_3583_TC_07
  Scenario: To check whether BBPS CC - verify biller payer information mobile email and amount
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Axis Bank Limited-Credit Card"
    Then Verify Bill Payer Information Mobile and EamilID

  @sprint13 @epic-3580 @SP-3583 @SP_3583_TC_08
  Scenario: To check whether BBPS CC - verify Validate bill button
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Axis Bank Limited-Credit Card"

  @sprint13 @epic-3580 @SP-3583 @SP_3583_TC_09
  Scenario: To check whether BBPS CC -verify two custom params for biller
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Axis Bank Limited-Credit Card"
    Then Verify Customer Params two fields

  @sprint13 @epic-3580 @SP-3583 @SP_3583_TC_10
  Scenario: To check whether BBPS CC -verify five custom params for biller
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "CCardBiller1"
    Then Verify Customer Params five fields
