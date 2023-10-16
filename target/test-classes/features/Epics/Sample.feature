Feature: Title of your feature
  I want to use this template for my feature file

  Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage
    # When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    When Enter the UserNM "admintest2" and Pass "Test@123" and click on LOGIN as "admintest2"

  @test
  Scenario: Title of your scenario outline
    Then Verify  Entity dropdown on View Entity Detail screen
    Then Verify  Active dropdown on View Entity Detail screen
    Then Verify  Admin check box is Default checked and not able to uncheck on View Entity Detail screen
    Then Click on ADD USER button on View Entity Detail screen
    Then Verify user can view SAVE and BACK button on User Management Details screen
    Then Click on ADD USER button on View Entity Detail screen
    Then Enter the user details in "<Login_Id>", "<Display_Name>", "<Mobile_Number>", "<Email>" text fields
    Then Click on SAVE button on User Management Details screen
    Then User navigate to View Entity Details screen for "<Entity_Name>" and view "User Created successfully" message popup
    Then Click on ADD USER button on View Entity Detail screen
    Then CLick on BACK button on User Management Details screen
    Then User navigate to View Entity Details screen for "<Entity_Name>"
    Then Click on ADD USER button on View Entity Detail screen
    Then Click on SAVE button on User Management Details screen
    Then Verify "Login Id cannot be empty" message for empty Login ID field on User Management Details screen
    Then Verify "Display Name cannot be empty" message for empty Display Name field on User Management Details screen
    Then Verify "Mobile Number is mandatory" message for empty Mobile Number field on User Management Details screen
    Then Verify "Email Id cannot be empty" message for empty mail field on User Management Details screen
    Then Enter invalid "<Login_Id>" in Login ID field on User Management Details screen and verify "Only alphanumeric and underscore allowed for Login Id" validtion message
    #Then Enter invalid "<Display_Name>" in Display Name field on User Management Details screen and verify "" validtion message
    Then Enter invalid "<Mobile_Number>" in Mobile Number field on User Management Details screen and verify "Mobile number should be 10 digits, starting with 6, 7, 8 or 9." validtion message
    Then Enter invalid "<Email>" in Email field on User Management Details screen and verify "Invalid Email Address-> Valid emails:user@gmail.com or my.user@domain.com etc." validtion message
