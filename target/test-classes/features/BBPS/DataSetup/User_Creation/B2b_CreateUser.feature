Feature: Validate the functionality of Create user b2b_Flow

  @b2b_UserCreation
  Scenario Outline: Create admin User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen
    Then Set Default Password For "<username>"

    Examples: 
      | username         | DisplayName      | Mobile     | email       |
      | admin_ba         | admin_ba         | 9090909090 | g@gmail.com |
      | v_admin          | v_admin          | 9090909090 | g@gmail.com |
      | hgsAdmin         | hgsAdmin         | 9090909090 | g@gmail.com |
      | pk_Admin         | pk_Admin         | 9090909090 | g@gmail.com |
      | admin1           | admin1           | 9090909090 | g@gmail.com |
      | Automation_admin | Automation_admin | 9090909090 | g@gmail.com |

  @b2b_UserCreation
  Scenario Outline: Create OU User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Dombiwali Nagari Bank"
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen
    Then Set Default Password For "<username>"

    Examples: 
      | username    | DisplayName | Mobile     | email       |
      | ou_ba_b2b   | ou_ba_b2b   | 9090909090 | g@gmail.com |
      | ou_user_b2b | ou_user_b2b | 9090909090 | g@gmail.com |
      | ou_auto_b2b | ou_auto_b2b | 9090909090 | g@gmail.com |

  @b2b_UserCreation
  Scenario Outline: Create AI User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen
    Then Set Default Password For "<username>"

    Examples: 
      | username    | DisplayName | Mobile     | email       |
      | ai_ba_b2b   | ai_ba_b2b   | 9090909090 | g@gmail.com |
      | ai_auto_b2b | ai_auto_b2b | 9090909090 | g@gmail.com |

  @b2b_UserCreation
  Scenario Outline: Create AG User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Babaji date Bank"
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen
    Then Set Default Password For "<username>"

    Examples: 
      | username    | DisplayName | Mobile     | email       |
      | ag_ba_b2b   | ag_ba_b2b   | 9090909090 | g@gmail.com |
      | ag_auto_b2b | ag_auto_b2b | 9090909090 | g@gmail.com |

  @b2b_UserCreation
  Scenario Outline: Create Agent User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click On Entity From List On View Entity Details Page For Flow "Babaji date Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "THE SEVA VIKAS CO-OP. BANK LTD"
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen
    Then Set Default Password For "<username>"

    Examples: 
      | username       | DisplayName    | Mobile     | email       |
      | agent_ba       | agent_ba       | 9090909090 | g@gmail.com |
      | agent_bbps_b2b | agent_bbps_b2b | 9090909090 | g@gmail.com |
      | agent_auto_b2b | agent_auto_b2b | 9090909090 | g@gmail.com |
