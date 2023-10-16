Feature: Validate the functionality of Login Page for PPI product User

  Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage

  #Then User logged in as "System Administrator"
  Scenario: To check whether the Host admin user can login and see HomePage.
    When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    Given User is on Homepage

  Scenario: Navigate from home page through Configuration
    When Click on Entities in Configurations Menu
    #When Click on Services in Configurations Menu1
    #When Click on Chanels in Configurations Menu
    When Click on Users in Configurations Menu
    #When Click on System Configuration in Configurations Menu
    #When Click on Migration in Configurations Menu
