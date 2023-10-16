Feature: As a host admin ,I want to search and View Issuing bank details.

  Background: User needs to be login as PPI Issuer Bank admin user
    When Enter the UserNM "PPI_Admin_01" and Pass "Test@1234" and click on LOGIN as "PPI Issuer Admin"
    Given User is on Homepage

  Scenario: Issuer bank admin Home page is showing entities and users in Configuration menu
    When Click on Entities in Configurations Menu
    Then verify  PPI product issuing bank details
      | ID - Name                  | SMUI Bank ID | Status | Bank Type | Short Code | Created Date        | Created By           | Address                                                            | District | State       | PIN    | Contact Person Name | Contact Person Mobile | NPCI Short Name | Email ID            | Telephone Number | Mobile Number | Acquirer ID | IIN    | Product | Card Type | PIN Mode  | Status Date         |
      | 1 - NSDL PAYMENT BANK LTD. |          538 | Active | ISSUER    | NSDLBK     | 06-05-2022 14:59:36 | System Administrator | 4th Floor, A wing, Trade World, Kamala Mills Compound, Lower Parel | Mumbai   | Maharashtra | 400013 | CONTACT PERSON NAME |            9123456789 | NSDLBK          | CARE@NSDLBANK.CO.IN |       2242022100 |    9123456789 |             | 990326 | PPI     | Insta     | GREEN PIN | 06-05-2022 14:59:24 |
