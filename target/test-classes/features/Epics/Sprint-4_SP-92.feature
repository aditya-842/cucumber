Feature: Validate the functionality on View Entity Details Page for PPI product.

  Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage
    # When Enter the UserNM "admin" and Pass "test" and click on LOGIN as "System Administrator"
    When Enter the UserNM "admintest2" and Pass "Test@123" and click on LOGIN as "admintest2"

  # Given User is on Homepage
  @Sprint-4 @epic-92 @sp-318 @TC_PPI_PMR_UI_001
  Scenario: To check whether the Host admin user can see the PPI as product in Product dropdown on Assign Product Role Pop-Up.
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    #Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Verify that user can see "PPI" in Product dropdown on Assign Product Role Pop-Up

  @Sprint-4 @epic-92 @sp-318 @TC_PPI_PMR_UI_002
  Scenario Outline: To check whether the Host admin user can see the all roles for PPI product on Assign Product Role Pop-Up.
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    #Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Verify that user can see "<Product>" & "<Role1>" on Assign Product Role Pop-Up
    Then Verify that user can see "<Product>" & "<Role2>" on Assign Product Role Pop-Up

    Examples: 
      | Product | Role1           | Role2                     |
      | PPI     | Program Manager | Prepaid Agent Institution |
