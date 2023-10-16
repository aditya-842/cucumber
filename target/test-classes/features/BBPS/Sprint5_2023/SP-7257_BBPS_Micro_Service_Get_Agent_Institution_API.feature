Feature: BBPS FASTag through Cash
 
  @sprint5_2023 @epic-496 @SP-7257 @SP_7257_TC_01 @redirection
  Scenario: login as a Admin, when click AI entities then user navigate on view entity page and entity data should be available
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then verify AI ID Is visible On View Entity Details Page
    Then verify AI Type Is visible On View Entity Details Page
    Then verify AI Acquiring Entity Is visible On View Entity Details Page
    Then verify AI Agent Institution Name Is visible On View Entity Details Page

  @sprint5_2023 @epic-496 @SP-7257 @SP_7257_TC_02 @redirection
  Scenario: login as a Admin, when click OU entities then user navigate on view entity page and entity data should be available
    Given User is on LoginPage
    When Enter the UserNM "Automation_OU" and Pass "Test@12" and click on LOGIN as "Automation_OU"
    When Click on Entities in Configurations Menu
    Then verify OU ID Is visible On View Entity Details Page
    Then verify OU Type Is visible On View Entity Details Page

  @sprint5_2023 @epic-496 @SP-7257 @SP_7257_TC_03 @redirection
  Scenario: login as a AI, when click entities then user navigate on view entity page and entity data should be available
    Given User is on LoginPage
    When Enter the UserNM "Automation_AI" and Pass "Test@12" and click on LOGIN as "Automation_AI"
    When Click on Entities in Configurations Menu
    Then verify AI ID Is visible On View Entity Details Page
    Then verify AI Type Is visible On View Entity Details Page
    Then verify AI Acquiring Entity Is visible On View Entity Details Page
    Then verify AI Agent Institution Name Is visible On View Entity Details Page

