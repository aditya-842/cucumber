#Author: Mayur Kale
Feature: Validate the UI functionality of [SP-126] PPI- Issuing/Issuer Issuing Bank User Registration epics stories.

  #Stories have --> SP-395, SP-147, SP-149, SP-152, SP-245, SP-155, SP-495, SP-150, SP-394.
  #Stories covered --> SP-394.
  #Note for TC not Automated:
  # For
  Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage
    When Enter the UserNM "AdminNSDL" and Pass "Test@123" and click on LOGIN as "NSDLuser_via_Users"

  # Given User is on Homepage
  #
  #>> Author: Mayur Kale
  #
  @Sprint-5 @epic-126 @sp-394 @TC_PPI_IBUR_UI_048
  Scenario Outline: To check whether Issuer bank Admin User should not be able to create any child entity under issuing bank /NSDL entity, Add New hypertext link should be disable.
    When Click on Entities in Configurations Menu
    Then Verify that user can see "<Product>" & "<Role>" on View Entity Detail screen
    Then Verify ADD NEW button should be disable for PPI institution NSDL
    Then Click on logout button

    Examples: 
      | Product | Role        |
      | PPI     | Institution |

  #
  #>> Author: Srihari Kovvuri
  #
  @epic-126 @sp-155 @TC_PPI_IBUR_UI_023
  Scenario: Issuer bank admin Home page is showing  users in Configuration menu
    Then Click on Users in Configurations Menu
    #And Click on Home icon
    Then Click on logout button

  @epic-126 @sp-155 @TC_PPI_IBUR_UI_023 @TC_PPI_IBUR_UI_024
  Scenario: Issuer bank admin Home page is showing entities and users in Configuration menu
    When Click on Entities in Configurations Menu
    Then Verify the top lefthand side title displayed as "NSDL"
    #And Click on Home icon
    Then Click on logout button

  @epic-126 @sp-155 @TC_PPI_IBUR_UI_025
  Scenario: Issuer bank admin Home page is having Left side sub menu
    Then Verify leftHand side menu configurations having Entities
    And Verify leftHand side menu configurations having Users
    And Verify lefthand side menu showing reports and changepassword options
    Then Click on logout button
