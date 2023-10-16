Feature: Validate the functionality of Home Page for PPI product User

  #Then User logged in as "System Administrator"
  Scenario: To check whether the Host admin user can login and see HomePage.
    When Enter the UserNM "ADITYA_UAT3" and Pass "Pass@123" and click on LOGIN as "ADITYA_UAT3"
    Given User is on Homepage

 