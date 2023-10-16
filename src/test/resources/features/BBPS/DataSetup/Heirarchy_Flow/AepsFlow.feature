Feature: Validate the functionality of AEPS_flow


  @Aeps_Flow
  Scenario Outline: add Institutions.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select As Acquirer CheckBox on Assign Product Role Pop-Up
    Then Select "AEPS" in Product dropdown and role "Institutions" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Institutions on Assign Institutions popup "<Institutions>"
    Then Click on Save Button on Assign Institutions popup
    
       Examples: 
      | Institutions     |
      | 588 - Utkarsh SFB |
    
      @Aeps_Flow
  Scenario Outline: add BC.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select "AEPS" in Product dropdown and role "BC" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Acquiring Bank "<Acquiring Bank>" on BC Details_AEPS Page
    Then Select Settlement Bank "<Settlement Bank>" on BC Details_AEPS Page
    Then Enter BC Name "<BC Name>" on BC Details_AEPS Page
    Then Click on Save Button on BC Details_AEPS Page
    
      Examples: 
        |   Acquiring Bank     | Settlement Bank  |  BC Name   |
        |   Utkarsh SFB  | Sarvatra - 1     |  BC_Test   |
    
     @Aeps_Flow
  Scenario Outline: add BC Agent
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select "AEPS" in Product dropdown and role "BC Agent" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select BC "<BC>" on BC Details_AEPS Page
    Then Select Terminal Type "<Terminal Type>" on BC Details_AEPS Page
    Then Select Branch "<Branch>" on BC Details_AEPS Page
    Then Enter Mobile number "<Mobile no>" on BC Details_AEPS Page
    Then Enter Loacation Name "<Location>" on BC Details_AEPS Page
    Then Enter Address "<Address>" on BC Details_AEPS Page
    Then Enter City "<City>" on BC Details_AEPS Page
    Then Enter State "<State>" on BC Details_AEPS Page
    Then Enter Pincode "<Pincode>" on BC Details_AEPS Page
    Then Click on Save Button on BC Agent Details_AEPS Page
    
        Examples:
    | BC      | Terminal Type  |  Branch         | Mobile no | Location | Address  | City | State       | Pincode |
    | BC_Test    | ANALOGIES          | UTKARSH SFB MAIN BRANCH | 9087654321|  street1 | street 2 | pune | MH | 500081 |
   
    
    
   