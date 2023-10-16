Feature: Validate the functionality of ‘Search Entity by name’ Pop-Up for existing products(Regression)

  Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"

  #Then User logged in as "admin_01"
  #Then User logged in as "System Administrator"
  @TC_PPI_Reg_001 @TC_PPI_Reg_003
  Scenario Outline: To check whether the Host admin user can search & view ‘View Entity Details’ screen for products via ‘Search Entity by name’ with E-hub Entity search option.
    Given User is on Homepage
    When Click on Entities in Configurations Menu
    Then Click on Search entity by Name hypertext link
    Then Select E-hub Entity radio button option on the pop-up window
    Then Enter "<Name>" in Name field
    Then Click on Search button
    Then Select or click on entity by checking "<Entity_Name>" & "<ID>"
    #Then Select or click on entity by checking "<Entity_Name>"
    Then Verify that user can see "<Product>" & "<Role>" on View Entity Detail screen
    Then Click on Home icon
    Then Click on logout button

    Examples: 
      | Name    | Product | Role         | Entity_Name  | ID     |
      | Capital | BBPS    | OU           | Capital Bank | 100000 |
      | NSDL    | AEPS    | Institutions | NSDL         | 100019 |

  @TC_PPI_Reg_002 @TC_PPI_Reg_004
  Scenario Outline: To check whether the Host admin user can search & view ‘View Entity Details’ screen for products via ‘Search Entity by name’ with Product Role and Name search option.
    Given User is on Homepage
    When Click on Entities in Configurations Menu
    Then Click on Search entity by Name hypertext link
    Then Select Product Role and Name radio button option on the pop-up window
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Enter "<Name>" in Name field
    Then Click on Search button
    Then Select or click on entity by checking "<Entity_Name>" & "<ID>"
    #Then Select or click on entity by checking "<Entity_Name>"
    Then Verify that user can see "<Product>" & "<Role>" on View Entity Detail screen
    Then Click on Home icon
    Then Click on logout button

    Examples: 
      | Name    | Product          | Role         | Entity_Name                | ID     |
      | Equitas | Sarvatra miniATM | Institutions | Equitas Small Finance Bank |  11900 |
      | NSDL    | microATM         | Institutions | NSDL                       | 100053 |
