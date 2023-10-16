Feature: BBPS Enhancement 12 - Addition of PaymentRef dropdown while creation of Channel

  @sprint10_2023 @epic-2825 @SP-9361 @SP_9361_TC_01 @SP_9361_TC_02 @SP_9361_TC_04 @SP_9361_TC_08
  Scenario: login as a Admin, Verify PaymentRef dropdown on Channel Management Details
    Given User is on LoginPage
    When Enter the UserNM "admin12" and Pass "Test@123" and click on LOGIN as "admin12"
    Then Click on Tiles On Home Page "Configurations" "Channels"
    Then Verify Header On Channel Management Page
    Then Click on Add Channel On Channel Management Page
    Then Enter Channel Name On Channel Management Page "bbps_channel"
    Then Select Product On Channel Management Page "BBPS"
    Then Select Agent Role On Channel Management Page "Agent"
    Then Verify PaymentRefId On Channel Management Page
    Then Verify PaymentRefId Dropdown Option On Channel Management Page "N"
    Then Click On PaymentRefId On Channel Management Page
    Then Verify PaymentRefId Dropdown Option On Channel Management Page "Y"
    Then Verify PaymentRefId Dropdown Option On Channel Management Page "N"
    Then Click On PaymentRefId Dropdown Option On Channel Management Page "Y"
    Then Select Entity On Channel Management Page "Saraspur Nagarik Coop Bank,Amraiwadi"
    Then Enter Password Name On Channel Management Page "Test@123"
    Then Select Validate Token Dropdown Option On Channel Management Page "Y"
    Then Enter OU ID On Channel Management Page "8"
    Then Enter BBPS AGENT REF ID On Channel Management Page "523"
		#Then Click on Save On Channel Management Page
		
  @sprint10_2023 @epic-2825 @SP-9361 @SP_9361_TC_05
  Scenario: login as a Admin, Verify user is able to craete channel for PaymentRef = false option
    Given User is on LoginPage
    When Enter the UserNM "admin12" and Pass "Test@123" and click on LOGIN as "admin12"
    Then Click on Tiles On Home Page "Configurations" "Channels"
    Then Verify Header On Channel Management Page
    Then Click on Add Channel On Channel Management Page
    Then Enter Channel Name On Channel Management Page "bbps_channel"
    Then Select Product On Channel Management Page "BBPS"
    Then Select Agent Role On Channel Management Page "Agent"
    Then Verify PaymentRefId On Channel Management Page
    Then Click On PaymentRefId On Channel Management Page
    Then Verify PaymentRefId Dropdown Option On Channel Management Page "Y"
    Then Verify PaymentRefId Dropdown Option On Channel Management Page "N"
    Then Click On PaymentRefId Dropdown Option On Channel Management Page "N"
    Then Select Entity On Channel Management Page "Saraspur Nagarik Coop Bank,Amraiwadi"
    Then Enter Password Name On Channel Management Page "Test@123"
    Then Select Validate Token Dropdown Option On Channel Management Page "Y"
    Then Enter OU ID On Channel Management Page "8"
    Then Enter BBPS AGENT REF ID On Channel Management Page "523"
    #Then Click on Save On Channel Management Page

  @sprint10_2023 @epic-2825 @SP-9361 @SP_9361_TC_09
  Scenario: login as a Admin, Verify for existing channel should be available payment ref id dropdown
    Given User is on LoginPage
    When Enter the UserNM "admin12" and Pass "Test@123" and click on LOGIN as "admin12"
    Then Click on Tiles On Home Page "Configurations" "Channels"
    Then Verify Header On Channel Management Page
    Then Click On 1st Row From Channel Table On Channel Management Page
    Then Verify PaymentRefId On Channel Management Page

  @sprint10_2023 @epic-2825 @SP-9361 @SP_9361_TC_11
  Scenario: login as a Admin, Verify payment ref id dropdown should not be available other than bbps agent.
    Given User is on LoginPage
    When Enter the UserNM "admin12" and Pass "Test@123" and click on LOGIN as "admin12"
    Then Click on Tiles On Home Page "Configurations" "Channels"
    Then Verify Header On Channel Management Page
    Then Click on Add Channel On Channel Management Page
    Then Enter Channel Name On Channel Management Page "bbps_channel"
    Then Select Product On Channel Management Page "BBPS"
    Then Select ProductRole On Channel Management Page "Agent"
    Then Verify PaymentRefId Not Available On Channel Management Page

  @sprint10_2023 @epic-2825 @SP-9361 @SP_9361_TC_12
  Scenario: login as a Admin, Verify user should be able to create channel apart from bbps agent.
    Given User is on LoginPage
    When Enter the UserNM "admin12" and Pass "Test@123" and click on LOGIN as "admin12"
    Then Click on Tiles On Home Page "Configurations" "Channels"
    Then Verify Header On Channel Management Page
    Then Click on Add Channel On Channel Management Page
    Then Enter Channel Name On Channel Management Page "bbps_AIchannel"
    Then Select Product On Channel Management Page "BBPS"
    Then Select Agent Role On Channel Management Page "Agent"
    Then Select Entity On Channel Management Page "Adinath COOP Bank"
    Then Enter Password Name On Channel Management Page "Test@123"
    Then Select Validate Token Dropdown Option On Channel Management Page "Y"
    Then Enter OU ID On Channel Management Page "8"
    Then Enter BBPS AGENT REF ID On Channel Management Page "523"
    #Then Click on Save On Channel Management Page
