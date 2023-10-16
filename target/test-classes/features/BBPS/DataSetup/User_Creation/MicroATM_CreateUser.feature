Feature: Validate the functionality of Create user MicroATM_Flow

  @b2b_UserCreation
  Scenario Outline: Create Institutions User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "NSDL"
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen
    Then Set Default Password For "<username>"

    Examples: 
      | username                  | DisplayName               | Mobile     | email       |
      | MicroATM_Institutions_ba2 | MicroATM_Institutions_ba2 | 9090909090 | g@gmail.com |
      | MicroATM_Institutions2    | MicroATM_Institutions2    | 9090909090 | g@gmail.com |
      | Micro_auto_Inst2          | Micro_auto_Inst2          | 9090909090 | g@gmail.com |

  @b2b_UserCreation
  Scenario Outline: Create BC User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "NSDL"
    Then Click On Entity From List On View Entity Details Page For Flow "Micro_BC"
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen
    Then Set Default Password For "<username>"

    Examples: 
      | username        | DisplayName     | Mobile     | email       |
      | MicroATM_BC_ba2 | MicroATM_BC_ba2 | 9090909090 | g@gmail.com |
      | MicroATM_BC2    | MicroATM_BC2    | 9090909090 | g@gmail.com |
      | Micro_auto_BC2  | Micro_auto_BC2  | 9090909090 | g@gmail.com |

  @b2b_UserCreation
  Scenario Outline: Create Merchant User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "NSDL"
    Then Click On Entity From List On View Entity Details Page For Flow "Micro_BC"
    Then Click On Entity From List On View Entity Details Page For Flow "Micro_Merchant"
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen
    Then Set Default Password For "<username>"

    Examples: 
      | username              | DisplayName           | Mobile     | email       |
      | MicroATM_Merchant_ba2 | MicroATM_Merchant_ba2 | 9090909090 | g@gmail.com |
      | MicroATM_Merchant2    | MicroATM_Merchant2    | 9090909090 | g@gmail.com |
      | Micro_auto_Merchant2  | Micro_auto_Merchant2  | 9090909090 | g@gmail.com |

  @b2b_UserCreation
  Scenario Outline: Create Terminal User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "NSDL"
    Then Click On Entity From List On View Entity Details Page For Flow "Micro_BC"
    Then Click On Entity From List On View Entity Details Page For Flow "Micro_Merchant"
    Then Click On Entity From List On View Entity Details Page For Flow "Micro_Terminal"
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen
    Then Set Default Password For "<username>"

    Examples: 
      | username              | DisplayName            | Mobile     | email       |
      | MicroATM_Terminal_ba1 | MicroATM_Terminalt_ba1 | 9090909090 | g@gmail.com |
      | MicroATM_Terminal1    | MicroATM_Terminal1     | 9090909090 | g@gmail.com |
      | Micro_auto_Terminal   | Micro_auto_Terminal    | 9090909090 | g@gmail.com |
