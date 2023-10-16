Feature: BBPS Micro Service - POST - get- child entities API

  @sprint4_2023 @epic-42 @SP-6629 @SP_6629_TC_01
  Scenario: login as a Admin, Click on entities and verify child entities.
    Given User is on LoginPage
    When Enter the UserNM "Automation_admin" and Pass "Test@123" and click on LOGIN as "Automation_admin"
    Then Click on Entities in Configurations Menu
    Then Verify Entity "100106" is displayed
    Then Verify Entity "100075" is displayed
    Then Verify Entity "100041" is displayed
    Then Verify Entity "100049" is displayed
    Then Verify Entity "100163" is displayed
    #Then Get Entity count
    
  @sprint4_2023 @epic-42 @SP-6629 @SP_6629_TC_02 @SP_6629_TC_04
  Scenario: login as a OU admin user, Click on entities and verify child entities
    Given User is on LoginPage
    When Enter the UserNM "Automation_OU" and Pass "Test@12" and click on LOGIN as "Automation_OU"
    Then Click on Entities in Configurations Menu

  @sprint4_2023 @epic-42 @SP-6629 @SP_6629_TC_03 @SP_6629_TC_05
  Scenario: login as a OU non admin user, Click on entities and verify child entities
    Given User is on LoginPage
    When Enter the UserNM "Automation_OU" and Pass "Test@12" and click on LOGIN as "Automation_OU"
    Then Click on Entities in Configurations Menu
    #Then Verify Entity "100106" is displayed
    # Non admin user
    
  @sprint4_2023 @epic-42 @SP-6629 @SP_6629_TC_06 @SP_6629_TC_08
  Scenario: login as a Agent Institution admin user, Click on entities and verify child entities
    Given User is on LoginPage
    When Enter the UserNM "Automation_AI" and Pass "Test@12" and click on LOGIN as "Automation_AI"
    Then Click on Entities in Configurations Menu
    Then Verify Entity "100006" is displayed
    Then Verify Entity "100011" is displayed
    Then Verify Entity "100012" is displayed
    Then Verify Entity "100008" is displayed
    Then Verify Entity "100039" is displayed

  @sprint4_2023 @epic-42 @SP-6629 @SP_6629_TC_07 @SP_6629_TC_09
  Scenario: login as a Agent Institution non admin user, Click on entities and verify child entities.
    Given User is on LoginPage
    When Enter the UserNM "Automation_AI" and Pass "Test@12" and click on LOGIN as "Automation_AI"
    Then Click on Entities in Configurations Menu
    # Then Verify Entity "100106" is displayed
    # Non admin user
    
  @sprint4_2023 @epic-42 @SP-6629 @SP_6629_TC_10 @SP_6629_TC_12
  Scenario: login as a Agent group admin user, Click on entities and verify child entities
    Given User is on LoginPage
    When Enter the UserNM "Automation_AG" and Pass "Test@12" and click on LOGIN as "Automation_AG"
    Then Click on Entities in Configurations Menu
    Then Verify Entity "100032" is displayed
    Then Verify Entity "100007" is displayed
    Then Verify Entity "100015" is displayed
    Then Verify Entity "100016" is displayed
    Then Verify Entity "100032" is displayed

  @sprint4_2023 @epic-42 @SP-6629 @SP_6629_TC_11 @SP_6629_TC_13
  Scenario: login as a Agent group non admin user, Click on entities and verify child entities
    Given User is on LoginPage
    When Enter the UserNM "Automation_AG" and Pass "Test@12" and click on LOGIN as "Automation_AG"
    Then Click on Entities in Configurations Menu
    # Then Verify Entity "100106" is displayed
    # Non admin user
    
  @sprint4_2023 @epic-42 @SP-6629 @SP_6629_TC_14 @SP_6629_TC_16
  Scenario: login as a Agent admin user, Click on entities and verify child entities
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Then Click on Entities in Configurations Menu
    #Then Verify Entity "100106" is displayed

  @sprint4_2023 @epic-42 @SP-6629 @SP_6629_TC_15 @SP_6629_TC_17
  Scenario:  login as a Agent non admin user, Click on entities and verify child entities
    Given User is on LoginPage
    When Enter the UserNM "Auto_Agent" and Pass "TEst@123" and click on LOGIN as "Auto_Agent"
    Then Click on Entities in Configurations Menu
    #Then Verify Entity "100106" is displayed
    # Non admin user
