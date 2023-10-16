Feature: Validate the functionality of Create user b2c_Flow

  @b2c_UserCreation
  Scenario Outline: Create OU User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen
    Then Set Default Password For "<username>"

    Examples: 
      | username    | DisplayName | Mobile     | email       |
      | ou_ba_b2c   | ou_ba_b2c   | 9090909090 | g@gmail.com |
      | ou_user_b2c | ou_user_b2c | 9090909090 | g@gmail.com |
      | ou_auto_b2c | ou_auto_b2c | 9090909090 | g@gmail.com |

  @b2c_UserCreation
  Scenario Outline: Create AI User.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen
    Then Enter the user details in "<username>", "<DisplayName>", "<Mobile>", "<email>" text fields on UMD via Entity
    Then Click on SAVE button on User Management Details screen
    Then Set Default Password For "<username>"

    Examples: 
      | username    | DisplayName | Mobile     | email       |
      | ai_ba_b2c   | ai_ba_b2c   | 9090909090 | g@gmail.com |
      | ai_auto_b2c | ai_auto_b2c | 9090909090 | g@gmail.com |

  @b2c_UserCreation
  Scenario Outline: : Create Agent User.
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
      | agent_ba_b2c   | agent_ba_b2c   | 9090909090 | g@gmail.com |
      | agent_bbps_b2c | agent_bbps_b2c | 9090909090 | g@gmail.com |
      | agent_auto_b2c | agent_auto_b2c | 9090909090 | g@gmail.com |
