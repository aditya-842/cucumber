Feature: BBPS - Get Agent Group API  - UI

  @sprint5_2023 @epic-496 @SP-7256 @SP_7256_TC_01 @redirection
  Scenario: login as a admin User, Verify view Agent group entity page
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Child Entity "100006"
    Then verify AG "Babaji date Bank" Is visible On View Entity Details Page
    Then verify AG Detail "Sarvatra" Is visible On View Entity Details Page
    Then verify AG Detail "Wakad, Pune" Is visible On View Entity Details Page
    Then verify AG Detail "8888888888" Is visible On View Entity Details Page
    Then Check Status On View Entity Details Page "Active"
    Then verify "BANK000" wallet ID On View Entity Details Page
    Then Verify Disabled icons for Bill Pay Enabled and Wallet Enabled

  @sprint5_2023 @epic-496 @SP-7256 @SP_7256_TC_02 @redirection
  Scenario: login as a admin User, Verify view Agent group entity page
    Given User is on LoginPage
    When Enter the UserNM "Automation_AI" and Pass "Test@12" and click on LOGIN as "Automation_AI"
    When Click on Entities in Configurations Menu
    Then Click On Child Entity "100006"
    Then verify AG "Babaji date Bank" Is visible On View Entity Details Page
    Then verify AG Detail "Sarvatra" Is visible On View Entity Details Page
    Then verify AG Detail "Wakad, Pune" Is visible On View Entity Details Page
    Then verify AG Detail "8888888888" Is visible On View Entity Details Page
    Then Check Status On View Entity Details Page "Active"
    Then verify "BANK000" wallet ID On View Entity Details Page
    Then Verify Disabled icons for Bill Pay Enabled and Wallet Enabled

  @sprint5_2023 @epic-496 @SP-7256 @SP_7256_TC_03 @redirection
  Scenario: login as a admin User, Verify view Agent group entity page
    Given User is on LoginPage
    When Enter the UserNM "Automation_AG" and Pass "Test@12" and click on LOGIN as "Automation_AG"
    When Click on Entities in Configurations Menu
    Then verify AG "Babaji date Bank" Is visible On View Entity Details Page
    Then verify AG Detail "Sarvatra" Is visible On View Entity Details Page
    Then verify AG Detail "Wakad, Pune" Is visible On View Entity Details Page
    Then verify AG Detail "8888888888" Is visible On View Entity Details Page
    Then Check Status On View Entity Details Page "Active"
    Then verify "BANK000" wallet ID On View Entity Details Page
    Then Verify Disabled icons for Bill Pay Enabled and Wallet Enabled

  @sprint5_2023 @epic-496 @SP-7256 @SP_7256_TC_04 @redirection
  Scenario: login as a admin User, Verify view Agent group entity page
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click on Search entity by Name hypertext link
    Then Select Product Role and Name radio button option on the pop-up window
    Then Click On Products
    Then Select product "BBPS"
    Then Select product role "Agent Group"
    Then Click On Search Button On Popup for Search By Entity Name
    Then Click On child Enity "Babaji date Bank" On Popup for Search By Entity Name
    Then verify AG "Babaji date Bank" Is visible On View Entity Details Page
    Then verify AG Detail "Sarvatra" Is visible On View Entity Details Page
    Then verify AG Detail "Wakad, Pune" Is visible On View Entity Details Page
    Then verify AG Detail "8888888888" Is visible On View Entity Details Page
    Then Check Status On View Entity Details Page "Active"
    Then verify "BANK000" wallet ID On View Entity Details Page
    Then Verify Disabled icons for Bill Pay Enabled and Wallet Enabled
