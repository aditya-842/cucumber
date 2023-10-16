package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.AgentDetailsPage;
import io.cucumber.java.en.Then;

public class AgentDetailsStep {
	
	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	private AgentDetailsPage AgentDetails = new AgentDetailsPage(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();
	Logger log = (Logger) LogManager.getLogger(AddUserAgentStep.class);
	
	@Then("Select Agent On Agent Details Page {string}")
	public void select_Agent(String agent) throws InterruptedException {
		log.info("Select Agent On Agent Details Page");
		AgentDetails.select_Agent(agent);
		
	}

}
