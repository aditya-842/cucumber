Feature: Fetch-wallet-statement

  @sprint4 @epic-42 @SP-6700 @SP_6700_TC_02
  Scenario: login as a Agent User, Verify Wallet Statement for b2b
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Then Click on Wallet Statement Icon
    Then Click on Submit button
    Then Verify "Wallet statement fetched successfully" MSG On Wallet Statement Page

  @sprint4 @epic-42 @SP-6700 @SP_6700_TC_02
  Scenario: login as a Agent User, Verify Wallet Statement for b2b
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2c" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2c"
    Then Click on Wallet Statement Icon
    Then Click on Submit button
    Then Verify "Wallet Service error - wallet not mapped" MSG On Wallet Statement Page
