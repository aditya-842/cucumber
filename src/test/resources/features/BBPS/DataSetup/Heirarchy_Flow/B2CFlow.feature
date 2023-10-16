Feature: Validate the functionality of b2c_Flow

  @B2C_Flow
  Scenario: Check user can create OU in B2C Flow.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select As Acquirer CheckBox on Assign Product Role Pop-Up
    Then Select "BBPS" in Product dropdown and role "OU" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select OU on Assign OU popup "Capital Bank"
    Then Click on Save Button on Assign OU popup

  @B2C_Flow
  Scenario: Check user can create Agent Institution in B2C Flow.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    Then Click on ADD NEW button in Child entity section
    Then Select "BBPS" in Product dropdown and role "Agent Institution" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Agent Institution "Sarvatra - CS11" via AgentInstitution
    Then Click On Save on Agent Institution

  @B2C_Flow
  Scenario: Check user can create Agent in B2C Flow.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click on ADD NEW button in Child entity section
    Then Select "BBPS" in Product dropdown and role "Agent" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select AgentGroup "None"
    Then Select Agent On Agent Details Page "Capital Small Finance bank, Jalandhar Branch"
    Then Click On Save on Agent Institution
