Feature: Addition of fields while AG registration

  @sprint12 @epic-2825 @SP-3183 @SP_3183_BBPS_001
  Scenario Outline: login as a admin, when user click on ADD new user navigate Agent Institution details page.
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Click on logout button

    Examples: 
      | Product | Role              |
      | BBPS    | Agent Institution |

  @sprint12 @epic-2825 @SP-3183 @SP_3183_BBPS_003
  Scenario Outline: login as a admin, when user click on ADD new user navigate Agent Institution details page.
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Verify Support Email ID displayed on Agent Institution
    Then Verify Support Contact Number displayed  on Agent Institution
    Then Click on logout button

    Examples: 
      | Product | Role              |
      | BBPS    | Agent Institution |

  @sprint12 @epic-2825 @SP-3183 @SP_3183_BBPS_004
  Scenario Outline: login as a admin, when user click on ADD new user navigate Agent Institution details page.
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Agent Institution "Sarvatra - DN12" via AgentInstitution
    Then Enter Support Email ID "Abcdefh@gmail.com"
    Then Enter Support Contact Number "9803409800"
    Then Click on save button

    Examples: 
      | Product | Role              |
      | BBPS    | Agent Institution |

  @sprint12 @epic-2825 @SP-3183 @SP_3183_BBPS_005
  Scenario Outline: login as a admin, when user click on ADD new user navigate Agent Institution details page.
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Agent Institution "Sarvatra - DN12" via AgentInstitution
    Then Enter Support Email ID "test@123.mailc"
    Then Enter Support Contact Number "98098098090"
    Then Click on save button

    Examples: 
      | Product | Role              |
      | BBPS    | Agent Institution |

  @sprint12 @epic-2825 @SP-3183 @SP_3183_BBPS_006 @SP_3183_BBPS_007
  Scenario Outline: login as a OU User, when user click on ADD new user navigate Agent Institution details page.
    Given User is on LoginPage
    When Enter the UserNM "OU_User_New" and Pass "Test@1234" and click on LOGIN as "OU_User_New"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up

    Examples: 
      | Product | Role              |
      | BBPS    | Agent Institution |

  @sprint12 @epic-2825 @SP-3183 @SP_3183_BBPS_008
  Scenario Outline: login as a OU User, when user click on ADD new user navigate Agent Institution details page.
    Given User is on LoginPage
    When Enter the UserNM "OU_User_New" and Pass "Test@1234" and click on LOGIN as "OU_User_New"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Verify Support Email ID displayed on Agent Institution
    Then Verify Support Contact Number displayed  on Agent Institution
    Then Click on logout button

    Examples: 
      | Product | Role              |
      | BBPS    | Agent Institution |

  @sprint12 @epic-2825 @SP-3183 @SP_3183_BBPS_009
  Scenario Outline: login as a OU User, when user click on ADD new user navigate Agent Institution details page.
    Given User is on LoginPage
    When Enter the UserNM "OU_User_New" and Pass "Test@1234" and click on LOGIN as "OU_User_New"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Agent Institution "Kadi Nagrik bank - 187" via AgentInstitution
    Then Enter Support Email ID "Abcde@gmail.com"
    Then Enter Support Contact Number "9812309800"
    Then Click on save button
    Then Click on logout button

    Examples: 
      | Product | Role              |
      | BBPS    | Agent Institution |

  @sprint12 @epic-2825 @SP-3183 @SP_3183_BBPS_010
  Scenario Outline: login as a admin, when user click on ADD new user navigate Agent Institution details page.
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Agent Institution "- 12" via AgentInstitution
    Then Enter Support Email ID "test@123.mailc"
    Then Enter Support Contact Number "98098098090"
    Then Click on save button

    Examples: 
      | Product | Role              |
      | BBPS    | Agent Institution |

  @sprint12 @epic-2825 @SP-3183 @SP_3183_BBPS_011
  Scenario Outline: login as a admin and verify user can save with valid email.
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Agent Institution "Sarvatra - DN12" via AgentInstitution
    Then Enter Support Email ID "Abcdeg@gmail.com"
    Then Enter Support Contact Number "9812309123"
    Then Click on save button

    Examples: 
      | Product | Role              |
      | BBPS    | Agent Institution |

  @sprint12 @epic-2825 @SP-3183 @SP_3183_BBPS_012
  Scenario Outline: login as a admin, when user click on ADD new user navigate Agent Institution details page.
    Given User is on LoginPage
    When Enter the UserNM "OU_User_New" and Pass "Test@1234" and click on LOGIN as "OU_User_New"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Agent Institution "Adinath COOP Bank - 439" via AgentInstitution
    Then Enter Support Email ID "Abcdeg@gmail.com"
    Then Enter Support Contact Number "9812309123"
    Then Click on save button

    Examples: 
      | Product | Role              |
      | BBPS    | Agent Institution |

  @sprint12 @epic-2825 @SP-3183 @SP_3183_BBPS_013
  Scenario Outline: login as a admin, when user click on ADD new user navigate Agent Institution details page.
    Given User is on LoginPage
    When Enter the UserNM "OU_User_New" and Pass "Test@1234" and click on LOGIN as "OU_User_New"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Agent Institution "Manglore Catholic - 429" via AgentInstitution
    Then Enter Support Email ID "test@mail.com;testing@mail.com;test123@mail.com"
    Then Click on save button

    Examples: 
      | Product | Role              |
      | BBPS    | Agent Institution |

  @sprint12 @epic-2825 @SP-3183 @SP_3183_BBPS_014
  Scenario Outline: login as a admin, when user click on ADD new user navigate Agent Institution details page.
    Given User is on LoginPage
    When Enter the UserNM "OU_User_New" and Pass "Test@1234" and click on LOGIN as "OU_User_New"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Agent Institution "Sarvatra - DN21" via AgentInstitution
    Then Enter Support Contact Number "9087654321;9087654322;9087622321"
    Then Click on save button

    Examples: 
      | Product | Role              |
      | BBPS    | Agent Institution |

  @sprint12 @epic-2825 @SP-3183 @SP_3183_BBPS_015
  Scenario Outline: login as a admin, when user click on ADD new user navigate Agent Institution details page.
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Agent Institution "- 123" via AgentInstitution
    Then Enter Support Email ID "test@mail.com;testing@mail.com;test123@mail.com"
    Then Click on save button

    Examples: 
      | Product | Role              |
      | BBPS    | Agent Institution |

  @sprint12 @epic-2825 @SP-3183 @SP_3183_BBPS_016
  Scenario Outline: login as a admin, when user click on ADD new user navigate Agent Institution details page.
    Given User is on LoginPage
    When Enter the UserNM "Admin_12" and Pass "Test@123" and click on LOGIN as "Admin_12"
    When Click on Entities in Configurations Menu
    Then Click on ADD NEW button in Child entity section
    Then Select the "<Product>" and Product "<Role>" from the dropdown list
    Then Click on Next button on Assign Product Role Pop-Up
    Then Select Agent Institution "- 123" via AgentInstitution
    Then Enter Support Email ID "9087654321;9087654322;9087622321"
    Then Click on save button

    Examples: 
      | Product | Role              |
      | BBPS    | Agent Institution |
