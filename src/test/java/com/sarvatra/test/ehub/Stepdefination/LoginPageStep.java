package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep {

	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	private LoginPage loginPage = new LoginPage(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();

	Logger log = (Logger) LogManager.getLogger("LoginPageTest.java");

	/*
	 * ####################- Owner --> Mayur Kale -###########################
	 * 
	 */

//	@AfterStep
//	public void TakesScreeanShots(io.cucumber.java.Scenario result) throws Exception {
//		if(result.isFailed()==false){
//			TakesScreenshot ts=(TakesScreenshot)driver;
//			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//			result.attach(src, "image/png", "screenshot");
//		}
//	}

	@Given("User is on LoginPage")
	public void user_is_on_login_page() {
		log.info("User is on LoginPage: " + loginPage.loginPageTitle());
		Assert.assertEquals(loginPage.loginPageTitle(), "Sarvatra e-HUB");
	}

	@When("Enter the UserNM {string} and Pass {string} and click on LOGIN as {string}")
	public void enter_the_user_nm_and_pass_and_click_on_login(String string, String string2, String string3) {
		log.info("User successfully login - User is on Home Page");
		Assert.assertEquals(loginPage.userLogin(string, string2), string3);
	}
	
	
	@When("Enter the UserNM {string} and Pass {string} and click on LOGIN")
	public void invalidLoginCheck(String string, String string2) {
		log.info("User successfully login - User is on Home Page");
		loginPage.invalidUserLogin(string, string2);
	}

//	@Then("Check for valid error messages {string} {string}")
//	public void checkErrorMessage(String message1,String message2) {
//		log.info("User should not login when No/Wrong details passed from Login Screen");
//		loginPage.errorMessageValidationsbothBlank(message1,message2);
//	}
	@Then("Check for valid error messages for blank password {string}")
	public void checkErrorMessagePassword(String message1) {
		log.info("User should not login when No/Wrong details passed from Login Screen");
		loginPage.errorMessageValidationBlankPassword(message1);
	}

	@Then("Check for valid error messages for blank username {string}")
	public void checkErrorMessageUsername(String message1) {
		log.info("User should not login when No/Wrong details passed from Login Screen");
		loginPage.errorMessageValidationBlankUsername(message1);
	}

	@Then("Check for valid error messages for invalid username {string}")
	public void checkInvalidUsernameErrorMessage(String message1) {
		log.info("User should not login when No/Wrong details passed from Login Screen");
		loginPage.errorMessageValidationInvalidUsernamePassword(message1);
	}

	@Then("Check for valid error messages for invalid password {string}")
	public void checkInvalidPasswordErrorMessage(String message1) {
		log.info("User should not login when No/Wrong details passed from Login Screen");
		loginPage.errorMessageValidationInvalidUsernamePassword(message1);
	}

}