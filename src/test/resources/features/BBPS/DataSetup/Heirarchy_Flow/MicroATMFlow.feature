Feature: Validate the functionality of MicroATM_Flow

  @MicroATM_Flow
  Scenario: add Institutions.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select As Acquirer CheckBox on Assign Product Role Pop-Up
    Then Select "microATM" in Product dropdown and role "Institutions" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Institution For Institution Map "41 - NSDL"
    Then Enter MID Prifix On Assign Institution Page "HJU"
    Then Select Select head Office State "Andhra Pradesh"
    Then Enter GSTNumber On Assign Institution Page "37AACCF8040D1ZM"
    Then Click On Next on Assign Institution Page
    Then Click On Save on Assign Institution Page

  @MicroATM_Flow
  Scenario: Check user can create BC in microATM Flow.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "NSDL"
    Then Click On Entity From List On View Entity Details Page For Flow "NSDL"
    Then Click on ADD NEW button in Child entity section
    Then Select "microATM" in Product dropdown and role "BC" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Enter BC Name On BC Details page "Micro_BC"
    Then Enter shortCode On BC Details page "WE"
    Then Click On GSTNumber Not Available On BC Details page
    Then Enter mobile On BC Details page "9090909090"
    Then Enter email On BC Details page "gh@gmail.com"
    Then Enter address1 On BC Details page "Pune"
    Then Enter city On BC Details page "pune"
    Then Select State On BC Details page "Maharashtra"
    Then Enter pin On BC Details page "411001"
    Then Click On Next on Assign Institution Page
    Then Click On Save on Assign Institution Page

  @MicroATM_Flow
  Scenario: Check user can create Merchant in microATM Flow.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "NSDL"
    Then Click On Entity From List On View Entity Details Page For Flow "NSDL"
    Then Click On Entity From List On View Entity Details Page For Flow "Micro_BC"
    Then Click on ADD NEW button in Child entity section
    Then Select "microATM" in Product dropdown and role "Merchant" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Enter Merchant Name On Merchant Details page "Micro_Merchant"
    Then Click On GSTNumber Not Available On BC Details page
    Then Enter mobile On Merchant Details page "9090909090"
    Then Enter address1 On Merchant Details page "Pune"
    Then Enter city On Merchant Details page "pune"
    Then Select State On Merchant Details page "Maharashtra"
    Then Enter pin On Merchant Details page "411001"
    Then Click On Next on Assign Institution Page
    Then Click On Save on Assign Institution Page

  @MicroATM_Flow
  Scenario: Check user can create Terminal in microATM Flow.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "NSDL"
    Then Click On Entity From List On View Entity Details Page For Flow "NSDL"
    Then Click On Entity From List On View Entity Details Page For Flow "Micro_BC"
    Then Click On Entity From List On View Entity Details Page For Flow "Micro_Merchant"
    Then Click on ADD NEW button in Child entity section
    Then Select "microATM" in Product dropdown and role "Terminal" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Enter POSNumber On Terminal Details page "POSABCD123456"
    Then Enter address1 On Terminal Details page "Pune"
    Then Enter city On Terminal Details page "pune"
    Then Select State On Terminal Details page "Maharashtra"
    Then Enter pin On Terminal Details page "411001"
    Then Click On Next on Assign Institution Page
    Then Click On Save on Assign Institution Page
