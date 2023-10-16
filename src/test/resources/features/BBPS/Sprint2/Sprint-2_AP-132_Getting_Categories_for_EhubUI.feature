Feature: Customer Parameters for Housing Society

  Background: Verify the Login Page by logging with Host admin
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"

  @Sprint-2 @SP-132 @TC_MS_UI_001
  Scenario: To check whether Agent admin user can Enter value for blank Customer Parameters.
    Given Click on Pay Bill Icon
    Then Verify agent user Pay Bill category
