Feature: Addition of agent ID on User management screen

  @sprint13 @epic-2825 @SP-2616 @SP_2616_TC_01
  Scenario: Login as a admin, Verify Agent id
    Given User is on LoginPage
    When Enter the UserNM "Automation_admin" and Pass "Test@123" and click on LOGIN as "Automation_admin"
    Then Click on Users
    Then Verify Agentid Field

  @sprint13 @epic-2825 @SP-2616 @SP_2616_TC_02
  Scenario: Login as a admin, Check if search field is visible
    Given User is on LoginPage
    When Enter the UserNM "Automation_admin" and Pass "Test@123" and click on LOGIN as "Automation_admin"
    Then Click on Users
    Then Verify AgentId input Field

  @sprint13 @epic-2825 @SP-2616 @SP_2616_TC_03
  Scenario: Login as a admin, verify the drop down filter for Agent Id field
    Given User is on LoginPage
    When Enter the UserNM "Automation_admin" and Pass "Test@123" and click on LOGIN as "Automation_admin"
    Then Click on Users
    Then Click AgentId Dropdown
    Then Verify Dropdown Value "Sort Ascending"
    Then Verify Dropdown Value "Sort Descending"
    Then Verify Dropdown Value "Hide Column"

  @sprint13 @epic-2825 @SP-2616 @SP_2616_TC_05
  Scenario: Login as a admin, verify if the table dropdown has agent id option
    Given User is on LoginPage
    When Enter the UserNM "Automation_admin" and Pass "Test@123" and click on LOGIN as "Automation_admin"
    Then Click on Users
    Then Click User Management Grid filter Dropdown
    Then Verify Agent id in User Management Grid filter Dropdown

  @sprint13 @epic-2825 @SP-2616 @SP_2616_TC_06
  Scenario: Login as a AI user, Verify Agent id
    Given User is on LoginPage
    When Enter the UserNM "Automation_AI" and Pass "Test@12" and click on LOGIN as "Automation_AI"
    Then Click on Users
    Then Verify Agentid Field

  @sprint13 @epic-2825 @SP-2616 @SP_2616_TC_07
  Scenario: Login as a AI user, Check if search field is visible
    Given User is on LoginPage
    When Enter the UserNM "Automation_AI" and Pass "Test@12" and click on LOGIN as "Automation_AI"
    Then Click on Users
    Then Verify AgentId input Field

  @sprint13 @epic-2825 @SP-2616 @SP_2616_TC_08
  Scenario: Login as a AI user, verify the drop down filter for Agent Id field
    Given User is on LoginPage
    When Enter the UserNM "Automation_AI" and Pass "Test@12" and click on LOGIN as "Automation_AI"
    Then Click on Users
    Then Click AgentId Dropdown
    Then Verify Dropdown Value "Sort Ascending"
    Then Verify Dropdown Value "Sort Descending"
    Then Verify Dropdown Value "Hide Column"

  @sprint13 @epic-2825 @SP-2616 @SP_2616_TC_10
  Scenario: Login as a AI user, verify if the table dropdown has agent id option
    Given User is on LoginPage
    When Enter the UserNM "Automation_AI" and Pass "Test@12" and click on LOGIN as "Automation_AI"
    Then Click on Users
    Then Click User Management Grid filter Dropdown
    Then Verify Agent id in User Management Grid filter Dropdown

  @sprint13 @epic-2825 @SP-2616 @SP_2616_TC_11
  Scenario: Login as a OU user, Verify Agent id
    Given User is on LoginPage
    When Enter the UserNM "Automation_OU" and Pass "Test@12" and click on LOGIN as "Automation_OU"
    Then Click on Users
    Then Verify Agentid Field

  @sprint13 @epic-2825 @SP-2616 @SP_2616_TC_12
  Scenario: Login as a OU user, Check if search field is visible
    Given User is on LoginPage
    When Enter the UserNM "Automation_OU" and Pass "Test@12" and click on LOGIN as "Automation_OU"
    Then Click on Users
    Then Verify AgentId input Field

  @sprint13 @epic-2825 @SP-2616 @SP_2616_TC_13
  Scenario: Login as a OU user, verify the drop down filter for Agent Id field
    Given User is on LoginPage
    When Enter the UserNM "Automation_OU" and Pass "Test@12" and click on LOGIN as "Automation_OU"
    Then Click on Users
    Then Click AgentId Dropdown
    Then Verify Dropdown Value "Sort Ascending"
    Then Verify Dropdown Value "Sort Descending"
    Then Verify Dropdown Value "Hide Column"

  @sprint13 @epic-2825 @SP-2616 @SP_2616_TC_15
  Scenario: Login as a OU user, verify if the table dropdown has agent id option
    Given User is on LoginPage
    When Enter the UserNM "Automation_OU" and Pass "Test@12" and click on LOGIN as "Automation_OU"
    Then Click on Users
    Then Click User Management Grid filter Dropdown
    Then Verify Agent id in User Management Grid filter Dropdown

  @sprint13 @epic-2825 @SP-2616 @SP_2616_TC_16
  Scenario: Login as a AG user, Verify Agent id
    Given User is on LoginPage
    When Enter the UserNM "Automation_AG" and Pass "Test@12" and click on LOGIN as "Automation_AG"
    Then Click on Users
    Then Verify Agentid Field

  @sprint13 @epic-2825 @SP-2616 @SP_2616_TC_17
  Scenario: Login as a AG user, Check if search field is visible
    Given User is on LoginPage
    When Enter the UserNM "Automation_AG" and Pass "Test@12" and click on LOGIN as "Automation_AG"
    Then Click on Users
    Then Verify AgentId input Field

  @sprint13 @epic-2825 @SP-2616 @SP_2616_TC_18
  Scenario: Login as a AG user, verify the drop down filter for Agent Id field
    Given User is on LoginPage
    When Enter the UserNM "Automation_AG" and Pass "Test@12" and click on LOGIN as "Automation_AG"
    Then Click on Users
    Then Click AgentId Dropdown
    Then Verify Dropdown Value "Sort Ascending"
    Then Verify Dropdown Value "Sort Descending"
    Then Verify Dropdown Value "Hide Column"

  @sprint13 @epic-2825 @SP-2616 @SP_2616_TC_20
  Scenario: Login as a AG user, verify if the table dropdown has agent id option
    Given User is on LoginPage
    When Enter the UserNM "Automation_AG" and Pass "Test@12" and click on LOGIN as "Automation_AG"
    Then Click on Users
    Then Click User Management Grid filter Dropdown
    Then Verify Agent id in User Management Grid filter Dropdown

  @sprint13 @epic-2825 @SP-2616 @SP_2616_TC_21
  Scenario: Login as a Agent user, Verify Agentent id
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Then Click on Users
    Then Verify Agentid Field

  @sprint13 @epic-2825 @SP-2616 @SP_2616_TC_22
  Scenario: Login as a Agent user, Check if search field is visible
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Then Click on Users
    Then Verify AgentId input Field

  @sprint13 @epic-2825 @SP-2616 @SP_2616_TC_23
  Scenario: Login as a Agent user, verify the drop down filter for Agentent Id field
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Then Click on Users
    Then Click AgentId Dropdown
    Then Verify Dropdown Value "Sort Ascending"
    Then Verify Dropdown Value "Sort Descending"
    Then Verify Dropdown Value "Hide Column"

  @sprint13 @epic-2825 @SP-2616 @SP_2616_TC_25
  Scenario: Login as a Agent user, verify if the table dropdown has Agentent id option
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Then Click on Users
    Then Click User Management Grid filter Dropdown
    Then Verify Agent id in User Management Grid filter Dropdown
