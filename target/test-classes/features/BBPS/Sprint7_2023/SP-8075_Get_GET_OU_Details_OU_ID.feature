Feature: BBPS Micro Service - Get GET ou-details/ou_id

  @sprint12 @epic-2825 @SP-8075 @SP_8075_TC_01
  Scenario Outline: login as a Admin, when user click on OU then Get ou-details
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Dombiwali Nagari Bank"
    Then Verify Key and value filed On View Entity Page "ID - Name" "8 - Dombiwali Nagari Bank"
    Then Verify Key and value filed On View Entity Page "Alias" "DNSB"
    Then Verify Key and value filed On View Entity Page "Business Type" "Bank"