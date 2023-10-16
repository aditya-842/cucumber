Feature: Validate the functionality of Flow and users

  @Flow_And_Users
  Scenario: add OU.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select As Acquirer CheckBox on Assign Product Role Pop-Up
    Then Select "BBPS" in Product dropdown and role "OU" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select OU on Assign OU popup "Dombiwali Nagari Bank"
    Then Click on Save Button on Assign OU popup

  @Flow_And_Users
  Scenario: Check user can create Agent Institution in B2B Flow.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select "BBPS" in Product dropdown and role "Agent Institution" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Acquiring Bank on Agent Institution "Dombiwali Nagari Bank"
    Then Select Agent Institution "Sarvatra - DN11" via AgentInstitution
    Then Click On Save on Agent Institution

  @Flow_And_Users
  Scenario: Check user can create Agent Group in B2B Flow.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click on ADD NEW button in Child entity section
    Then Select "BBPS" in Product dropdown and role "Agent Group" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select AgentGroup "Babaji date Bank"
    Then Click On Save on Agent Institution

  @Flow_And_Users
  Scenario: Check user can create Agent in B2B Flow.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Babaji date Bank"
    Then Click on ADD NEW button in Child entity section
    Then Select "BBPS" in Product dropdown and role "Agent" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Agent On Agent Details Page "THE SEVA VIKAS CO-OP. BANK LTD"
    Then Click On Save on Agent Institution

  @Flow_And_Users
  Scenario: Check user can create OU in B2C Flow.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select As Acquirer CheckBox on Assign Product Role Pop-Up
    Then Select "BBPS" in Product dropdown and role "OU" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select OU on Assign OU popup "Capital Bank"
    Then Click on Save Button on Assign OU popup

  @Flow_And_Users
  Scenario: Check user can create Agent Institution in B2C Flow.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    Then Click on ADD NEW button in Child entity section
    Then Select "BBPS" in Product dropdown and role "Agent Institution" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Agent Institution "Sarvatra - CS11" via AgentInstitution
    Then Click On Save on Agent Institution

  @Flow_And_Users
  Scenario: Check user can create Agent in B2C Flow.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click on ADD NEW button in Child entity section
    Then Select "BBPS" in Product dropdown and role "Agent" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select AgentGroup "None"
    Then Select Agent On Agent Details Page "Capital Small Finance bank, Jalandhar Branch"
    Then Click On Save on Agent Institution

  @Flow_And_Users
  Scenario: add Institutions.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select As Acquirer CheckBox on Assign Product Role Pop-Up
    Then Select "microATM" in Product dropdown and role "Institutions" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Institution For Institution Map "41 - NSDL"
    Then Enter MID Prifix On Assign Institution Page "HJU"
    Then Select Select head Office State "Andhra Pradesh"
    Then Enter GSTNumber On Assign Institution Page "37AACCF8040D1ZM"
    Then Click On Next on Assign Institution Page
    Then Click On Save on Assign Institution Page

  @Flow_And_Users
  Scenario: Check user can create BC in microATM Flow.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "NSDL"
    Then Click On Entity From List On View Entity Details Page For Flow "NSDL"
    Then Click on ADD NEW button in Child entity section
    Then Select "microATM" in Product dropdown and role "BC" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Enter BC Name On BC Details page "Micro_BC"
    Then Enter shortCode On BC Details page "WE"
    Then Click On GSTNumber Not Available On BC Details page
    Then Enter mobile On BC Details page "9090909090"
    Then Enter email On BC Details page "gh@gmail.com"
    Then Enter address1 On BC Details page "Pune"
    Then Enter city On BC Details page "pune"
    Then Select State On BC Details page "Maharashtra"
    Then Enter pin On BC Details page "411001"
    Then Click On Next on Assign Institution Page
    Then Click On Save on Assign Institution Page

  @Flow_And_Users
  Scenario: Check user can create Merchant in microATM Flow.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "NSDL"
    Then Click On Entity From List On View Entity Details Page For Flow "NSDL"
    Then Click On Entity From List On View Entity Details Page For Flow "Micro_BC"
    Then Click on ADD NEW button in Child entity section
    Then Select "microATM" in Product dropdown and role "Merchant" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Enter Merchant Name On Merchant Details page "Micro_Merchant"
    Then Click On GSTNumber Not Available On BC Details page
    Then Enter mobile On Merchant Details page "9090909090"
    Then Enter address1 On Merchant Details page "Pune"
    Then Enter city On Merchant Details page "pune"
    Then Select State On Merchant Details page "Maharashtra"
    Then Enter pin On Merchant Details page "411001"
    Then Click On Next on Assign Institution Page
    Then Click On Save on Assign Institution Page

  @Flow_And_Users
  Scenario: Check user can create Terminal in microATM Flow.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "NSDL"
    Then Click On Entity From List On View Entity Details Page For Flow "NSDL"
    Then Click On Entity From List On View Entity Details Page For Flow "Micro_BC"
    Then Click On Entity From List On View Entity Details Page For Flow "Micro_Merchant"
    Then Click on ADD NEW button in Child entity section
    Then Select "microATM" in Product dropdown and role "Terminal" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Enter POSNumber On Terminal Details page "POSABCD123456"
    Then Enter address1 On Terminal Details page "Pune"
    Then Enter city On Terminal Details page "pune"
    Then Select State On Terminal Details page "Maharashtra"
    Then Enter pin On Terminal Details page "411001"
    Then Click On Next on Assign Institution Page
    Then Click On Save on Assign Institution Page

  @Flow_And_Users
  Scenario Outline: add Institutions.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select As Acquirer CheckBox on Assign Product Role Pop-Up
    Then Select "AEPS" in Product dropdown and role "Institutions" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Institutions on Assign Institutions popup "<Institutions>"
    Then Click on Save Button on Assign Institutions popup

    Examples: 
      | Institutions      |
      | 588 - Utkarsh SFB |

  @Flow_And_Users
  Scenario Outline: add BC.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click Institutions from the list "<Institutions>"
    Then Click on ADD NEW button in Child entity section
    Then Select "AEPS" in Product dropdown and role "BC" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Enter BC Name "<BC Name>" on BC Details_AEPS Page
    Then Click on Save Button on BC Details_AEPS Page

    Examples: 
      | Institutions | Acquiring Bank | Settlement Bank | BC Name |
      | Utkarsh SFB  | Utkarsh SFB    | Sarvatra - 1    | BC_Test |

  @Flow_And_Users
  Scenario Outline: add BC Agent
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click Institutions from the list "<Institutions>"
    Then Click BC from the list "<BC Name>"
    Then Click on ADD NEW button in Child entity section
    Then Select "AEPS" in Product dropdown and role "BC Agent" in Role dropdown on Assign Product Role popup
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select BC "<BC>" on BC Details_AEPS Page
    Then Select Terminal Type "<Terminal Type>" on BC Details_AEPS Page
    Then Select Branch "<Branch>" on BC Details_AEPS Page
    Then Enter Mobile number "<Mobile no>" on BC Details_AEPS Page
    Then Enter Loacation Name "<Location>" on BC Details_AEPS Page
    Then Enter Address "<Address>" on BC Details_AEPS Page
    Then Enter City "<City>" on BC Details_AEPS Page
    Then Enter State "<State>" on BC Details_AEPS Page
    Then Enter Pincode "<Pincode>" on BC Details_AEPS Page
    Then Click on Save Button on BC Agent Details_AEPS Page

    Examples: 
      | Institutions | BC Name | BC      | Terminal Type | Branch                  | Mobile no  | Location | Address  | City | State | Pincode |
      | Utkarsh SFB  | BC_Test | BC_Test | ANALOGIES     | UTKARSH SFB MAIN BRANCH | 9087654321 | street1  | street 2 | pune | MH    |  500081 |

  @Flow_And_Users
  Scenario Outline: Create admin User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen

    Examples: 
      | username | DisplayName | Mobile     | email       |
      | admin_ba | admin_ba    | 9090909090 | g@gmail.com |
      | v_admin  | v_admin     | 9090909090 | g@gmail.com |
      | hgsAdmin | hgsAdmin    | 9090909090 | g@gmail.com |
      | pk_Admin | pk_Admin    | 9090909090 | g@gmail.com |

  @Flow_And_Users
  Scenario Outline: Create OU User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Dombiwali Nagari Bank"
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen

    Examples: 
      | username | DisplayName | Mobile     | email       |
      | ou_ba    | ou_ba       | 9090909090 | g@gmail.com |

  @Flow_And_Users
  Scenario Outline: Create AI User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen

    Examples: 
      | username | DisplayName | Mobile     | email       |
      | ai_ba    | ai_ba       | 9090909090 | g@gmail.com |

  @Flow_And_Users
  Scenario Outline: Create AG User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Babaji date Bank"
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen

    Examples: 
      | username | DisplayName | Mobile     | email       |
      | ag_ba    | ag_ba       | 9090909090 | g@gmail.com |

  @Flow_And_Users
  Scenario Outline: Create Agent User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Babaji date Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "THE SEVA VIKAS CO-OP. BANK LTD"
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen

    Examples: 
      | username       | DisplayName    | Mobile     | email       |
      | agent_ba       | agent_ba       | 9090909090 | g@gmail.com |
      | agent_bbps_b2b | agent_bbps_b2b | 9090909090 | g@gmail.com |

  @Flow_And_Users
  Scenario Outline: Create OU User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen

    Examples: 
      | username  | DisplayName | Mobile     | email       |
      | ou_ba_b2c | ou_ba_b2c   | 9090909090 | g@gmail.com |

  @Flow_And_Users
  Scenario Outline: Create AI User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen

    Examples: 
      | username  | DisplayName | Mobile     | email       |
      | ai_ba_b2c | ai_ba_b2c   | 9090909090 | g@gmail.com |

  @Flow_And_Users
  Scenario Outline: : Create Agent User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Small Finance bank, Jalandhar Branch"
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen

    Examples: 
      | username       | DisplayName    | Mobile     | email       |
      | agent_ba_b2c   | agent_ba_b2c   | 9090909090 | g@gmail.com |
      | agent_bbps_b2c | agent_bbps_b2c | 9090909090 | g@gmail.com |

  @Flow_And_Users
  Scenario Outline: Create Institutions User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "NSDL"
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen

    Examples: 
      | username                 | DisplayName              | Mobile     | email       |
      | MicroATM_Institutions_ba | MicroATM_Institutions_ba | 9090909090 | g@gmail.com |
      | MicroATM_Institutions    | MicroATM_Institutions    | 9090909090 | g@gmail.com |

  @Flow_And_Users
  Scenario Outline: Create BC User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "NSDL"
    Then Click On Entity From List On View Entity Details Page For Flow "Micro_BC"
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen

    Examples: 
      | username       | DisplayName    | Mobile     | email       |
      | MicroATM_BC_ba | MicroATM_BC_ba | 9090909090 | g@gmail.com |
      | MicroATM_BC    | MicroATM_BC    | 9090909090 | g@gmail.com |

  @Flow_And_Users
  Scenario Outline: Create Merchant User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "NSDL"
    Then Click On Entity From List On View Entity Details Page For Flow "Micro_BC"
    Then Click On Entity From List On View Entity Details Page For Flow "Micro_Merchant"
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen

    Examples: 
      | username             | DisplayName          | Mobile     | email       |
      | MicroATM_Merchant_ba | MicroATM_Merchant_ba | 9090909090 | g@gmail.com |
      | MicroATM_Merchant    | MicroATM_Merchant    | 9090909090 | g@gmail.com |

  @Flow_And_Users
  Scenario Outline: Create Terminal User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "NSDL"
    Then Click On Entity From List On View Entity Details Page For Flow "Micro_BC"
    Then Click On Entity From List On View Entity Details Page For Flow "Micro_Merchant"
    Then Click On First Entity From List On View Entity Details Page For Flow
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen

    Examples: 
      | username             | DisplayName           | Mobile     | email       |
      | MicroATM_Terminal_ba | MicroATM_Terminalt_ba | 9090909090 | g@gmail.com |
      | MicroATM_Terminal    | MicroATM_Terminal     | 9090909090 | g@gmail.com |

  @Flow_And_Users
  Scenario Outline: Institutions user creation
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click on Search entity by Name hypertext link
    Then Enter "<institution>" in Name field
    Then Click on Search button
    Then Select entity "<institution>"
    Then Validate the header "View Entity Details"
    Then click on Add User
    Then Enter Login ID "<loginid>"
    Then Enter Display name "<loginname>"
    Then Enter Mobile number "<mobileno>"
    Then Enter User Email id "<emailid>"
    Then Click on Save Button on User Management Details Page
    Then Validate the header "View Entity Details"

    Examples: 
      | institution | loginid     | loginname | mobileno   | emailid           |
      | Utkarsh SFB | insti_test  | insti_qa  | 9087654321 | abc@gmail.com     |
      | Utkarsh SFB | insti_test1 | insti_qa1 | 9087654320 | abcde@gmail.com   |
      | Utkarsh SFB | insti_BA    | insti_BA  | 9087654328 | qalogin@gmail.com |

  @Flow_And_Users
  Scenario Outline: BC user creation
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click on Search entity by Name hypertext link
    Then Enter "<BCName>" in Name field
    Then Click on Search button
    Then Select entity "<BCName>"
    Then Validate the header "View Entity Details"
    Then click on Add User
    Then Enter Login ID "<loginid>"
    Then Enter Display name "<loginname>"
    Then Enter Mobile number "<mobileno>"
    Then Enter User Email id "<emailid>"
    Then Click on Save Button on User Management Details Page
    Then Validate the header "View Entity Details"

    Examples: 
      | BCName  | loginid    | loginname  | mobileno   | emailid           |
      | BC_Test | BC_QAuser  | BC_QAuser  | 9087654321 | abc@gmail.com     |
      | BC_Test | BC_QAuser1 | BC_QAuser1 | 9087654320 | abcde@gmail.com   |
      | BC_Test | BC_BAuser  | BC_BAuser  | 9087654328 | qalogin@gmail.com |

  @Flow_And_Users
  Scenario Outline: BC user creation
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Utkarsh SFB"
    Then Click On Entity From List On View Entity Details Page For Flow "BC_Test"
    Then Click On First Entity From List On View Entity Details Page For Flow
    Then Validate the header "View Entity Details"
    Then click on Add User
    Then Enter Login ID "<loginid>"
    Then Enter Display name "<loginname>"
    Then Enter Mobile number "<mobileno>"
    Then Enter User Email id "<emailid>"
    Then Click on Save Button on User Management Details Page
    Then Validate the header "View Entity Details"

    Examples: 
      | BCagentname | loginid       | loginname     | mobileno   | emailid           |
      | BC_Agent    | BCagent_test  | BCagent_test  | 9087654321 | abc@gmail.com     |
      | BC_Agent    | BCagent_test1 | BCagent_test1 | 9087654320 | abcde@gmail.com   |
      | BC_Agent    | BCagent_BA    | BCagent_BA    | 9087654328 | qalogin@gmail.com |
