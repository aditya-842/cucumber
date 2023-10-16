Feature: BBPS Mobile Prepaid recharge - Circle wise filter for Fetch Plan

  @sprint1_2023 @epic-181 @SP-5958 @SP_5958_TC_01 @SP_5958_TC_02
  Scenario: To check agent user abel to pay bill when Support Plan is Manditory and visiblity is 'False' for  plan id
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Mobile Prepaid"
    Then select Biller From Dropdown "BSNL"
    Then Enter Mobile Number "9090909090"
    Then Select Circle
    Then Click on Fetch Plan button
    Then Select Smart Recharge
    Then Click on Pay Bill button
    Then enter Cash Receipt Number On Confirm Payment page "5678"

  @sprint1_2023 @epic-181 @SP-5958 @SP_5958_TC_03
  Scenario: To check wheather agent user pay bill for Support Plan is Manditory and visiblity is 'False' for custom param of circle and id
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Mobile Prepaid"
    Then select Biller From Dropdown "UCO Bank Mobile Prepaid 002"
    Then Enter Mobile Number "9090909090"
    Then Click on Fetch Plan button
    Then Select Smart Recharge
    Then Click on Pay Bill button
    Then enter Cash Receipt Number On Confirm Payment page "5678"
