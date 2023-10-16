package com.sarvatra.test.ehub.Stepdefination;

import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;

import com.sarvatra.test.ehub.pageobjects.AgentGroupDetailsPageObject;

import io.cucumber.java.en.Then;

public class AgentGroupDetailsStep {
	
	
	

	// ########################### Divija Jagdale ###############################
	
	
	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	private AgentGroupDetailsPageObject AgentGroupDetailsPageObject = new AgentGroupDetailsPageObject(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();
	Logger log = (Logger) LogManager.getLogger(AddUserAgentStep.class);

	
	@Then("Select AgentGroup {string}")
	public void selectAgentGroup(String agentGroup) throws InterruptedException {
		log.info("Selecting agent group ");
		AgentGroupDetailsPageObject.selectAgentGroup(agentGroup);
		
	}
	
	@Then("Select Agent Institution {string}")
	public void selectAgentInstitution(String agentInstitution) throws InterruptedException {
		log.info("Selecting Agent Institution ");
		AgentGroupDetailsPageObject.selectAgentInstitution(agentInstitution);
		
	}
	
	@Then("Select Agent Institution {string} via AgentInstitution" )
	public void selectAgentInstitutionviaAgentInstitution(String agentInstitution) throws InterruptedException {
		log.info("Selecting Agent Institution ");
		AgentGroupDetailsPageObject.selectAgentInstitutionviaAgentInstitution(agentInstitution);
		
	}
	
	@Then("Click on save button")
	public void click_save() {
		log.info("Click on save button");
		Assert.assertTrue(AgentGroupDetailsPageObject.clickSave());
	}
	

	@Then("Enter Support Email ID {string}")
	public void enter_support_Email_ID(String string) {
		log.info("Enter Support Email ID <" + string + "> ");
//		cf.waitforSometime(1200);
		Assert.assertTrue(AgentGroupDetailsPageObject.enterSupportEmailID(string));
	}
	
	

	@Then("Enter Support Contact Number {string}")
	public void enter_support_Contact_Number(String string) {
		log.info("Enter Support Email ID <" + string + "> ");
//		cf.waitforSometime(1200);
		Assert.assertTrue(AgentGroupDetailsPageObject.enterSupportContactNumber(string));
	}
	

	@Then("Verify Error msg displayed as {string} on Agent Group Details")
	public void Error_msg_displayed_on_Agent_Group_Details(String string) {
		log.info("Verify Error msg displayed as on Agent Group Details");
		Assert.assertEquals(AgentGroupDetailsPageObject.ErrorMessageforSubmitEMailID(), string);
	}
   
	@Then("Verify Error msg displayed as {string} on Agent Group Details for mobile number")
	public void Error_msg_displayed_on_Agent_Group_Details_for_mobile_number(String string) {
		log.info("Verify Error msg displayed as on Agent Group Details");
		Assert.assertEquals(AgentGroupDetailsPageObject.ErrorMessageforContactNumber(), string);
	}
	
	@Then("Verify Agent Group Details Header")
	public void verify_Agent_Group_Details_Header() {
		log.info("Verify Agent Group Details Header");
		Assert.assertTrue(AgentGroupDetailsPageObject.verify_Agent_Group_Details_Header());
	}
	
	@Then("Click On Agent Group Dropdown On Agent Group Details")
	public void Click_On_Agent_Group_Dropdown_On_Agent_Group_Details() {
		log.info("Click On Agent Group Dropdown On Agent Group Details");
		AgentGroupDetailsPageObject.Click_On_Agent_Group_Dropdown_On_Agent_Group_Details();
	}
	
	@Then("Verify Agent Group Option In Dropdown On Agent Group Details {string}")
	public void verify_Agent_Group_Option_In_Dropdown_On_Agent_Group_Details(String Option) {
		log.info("Verify Agent Group Option In Dropdown On Agent Group Details");
		Assert.assertTrue(AgentGroupDetailsPageObject.verify_Agent_Group_Option_In_Dropdown_On_Agent_Group_Details(Option));
	}


}
