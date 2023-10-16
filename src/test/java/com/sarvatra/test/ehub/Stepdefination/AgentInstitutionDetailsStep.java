package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import static org.testng.Assert.assertTrue;
import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.AddUserAgentPageObject;
import com.sarvatra.test.ehub.pageobjects.AgentGroupDetailsPageObject;
import com.sarvatra.test.ehub.pageobjects.AgentInstitutionDetailsPageObject;

import io.cucumber.java.en.Then;

public class AgentInstitutionDetailsStep {

	
	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	public AgentInstitutionDetailsPageObject AgentInstitutionPageObject = new AgentInstitutionDetailsPageObject(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();
	Logger log = (Logger) LogManager.getLogger(AddUserAgentStep.class);
	
	// ########################### Divija Jagdale ###############################
	
	
	@Then("Verify Support Email ID displayed on Agent Institution")
	public void VerifyS_upport_Email_ID_displayed_on_Agent_nstitution() {
		log.info("Verify Support Email ID displayed on Agent Institution");
		Assert.assertTrue(AgentInstitutionPageObject.Support_Email_ID_Displays());
	}

	@Then("Verify Support Contact Number displayed  on Agent Institution")
	public void Verify_Support_Contact_Number_displayed_on_Agent_Institution() {
		log.info("Verify Support Contact Number displayed  on Agent Institution");
		Assert.assertTrue(AgentInstitutionPageObject.Support_contact_Number_Displays());
	}
	
	@Then("Select Acquiring Bank on Agent Institution {string}")
	public void Select_Acquiring_Bank_On_Agent_Institution(String Bank) throws InterruptedException {
		log.info("Select Acquiring Bank on Agent Institution");
		AgentInstitutionPageObject.Select_Acquiring_Bank(Bank);;
	}
	
	@Then("Click On Save on Agent Institution")
	public void Click_On_Save_on_Agent_Institution() throws InterruptedException {
		log.info("Click On Save on Agent Institution");
		AgentInstitutionPageObject.Click_On_Save_on_Agent_Institution();;
	}
	
	@Then("Select Institution For Institution Map {string}")
	public void Select_Institution_For_institution_Map(String Institution) throws InterruptedException {
		log.info("Select Institution For Institution Map");
		AgentInstitutionPageObject.Select_Institution_For_institution_Map(Institution);;
	}
	
	@Then("Enter MID Prifix On Assign Institution Page {string}")
	public void Enter_MID_Prifix_On_Assign_Institution_Page(String MID) throws InterruptedException {
		log.info("Enter MID Prifix On Assign Institution Page");
		AgentInstitutionPageObject.Enter_MID_Prifix_On_Assign_Institution_Page(MID);;
	}
	
	@Then("Select Select head Office State {string}")
	public void Select_Head_Office_State(String state) throws InterruptedException {
		log.info("Select Select head Office State");
		AgentInstitutionPageObject.Select_Head_Office_State(state);;
	}
	
	@Then("Enter GSTNumber On Assign Institution Page {string}")
	public void Enter_GSTNumber_On_Assign_Institution_Page(String GSTNumber) throws InterruptedException {
		log.info("Enter GSTNumber On Assign Institution Page");
		AgentInstitutionPageObject.Enter_GSTNumber_On_Assign_Institution_Page(GSTNumber);;
	}
	
	@Then("Click On Next on Assign Institution Page")
	public void Click_On_Next_Assign_Institution_Page() throws InterruptedException {
		log.info("Click On Next on Assign Institution Page");
		AgentInstitutionPageObject.Click_On_Next_Assign_Institution_Page();;
	}
	
	@Then("Click On Save on Assign Institution Page")
	public void Click_On_Save_Assign_Institution_Page() throws InterruptedException {
		log.info("Click On Save on Assign Institution Page");
		AgentInstitutionPageObject.Click_On_Save_Assign_Institution_Page();;
	}

}
