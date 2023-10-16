package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.ChangePasswordPage;
import com.sarvatra.test.ehub.pageobjects.HomePage;

import io.cucumber.java.en.Then;

public class ChangePasswordStep {
	
	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	private ChangePasswordPage changePasswordPage = new ChangePasswordPage(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();

	Logger log = (Logger) LogManager.getLogger("LoginPageTest.java");

	/*
	 * ####################- Owner --> Vivek Nichal -###########################
	 * 
	 */
	
	@Then("Enter Current Password {string}")
	public void enterCurrentPassword(String Currentpassword) {
		log.info("Enter Current Password");
		Assert.assertTrue(changePasswordPage.enterCurrentPassword(Currentpassword), "Electricity");
	}
	
	@Then("Enter New Password {string}")
	public void enterNewPassword(String Newpassword) {
		log.info("Enter New Password");
		Assert.assertTrue(changePasswordPage.enterNewPassword(Newpassword), "Electricity");
	}
	
	@Then("Enter Confirm Password {string}")
	public void enterConfirmPassword(String Confirmpassword) {
		log.info("Enter Confirm Password");
		Assert.assertTrue(changePasswordPage.enterConfirmPassword(Confirmpassword), "Electricity");
	}
	
	@Then("Click on Change button")
	public void clickOnChangeButton() throws InterruptedException {
		log.info("Click on Change Button");
		changePasswordPage.Click_on_ChangeButton();
	}
	
	@Then("Verify Old Password invaild error message")
	public void verifyOldPasswordInvaildErrorMessage() throws InterruptedException {
		log.info("Verify Old Password invaild error message");
		Assert.assertTrue(changePasswordPage.verifyInvalid_Old_Password_Error_message(), "Electricity");
	}
	
	@Then("Verify Password not match error message")
	public void verifyPasswordNotMatchErrorMessage() throws InterruptedException {
		log.info("Verify Password not match error message");
		Assert.assertTrue(changePasswordPage.verifyPasswordDoesntMatch_Error_message(), "Electricity");
	}
	
	@Then("Verify Required basic error message")
	public void verifyRequiredBasicErrorMessage() throws InterruptedException {
		log.info("Verify Required basic error message");
		Assert.assertTrue(changePasswordPage.verifyBasicErrorMessage(), "Electricity");
	}
	
	@Then("Verify blank error message for current password")
	public void verifyBlankErrorMessageForCurrentPassword() throws InterruptedException {
		log.info("Verify blank error message for current password");
		Assert.assertTrue(changePasswordPage.verifyOldPasswordRequiredErrorMessage());
	}
	
	@Then("Verify blank error message for New password")
	public void verifyBlankErrorMessageForNewPassword() throws InterruptedException {
		log.info("Verify blank error message for New password");
		Assert.assertTrue(changePasswordPage.verifyNewPasswordRequiredErrorMessage());
	}
	
	@Then("Click on change password page back button")
	public void clickOnChangePasswordPageBackButton() throws InterruptedException {
		log.info("Click on change password page back button");
		changePasswordPage.Click_on_BackButton();
	}



}
