package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.PasswordResetHelper;

import io.cucumber.java.en.Then;

public class PasswordResetHelperStep {
	
	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	public PasswordResetHelper PasswordReset = new PasswordResetHelper(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();

	Logger log = (Logger) LogManager.getLogger("PayBillCategory.java");

	/*
	 * ####################- Owner --> Vivek Nichal -###########################
	 * 
	 */
	
	@Then("Set Default Password For {string}")
	public void resetPassword(String User)  {
		log.info("Set Default Password For");
		PasswordReset.resetPassword(User);
	}

}
