Feature: BBPS Micro Service - Get GET ou-details/ou_id

  @sprint12 @epic-2825 @SP-8077 @SP_8077_TC_01 @SP_8077_TC_02 @SP_8077_TC_03
  Scenario Outline: login as a Admin, when user click on add new and select for AG from AI page then user navigate on Agent Group Details page
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow " Sarvatra"
    Then Click on ADD NEW button in Child entity section
    Then Select the "BBPS" and Product "Agent Group" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Click On Agent Group Dropdown On Agent Group Details
    Then Verify Agent Group Option In Dropdown On Agent Group Details "userdemo"
