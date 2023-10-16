Feature: Change in acceptance criteria for AI and AG registration

  @sprint13 @epic-2825 @SP-3730 @SP_3730_TC_01
  Scenario Outline: verify add new function for AG with both contact and mail id valid field values of 120 char by admin login
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select AgentGroup "Babajidate"
    Then Enter Support Email ID "Abcdef@gmail.com;1bcdef@gmail.com;2bcdef@gmail.com;3bcdef@gmail.com;4bcdef@gmail.com;5bcdef@gmail.com;61abcdef@gmail.com"
    Then Enter Support Contact Number "9809809800;9809809800;9809809800;98098098009809809800;9809809800;98098098009809809800;9809809800;9809809800;980980980011"
    Then Click on save button

    Examples: 
      | Name     | Product | Role        |
      | Sarvatra | BBPS    | Agent Group |

  @sprint13 @epic-2825 @SP-3730 @SP_3730_TC_02
  Scenario Outline: verify add new function for AG with both contact and mail id invalid field values of more than 120 char by admin login
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Enter Support Email ID "11Abcdef@gmail.com;1bcdef@gmail.com;2bcdef@gmail.com;3bcdef@gmail.com;4bcdef@gmail.com;5bcdef@gmail.com;61abcdef@gmail.com"
    Then Enter Support Contact Number "90119809809800;9809809800;9809809800;98098098009809809800;9809809800;98098098009809809800;9809809800;9809809800;980980980011"
    Then Click on save button
    Then Verify Error msg displayed as "Invalid Email Address-> Valid emails:user@gmail.com or my.user@domain.com etc, Multiple Email Ids cannot exceed 120 chars long." on Agent Group Details
    Then Verify Error msg displayed as "min length 8 numbers, max 20 numbers, valid contact numbers will separated by semicolon." on Agent Group Details for mobile number

    Examples: 
      | Name     | Product | Role        | Entity_Name |
      | Sarvatra | BBPS    | Agent Group | Sarvatra    |

  @sprint13 @epic-2825 @SP-3730 @SP_3730_TC_03
  Scenario Outline: verify add new function for AG with both contact and mail id invalid field values by admin login
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click On Entity From List On View Entity Details Page For Flow "Sarvatra"
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Enter Support Email ID "test@123.mailc"
    Then Enter Support Contact Number "9087&^54322"
    Then Click on save button
    Then Verify Error msg displayed as "Invalid Email Address-> Valid emails:user@gmail.com or my.user@domain.com etc, Multiple Email Ids cannot exceed 120 chars long." on Agent Group Details
    Then Verify Error msg displayed as "min length 8 numbers, max 20 numbers, valid contact numbers will separated by semicolon." on Agent Group Details for mobile number

    Examples: 
      | Name     | Product | Role        | Entity_Name |
      | Sarvatra | BBPS    | Agent Group | Sarvatra    |

  @sprint13 @epic-2825 @SP-3730 @SP_3730_TC_04
  Scenario Outline: verify add new function for AG with both contact and mail id valid field values of 120 char by AI login
    Given User is on LoginPage
    When Enter the UserNM "Automation_AI" and Pass "Test@12" and click on LOGIN as "Automation_AI"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select AgentGroup "Babajidate"
    Then Enter Support Email ID "Abcdef@gmail.com;1bcdef@gmail.com;2bcdef@gmail.com;3bcdef@gmail.com;4bcdef@gmail.com;5bcdef@gmail.com;61abcdef@gmail.com"
    Then Enter Support Contact Number "9809809800;9809809800;9809809800;98098098009809809800;9809809800;98098098009809809800;9809809800;9809809800;980980980011"
    Then Click on save button

    Examples: 
      | Product | Role        | Entity_Name |
      | BBPS    | Agent Group | Sarvatra    |

  @sprint13 @epic-2825 @SP-3730 @SP_3730_TC_05
  Scenario Outline: verify add new function for AG with both contact and mail id invalid field values of more than 120 char by AI login
    Given User is on LoginPage
    When Enter the UserNM "Automation_AI" and Pass "Test@12" and click on LOGIN as "Automation_AI"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Enter Support Email ID "11Abcdef@gmail.com;1bcdef@gmail.com;2bcdef@gmail.com;3bcdef@gmail.com;4bcdef@gmail.com;5bcdef@gmail.com;61abcdef@gmail.com"
    Then Enter Support Contact Number "90119809809800;9809809800;9809809800;98098098009809809800;9809809800;98098098009809809800;9809809800;9809809800;980980980011"
    Then Click on save button
    Then Verify Error msg displayed as "Invalid Email Address-> Valid emails:user@gmail.com or my.user@domain.com etc, Multiple Email Ids cannot exceed 120 chars long." on Agent Group Details
    Then Verify Error msg displayed as "min length 8 numbers, max 20 numbers, valid contact numbers will separated by semicolon." on Agent Group Details for mobile number

    Examples: 
      | Product | Role        | Entity_Name |
      | BBPS    | Agent Group | Sarvatra    |

  @sprint13 @epic-2825 @SP-3730 @SP_3730_TC_06
  Scenario Outline: verify add new function for Ag with both contact and mail id invalid field values by AI login
    Given User is on LoginPage
    When Enter the UserNM "Automation_AI" and Pass "Test@12" and click on LOGIN as "Automation_AI"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Enter Support Email ID "test@123.mailc"
    Then Enter Support Contact Number "9087&^54322"
    Then Click on save button
    Then Verify Error msg displayed as "Invalid Email Address-> Valid emails:user@gmail.com or my.user@domain.com etc, Multiple Email Ids cannot exceed 120 chars long." on Agent Group Details
    Then Verify Error msg displayed as "min length 8 numbers, max 20 numbers, valid contact numbers will separated by semicolon." on Agent Group Details for mobile number

    Examples: 
      | Product | Role        |
      | BBPS    | Agent Group |

  @sprint13 @epic-2825 @SP-3730 @SP_3730_TC_07
  Scenario Outline: verify add new function for AI with both contact and mail id valid field values of 120 char by admin login
    Given User is on LoginPage
    When Enter the UserNM "Automation_AI" and Pass "Test@12" and click on LOGIN as "Automation_AI"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Agent Institution "Sarvatra"
    Then Enter Support Email ID "Abcdef@gmail.com;1bcdef@gmail.com;2bcdef@gmail.com;3bcdef@gmail.com;4bcdef@gmail.com;5bcdef@gmail.com;61abcdef@gmail.com"
    Then Enter Support Contact Number "9809809800;9809809800;9809809800;98098098009809809800;9809809800;98098098009809809800;9809809800;9809809800;980980980011"
    Then Click on save button

    Examples: 
      | Product | Role              |
      | BBPS    | Agent Institution |

  @sprint13 @epic-2825 @SP-3730 @SP_3730_TC_08
  Scenario Outline: verify add new function for AI with both contact and mail id invalid field values of more than 120 char by admin login
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Enter Support Email ID "11Abcdef@gmail.com;1bcdef@gmail.com;2bcdef@gmail.com;3bcdef@gmail.com;4bcdef@gmail.com;5bcdef@gmail.com;61abcdef@gmail.com"
    Then Enter Support Contact Number "90119809809800;9809809800;9809809800;98098098009809809800;9809809800;98098098009809809800;9809809800;9809809800;980980980011"
    Then Click on save button
    Then Verify Error msg displayed as "Invalid Email Address-> Valid emails:user@gmail.com or my.user@domain.com etc, Multiple Email Ids cannot exceed 120 chars long." on Agent Group Details
    Then Verify Error msg displayed as "min length 8 numbers, max 20 numbers, valid contact numbers will separated by semicolon." on Agent Group Details for mobile number

    Examples: 
      | Product | Role              |
      | BBPS    | Agent Institution |

  @sprint13 @epic-2825 @SP-3730 @SP_3730_TC_09
  Scenario Outline: verify add new function for AI with both contact and mail id invalid field values by admin login
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Enter Support Email ID "test@123.mailc"
    Then Enter Support Contact Number "9087&^54322"
    Then Click on save button
    Then Verify Error msg displayed as "Invalid Email Address-> Valid emails:user@gmail.com or my.user@domain.com etc, Multiple Email Ids cannot exceed 120 chars long." on Agent Group Details
    Then Verify Error msg displayed as "min length 8 numbers, max 20 numbers, valid contact numbers will separated by semicolon." on Agent Group Details for mobile number

    Examples: 
      | Product | Role              |
      | BBPS    | Agent Institution |

  @sprint13 @epic-2825 @SP-3730 @SP_3730_TC_10
  Scenario Outline: verify add new function for AI with both contact and mail id valid field values of 120 char by OU login
    Given User is on LoginPage
    When Enter the UserNM "OU_User_New" and Pass "Test@1234" and click on LOGIN as "OU_User_New"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Agent Institution "Sarvatra"
    Then Enter Support Email ID "Abcdef@gmail.com;1bcdef@gmail.com;2bcdef@gmail.com;3bcdef@gmail.com;4bcdef@gmail.com;5bcdef@gmail.com;61abcdef@gmail.com"
    Then Enter Support Contact Number "9809809800;9809809800;9809809800;98098098009809809800;9809809800;98098098009809809800;9809809800;9809809800;980980980011"
    Then Click on save button

    Examples: 
      | Product | Role              |
      | BBPS    | Agent Institution |

  @sprint13 @epic-2825 @SP-3730 @SP_3730_TC_11
  Scenario Outline: verify add new function for AI with both contact and mail id invalid field values of more than 120 char by OU login
    Given User is on LoginPage
    When Enter the UserNM "OU_User_New" and Pass "Test@1234" and click on LOGIN as "OU_User_New"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Enter Support Email ID "11Abcdef@gmail.com;1bcdef@gmail.com;2bcdef@gmail.com;3bcdef@gmail.com;4bcdef@gmail.com;5bcdef@gmail.com;61abcdef@gmail.com"
    Then Enter Support Contact Number "90119809809800;9809809800;9809809800;98098098009809809800;9809809800;98098098009809809800;9809809800;9809809800;980980980011"
    Then Click on save button
    Then Verify Error msg displayed as "Invalid Email Address-> Valid emails:user@gmail.com or my.user@domain.com etc, Multiple Email Ids cannot exceed 120 chars long." on Agent Group Details
    Then Verify Error msg displayed as "min length 8 numbers, max 20 numbers, valid contact numbers will separated by semicolon." on Agent Group Details for mobile number

    Examples: 
      | Product | Role              |
      | BBPS    | Agent Institution |

  @sprint13 @epic-2825 @SP-3730 @SP_3730_TC_12
  Scenario Outline: verify add new function for AI with both contact and mail id invalid field values by OU login
    Given User is on LoginPage
    When Enter the UserNM "OU_User_New" and Pass "Test@1234" and click on LOGIN as "OU_User_New"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Enter Support Email ID "test@123.mailc"
    Then Enter Support Contact Number "9087&^54322"
    Then Click on save button
    Then Verify Error msg displayed as "Invalid Email Address-> Valid emails:user@gmail.com or my.user@domain.com etc, Multiple Email Ids cannot exceed 120 chars long." on Agent Group Details
    Then Verify Error msg displayed as "min length 8 numbers, max 20 numbers, valid contact numbers will separated by semicolon." on Agent Group Details for mobile number

    Examples: 
      | Product | Role              |
      | BBPS    | Agent Institution |
