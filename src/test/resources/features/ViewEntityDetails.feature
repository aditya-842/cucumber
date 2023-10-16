Feature: Validate the functionality on View Entity Details Page for PPI product.

  Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"

  @Sprint-4 @sp-207 @TC_PPI_IBR_UI_001
  Scenario Outline: To check whether the Host admin user can see the Issuing bank entry on eHub UI by searching the entity name NSDLPB/ NSDL via Search Entity - search box in right hand Child entity menu.
    Given User is on Homepage
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    Then Verify that user can see "<Entity_Name>" in Child entity section
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    |
      | NSDL | PPI     | Institution | NSDL        | 12226 |

  @Sprint-4 @sp-210 @TC_PPI_IBR_UI_015
  Scenario Outline: To check that the Host admin user can view the View Entity Detail screen for product PPI & Role as Instituion.
    Given User is on Homepage
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "<Entity_Name>" in Child entity
    Then Verify that user can see "<Product>" & "<Role>" on View Entity Detail screen
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    |
      | NSDL | PPI     | Institution | NSDL        | 12226 |

  @Sprint-4 @sp-210 @TC_PPI_IBR_UI_016
  Scenario Outline: To check whether the Host admin user can see the all Issuing Bank details on View Entity Detail screen for product PPI & Role as Instituion.
    Given User is on Homepage
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "<Entity_Name>" in Child entity
    Then Verify that user can see "<Product>" & "<Role>" on View Entity Detail screen
    Then Verify the PPI Institution Product Fields and values
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    |
      | NSDL | PPI     | Institution | NSDL        | 12226 |

  @Sprint-4 @sp-210 @TC_PPI_IBR_UI_017
  Scenario Outline: To check whether the Host admin user can not see History & Edit buttons on View Entity Detail screen for Issuing Bank (NSDL) Role as Instituion
    Given User is on Homepage
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "<Entity_Name>" in Child entity
    Then Verify that user can see "<Product>" & "<Role>" on View Entity Detail screen
    Then Verify that user can not see History and Edit button on View Entity Detail screen in Product details
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    |
      | NSDL | PPI     | Institution | NSDL        | 12226 |

  @Sprint-4 @sp-210 @TC_PPI_IBR_UI_018
  Scenario Outline: To check whether the Host admin user can see Add New hypertext link on View Entity Detail screen for Issuing Bank (NSDL) Role as Instituion
    Given User is on Homepage
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "<Entity_Name>" in Child entity
    Then Verify that user can see "<Product>" & "<Role>" on View Entity Detail screen
    Then Verify that user can see Add New hypertext link on View Entity Detail screen in Product details
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    |
      | NSDL | PPI     | Institution | NSDL        | 12226 |

  @Sprint-4 @sp-210 @TC_PPI_IBR_UI_019
  Scenario Outline: To check whether the Host admin user can see Active/deactive button on View Entity Detail screen for Issuing Bank (NSDL) Role as Instituion.
    Given User is on Homepage
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "<Entity_Name>" in Child entity
    Then Verify that user can see "<Product>" & "<Role>" on View Entity Detail screen
    Then Verify that user can see Active_deactive on View Entity Detail screen in Product details
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    |
      | NSDL | PPI     | Institution | NSDL        | 12226 |
