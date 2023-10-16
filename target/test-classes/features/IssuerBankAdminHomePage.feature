Feature: Validate the functionality of Home Page for PPI Issuer Bank Admin User Home Page

#Stories covered --> SP-155, SP-495.
  Background: User needs to be login as PPI Issuer Bank admin user
    When Enter the UserNM "PPI_Admin_01" and Pass "Test@1234" and click on LOGIN as "PPI Issuer Admin"
    Given User is on Homepage

  @Epic_SP-126, @SP-155, @[TC_PPI_IBUR_UI_023_to_TC_PPI_IBUR_UI_028]
  Scenario: Issuer bank admin Home page is showing entities and users in Configuration menu
    When Click on Entities in Configurations Menu
    Then Verify the top lefthand side title displayed as "NSDL"
    And Click on Home icon
    Then Click on logout button

  @Epic_SP-126, @SP-155, @[TC_PPI_IBUR_UI_023_to_TC_PPI_IBUR_UI_028]
  Scenario: Issuer bank admin Home page is showing  users in Configuration menu
    Then Click on Users in Configurations Menu
    And Click on Home icon
    Then Click on logout button

  @Epic_SP-126, @SP-155, @[TC_PPI_IBUR_UI_023_to_TC_PPI_IBUR_UI_028]
  Scenario: Issuer bank admin Home page is having Left side sub menu
    Then Verify leftHand side menu configurations having Entities
    And Verify leftHand side menu configurations having Users
    And Verify lefthand side menu showing reports and changepassword options
    Then Click on logout button

  @Epic_SP-126, @Sp-495, @[TC_PPI_IBUR_UI_029_to_TC_PPI_IBUR_UI_035]
  Scenario Outline: Verify Issuer bank Admin user permissions for view and manage entities
    And Click on Entities in Configurations Menu
    Then Verify that user can see "<Product>" & "<Role>" on View Entity Detail screen
    And Verify ADD NEW link should be disable for PPI institution NSDL
    And Verify addnew button
    Then Click on logout button

    Examples: 
      | Product | Role        |
      | PPI     | Institution |

  @Epic_SP-126, @Sp-495, @[TC_PPI_IBUR_UI_029_to_TC_PPI_IBUR_UI_035]
  Scenario Outline: Verify Issuer bank Admin user can add admin user via manage entities
    And Click on Entities in Configurations Menu
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Verify mandatory text fields-Login Id, Display Name, Mobile Number, Email on User Management Details screen
    Then Enter the user details in "<Login_Id>", "<Display_Name>", "<Mobile_Number>", "<Email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen
    Then User navigate to View Entity Details screen for "<Entity_Name>" and view "User Created successfully" message popup
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    | Login_Id | Display_Name | Mobile_Number | Email               |
      | NSDL | PPI     | Institution | NSDL        | 12226 | Auto123  | TestAuto01   |    9876543211 | automation@test.com |
