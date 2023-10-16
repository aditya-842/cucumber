Feature: Validate the UI functionality of SP-152-Issuing Bank_Create Issuing bank Admin User via ‘User’ Submenu.

  #Stories covered --> SP-152.
  #Note for TC not Automated:TC_PPI_IBR_UI_017
  #Author: Amol Kale
  Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage
    # When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    When Enter the UserNM "admintest2" and Pass "Test@123" and click on LOGIN as "admintest2"

  @Sprint-5 @epic-126 @sp-152 @TC_PPI_IBR_UI_010
  Scenario Outline: To check all the input and dropdown fields should be Mandatory fields (with an asterisk (*) mark) except Active dropdown and Admin checkbox
    on User Management Details page via Users Submenu.

    When Click on Users in Configurations Menu
    Then Click on ADD USER button on User Management screen and Verify user navigate to User Management Details screen
    Then Verify all 8 input and dropdown fields on User Management Details screen
    Then Click on logout button

  @Sprint-5 @epic-126 @sp-152 @TC_PPI_IBR_UI_011
  Scenario Outline: To check whether Host admin can see PPI in product dropdown along with existing products
    and also product roles in product role dropdown on User Management Details page via Users Submenu.

    When Click on Users in Configurations Menu
    Then Click on ADD USER button on User Management screen and Verify user navigate to User Management Details screen
    Then Verify that user can see all 6 existing product with PPI in product dropdown
    Then Select "PPI" product from product dropdown
    Then Verify that user can see  all 3 Product Role in Product role dropdown

  @Sprint-5 @epic-126 @sp-152 @TC_PPI_IBR_UI_012
  Scenario Outline: To check whether Host admin can see and select only NSDL in Search Entity* dropdown for PPI
    Institution on User Management Details page via Users Submenu.

    When Click on Users in Configurations Menu
    Then Click on ADD USER button on User Management screen and Verify user navigate to User Management Details screen
    Then Select "PPI" in product dropdown and role "Institution" in product role
    Then Verify user can see & select "NSDL" in Search Entity dropdown

  @Sprint-5 @epic-126 @sp-152 @TC_PPI_IBR_UI_013
  Scenario Outline: To check whether Host admin can see "ADMIN" checkbox only after selecting value in Search Entity
    dropdown on User Management Details page via Users Submenu.

    When Click on Users in Configurations Menu
    Then Click on ADD USER button on User Management screen and Verify user navigate to User Management Details screen
    Then Verify Admin checkbox should not be displayed before select entity
    Then Select "PPI" in product dropdown and role "Institution" in product role
    Then Verify user can see & select "NSDL" in Search Entity dropdown
    Then Verify Admin check box is Default checked and not able to uncheck on User Management Detail screen

  @Sprint-5 @epic-126 @sp-152 @TC_PPI_IBR_UI_014
  Scenario Outline: To check whether Host admin can create a admin user for the issuing bank entity (NSDL) via Users Submenu.
    When Click on Users in Configurations Menu
    Then Click on ADD USER button on User Management screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<Login_ID>", "<Display_Name>","<Product>","<Product_Role>","<Select_Entity>", "<Mobile_Number>", "<Email>" text fields
    Then Click on SAVE button on User Management Details screen
    Then User navigate to User Management screen and view "User created Successfully" message popup
    Then Click on logout button

    Examples: 
      | Login_ID    | Display_Name | Product | Product_Role | Select_Entity | Mobile_Number | Email               |
      | NSDL_admin2 | NSDL_admin2  | PPI     | Institution  | NSDL          |    9876543211 | automation@test.com |

  @Sprint-5 @epic-126 @sp-152 @TC_PPI_IBR_UI_015
  Scenario Outline: To check whether Host admin can click on Back button on User Management Details page via Users Submenu,
    User should be navigate to ‘User Management’ screen.

    When Click on Users in Configurations Menu
    Then Click on ADD USER button on User Management screen and Verify user navigate to User Management Details screen
    Then Click on Back button and verify that user should be navigate to User Management page

  @Sprint-5 @epic-126 @sp-152 @TC_PPI_IBR_UI_016
  Scenario Outline: To check whether Host admin can click on Back button on User Management Details page via Users Submenu,
    User should be navigate to ‘User Management’ screen.

    When Click on Users in Configurations Menu
    Then Click on ADD USER button on User Management screen and Verify user navigate to User Management Details screen
    Then Click on Save button
    Then Verify "Login Id cannot be empty" message for "empty" "Login ID" field on User Management Details screen
    Then Verify "Display Name cannot be empty" message for "empty" "Display Name" field on User Management Details screen
    Then Verify "Mobile Number is mandatory" message for "empty" "Mobile Number" field on User Management Details screen
    Then Verify "Email Id cannot be empty" message for "empty" "mail" field on User Management Details screen
    Then Verify "Please select Product." message for "Empty" "Product" field on User Management Details screen
    Then Verify "Please select Role." message for "Empty" "Product Role" field on User Management Details screen
    Then Verify that "Please Select Entity" message for  Select Entity dropdown on User Management Details screen
    Then Click on logout button

  #@Sprint-5 @epic-126 @sp-152 @TC_PPI_IBR_UI_017
  #Scenario Outline: To check whether validation message should be display for Character length for each fields on
  # User Management Details page should remain as per exiting code, via Users Submenu.
  #When Click on Users in Configurations Menu
  #Then Click on ADD USER button on User Management screen and Verify user navigate to User Management Details screen
  #Then Verify "<Validation>" Message  for "<min_lenght_Input>" of "<Input>" field
  #Then Verify "<Validation>" Message  for "<max_lenght_Input>" of input field
  #Then Click on logout button
  #Examples:
  #  | Input         | min_lenght_Input | max_lenght_Input                                                                                                                  | Validation                                       |
  # | Login ID      | ab_0             | A1234567891234567891234567891234                                                                                                  | The Login Id must be between 5 and 32 chars long |
  # | Display Name  | ab_0             | A1234567891234567891234567891234                                                                                                  | Display Name must be between 5 and 40 chars long |
  # | Mobile Number |         91234567 |                                                                                                                       91234567891 | Mobile Number must be 10 digits long             |
  # | Email         | ab_0             | 123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123@test.com | Email Id must be between 10 and 128 chars long   |
  @Sprint-5 @epic-126 @sp-152 @TC_PPI_IBR_UI_018
  Scenario Outline: To check validation message for invalid inputs in mandatory fields on User Management Details page via Users Submenu.
    When Click on Users in Configurations Menu
    Then Click on ADD USER button on User Management screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<Login_ID>", "<Display_Name>","<Product>","<Product_Role>","<Select_Entity>", "<Mobile_Number>", "<Email>" text fields
    Then Click on Save button
    Then Verify "Only alphanumeric and underscore allowed for Login Id" message for "invalid inputs in" "Login ID" field on User Management Details screen
    Then Verify "Mobile number should be 10 digits, starting with 6, 7, 8 or 9." message for "invalid inputs in" "Mobile Number" field on User Management Details screen
    Then Verify "Invalid Email Address-> Valid emails:user@gmail.com or my.user@domain.com etc." message for "invalid inputs in" "Email" field on User Management Details screen
    Then Click on logout button

    Examples: 
      | Login_ID | Display_Name | Product | Product_Role | Select_Entity | Mobile_Number | Email          |
      | @#Auto1  | TestAuto01   | PPI     | Institution  | NSDL          | 987654auto    | automation.com |
