Feature: Validate the functionality of PPI-Issuing/Issuer Issuing Bank User Registration epic.

  #Note:
    Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage
    # When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    When Enter the UserNM "ADITYA_UAT3" and Pass "Pass@123" and click on LOGIN as "admintest2"

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
