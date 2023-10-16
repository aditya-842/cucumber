Feature: Customer Parameters for Housing Society

  @Sprint-1 @epic-1 @SP-33 @SP_33_TC_25 @SP_33_TC_26
  Scenario: To check whether Agent admin user can Enter value for blank Customer Parameters.
    Given User is on LoginPage
    When Enter the UserNM "bbps_agent_b2b" and Pass "Test@123" and click on LOGIN as "bbps_agent_b2b"
    Given Click on Pay Bill Icon
    Then Select category "Housing Society"
    Then Select state from dropdown list "MAHARASHTRA"
    Then Enter City for Housing Society "Pune"
    Then Click on Submit Button Housing Society
    Then Select Optional Biller when Support plan is "Housing_Society"
    Then Enter Flatnumber "786786"
    Then Enter Mobile Number "87878787878"
    Then Click on Fetch Bill button
    When Validate Payment Confirmation page "8787"
    Then Click on CONFIRM button
    Then Validate Transaction Details SUCCESS Page
    Then Click on logout button

  @Sprint-1 @Epic-1 @SP-33 @SP_33_TC_27 @SP_33_TC_28
  Scenario: To check whether Agent admin user can Enter value for blank Customer Parameters.
    Given User is on LoginPage
    When Enter the UserNM "b2c_agent_bbps" and Pass "Test@123" and click on LOGIN as "b2c_agent_bbps"
    Given Click on Pay Bill Icon
    Then Select category "Housing Society"
    Then Select state from dropdown list "MAHARASHTRA"
    Then Enter City for Housing Society "Pune"
    Then Click on Submit Button Housing Society
    Then Select Optional Biller when Support plan is "Housing_Society"
    Then Enter Flatnumber "786786"
    Then Enter Mobile Number "87878787878"
    Then Click on Fetch Bill button
    When Validate Payment Confirmation page "8787"
    Then Click on CONFIRM button
    Then Validate Transaction Details SUCCESS Page
    Then Click on logout button
