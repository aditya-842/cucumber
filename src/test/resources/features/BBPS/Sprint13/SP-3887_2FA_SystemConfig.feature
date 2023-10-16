Feature: 2FA - QA of System Configuration for enable/disable 2FA login for EHUB entities

  #we are using different url for this story - OTP vm url added in config file
  #pre-cond is loginOtpRequired key not present in system config
  @sprint13 @epic-3887 @SP_3887_TC_04
  Scenario: Verify OTP enabled/Disabled when system configuration for loginOtpRequired missing in system config - verify user on dashboard page after login
  Given User is on LoginPage
  When Enter the UserNM "hgsAdmin" and Pass "Test@123" and click on LOGIN as "hgsAdmin"
  Then Verify user is on dashborad page
  
  @sprint13 @epic-3887 @SP_3887_TC_06
  Scenario: Verify OTP enabled/Disabled when systemConfig key is invalid - Add/Update loginOtpRequired1 in systemConfig as false
  Given User is on LoginPage
  When Enter the UserNM "hgsAdmin" and Pass "Test@123" and click on LOGIN as "hgsAdmin"
  Then Click on system config
  Then Click on Add config
  Then Enter parameter id as "loginOtpRequired1" and value as "true"
  Then Click on Save button on config details window
  
  @sprint13 @epic-3887 @SP_3887_TC_06
  Scenario: Verify OTP enabled/Disabled when systemConfig is false - verify user on dashboard page after login and delete invaliid system config
  Given User is on LoginPage
  When Enter the UserNM "hgsAdmin" and Pass "Test@123" and click on LOGIN as "hgsAdmin"
  Then Verify user is on dashborad page
  Then Click on system config
  Then Search "loginOtpRequired1" in search box
  Then Click on delete icon
  Then Click on yes button
  
  @sprint13 @epic-3887 @SP_3887_TC_02
  Scenario: Verify OTP enabled/Disabled when systemConfig is false - Add and Update loginOtpRequired in systemConfig as false
    Given User is on LoginPage
    When Enter the UserNM "hgsAdmin" and Pass "Test@123" and click on LOGIN as "hgsAdmin"
    Then Click on system config
    Then Click on Add config
    Then Enter parameter id as "loginOtpRequired" and value as "false"
    Then Click on Save button on config details window

  @sprint13 @epic-3887 @SP_3887_TC_02
  Scenario: Verify OTP enabled/Disabled when systemConfig is false - verify user on dashboard page after login
    Given User is on LoginPage
    When Enter the UserNM "hgsAdmin" and Pass "Test@123" and click on LOGIN as "hgsAdmin"
    Then Verify user is on dashborad page

  @sprint13 @epic-3887 @SP_3887_TC_03
  Scenario: Verify OTP enabled/Disabled when systemConfig is alpha value - Update systemConfig value as xyz
    Given User is on LoginPage
    When Enter the UserNM "hgsAdmin" and Pass "Test@123" and click on LOGIN as "hgsAdmin"
    Then Click on system config
    Then Search "loginOtpRequired" in search box
    Then Click on edit icon
    Then Change the System config value to "xyz"
    Then Click on Save button on config details window

  @sprint13 @epic-3887 @SP_3887_TC_03
  Scenario: Verify OTP enabled/Disabled when systemConfig is alpha value - verify user on dashboard page after login
    Given User is on LoginPage
    When Enter the UserNM "hgsAdmin" and Pass "Test@123" and click on LOGIN as "hgsAdmin"
    Then Verify user is on dashborad page

  @sprint13 @epic-3887 @SP_3887_TC_05
  Scenario: Verify OTP enabled/Disabled when systemConfig is special char - Update systemConfig value as special char
    Given User is on LoginPage
    When Enter the UserNM "hgsAdmin" and Pass "Test@123" and click on LOGIN as "hgsAdmin"
    Then Click on system config
    Then Search "loginOtpRequired" in search box
    Then Click on edit icon
    Then Change the System config value to "!@#"
    Then Click on Save button on config details window

  @sprint13 @epic-3887 @SP_3887_TC_05
  Scenario: Verify OTP enabled/Disabled when systemConfig is special char - verify user on dashboard page after login
    Given User is on LoginPage
    When Enter the UserNM "hgsAdmin" and Pass "Test@123" and click on LOGIN as "hgsAdmin"
    Then Verify user is on dashborad page

  @sprint13 @epic-3887 @SP_3887_TC_01
  Scenario: Verify OTP enabled/Disabled when systemConfig is true - Update systemConfig value as true
    Given User is on LoginPage
    When Enter the UserNM "hgsAdmin" and Pass "Test@123" and click on LOGIN as "hgsAdmin"
    Then Click on system config
    Then Search "loginOtpRequired" in search box
    Then Click on edit icon
    Then Change the System config value to "true"
    Then Click on Save button on config details window

  @sprint13 @epic-3887 @SP_3887_TC_01 @SP_3887_TC_07 @SP_3887_TC_08 @SP_3887_TC_09 @SP_3887_TC_10
  Scenario Outline: Verify OTP enabled/Disabled when systemConfig is true - verify admin user is on OTP page
    Given User is on LoginPage
    When Enter the UserNM "<Name>" and Pass "Test@123" and click on LOGIN as "<DisplayName>"
    Then Verify user is on OTP page
   
   Examples: 
      |Name                      |DisplayName               |
      |hgsAdmin                  |hgsAdmin                  |
      |miniatm_corporate_bc_user |miniatm_corporate_bc_user |
      |NSDL_user                 |NSDL_user                 |
      |channel_783               |Channel User              |
    
     
