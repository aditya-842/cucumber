Feature: BBPS - Hospital and Pathology Billers

  @sprint14 @epic-3580 @SP-4629 @TC_02 @TC_03
  Scenario: To check whether when select Hospital and Pathology then verify biller
    Given User is on LoginPage
    When Enter the UserNM "ab_agent" and Pass "TEst@123" and click on LOGIN as "ab_agent"
    Given Click on Pay Bill Icon
    Then Select category "Hospital and Pathology"
    Then Verify Biller Dropdown On PayBill Page
    Then Verify Biller Available In Dropdown "B.K. Arogyam and Research Pvt. Ltd"