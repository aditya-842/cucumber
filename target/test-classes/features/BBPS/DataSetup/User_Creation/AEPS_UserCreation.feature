 Feature: Validate the Fucnctionality of AEPS User Creation 
   
    @Aeps_Flow
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
        | institution        | loginid  |  loginname  | mobileno | emailid  |
        | Utkarsh SFB  | insti_test | insti_qa |  9087654321 |  abc@gmail.com  |
        | Utkarsh SFB  | insti_test1 | insti_qa1 |  9087654320 |  abcde@gmail.com  |
        | Utkarsh SFB  | insti_BA  | insti_BA  |  9087654328 | qalogin@gmail.com  |
        

     @Aeps_Flow
  Scenario Outline: BC user creation
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click on Search entity by Name hypertext link
    Then Enter "<BCName>" in Name field
    Then Click on Search button
    Then Select entity "<BCName>"
    Then Validate the header "View Entity Details"
    Then Enter Login ID "<loginid>"
    Then Enter Display name "<loginname>"
    Then Enter Mobile number "<mobileno>"
    Then Enter User Email id "<emailid>" 
    Then Click on Save Button on User Management Details Page
    Then Validate the header "View Entity Details"
    
    Examples:
        | BCName   | loginid  |  loginname  | mobileno | emailid  |
        | BC_Test  | BC_QAuser | BC_QAuser |  9087654321 |  abc@gmail.com  |
        | BC_Test  | BC_QAuser1 | BC_QAuser1 |  9087654320 |  abcde@gmail.com  |
        | BC_Test  | BC_BAuser  | BC_BAuser  |  9087654328 | qalogin@gmail.com  | 
        
         @Aeps_Flow
  Scenario Outline: BC user creation
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Then Click on Entities in Configurations Menu
    Then Click on Search entity by Name hypertext link
    Then Enter "<BCagentname>" in Name field
    Then Click on Search button
    Then Select entity "<BCagentname>"
    Then Validate the header "View Entity Details"
    Then click on Add User 
    Then Enter Login ID "<loginid>"
    Then Enter Display name "<loginname>"
    Then Enter Mobile number "<mobileno>"
    Then Enter User Email id "<emailid>" 
    Then Click on Save Button on User Management Details Page
    Then Validate the header "View Entity Details"
    
     Examples:
        | BCagentname | loginid  |  loginname  | mobileno | emailid  |
        | BC_Agent  | BCagent_test | BCagent_test |  9087654321 |  abc@gmail.com  |
        | BC_Agent  | BCagent_test1 | BCagent_test1 |  9087654320 |  abcde@gmail.com  |
        | BC_Agent  | BCagent_BA  | BCagent_BA  |  9087654328 | qalogin@gmail.com  |