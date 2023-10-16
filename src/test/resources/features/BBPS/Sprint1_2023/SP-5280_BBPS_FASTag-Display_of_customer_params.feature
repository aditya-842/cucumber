Feature: BBPS FASTag - Display of customer params

  @sprint1 @epic-5277 @SP-5280 @SP_5280_TC_02
  Scenario Outline: Verify Bill Payer Information (Payer Mobile and Payer email) available for all biller of FASTag category
    Given User is on LoginPage
    When Enter the UserNM "<username>" and Pass "Test@123" and click on LOGIN as "<username>"
    Then Click on Pay Bill Icon
    Then Select category "FASTag"
    Then select Biller From Dropdown "<biller>"
    Then Verify Payer Mobile Number Field On PayBill Page
    Then Verify Payer Email Field On PayBill Page

    Examples: 
      | username  | biller           |
      | b2b_agent | Axis Bank FASTag |
      | b2c_agent | ICICI Fastag     |

  @sprint1 @epic-5277 @SP-5280 @SP_5280_TC_03
  Scenario Outline: Verify Payment mode for all the billers of FASTag category Display
    Given User is on LoginPage
    When Enter the UserNM "<username>" and Pass "Test@123" and click on LOGIN as "<username>"
    Then Click on Pay Bill Icon
    Then Select category "FASTag"
    Then select Biller From Dropdown "<biller>"
    Then Verify Payment Mode Field On PayBill Page "Cash"

    Examples: 
      | username  | biller           |
      | b2b_agent | Axis Bank FASTag |
      | b2c_agent | ICICI Fastag     |

  @sprint1 @epic-5277 @SP-5280 @SP_5280_TC_04
  Scenario Outline: Verify  Fetch Bill button available for FASTag category
    Given User is on LoginPage
    When Enter the UserNM "<username>" and Pass "Test@123" and click on LOGIN as "<username>"
    Then Click on Pay Bill Icon
    Then Select category "FASTag"
    Then select Biller From Dropdown "<biller>"
    Then Verify Fetch Bill Button for Credit Card Biller

    Examples: 
      | username  | biller         |
      | b2b_agent | Bank  - Fastag |
      | b2c_agent | ICICI Fastag   |

  @sprint1 @epic-5277 @SP-5280 @SP_5280_TC_05
  Scenario Outline: Verify Vehicle Registration Number/Wallet Number custom param field available for FASTag category
    Given User is on LoginPage
    When Enter the UserNM "<username>" and Pass "Test@123" and click on LOGIN as "<username>"
    Then Click on Pay Bill Icon
    Then Select category "FASTag"
    Then select Biller From Dropdown "Karnataka Bank Fastag"
    Then Verify Vehicle Registration Number Wallet Number custom param field displayed

    Examples: 
      | username  |
      | b2b_agent |
      | b2c_agent |

  @sprint1 @epic-5277 @SP-5280 @SP_5280_TC_06
  Scenario Outline: Verify  Amount custom param field available for FASTag category
    Given User is on LoginPage
    When Enter the UserNM "<username>" and Pass "Test@123" and click on LOGIN as "<username>"
    Then Click on Pay Bill Icon
    Then Select category "FASTag"
    Then select Biller From Dropdown "Axis Bank FASTag - BHIM"
    Then Verify Amount custom param field displayed

    Examples: 
      | username  |
      | b2b_agent |
      | b2c_agent |
