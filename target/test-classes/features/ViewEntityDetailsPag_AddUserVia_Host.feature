#Author: Mayur Kale
Feature: Validate the UI functionality of [SP-126] PPI- Issuing/Issuer Issuing Bank User Registration epics stories.

  #Stories covered --> SP-147, SP-149, SP-152.
  #Note --> Need update test data for " @TC_PPI_IBUR_UI_005" for every run
  #Note for TC not Automated: SP-395, SP-245, TC_PPI_IBR_UI_017
  #
  Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage
    # When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    When Enter the UserNM "admintest2" and Pass "Test@123" and click on LOGIN as "admintest2"

  # Given User is on Homepage
  #
  #>> Author: Mayur Kale [SP-126]
  #
  @Sprint-5 @epic-126 @sp-147 @TC_PPI_IBUR_UI_001
  Scenario Outline: To check whether Host admin can view User Management Details screen for PPI Issuing Bank.
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "<Entity_Name>" in Child entity
    Then Verify that user can see "<Product>" & "<Role>" on View Entity Detail screen
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    #Then Verify user is on User Management Details screen
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    |
      | NSDL | PPI     | Institution | NSDL        | 12226 |

  @Sprint-5 @epic-126 @sp-147 @TC_PPI_IBUR_UI_002
  Scenario Outline: To check whether Host admin can view Mandatory fields (with an asterisk (*) mark) on User Management Details screen for PPI Issuing Bank(NSDL).
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "<Entity_Name>" in Child entity
    Then Verify that user can see "<Product>" & "<Role>" on View Entity Detail screen
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Verify mandatory text fields-Login Id, Display Name, Mobile Number, Email on User Management Details screen
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    |
      | NSDL | PPI     | Institution | NSDL        | 12226 |

  @Sprint-5 @epic-126 @sp-147 @TC_PPI_IBUR_UI_003
  Scenario Outline: To check whether Host admin can view dropdown and checkbox fields (without an asterisk (*) mark) on User Management Details screen for PPI Issuing Bank.
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "<Entity_Name>" in Child entity
    Then Verify that user can see "<Product>" & "<Role>" on View Entity Detail screen
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Verify Entity dropdown should dislplay and "<Entity_Name>" is prepopulated in Entity dropdown on User Management Detail screen
    Then Verify Active dropdown should dislplay and "Y" is default selected on User Management Detail screen
    Then Verify Admin check box is Default checked and not able to uncheck on User Management Detail screen
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    |
      | NSDL | PPI     | Institution | NSDL        | 12226 |

  @Sprint-5 @epic-126 @sp-147 @TC_PPI_IBUR_UI_004
  Scenario Outline: To check whether Host admin can view SAVE and BACK button on User Management Details screen for PPI Issuing Bank.
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "<Entity_Name>" in Child entity
    Then Verify that user can see "<Product>" & "<Role>" on View Entity Detail screen
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Verify user can view SAVE and BACK button on User Management Details screen
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    |
      | NSDL | PPI     | Institution | NSDL        | 12226 |

  @Sprint-5 @epic-126 @sp-149 @TC_PPI_IBUR_UI_005
  Scenario Outline: To check whether Host admin can create a admin user for the issuing bank entity (NSDL) via Entity Submenu.
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "<Entity_Name>" in Child entity
    Then Verify that user can see "<Product>" & "<Role>" on View Entity Detail screen
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<Login_Id>", "<Display_Name>", "<Mobile_Number>", "<Email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen
    Then User navigate to View Entity Details screen for "<Entity_Name>" and view "User created Successfully" message popup
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    | Login_Id | Display_Name | Mobile_Number | Email               |
      | NSDL | PPI     | Institution | NSDL        | 12226 | Auto786k | NSDL786k     |    9876543211 | automation@test.com |

  @Sprint-5 @epic-126 @sp-149 @TC_PPI_IBUR_UI_006
  Scenario Outline: To check whether Host admin click on Back button on User Management  Details page for NSDL(PPI) via Entity Submenu, User should be navigate to View Entity Details screen for NSDL(PPI).
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "<Entity_Name>" in Child entity
    Then Verify that user can see "<Product>" & "<Role>" on View Entity Detail screen
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then CLick on BACK button on User Management Details screen
    Then User navigate to View Entity Details screen for "<Entity_Name>"
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    |
      | NSDL | PPI     | Institution | NSDL        | 12226 |

  @Sprint-5 @epic-126 @sp-149 @TC_PPI_IBUR_UI_007
  Scenario Outline: To check validation message for empty mandatory fields on User Management Details page.
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "<Entity_Name>" in Child entity
    Then Verify that user can see "<Product>" & "<Role>" on View Entity Detail screen
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Click on SAVE button on User Management Details screen
    Then Verify "Login Id cannot be empty" message for "Empty" "Login ID" field on User Management Details screen
    Then Verify "Display Name cannot be empty" message for "Empty" "Display Name" field on User Management Details screen
    Then Verify "Mobile Number is mandatory" message for "Empty" "Mobile Number" field on User Management Details screen
    Then Verify "Email Id cannot be empty" message for "Empty" "Email" field on User Management Details screen
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    |
      | NSDL | PPI     | Institution | NSDL        | 12226 |

  # TC_PPI_IBUR_UI_008 Not Automated --> To check for Character length
  @Sprint-5 @epic-126 @sp-149 @TC_PPI_IBUR_UI_009
  Scenario Outline: To check validation message for invalid inputs in mandatory fields on User Management Details page.
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "<Entity_Name>" in Child entity
    Then Verify that user can see "<Product>" & "<Role>" on View Entity Detail screen
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<Login_Id>", "<Display_Name>", "<Mobile_Number>", "<Email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen
    Then Verify "Only alphanumeric and underscore allowed for Login Id" message for "invalid inputs in" "Login ID" field on User Management Details screen
    #Then Verify "Display Name cannot be empty" message for "<Validation>" "Display Name" field on User Management Details screen
    Then Verify "Mobile number should be 10 digits, starting with 6, 7, 8 or 9." message for "invalid inputs in" "Mobile Number" field on User Management Details screen
    Then Verify "Invalid Email Address-> Valid emails:user@gmail.com or my.user@domain.com etc." message for "invalid inputs in" "Email" field on User Management Details screen
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    | Login_Id | Display_Name | Mobile_Number | Email          |
      | NSDL | PPI     | Institution | NSDL        | 12226 | @#Auto1  | TestAuto01   | 987654auto    | automation.com |

  # Given User is on Homepage
  #
  #>> Author: Mayur Kale [SP-160]
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
