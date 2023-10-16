#Author: Mayur Kale
Feature: Validate the UI functionality of [SP-126] PPI- Issuing/Issuer Issuing Bank User Registration epics stories.

  #Stories have --> SP-395, SP-147, SP-149, SP-152, SP-245, SP-155, SP-495, SP-150, SP-394.
  #Stories covered --> SP-147, SP-149, SP-152.
  #
  #>>Note --> Need update test data for " @TC_PPI_IBUR_UI_005 and @TC_PPI_IBR_UI_014" for every run
  #
  #Note for TC not Automated: SP-395, SP-245, TC_PPI_IBR_UI_017
  #
  Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage
    # When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    When Enter the UserNM "admintest2" and Pass "Test@123" and click on LOGIN as "admintest2"

  # Given User is on Homepage
  #
  #>> Author: Mayur Kale
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

  #Stories covered --> SP-152.
  #Note for TC not Automated:TC_PPI_IBR_UI_017
  #
  #>> Author: Amol Kale
  #
  @Sprint-5 @epic-126 @sp-152 @TC_PPI_IBR_UI_010
  Scenario: To check all the input and dropdown fields should be Mandatory fields (with an asterisk (*) mark) except Active dropdown and Admin checkbox
    on User Management Details page via Users Submenu.

    When Click on Users in Configurations Menu
    Then Click on ADD USER button on User Management screen and Verify user navigate to User Management Details screen via Users
    Then Verify all 8 input and dropdown fields on User Management Details screen
    Then Click on logout button

  @Sprint-5 @epic-126 @sp-152 @TC_PPI_IBR_UI_011
  Scenario: To check whether Host admin can see PPI in product dropdown along with existing products
    and also product roles in product role dropdown on User Management Details page via Users Submenu.

    When Click on Users in Configurations Menu
    Then Click on ADD USER button on User Management screen and Verify user navigate to User Management Details screen via Users
    Then Verify that user can see all 6 existing product with PPI in product dropdown
    Then Select "PPI" product from product dropdown
    Then Verify that user can see  all 3 Product Role in Product role dropdown

  @Sprint-5 @epic-126 @sp-152 @TC_PPI_IBR_UI_012
  Scenario: To check whether Host admin can see and select only NSDL in Search Entity* dropdown for PPI
    Institution on User Management Details page via Users Submenu.

    When Click on Users in Configurations Menu
    Then Click on ADD USER button on User Management screen and Verify user navigate to User Management Details screen via Users
    Then Select "PPI" in product dropdown and role "Institution" in product role
    Then Verify user can see & select "NSDL" in Search Entity dropdown

  @Sprint-5 @epic-126 @sp-152 @TC_PPI_IBR_UI_013
  Scenario: To check whether Host admin can see "ADMIN" checkbox only after selecting value in Search Entity
    dropdown on User Management Details page via Users Submenu.

    When Click on Users in Configurations Menu
    Then Click on ADD USER button on User Management screen and Verify user navigate to User Management Details screen via Users
    Then Verify Admin checkbox should not be displayed before select entity
    Then Select "PPI" in product dropdown and role "Institution" in product role
    Then Verify user can see & select "NSDL" in Search Entity dropdown
    Then Verify Admin check box is Default checked and not able to uncheck on User Management Detail screen

  @Sprint-5 @epic-126 @sp-152 @TC_PPI_IBR_UI_014
  Scenario Outline: To check whether Host admin can create a admin user for the issuing bank entity (NSDL) via Users Submenu.
    When Click on Users in Configurations Menu
    Then Click on ADD USER button on User Management screen and Verify user navigate to User Management Details screen via Users
    Then Enter the user details in "<Login_ID>", "<Display_Name>","<Product>","<Product_Role>","<Select_Entity>", "<Mobile_Number>", "<Email>" text fields
    Then Click on SAVE button on User Management Details screen
    Then User navigate to User Management screen and view "User created Successfully" message popup
    Then Click on logout button

    Examples: 
      | Login_ID       | Display_Name | Product | Product_Role | Select_Entity | Mobile_Number | Email               |
      | NSDL_adminUsr4 | NSDL_User06  | PPI     | Institution  | NSDL          |    9876543211 | automation@test.com |

  @Sprint-5 @epic-126 @sp-152 @TC_PPI_IBR_UI_015
  Scenario: To check whether Host admin can click on Back button on User Management Details page via Users Submenu,
    User should be navigate to ‘User Management’ screen.

    When Click on Users in Configurations Menu
    Then Click on ADD USER button on User Management screen and Verify user navigate to User Management Details screen via Users
    Then Click on Back button and verify that user should be navigate to User Management page

  @Sprint-5 @epic-126 @sp-152 @TC_PPI_IBR_UI_016
  Scenario: To check whether Host admin can click on Back button on User Management Details page via Users Submenu,
    User should be navigate to ‘User Management’ screen.

    When Click on Users in Configurations Menu
    Then Click on ADD USER button on User Management screen and Verify user navigate to User Management Details screen via Users
    Then Click on Save button
    Then Verify "Login Id cannot be empty" message for "empty" "Login ID" field on User Management Details screen
    Then Verify "Display Name cannot be empty" message for "empty" "Display Name" field on User Management Details screen
    Then Verify "Mobile Number is mandatory" message for "empty" "Mobile Number" field on User Management Details screen
    Then Verify "Email Id cannot be empty" message for "empty" "mail" field on User Management Details screen
    Then Verify "Please select Product." message for "Empty" "Product" field on User Management Details screen
    Then Verify "Please select Role." message for "Empty" "Product Role" field on User Management Details screen
    Then Verify that "Please Select Entity" message for  Select Entity dropdown on User Management Details screen
    Then Click on logout button

  #@Sprint-5 @epic-126 @sp-152 @TC_PPI_IBR_UI_017 --> Skipped
  @Sprint-5 @epic-126 @sp-152 @TC_PPI_IBR_UI_018
  Scenario Outline: To check validation message for invalid inputs in mandatory fields on User Management Details page via Users Submenu.
    When Click on Users in Configurations Menu
    Then Click on ADD USER button on User Management screen and Verify user navigate to User Management Details screen via Users
    Then Enter the user details in "<Login_ID>", "<Display_Name>","<Product>","<Product_Role>","<Select_Entity>", "<Mobile_Number>", "<Email>" text fields
    Then Click on Save button
    Then Verify "Only alphanumeric and underscore allowed for Login Id" message for "invalid inputs in" "Login ID" field on User Management Details screen
    Then Verify "Mobile number should be 10 digits, starting with 6, 7, 8 or 9." message for "invalid inputs in" "Mobile Number" field on User Management Details screen
    Then Verify "Invalid Email Address-> Valid emails:user@gmail.com or my.user@domain.com etc." message for "invalid inputs in" "Email" field on User Management Details screen
    Then Click on logout button

    Examples: 
      | Login_ID | Display_Name | Product | Product_Role | Select_Entity | Mobile_Number | Email          |
      | @#Auto1  | TestAuto01   | PPI     | Institution  | NSDL          | 987654auto    | automation.com |
