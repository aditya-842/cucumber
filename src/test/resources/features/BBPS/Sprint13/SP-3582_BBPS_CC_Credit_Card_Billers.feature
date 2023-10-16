Feature: BBPS CC - Credit card Billers

  @sprint13 @epic-3580 @SP-3582 @SP_3582_TC_02 @SP_3582_TC_03
  Scenario: To check whether BBPS CC - Credit card Billers.
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then Select Biller from Dropdown "Axis Bank Limited-Credit Card"
    Then Verify Biller For Credit Card "Axis Bank Limited-Credit Card"