Feature: BBPS Credit Card - Credit Card Icon

  @sprint13 @epic-3580 @SP-3581 @SP_3581_TC_01 @SP_3581_TC_02
  Scenario: To check BBPS Credit Card - Credit Card Icon.
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Scroll right to category
    Then Click on Credit Card
    Then Select Biller from Dropdown "Axis Bank Limited-Credit Card"
    Then Verify Biller For Credit Card "Axis Bank Limited-Credit Card"