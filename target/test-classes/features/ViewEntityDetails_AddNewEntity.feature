Feature: Validate the functionality on View Entity Details Page for PPI product.

  Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage
    # When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    When Enter the UserNM "admintest2" and Pass "Test@123" and click on LOGIN as "admintest2"

  @Sprint-4 @sp-318 @TC_PPI_PMR_UI_001
  Scenario Outline: To check whether the Host admin user can see the PPI as product in Product dropdown on Assign Product Role Pop-Up.
    Given User is on Homepage
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    #Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Verify that user can see "PPI" in Product dropdown on Assign Product Role Pop-Up

  @Sprint-4 @sp-318 @TC_PPI_PMR_UI_001
  Scenario Outline: To check whether the Host admin user can see the all roles for PPI product on Assign Product Role Pop-Up.
    Given User is on Homepage
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    #Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Verify that user can see "<Product>" & "<Role>" on Assign Product Role Pop-Up
    Then Click on Close button on Assign Product Role Pop-Up
    Then Click on logout button

    Examples: 
      | Product | Role                      |
      | PPI     | Program Manager           |
      | PPI     | Prepaid Agent Institution |

  @Sprint-5 @epic-126 @sp-394 @TC_PPI_IBUR_UI_048
  Scenario Outline: To check whether Issuer bank Admin User should not be able to create any child entity under issuing bank /NSDL entity, Add New hypertext link should be disable.
    Given User is on Homepage
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "<Entity_Name>" in Child entity
    Then Verify that user can see "<Product>" & "<Role>" on View Entity Detail screen
    Then Verify ADD NEW button should be disable for PPI institution NSDL
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    |
      | NSDL | PPI     | Institution | NSDL        | 12226 |

  @Sprint-5 @epic-160 @sp-192 @TC_PPI_PMR_UI_001
  Scenario: To check that the Host admin user can View Assign Product Role pop-up window by clicking on Add New hypertext link.
    Given User is on Homepage
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Verify Host admin user can View Assign Product Role popup
    Then Click on CLOSE button on Assign Product Role popup
    Then Click on logout button

  @Sprint-5 @epic-160 @sp-192 @TC_PPI_PMR_UI_002
  Scenario: To check that the Host admin user can view and select values from Product dropdown on Assign Product Role pop-up window for product PPI.
    Given User is on Homepage
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Verify that user can see "PPI" in Product dropdown on Assign Product Role Pop-Up
    Then Click on CLOSE button on Assign Product Role popup
    Then Click on logout button

  @Sprint-5 @epic-160 @sp-192 @TC_PPI_PMR_UI_003
  Scenario Outline: To check that the Host admin user can view and select values from Role dropdown on Assign Product Role pop-up window for product PPI.
    Given User is on Homepage
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
    Given User is on Homepage
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Click on Next button on Assign Product Role Pop-Up
    Then Verify "<Validation_Product>" message for Product drpodown on Assign Product Role Pop-Up
    Then Verify "<Validation_Role>" message for Role drpodown on Assign Product Role Pop-Up
    Then Click on close button on Search Entity by name pop up
    Then Click on logout button

    Examples: 
      | Validation_Product     | Validation_Role     |
      | Please select Product. | Please select Role. |

  @Sprint-5 @epic-160 @sp-192 @TC_PPI_PMR_UI_005
  Scenario: To check that Host admin user should not be able to select direct Product Role without selecting Product on Assign Product Role pop-up window.
    Given User is on Homepage
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Verify user can not view any role in Role dropdown without slecting Product
    Then Click on CLOSE button on Assign Product Role popup
    Then Click on logout button|

  @Sprint-5 @epic-160 @sp-192 @TC_PPI_PMR_UI_006
  Scenario Outline: To check that if host admin select As Acquirer checkbox and select PPI as product in product dropdown, Only Instistuion should be display in Role dropdown.
    Given User is on Homepage
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
    Given User is on Homepage
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Verify PPI roles should not be view in Role dropdown while selecting other products except PPI in product dropdown
    Then Click on CLOSE button on Assign Product Role popup
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    |
      | NSDL | PPI     | Institution | NSDL        | 12226 |
