Feature: Validate the functionality of Search Entity by name hpertext link pop up for PPI product

  #Note:
  # For @sp-208 Test Cases @TC_PPI_IBR_UI_005  @TC_PPI_IBR_UI_006  Not automated - to check maxi & minimum length for input field
  # For @sp-208 Test Cases @TC_PPI_IBR_UI_011  @TC_PPI_IBR_UI_012  Not automated - to check maxi & minimum length for input field
  Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage
    #When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    When Enter the UserNM "admintest2" and Pass "Test@123" and click on LOGIN as "admintest2"

  # Given User is on Homepage
  @Sprint-4 @epic-206 @sp-207 @TC_PPI_IBR_UI_001
  Scenario Outline: To check whether the Host admin user can see the Issuing bank entry on eHub UI by searching the entity name NSDLPB/ NSDL via Search Entity - search box in right hand Child entity menu.
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    Then Verify that user can see "<Entity_Name>" in Child entity section
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    |
      | NSDL | PPI     | Institution | NSDL        | 12226 |

  @Sprint-4 @epic-206 @sp-208 @TC_PPI_IBR_UI_002
  Scenario Outline: To check whether the Host admin user can search & view View Entity Details screen for PPI via Search Entity by name with E-hub Entity search option.
    When Click on Entities in Configurations Menu
    Then Click on Search entity by Name hypertext link
    #Then Select E-hub Entity radio button option on the pop-up window
    Then Enter "<Name>" in Name field
    Then Click on Search button
    Then Verify that user can see "<Entity_Name>" in serached results
    Then Click on close button on Search Entity by name pop up
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    |
      | NSDL | PPI     | Institution | NSDL        | 12226 |

  @Sprint-4 @epic-206 @sp-208 @TC_PPI_IBR_UI_003
  Scenario Outline: To verify that validation message should be display on screen for empty Name (mandatory*) field on Search Entity by name window with E-hub Entity search option.
    When Click on Entities in Configurations Menu
    Then Click on Search entity by Name hypertext link
    #Then Select E-hub Entity radio button option on the pop-up window
    Then Click on Search button
    Then Verify "<Validation>" message for Empty Name Field
    Then Click on close button on Search Entity by name pop up
    Then Click on logout button

    Examples: 
      | Validation                  |
      | Entity Name cannot be empty |

  @Sprint-4 @epic-206 @sp-208 @TC_PPI_IBR_UI_004
  Scenario Outline: To verify that validation message should be display on screen for invalid inputs for mandatory fields (*) on Search Entity by name window with E-hub Entity search option.
    When Click on Entities in Configurations Menu
    Then Click on Search entity by Name hypertext link
    #Then Select E-hub Entity radio button option on the pop-up window
    Then Enter "<Name>" in Name field
    Then Click on Search button
    Then Verify "<Validation>" message for invalid input in Name Field
    Then Click on close button on Search Entity by name pop up
    Then Click on logout button

    Examples: 
      | Name  | Parameter       | Validation                                                                         |
      | ###   | Invalid Inputes | Only alphanumeric (starting with alphabet) and special characters allowed for Name |
      | %$$12 | Invalid Inputes | Only alphanumeric (starting with alphabet) and special characters allowed for Name |
      | 34$$  | Invalid Inputes | Only alphanumeric (starting with alphabet) and special characters allowed for Name |

  #| $@Nsd | Invalid Inputes | Only alphanumeric (starting with alphabet) and special characters allowed for Name |
  @Sprint-4 @epic-206 @sp-208 @TC_PPI_IBR_UI_007
  Scenario Outline: To check whether the searched entity is not exist/available on ehub then informative message should be display for Search Entity by name window for E-hub Entity search option.
    When Click on Entities in Configurations Menu
    Then Click on Search entity by Name hypertext link
    #Then Select E-hub Entity radio button option on the pop-up window
    Then Enter "<Name>" in Name field
    Then Click on Search button
    Then Verify "<Informative_Msg>" message for input which not avilable on eHub
    Then Click on close button on Search Entity by name pop up
    Then Click on logout button

    Examples: 
      | Name    | Parameter       | Informative_Msg                              |
      | IPL11   | Invalid Inputes | No entities matching the criteria are Found. |
      | Hotstar | Invalid Inputes | No entities matching the criteria are Found. |
      | aWS##   | Invalid Inputes | No entities matching the criteria are Found. |

  @Sprint-4 @epic-206 @sp-209 @TC_PPI_IBR_UI_008
  Scenario Outline: To check whether the Host admin user can search & view View Entity Details screen for PPI via Search Entity by name with Product Role and Name search option.
    When Click on Entities in Configurations Menu
    Then Click on Search entity by Name hypertext link
    Then Select Product Role and Name radio button option on the pop-up window
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Enter "<Name>" in Name field
    Then Click on Search button
    Then Verify that user can see "<Entity_Name>" in serached results
    Then Click on close button on Search Entity by name pop up
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    |
      | NSDL | PPI     | Institution | NSDL        | 12226 |

  @Sprint-4 @epic-206 @sp-209 @TC_PPI_IBR_UI_009
  Scenario Outline: To verify that validation message should be display on screen for empty mandatory (*) fields on ‘Search Entity by name’ window with Product Role & Name search option.
    When Click on Entities in Configurations Menu
    Then Click on Search entity by Name hypertext link
    Then Select Product Role and Name radio button option on the pop-up window
    Then Click on Search button
    Then Verify "<Validation_Product>" message for Product drpodown on search entity popup
    Then Verify "<Validation_Role>" message for Role drpodown on search entity popup
    Then Verify "<Validation_Name>" message for Empty Name Field
    Then Click on close button on Search Entity by name pop up
    Then Click on logout button

    Examples: 
      | Validation_Product     | Validation_Role     | Validation_Name             |
      | Please select Product. | Please select Role. | Entity Name cannot be empty |

  @Sprint-4 @epic-206 @sp-209 @TC_PPI_IBR_UI_010
  Scenario Outline: To verify that validation message should be display on screen for invalid inputs for mandatory field (*) on ‘Search Entity by name’ window with Product Role & Name search option.
    When Click on Entities in Configurations Menu
    Then Click on Search entity by Name hypertext link
    Then Select Product Role and Name radio button option on the pop-up window
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Enter "<Name>" in Name field
    Then Click on Search button
    Then Verify "<Validation>" message for invalid input in Name Field
    Then Click on close button on Search Entity by name pop up
    Then Click on logout button

    Examples: 
      | Name  | Product | Role        | Validation                                                                         |
      | ###   | PPI     | Institution | Only alphanumeric (starting with alphabet) and special characters allowed for Name |
      | %$$12 | PPI     | Institution | Only alphanumeric (starting with alphabet) and special characters allowed for Name |
      | 34$$  | PPI     | Institution | Only alphanumeric (starting with alphabet) and special characters allowed for Name |

  @Sprint-4 @epic-206 @sp-209 @TC_PPI_IBR_UI_013
  Scenario Outline: To check whether the searched entity is not exist/available on ehub then informative message should be display for ‘Search Entity by name’ window for Product Role & Name search option.
    When Click on Entities in Configurations Menu
    Then Click on Search entity by Name hypertext link
    Then Select Product Role and Name radio button option on the pop-up window
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Enter "<Name>" in Name field
    Then Click on Search button
    Then Verify "<Informative_Msg>" message for input which not avilable on eHub
    Then Click on close button on Search Entity by name pop up
    Then Click on logout button

    Examples: 
      | Name    | Product | Role        | Informative_Msg                              |
      | IPL11   | PPI     | Institution | No entities matching the criteria are Found. |
      | Hotstar | PPI     | Institution | No entities matching the criteria are Found. |
      | aWS##   | PPI     | Institution | No entities matching the criteria are Found. |

  @Sprint-4 @epic-206 @sp-208 @sp-209 @TC_PPI_IBR_UI_014
  Scenario: To check whether the Host admin user can close the Search Entity by name pop up.
    When Click on Entities in Configurations Menu
    Then Click on Search entity by Name hypertext link
    Then Click on close button on Search Entity by name pop up
    Then Click on logout button

  @Sprint-4 @epic-206 @sp-210 @TC_PPI_IBR_UI_015
  Scenario Outline: To check that the Host admin user can view the View Entity Detail screen for product PPI & Role as Instituion.
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "<Entity_Name>" in Child entity
    Then Verify that user can see "<Product>" & "<Role>" on View Entity Detail screen

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    |
      | NSDL | PPI     | Institution | NSDL        | 12226 |

  # @Sprint-4 @epic-206 
  @sp-210 @TC_PPI_IBR_UI_016
  Scenario Outline: To check whether the Host admin user can see the all Issuing Bank details on View Entity Detail screen for product PPI & Role as Instituion.
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    #Then Select or click on entity by checking "<Entity_Name>" & "<ID>" in Child entity
    Then Select or click on entity by checking "<Entity_Name>" in Child entity
    Then Verify that user can see "<Product>" & "<Role>" on View Entity Detail screen
    Then Verify the PPI Institution Product Fields and values
    #Then verify  PPI product issuing bank details
    Then Click on logout button

    Examples: 
      | Name | Product | Role        | Entity_Name | ID    |
      | NSDL | PPI     | Institution | NSDL        | 12226 |

  @Sprint-4 @epic-206 @sp-210 @TC_PPI_IBR_UI_017
  Scenario Outline: To check whether the Host admin user can not see History & Edit buttons on View Entity Detail screen for Issuing Bank (NSDL) Role as Instituion
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

  @Sprint-4 @epic-206 @sp-210 @TC_PPI_IBR_UI_018
  Scenario Outline: To check whether the Host admin user can see Add New hypertext link on View Entity Detail screen for Issuing Bank (NSDL) Role as Instituion
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

  @Sprint-4 @epic-206 @sp-210 @TC_PPI_IBR_UI_019
  Scenario Outline: To check whether the Host admin user can see Active/deactive button on View Entity Detail screen for Issuing Bank (NSDL) Role as Instituion.
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
