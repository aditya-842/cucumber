Feature: Validate the functionality of Search Entity by name hpertext link pop up for PPI product

  Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"

  @Sprint-4 @sp-208 @TC_PPI_IBR_UI_002
  Scenario Outline: To check whether the Host admin user can search & view View Entity Details screen for PPI via Search Entity by name with E-hub Entity search option.
    Given User is on Homepage
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

  @sp-209 @Sprint-4 @TC_PPI_IBR_UI_014 @sp-208
  Scenario: To check whether the Host admin user can close the Search Entity by name pop up.
    Given User is on Homepage
    When Click on Entities in Configurations Menu
    Then Click on Search entity by Name hypertext link
    Then Click on close button on Search Entity by name pop up
    Then Click on logout button

  @Sprint-4 @sp-208 @TC_PPI_IBR_UI_003
  Scenario Outline: To verify that validation message should be display on screen for empty Name (mandatory*) field on Search Entity by name window with E-hub Entity search option.
    Given User is on Homepage
    When Click on Entities in Configurations Menu
    Then Click on Search entity by Name hypertext link
    #Then Select E-hub Entity radio button option on the pop-up window
    Then Click on Search button
    #Then Verify "<Validation>" message for "<Parameter>"
    Then Verify "<Validation>" message for Empty Name Field
    Then Click on close button on Search Entity by name pop up
    Then Click on logout button

    Examples: 
      | Name | Validation                  |
      |      | Entity Name cannot be empty |

  @Sprint-4 @sp-208 @TC_PPI_IBR_UI_004
  Scenario Outline: To verify that validation message should be display on screen for invalid inputs for mandatory fields (*) on Search Entity by name window with E-hub Entity search option.
    Given User is on Homepage
    When Click on Entities in Configurations Menu
    Then Click on Search entity by Name hypertext link
    #Then Select E-hub Entity radio button option on the pop-up window
    Then Enter "<Name>" in Name field
    Then Click on Search button
    #Then Verify "<Validation>" message for "<Parameter>"
    Then Verify "<Validation>" message for invalid input in Name Field
    Then Click on close button on Search Entity by name pop up
    Then Click on logout button

    Examples: 
      | Name  | Parameter       | Validation                                                                         |
      | ###   | Invalid Inputes | Only alphanumeric (starting with alphabet) and special characters allowed for Name |
      | %$$12 | Invalid Inputes | Only alphanumeric (starting with alphabet) and special characters allowed for Name |
      | 34$$  | Invalid Inputes | Only alphanumeric (starting with alphabet) and special characters allowed for Name |

  # @sp-208 @TC_PPI_IBR_UI_005  @TC_PPI_IBR_UI_006  Not automated - to check maxi & minimum length
  @Sprint-4 @sp-208 @TC_PPI_IBR_UI_007
  Scenario Outline: To check whether the searched entity is not exist/available on ehub then informative message should be display for Search Entity by name window for E-hub Entity search option.
    Given User is on Homepage
    When Click on Entities in Configurations Menu
    Then Click on Search entity by Name hypertext link
    #Then Select E-hub Entity radio button option on the pop-up window
    Then Enter "<Name>" in Name field
    Then Click on Search button
    #Then Verify "<Validation>" message for "<Parameter>"
    Then Verify "<Informative_Msg>" message for input which not avilable on eHub
    Then Click on close button on Search Entity by name pop up
    Then Click on logout button

    Examples: 
      | Name    | Parameter       | Informative_Msg                              |
      | IPL11   | Invalid Inputes | No entities matching the criteria are Found. |
      | Hotstar | Invalid Inputes | No entities matching the criteria are Found. |
      | aWS##   | Invalid Inputes | No entities matching the criteria are Found. |

  @Sprint-4 @sp-209 @TC_PPI_IBR_UI_008
  Scenario Outline: To check whether the Host admin user can search & view View Entity Details screen for PPI via Search Entity by name with Product Role and Name search option.
    Given User is on Homepage
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

  @Sprint-4 @sp-209 @TC_PPI_IBR_UI_009
  Scenario Outline: To verify that validation message should be display on screen for empty mandatory (*) fields on ‘Search Entity by name’ window with Product Role & Name search option.
    Given User is on Homepage
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

  @Sprint-4 @sp-209 @TC_PPI_IBR_UI_010
  Scenario Outline: To verify that validation message should be display on screen for invalid inputs for mandatory field (*) on ‘Search Entity by name’ window with Product Role & Name search option.
    Given User is on Homepage
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

  @Sprint-4 @sp-209 @TC_PPI_IBR_UI_013
  Scenario Outline: To check whether the searched entity is not exist/available on ehub then informative message should be display for ‘Search Entity by name’ window for Product Role & Name search option.
    Given User is on Homepage
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
