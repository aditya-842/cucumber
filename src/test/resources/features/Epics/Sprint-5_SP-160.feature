#Author: Mayur Kale
Feature: Validate the UI functionality of [SP-160] PPI- Program Manager Registration epics stories.

  #Stories have --> SP-192, SP-193, SP-194, SP-195, SP-517.
  #Stories covered --> SP-192.
  # TC not Automated: SP-193, SP-194, SP-195, SP-517.
  #
  Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage
    # When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    When Enter the UserNM "AJ_admin" and Pass "Test@123" and click on LOGIN as "AJ_admin"

  # Given User is on Homepage
  #
  #>> Author: Mayur Kale
  #
  @Sprint-5 @epic-160 @sp-192 @TC_PPI_PMR_UI_001
  Scenario: To check that the Host admin user can View Assign Product Role pop-up window by clicking on Add New hypertext link.
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Verify Host admin user can View Assign Product Role popup
    Then Click on CLOSE button on Assign Product Role popup
    Then Click on logout button

  @Sprint-5 @epic-160 @sp-192 @TC_PPI_PMR_UI_002
  Scenario: To check that the Host admin user can view and select values from Product dropdown on Assign Product Role pop-up window for product PPI.
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Verify that user can see "PPI" in Product dropdown on Assign Product Role Pop-Up
    Then Click on CLOSE button on Assign Product Role popup
    Then Click on logout button

  @Sprint-5 @epic-160 @sp-192 @TC_PPI_PMR_UI_003
  Scenario Outline: To check that the Host admin user can view and select values from Role dropdown on Assign Product Role pop-up window for product PPI.
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Verify that user can see "<Product>" & "<Role1>" on Assign Product Role Pop-Up
    Then Verify that user can see "<Product>" & "<Role2>" on Assign Product Role Pop-Up
    Then Verify NEXT button should available on Assign Product Role Pop-Up
    Then Click on CLOSE button on Assign Product Role popup
    Then Click on logout button

    Examples: 
      | Product | Role1           | Role2                     |
      | PPI     | Program Manager | Prepaid Agent Institution |

  @Sprint-5 @epic-160 @sp-192 @TC_PPI_PMR_UI_004
  Scenario Outline: To verify that validation message should be display on screen for invalid inputs for mandatory (*) field on ‘Assign Product Role’ pop-up window.
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Click on Next button on Assign Product Role Pop-Up
    Then Verify "<Validation_Product>" message for "Product" drpodown on Assign Product Role Pop-Up
    Then Verify "<Validation_Role>" message for "Role" drpodown on Assign Product Role Pop-Up
    Then Click on close button on Search Entity by name pop up
    Then Click on logout button

    Examples: 
      | Validation_Product     | Validation_Role     |
      | Please select Product. | Please select Role. |

  @Sprint-5 @epic-160 @sp-192 @TC_PPI_PMR_UI_005
  Scenario: To check that Host admin user should not be able to select direct Product Role without selecting Product on Assign Product Role pop-up window.
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Verify user can not view any role in Role dropdown without slecting Product
    Then Click on CLOSE button on Assign Product Role popup
    Then Click on logout button

  @Sprint-5 @epic-160 @sp-192 @TC_PPI_PMR_UI_006
  Scenario Outline: To check that if host admin select As Acquirer checkbox and select PPI as product in product dropdown, Only Instistuion should be display in Role dropdown.
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select As Acquirer CheckBox on Assign Product Role Pop-Up
    Then Verify that user can see "<Product>" & "<Role>" on Assign Product Role Pop-Up
    Then Click on CLOSE button on Assign Product Role popup
    Then Click on logout button

    Examples: 
      | Product | Role        |
      | PPI     | Institution |

  @Sprint-5 @epic-160 @sp-192 @TC_PPI_PMR_UI_007
  Scenario Outline: To check that on ‘Assign Product Role’ pop-up window, host admin should not see Program Manager in Role dropdown with other products exept PPI.
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Verify PPI roles should not be view in Role dropdown while selecting "BBPS" in product dropdown
    Then Verify PPI roles should not be view in Role dropdown while selecting "AEPS" in product dropdown
    Then Verify PPI roles should not be view in Role dropdown while selecting "microATM" in product dropdown
    Then Verify PPI roles should not be view in Role dropdown while selecting "Sarvatra miniATM" in product dropdown
    Then Click on CLOSE button on Assign Product Role popup
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    |
      | NSDL | PPI     | Institution | NSDL        | 12226 |

  #
  #>> Author: Mayur Kale
  #
  @Sprint-5 @epic-160 @sp-193 @TC_PPI_PMR_UI_008
  Scenario: To check that the Host admin user can see the Program manager registration screen.
    When Click on Entities in Configurations Menu
    Then Enter "NSDL" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "NSDL" in Child entity
    Then Click on ADD NEW button in Child entity section
    Then Select "PPI" in Product dropdown and role "Program Manager" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Verify user navigate to Program Manager Details | PPI page
    Then Close the current window
    Then Click on logout button

  @Sprint-5 @epic-160 @sp-193 @TC_PPI_PMR_UI_009
  Scenario: To check that the Host admin user can view Mandatory fields (with an asterisk (*) mark) on Program manager registration screen.
    When Click on Entities in Configurations Menu
    Then Enter "NSDL" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "NSDL" in Child entity
    Then Click on ADD NEW button in Child entity section
    Then Select "PPI" in Product dropdown and role "Program Manager" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Verify user navigate to Program Manager Details | PPI page
    Then Verify user can see all mandatory input fields Program Manager Details page
    Then Verify user can see all mandatory dropdown fields Program Manager Details page
    Then Close the current window
    Then Click on logout button

  @Sprint-5 @epic-160 @sp-193 @TC_PPI_PMR_UI_010
  Scenario: To check that the Host admin user can view all Non-Mandatory fields (without an asterisk (*) mark) on Program manager registration screen.
    When Click on Entities in Configurations Menu
    Then Enter "NSDL" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "NSDL" in Child entity
    Then Click on ADD NEW button in Child entity section
    Then Select "PPI" in Product dropdown and role "Program Manager" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Verify user navigate to Program Manager Details | PPI page
    Then Verify user can see all Non-mandatory input fields Program Manager Details page
    Then Close the current window
    Then Click on logout button

  #->> @Sprint-5 @epic-160 @sp-193 @TC_PPI_PMR_UI_011 covered in @TC_PPI_PMR_UI_009 and @TC_PPI_PMR_UI_010
  @Sprint-5 @epic-160 @sp-193 @TC_PPI_PMR_UI_012
  Scenario: To check that the Host admin user can see the Username and last login details in Program manager registration screen.
    When Click on Entities in Configurations Menu
    Then Enter "NSDL" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "NSDL" in Child entity
    Then Click on ADD NEW button in Child entity section
    Then Select "PPI" in Product dropdown and role "Program Manager" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Verify user navigate to Program Manager Details | PPI page
    Then Verify user can see Username and last login details on header of Program Manager Details page
    Then Close the current window
    Then Click on logout button

  @Sprint-5 @epic-160 @sp-195 @TC_PPI_PMR_UI_018
  Scenario: To check that the Host admin user can see SAVE/ SUBMIT & BACK/ CANCEL buttons on Program manager registration screen.
    When Click on Entities in Configurations Menu
    Then Enter "NSDL" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "NSDL" in Child entity
    Then Click on ADD NEW button in Child entity section
    Then Select "PPI" in Product dropdown and role "Program Manager" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Verify user navigate to Program Manager Details | PPI page
    Then Verify user can see SAVE/ SUBMIT & BACK/ CANCEL buttons on Program Manager Details page
    Then Close the current window
    Then Click on logout button

  @Sprint-5 @epic-160 @sp-195 @TC_PPI_PMR_UI_019
  Scenario: To check that the Host admin user can view Mandatory fields (with an asterisk (*) mark) on Program manager registration screen.
    When Click on Entities in Configurations Menu
    Then Enter "NSDL" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "NSDL" in Child entity
    Then Click on ADD NEW button in Child entity section
    Then Select "PPI" in Product dropdown and role "Program Manager" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Verify user navigate to Program Manager Details | PPI page
    Then Enter the details in input text fields on Program Manager Details page
    Then Select the values in dropdown fields on Program Manager Details page
    #Then Verify user can see all mandatory input fields Program Manager Details page
    #Then Verify user can see all mandatory dropdown fields Program Manager Details page
    Then Close the current window
    Then Click on logout button

  @Sprint-5 @epic-160 @sp-195 @TC_PPI_PMR_UI_020
  Scenario Outline: To check that the Host admin user can view the Program Manager entity in right hand child menu section on issuing bank Entities details screen.
    When Click on Entities in Configurations Menu
    Then Enter "<IssuingName>" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<IssuingName>" & "<ID>" in Child entity
    Then Select or click on entity by checking "<IssuingName>" in Child entity
    Then Enter "<PM_Name>" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<<PM_Name>>" & "<ID>" in Child entity
    Then Select or click on entity by checking "<PM_Name>" in Child entity
    #Then Verify that user can see "<Product>" & "<Role>" on View Entity Detail screen
    Then Click on logout button

    Examples: 
      | IssuingName | PM_Name | Product | Role            | Entity_Name | ID    |  |
      | NSDL        | PM10    | PPI     | Program Manager | NSDL        | 12226 |  |
