Feature: Validate the UI functionality of SP-150-Issuing Bank Admin User_ View ‘User Management’ Page.

  Background: Verify that user can view  ‘User Management’ Page by logging with Issuing Bank Admin
    Given User is on LoginPage
    # When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    When Enter the UserNM "NSDL_admin" and Pass "Test@123" and click on LOGIN as "NSDL_admin"

  @Sprint-5 @epic-126 @sp-150 @TC_PPI_IBR_UI_036
  Scenario Outline: To check whether Issuing Bank (NSDL-PPI) Admin user can view User Management screen through PPI Issuing Bank user login.
  When Click on "Users" in Configurations Menu
  Then Verify that user should navigate to User Management  Details screen
  
  @Sprint-5 @epic-126 @sp-150 @TC_PPI_IBR_UI_037
  Scenario Outline: To check whether Issuing Bank (NSDL-PPI) Admin user can view all Column fields on User Management screen through PPI Issuing Bank user login
  When Click on Users in Configurations Menu
  Then Verify that  user can see all columns fields of table on User Management screen
  
  @Sprint-5 @epic-126 @sp-150 @TC_PPI_IBR_UI_038
  Scenario Outline: To check whether Issuing Bank (NSDL-PPI) Admin user click on Reports on the right-hand side main menu then user should navigate to Reports Configuration screen.
  When Click on Reports in right-hand side main menu on issuing bank admin login page
  Then verify user should navigate to Reports Configuration screen
  
  @Sprint-5 @epic-126 @sp-150 @TC_PPI_IBR_UI_039
  Scenario Outline: To check whether Issuing Bank (NSDL-PPI) Admin user click on Configuration menu on  right-hand side main menu then user should be view and access Entities and User submenu.
  When Click on Configuration in right-hand side main menu on issuing bank admin login page
  Then verify user should view Entities and User submenu
  Then Click on Entities in Configuration on  right-hand side main menu and verify user should be navigated to View Entity Details page
  Then Click on User in Configuration on  right-hand side main menu and verify user should be navigated to User Management page
  
  # How do differente which user is self created or host created through Automation 
  # if consider for automation then Need to update 
  @Sprint-5 @epic-126 @sp-150 @TC_PPI_IBR_UI_040
  Scenario Outline: To check wether Issuing Bank admin user can view already Added User by admin user(self), host admin and own user for Issuing Bank, and details about it in all columns.
  When Click on Configuration in right-hand side main menu on issuing bank admin login page
 
  
  @Sprint-5 @epic-126 @sp-150 @TC_PPI_IBR_UI_041
  Scenario Outline: To check whether Issuing Bank(NSDL-PPI) Admin user can view Home Icon & Add User button as-is on ‘User Management’ screen.
  When Click on Users in Configurations Menu
  Then Verify user can view Add User button on ‘User Management Details’ screen.
  Then Verify user can view Home Icon on ‘User Management Details’ screen.
  
  @Sprint-5 @epic-126 @sp-150 @TC_PPI_IBR_UI_042
  Scenario Outline: To check whether admin user can Search user with display name, login id, Entity id, and Entity name on ‘User Management' screen
  When Click on Users in Configurations Menu
  Then Verify user can Search user with "<display_name>"
  Then Verify user can Search user with "<login_id>"
  Then Verify user can Search user with "<Entity_id>"
  Then Verify user can Search user with "<Entity_name>"
  
   Examples: 
		|Login_ID | Display_Name | Entity_id | Entity_name |
		|NSDL_admin|NSDL_admin |1226|NSDL|
		
		
		# How do verify that password reset or not 
	@Sprint-5 @epic-126 @sp-150 @TC_PPI_IBR_UI_043
  Scenario Outline: To check whether Issuing Bank (NSDL-PPI) Admin user can Reset password of created user on User Management screen.
  When Click on Users in Configurations Menu
  Then Enter user name in Login Id - Search box text field to search user
  Then Click on Reset Password button icon in Action column.
  Then Click on Yes button on confirm pop up.
  
  
  @Sprint-5 @epic-126 @sp-150 @TC_PPI_IBR_UI_044
  Scenario Outline: To check whether Issuing Bank (NSDL-PPI) Admin user can Edit user details except Login ID & Entity of created user on User Management Details screen
  When Click on Users in Configurations Menu
  Then Enter user name in Login Id - Search box text field to serach user
  Then Click on edit button icon in Action column.
  Then Change "<Display Name>", "<Mobile No.>" & "<Email>" on User Management Details screen
  Then Click on 'Save' button and verify that User updated Successfully message popup should be display
  Examples: 
		| Display Name | Mobile No | Email |
		|NSDL_admin1 |9087654321|abc1@gmail.com|
		
  
  @Sprint-5 @epic-126 @sp-150 @TC_PPI_IBR_UI_045
  Scenario Outline: To check whether Issuing Bank (NSDL-PPI) Admin user can Delete the created user on User Management Details screen.
  When Click on Users in Configurations Menu
  Then Enter user name in Login Id - Search box text field to search user
  Then Click on Delete button icon in Action column.
  Then Click on Yes button on Delete the User pop up
  Then Click on Deleted user 
  Then Verify that This User is Deleted message is dispalyed on User Management Details page
  
  
  @Sprint-5 @epic-126 @sp-150 @TC_PPI_IBR_UI_046
  Scenario Outline: To check whether Issuer bank Admin User can not have permisson for edit,delete, reset password for its own user name
  When Click on Users in Configurations Menu
  Then Enter own user name in Login Id - Search box text field to search user
  Then Verify that permissions of edit, delete, reset password  are disabled for its own user name
  
  
  @Sprint-5 @epic-126 @sp-150 @TC_PPI_IBR_UI_047
  Scenario Outline: To check whether Issuing Bank (NSDL-PPI) Admin user can Logout after logged in
  When Click on Logout on the right-hand side main menu
  Then Verify that user should be navigate to Login page
  
  
  
  
  
  
  
  
  
  
  
  