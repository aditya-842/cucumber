Feature: Validate the functionality of b2c_Flow


  Scenario: Check user can create Agent in B2C Flow.
    When Enter the UserNM "esfb_aditya_agent" and Pass "Pass@123" and click on LOGIN as "esfb_aditya_agent"
    Then Click on Entities in Configurations Menu
    Then Click on Add User Button 
    Then Enter Login Id "esfb_aa3"
    Then Enter Display Name "esfb_aa3"
    Then Enter Mobile Number for new admin user "9393939124"
    Then Enter Email "efesf@gmail.com"
    Then Click on Active Dropdown and Select Value "Y"
    #Then Click on Admin Checkbox
    #Then Click on Default Permission for new admin user
    Then Click on Save Button
    
     Scenario: Check user can create NON Agent in	 B2C Flow.
    When Enter the UserNM "esfb_aditya_agent" and Pass "Pass@123" and click on LOGIN as "esfb_aditya_agent"
    Then Click on Entities in Configurations Menu
    Then Click on Add User Button 
    Then Enter Login Id "esfb_aa3"
    Then Enter Display Name "esfb_aa3"
    Then Enter Mobile Number for new admin user "9393939124"
    Then Enter Email "efesf@gmail.com"
    Then Click on Admin Checkbox
    Then Click on Default Permission for new admin user
    Then Click on Save Button
    
  #//   @BBPS_Regression_B2C @TC_BBPS_B2C_008_001.
     
    #// Scenario Outline: To check whether the Host admin can edit a user for the operating unit entity.
   #// When Enter the UserNM "esfb_aditya_agent" and Pass "Pass@123" and click on LOGIN as "esfb_aditya_agent"
  #//  When Click on Users in Configurations Menu
  #//  Then Enter "<Login_Id>" in Login Id - Search box text field to search user
  #//  Then Click on edit button icon in Action column.
  #//  Then Verify that user navigate to User Management Details screen
   #// Then Enter the user details in "<Display_Name>", "<Mobile_Number>", "<Email>" text fields on UMD via Entity
  #//  Then Click on Active dropdown and select to "<Active_Status>" on User Management Detail screen
    #Then Click on Admin checkbox to edit the admin/Non_admin permission
    #Then Click on Save button
    #Then Verify toaster-Validation message "User updated Successfully" should display on View Entity details page
    #Then Click on logout button
    
    
    #Examples: 
      #| Login_Id | Display_Name | Mobile_Number | Email                | Active_Status |
      #| esfb_aa3 | user2        |    9876543210 | automation4@test.com | N             |
    
    
    
    