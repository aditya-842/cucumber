Feature: BBPS - Toggle feature angular JS

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_01
  Scenario: verify BBPS user dashboard when BBPS related permission not available from db (eg. transaction history) for BBPS users
    Given User is on LoginPage
    When Update Ehub Permission Table "View Transaction History" "N"
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Then Verify Tiles Not Available For Product "BBPS" "Transaction History"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_01
  Scenario: verify BBPS user dashboard when BBPS related permission not available from db (eg. transaction history) for BBPS users
    Given User is on LoginPage
    When Update Ehub Permission Table "View Transaction History" "Y"
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Then Verify Tiles Available For Product "BBPS" "Transaction History"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_02
  Scenario: verify BBPS user dashboard left side menu when BBPS related permission not available from db (eg. transaction history) for BBPS users
    Given User is on LoginPage
    When Update Ehub Permission Table "View Transaction History" "N"
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Then Click on Left BBPS Menu
    Then Verify Left Side SubMenu Not Available For Product "BBPS" "Transaction History"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_02
  Scenario: verify BBPS user dashboard left side menu when BBPS related permission not available from db (eg. transaction history) for BBPS users
    Given User is on LoginPage
    When Update Ehub Permission Table "View Transaction History" "Y"
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Then Click on Left BBPS Menu
    Then Verify Left Side SubMenu Available For Product "BBPS" "Transaction History"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_03
  Scenario: verify BBPS user dashboard when BBPS related permissions related to dashboard tiles not available from db for BBPS users
    Given User is on LoginPage
    When Update Ehub Permission Table Via Product "N"
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Then Verify Tiles Not Available For Product "BBPS" "Transaction History"
    Then Verify Tiles Not Available For Product "BBPS" "Register Complaint"
    Then Verify Tiles Not Available For Product "BBPS" "Complaint Tracking"
    Then Verify Tiles Not Available For Product "BBPS" "Txn Search"
    Then Verify Tiles Not Available For Product "BBPS" "Wallet Statement"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_03
  Scenario: verify BBPS user dashboard when BBPS related permissions related to dashboard tiles not available from db for BBPS users
    Given User is on LoginPage
    When Update Ehub Permission Table Via Product "Y"
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Then Verify Tiles Available For Product "BBPS" "Transaction History"
    Then Verify Tiles Available For Product "BBPS" "Register Complaint"
    Then Verify Tiles Available For Product "BBPS" "Complaint Tracking"
    Then Verify Tiles Available For Product "BBPS" "Txn Search"
    Then Verify Tiles Available For Product "BBPS" "Wallet Statement"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_04
  Scenario: verify BBPS user dashboard left menu when BBPS related permissions related to dashboard tiles not available from db for BBPS users
    Given User is on LoginPage
    When Update Ehub Permission Table Via Product "N"
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Then Click on Left BBPS Menu
    Then Verify Left Side SubMenu Not Available For Product "BBPS" "Transaction History"
    Then Verify Left Side SubMenu Not Available For Product "BBPS" "Register Complaint"
    Then Verify Left Side SubMenu Not Available For Product "BBPS" "Complaint Tracking"
    Then Verify Left Side SubMenu Not Available For Product "BBPS" "Txn Search"
    Then Verify Left Side SubMenu Not Available For Product "BBPS" "Wallet Statement"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_04
  Scenario: verify BBPS user dashboard left menu when BBPS related permissions related to dashboard tiles not available from db for BBPS users
    Given User is on LoginPage
    When Update Ehub Permission Table Via Product "Y"
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Then Click on Left BBPS Menu
    Then Verify Left Side SubMenu Available For Product "BBPS" "Transaction History"
    Then Verify Left Side SubMenu Available For Product "BBPS" "Register Complaint"
    Then Verify Left Side SubMenu Available For Product "BBPS" "Complaint Tracking"
    Then Verify Left Side SubMenu Available For Product "BBPS" "Txn Search"
    Then Verify Left Side SubMenu Available For Product "BBPS" "Wallet Statement"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_05
  Scenario: verify manage permission page when BBPS related permission not available from db (eg. transaction history) for BBPS users
    Given User is on LoginPage
    When Update Ehub Permission Table "View Transaction History" "N"
    When Enter the UserNM "AI_Automation" and Pass "Test@123" and click on LOGIN as "AI_Automation"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Babaji date Bank"
    Then Click On Manage permission Link On View Entity Details Page
    Then Verify Permission Not Available On Manage Permission Popup "BBPS" "View Transaction History"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_05
  Scenario: verify manage permission page when BBPS related permission not available from db (eg. transaction history) for BBPS users
    Given User is on LoginPage
    When Update Ehub Permission Table "View Transaction History" "Y"
    When Enter the UserNM "AI_Automation" and Pass "Test@123" and click on LOGIN as "AI_Automation"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Babaji date Bank"
    Then Click On Manage permission Link On View Entity Details Page
    Then Verify Permission Available On Manage Permission Popup "BBPS" "View Transaction History"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_06
  Scenario: verify User management details page when BBPS related permission not available from db (eg. transaction history) for BBPS users
    Given User is on LoginPage
    When Update Ehub Permission Table "View Transaction History" "N"
    When Enter the UserNM "Automation_admin" and Pass "Test@123" and click on LOGIN as "Automation_admin"
    Then Click on Entities in Configurations Menu
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Click On Admin CheckBox On User Management Details Page
    Then Verify Permission Not Available On User Management Details Page "BBPS" "View Transaction History"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_06
  Scenario: verify User management details page when BBPS related permission not available from db (eg. transaction history) for BBPS users
    Given User is on LoginPage
    When Update Ehub Permission Table "View Transaction History" "Y"
    When Enter the UserNM "Automation_admin" and Pass "Test@123" and click on LOGIN as "Automation_admin"
    Then Click on Entities in Configurations Menu
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Click On Admin CheckBox On User Management Details Page
    Then Verify Permission Available On User Management Details Page "BBPS" "View Transaction History"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_07
  Scenario: verify BBPS user dashboard when BBPS related permissions related to dashboard tiles not available from db for host admin user
    Given User is on LoginPage
    When Update Ehub Permission Table Via Product "N"
    When Enter the UserNM "Automation_admin" and Pass "Test@123" and click on LOGIN as "Automation_admin"
    Then Verify Tiles Available For Product "BBPS" "Transaction History"
    Then Verify Tiles Available For Product "BBPS" "Wallet Statement"
    Then Verify Tiles Available For Product "BBPS" "Settlement Report"
    Then Verify Tiles Available For Product "BBPS" "Recon Dashboard"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_07
  Scenario: verify BBPS user dashboard when BBPS related permissions related to dashboard tiles not available from db for host admin user
    Given User is on LoginPage
    When Update Ehub Permission Table Via Product "Y"
    When Enter the UserNM "Automation_admin" and Pass "Test@123" and click on LOGIN as "Automation_admin"
    Then Verify Tiles Available For Product "BBPS" "Transaction History"
    Then Verify Tiles Available For Product "BBPS" "Wallet Statement"
    Then Verify Tiles Available For Product "BBPS" "Settlement Report"
    Then Verify Tiles Available For Product "BBPS" "Recon Dashboard"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_08
  Scenario: verify AEPS user dashboard when AEPS related permission not available from db (eg. Demographic auth ) for AEPS institution users
    Given User is on LoginPage
    When Update AEPS Ehub Permission Table "Manage Demo KYC" "N"
    When Enter the UserNM "aeps_insti" and Pass "Test@123" and click on LOGIN as "aeps_insti"
    Then Verify Tiles Not Available For Product "aeps" "Demographic Auth"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_08
  Scenario: verify AEPS user dashboard when AEPS related permission not available from db (eg. Demographic auth ) for AEPS institution users
    Given User is on LoginPage
    When Update AEPS Ehub Permission Table "Manage Demo KYC" "Y"
    When Enter the UserNM "aeps_insti" and Pass "Test@123" and click on LOGIN as "aeps_insti"
    Then Verify Tiles Available For Product "aeps" "Demographic Auth"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_09
  Scenario: verify AEPS user dashboard left side menu when AEPS related permission not available from db (eg. demo auth) for AEPS institution users
    Given User is on LoginPage
    When Update AEPS Ehub Permission Table "Manage Demo KYC" "N"
    When Enter the UserNM "aeps_insti" and Pass "Test@123" and click on LOGIN as "aeps_insti"
    Then Click on Left AEPS Menu On Home Page
    Then Verify Left Side SubMenu Not Available For Product "AEPS" "Demographic Auth"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_09
  Scenario: verify AEPS user dashboard left side menu when AEPS related permission not available from db (eg. demo auth) for AEPS institution users
    Given User is on LoginPage
    When Update AEPS Ehub Permission Table "Manage Demo KYC" "Y"
    When Enter the UserNM "aeps_insti" and Pass "Test@123" and click on LOGIN as "aeps_insti"
    Then Click on Left AEPS Menu On Home Page
    Then Verify Left Side SubMenu Available For Product "AEPS" "Demographic Auth"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_10
  Scenario: verify manage permission page when AEPS related permission not available from db (eg. demo auth) for AEPS users
    Given User is on LoginPage
    When Update AEPS Ehub Permission Table "Manage Demo KYC" "N"
    When Enter the UserNM "Automation_admin" and Pass "Test@123" and click on LOGIN as "Automation_admin"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Ahmedabad Mercantile Co-Op Bank AEPS"
    Then Click On Manage permission Link On View Entity Details Page
    Then Verify Permission Not Available On Manage Permission Popup "AEPS" "Manage Demo KYC"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_10
  Scenario: verify manage permission page when AEPS related permission not available from db (eg. demo auth) for AEPS users
    Given User is on LoginPage
    When Update AEPS Ehub Permission Table "Manage Demo KYC" "Y"
    When Enter the UserNM "Automation_admin" and Pass "Test@123" and click on LOGIN as "Automation_admin"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Ahmedabad Mercantile Co-Op Bank AEPS"
    Then Click On Manage permission Link On View Entity Details Page
    Then Verify Permission Available On Manage Permission Popup "AEPS" "Manage Demo KYC"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_11
  Scenario: verify User management details page when AEPS related permission not available from db (eg. demo auth) for AEPS users
    Given User is on LoginPage
    When Update AEPS Ehub Permission Table "Manage Demo KYC" "N"
    When Enter the UserNM "Automation_admin" and Pass "Test@123" and click on LOGIN as "Automation_admin"
    Then Click on Entities in Configurations Menu
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Click On Admin CheckBox On User Management Details Page
    Then Verify Permission Not Available On User Management Details Page "AEPS" "Manage Demo KYC"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_11
  Scenario: verify User management details page when AEPS related permission not available from db (eg. demo auth) for AEPS users
    Given User is on LoginPage
    When Update AEPS Ehub Permission Table "Manage Demo KYC" "Y"
    When Enter the UserNM "Automation_admin" and Pass "Test@123" and click on LOGIN as "Automation_admin"
    Then Click on Entities in Configurations Menu
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Click On Admin CheckBox On User Management Details Page
    Then Verify Permission Available On User Management Details Page "AEPS" "Manage Demo KYC"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_12
  Scenario: verify microATM user dashboard when microATM related permission not available from db (eg. transaction history) for microATM users
    Given User is on LoginPage
    When Update MicroATM Ehub Permission Table "View Transaction History" "N"
    When Enter the UserNM "Micro_Institutions" and Pass "Test@123" and click on LOGIN as "Micro_Institutions"
    Then Verify Tiles Not Available For Product "miniatm" "Transaction History"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_12
  Scenario: verify microATM user dashboard when microATM related permission not available from db (eg. transaction history) for microATM users
    Given User is on LoginPage
    When Update MicroATM Ehub Permission Table "View Transactions" "Y"
    When Enter the UserNM "Micro_Institutions" and Pass "Test@123" and click on LOGIN as "Micro_Institutions"
    Then Verify Tiles Available For Product "miniatm" "Transaction History"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_13
  Scenario: verify microATM user dashboard left side menu when microATM related permission not available from db (eg. transaction history) for microATM users
    Given User is on LoginPage
    When Update MicroATM Ehub Permission Table "View Transaction History" "N"
    When Enter the UserNM "Micro_Institutions" and Pass "Test@123" and click on LOGIN as "Micro_Institutions"
    Then Click on Left MicroATM Menu On Home Page
    Then Verify Left Side SubMenu Not Available For Product "Micro ATM" "Transaction History"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_13
  Scenario: verify microATM user dashboard left side menu when microATM related permission not available from db (eg. transaction history) for microATM users
    Given User is on LoginPage
    When Update MicroATM Ehub Permission Table "View Transactions" "Y"
    When Enter the UserNM "Micro_Institutions" and Pass "Test@123" and click on LOGIN as "Micro_Institutions"
    Then Click on Left MicroATM Menu On Home Page
    Then Verify Left Side SubMenu Available For Product "Micro ATM" "Transaction History"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_14
  Scenario: verify manage permission page when microATM related permission not available from db (eg. txn history) for microATM users
    Given User is on LoginPage
    When Update MicroATM Ehub Permission Table "View Transactions" "N"
    When Enter the UserNM "Automation_admin" and Pass "Test@123" and click on LOGIN as "Automation_admin"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "NSDL"
    Then Click On Manage permission Link On View Entity Details Page
    Then Verify Permission Not Available On Manage Permission Popup "microATM" "View Transactions"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_14
  Scenario: verify manage permission page when microATM related permission not available from db (eg. txn history) for microATM users
    Given User is on LoginPage
    When Update MicroATM Ehub Permission Table "View Transactions" "Y"
    When Enter the UserNM "Automation_admin" and Pass "Test@123" and click on LOGIN as "Automation_admin"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "NSDL"
    Then Click On Manage permission Link On View Entity Details Page
    Then Verify Permission Available On Manage Permission Popup "microATM" "View Transactions"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_15
  Scenario: verify User management details page when microATM related permission not available from db (eg. transaction history) for microATM users
    Given User is on LoginPage
    When Update MicroATM Ehub Permission Table "View Transactions" "N"
    When Enter the UserNM "Automation_admin" and Pass "Test@123" and click on LOGIN as "Automation_admin"
    Then Click on Entities in Configurations Menu
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Click On Admin CheckBox On User Management Details Page
    Then Verify Permission Not Available On User Management Details Page "microATM" "View Transactions"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_15
  Scenario: verify User management details page when microATM related permission not available from db (eg. transaction history) for microATM users
    Given User is on LoginPage
    When Update MicroATM Ehub Permission Table "View Transactions" "Y"
    When Enter the UserNM "Automation_admin" and Pass "Test@123" and click on LOGIN as "Automation_admin"
    Then Click on Entities in Configurations Menu
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Click On Admin CheckBox On User Management Details Page
    Then Verify Permission Available On User Management Details Page "microATM" "View Transactions"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_16
  Scenario: verify miniATM user dashboard when miniATM related permission not available from db (eg. transaction history) for miniATM users
    Given User is on LoginPage
    When Update MiniATM Ehub Permission Table "View Transactions" "N"
    When Enter the UserNM "corp_bc_mini" and Pass "Test@123" and click on LOGIN as "corp_bc_mini"
    Then Verify Tiles Not Available For Product "miniatm" "Transaction History"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_16
  Scenario: verify miniATM user dashboard when miniATM related permission not available from db (eg. transaction history) for miniATM users
    Given User is on LoginPage
    When Update MiniATM Ehub Permission Table "View Transactions" "Y"
    When Enter the UserNM "corp_bc_mini" and Pass "Test@123" and click on LOGIN as "corp_bc_mini"
    Then Verify Tiles Available For Product "miniatm" "Transaction History"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_17
  Scenario: verify miniATM user dashboard left side menu when miniATM related permission not available from db (eg. transaction history) for miniATM users
    Given User is on LoginPage
    When Update MiniATM Ehub Permission Table "View Transactions" "N"
    When Enter the UserNM "corp_bc_mini" and Pass "Test@123" and click on LOGIN as "corp_bc_mini"
    Then Click on Left Sarvatra ATM Menu On Home Page
    Then Verify Left Side SubMenu Not Available For Product "Sarvatra ATM" "Transaction History"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_17
  Scenario: verify miniATM user dashboard left side menu when miniATM related permission not available from db (eg. transaction history) for miniATM users
    Given User is on LoginPage
    When Update MiniATM Ehub Permission Table "View Transactions" "Y"
    When Enter the UserNM "corp_bc_mini" and Pass "Test@123" and click on LOGIN as "corp_bc_mini"
    Then Click on Left Sarvatra ATM Menu On Home Page
    Then Verify Left Side SubMenu Available For Product "Sarvatra ATM" "Transaction History"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_18
  Scenario: verify manage permission page when miniATM related permission not available from db (eg. txn history) for miniATM users
    Given User is on LoginPage
    When Update MiniATM Ehub Permission Table "View Transactions" "N"
    When Enter the UserNM "Automation_admin" and Pass "Test@123" and click on LOGIN as "Automation_admin"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra miniATM Corporate BC"
    Then Click On Manage permission Link On View Entity Details Page
    Then Verify Permission Not Available On Manage Permission Popup "Sarvatra miniATM" "View Transactions"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_18
  Scenario: verify manage permission page when miniATM related permission not available from db (eg. txn history) for miniATM users
    Given User is on LoginPage
    When Update MiniATM Ehub Permission Table "View Transactions" "Y"
    When Enter the UserNM "Automation_admin" and Pass "Test@123" and click on LOGIN as "Automation_admin"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra miniATM Corporate BC"
    Then Click On Manage permission Link On View Entity Details Page
    Then Verify Permission Available On Manage Permission Popup "Sarvatra miniATM" "View Transactions"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_19
  Scenario: verify User management details page when miniATM related permission not available from db (eg. transaction history) for miniATM users
    Given User is on LoginPage
    When Update MiniATM Ehub Permission Table "View Terminal" "N"
    When Enter the UserNM "Automation_admin" and Pass "Test@123" and click on LOGIN as "Automation_admin"
    Then Click on Entities in Configurations Menu
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Click On Admin CheckBox On User Management Details Page
    Then Verify Permission Not Available On User Management Details Page "Sarvatra miniATM" "View Terminal"

  @sprint3_2023 @epic-496 @SP-6758 @SP_6758_TC_19
  Scenario: verify User management details page when miniATM related permission not available from db (eg. transaction history) for miniATM users
    Given User is on LoginPage
    When Update MiniATM Ehub Permission Table "View Terminal" "Y"
    When Enter the UserNM "Automation_admin" and Pass "Test@123" and click on LOGIN as "Automation_admin"
    Then Click on Entities in Configurations Menu
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Click On Admin CheckBox On User Management Details Page
    Then Verify Permission Available On User Management Details Page "Sarvatra miniATM" "View Terminal"
