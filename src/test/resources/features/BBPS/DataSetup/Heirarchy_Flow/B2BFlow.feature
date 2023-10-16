Feature: Validate the functionality of b2b_Flow

  @b2b_Flow
  Scenario: add OU.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select As Acquirer CheckBox on Assign Product Role Pop-Up
    Then Select "BBPS" in Product dropdown and role "OU" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select OU on Assign OU popup "Dombiwali Nagari Bank"
    Then Click on Save Button on Assign OU popup
    
   @b2b_Flow
  Scenario: Check user can create Agent Institution in B2B Flow.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select "BBPS" in Product dropdown and role "Agent Institution" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Acquiring Bank on Agent Institution "Dombiwali Nagari Bank"
    Then Select Agent Institution "Sarvatra - DN11" via AgentInstitution
    Then Click On Save on Agent Institution
    
    @b2b_Flow
  Scenario: Check user can create Agent Group in B2B Flow.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click on ADD NEW button in Child entity section
    Then Select "BBPS" in Product dropdown and role "Agent Group" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select AgentGroup "Babaji date Bank"
    Then Click On Save on Agent Institution
    
    @b2b_Flow
  Scenario: Check user can create Agent in B2B Flow.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Babaji date Bank"
    Then Click on ADD NEW button in Child entity section
    Then Select "BBPS" in Product dropdown and role "Agent" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Agent On Agent Details Page "THE SEVA VIKAS CO-OP. BANK LTD"
    Then Click On Save on Agent Institution
    
    