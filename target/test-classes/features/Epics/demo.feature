Feature: Validate the functionality of Flow and users

 
    
  #@B2C_Flow
  #Scenario: Check user can create Agent in B2C Flow.
    #When Enter the UserNM "ADITYA_UAT3" and Pass "Pass@123" and click on LOGIN as "ADITYA_UAT3"
    #Then Click on Entities in Configurations Menu
    #Then Enter Entity Name in Search Entity Text field "Capital Bank"
    #Then Click On Entity From List On View Entity Details Page For Flow "Capital Bank"
    #Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    #Then Click on ADD NEW button in Child entity section
    #Then Select "BBPS" in Product dropdown and role "Agent" in Role dropdown on Assign Product Role popup
    #Then Click on Next button on Assign Product Role Pop-Up
    #Then Select AgentGroup "None"
    #Then Select Agent On Agent Details Page "Capital Small Finance bank, Jalandhar Branch"
    #Then Click On Save on Agent Institution
    
    
     @b2c_UserCreation
  Scenario Outline: : Create Agent User.
    When Enter the UserNM "" and Pass "test" and click on LOGIN as "System Administrator"
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
    