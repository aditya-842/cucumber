Feature: BBPS CC � Current outstanding amount

  @sprint1_2023 @epic-3580 @SP-5278 @SP_5278_TC_01 @SP_5278_TC_02
  Scenario: To check whether When user click on Pay bill then FASTag icon avaialble.
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Given Click on Pay Bill Icon
    Then Select category "Credit Card"
    Then select Biller From Dropdown "Bank of Baroda test"
    Then Enter Mobile Number for Card Number "9090909090"
    Then Enter cardNumber for Card Number "6787"
    Then Enter Payer Mobile Number for Card Number "9898989898"
    Then Click on Fetch Bill Button For Credit Card
    Then Verify Confirm Payment Header
    Then verify Radio Button On Confirm Payment page "Current outstanding amount"
    Then click On Radio Button On Confirm Payment page "Current outstanding amount"