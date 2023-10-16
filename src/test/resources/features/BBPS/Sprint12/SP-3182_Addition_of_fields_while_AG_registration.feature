Feature: Addition of fields while AG registration

  @sprint12 @epic-2825 @SP-3182 @SP_3182_BBPS_001 @SP_3182_BBPS_002
  Scenario Outline: verify UI for new fields when login as a admin,
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Enter Entity Name in Search Entity Text field "<Name>"
    Then Click On Entity From List On View Entity Details Page For Flow "<Name>"
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select AgentGroup "Babajidate"
    Then Enter Support Email ID "Abcdef@gmail.com"
    Then Enter Support Contact Number "9809809800"
    Then Click on save button

    Examples: 
      | Name     | Product | Role        | Entity_Name |
      | Sarvatra | BBPS    | Agent Group | Sarvatra    |

  @sprint12 @epic-2825 @SP-3182 @SP_3182_BBPS_003
  Scenario Outline: verify UI for new fields when login as a admin,
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    Then Select or click on entity by checking "<Entity_Name>" in Child entity
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select AgentGroup "Banaskanta"
    Then Enter Support Email ID "test@123.mailc"
    Then Click on save button
    Then Verify Error msg displayed as "Invalid Email Address-> Valid emails:user@gmail.com or my.user@domain.com etc, Multiple Email Ids cannot exceed 120 chars long." on Agent Group Details
    Then Enter Support Contact Number "9087&^54322"
    Then Click on logout button

    Examples: 
      | Name     | Product | Role        | Entity_Name |
      | Sarvatra | BBPS    | Agent Group | Sarvatra    |

  @sprint12 @epic-2825 @SP-3182 @SP_3182_BBPS_004
  Scenario Outline: verify UI for new fields when login as a admin,
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    Then Select or click on entity by checking "<Entity_Name>" in Child entity
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select AgentGroup "Banaskanta"
    Then Enter Support Email ID ""
    Then Enter Support Contact Number ""
    Then Click on save button

    Examples: 
      | Name     | Product | Role        | Entity_Name |
      | Sarvatra | BBPS    | Agent Group | Sarvatra    |

  @sprint12 @epic-2825 @SP-3182 @SP_3182_BBPS_005
  Scenario Outline: verify UI for new fields when login as a admin,
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    Then Select or click on entity by checking "<Entity_Name>" in Child entity
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select AgentGroup "BBPS_QA_2"
    Then Enter Support Email ID ""
    Then Enter Support Contact Number "9087654321;9087654322;9087622321"
    Then Click on save button

    Examples: 
      | Name     | Product | Role        | Entity_Name |
      | Sarvatra | BBPS    | Agent Group | Sarvatra    |

  @sprint12 @epic-2825 @SP-3182 @SP_3182_BBPS_006
  Scenario Outline: verify UI for new fields when login as a admin,
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    Then Select or click on entity by checking "<Entity_Name>" in Child entity
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select AgentGroup "demo_Agent_group"
    Then Enter Support Email ID "test@mail.com;testing@mail.com;test123@mail.com"
    Then Enter Support Contact Number "9087654321;9087654322;9087622321"
    Then Click on save button

    Examples: 
      | Name     | Product | Role        | Entity_Name |
      | Sarvatra | BBPS    | Agent Group | Sarvatra    |

  @sprint12 @epic-2825 @SP-3182 @SP_3182_BBPS_007
  Scenario Outline: verify UI for new fields when login as a admin,
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Enter "<Name>" in Child Entities Search Entity search box
    Then Select or click on entity by checking "<Entity_Name>" in Child entity
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select AgentGroup "Sardar Bhiladwala"
    Then Verify Support Email ID displayed on Agent Institution
    Then Verify Support Contact Number displayed  on Agent Institution
    Then Click on logout button

    Examples: 
      | Name     | Product | Role        | Entity_Name |
      | Sarvatra | BBPS    | Agent Group | Sarvatra    |

  @sprint12 @epic-2825 @SP-3182 @SP_3182_BBPS_008
  Scenario Outline: verify UI for new fields when login as a admin,
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Agent Institution "Sarvatra"
    Then Select AgentGroup "BBPS_QA_2"
    Then Enter Support Email ID "Abcdef@gmail.com"
    Then Enter Support Contact Number " 9087654321"
    Then Click on save button

    Examples: 
      | Product | Role        |
      | BBPS    | Agent Group |

  @sprint12 @epic-2825 @SP-3182 @SP_3182_BBPS_009
  Scenario Outline: verify UI for new fields when login as a admin,
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Agent Institution "Sarvatra"
    Then Select AgentGroup "Dombiwali bank New Grp"
    Then Enter Support Email ID "test@123.mail"
    Then Enter Support Contact Number "9087&^54322"
    Then Click on save button

    Examples: 
      | Product | Role        |
      | BBPS    | Agent Group |

  @sprint12 @epic-2825 @SP-3182 @SP_3182_BBPS_010
  Scenario Outline: verify UI for new fields when login as a admin,
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Agent Institution "Sarvatra"
    Then Select AgentGroup "Dombiwali bank New Grp"
    Then Enter Support Email ID ""
    Then Enter Support Contact Number ""
    Then Click on save button

    Examples: 
      | Product | Role        |
      | BBPS    | Agent Group |

  @sprint12 @epic-2825 @SP-3182 @SP_3182_BBPS_011
  Scenario Outline: verify UI for new fields when login as a admin,
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Agent Institution "Sarvatra"
    Then Select AgentGroup "Karad Urban Bank"
    Then Enter Support Contact Number "9087654321;9087654322;9087622321"
    Then Click on save button

    Examples: 
      | Product | Role        |
      | BBPS    | Agent Group |

  @sprint12 @epic-2825 @SP-3182 @SP_3182_BBPS_012
  Scenario Outline: verify UI for new fields when login as a admin,
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Agent Institution "Sarvatra"
    Then Select AgentGroup "Koyana Bank Karad"
    Then Enter Support Email ID "test@mail.com;testing@mail.com;test123@mail.com"
    #Then Enter Support Contact Number "9087&^54322"
    Then Click on save button

    Examples: 
      | Product | Role        |
      | BBPS    | Agent Group |
