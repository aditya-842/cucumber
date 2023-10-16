#Author: Mayur Kale
Feature: Validate the UI functionality of [SP-126] PPI- Issuing/Issuer Issuing Bank User Registration epics stories.

  #Stories covered --> SP-394.
  #Note for TC not Automated:
  # For
  Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage
    When Enter the UserNM "AdminNSDL" and Pass "Test@123" and click on LOGIN as "NSDLuser_via_Users"

  # Given User is on Homepage
  #
  #>> Author: Mayur Kale [SP-126]
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
