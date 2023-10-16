package com.sarvatra.test.ehub.Stepdefination;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.AddUserAgentPageObject;

import io.cucumber.java.en.Then;


/**
 * @author anand_tajne
 *
 */
public class AddUserAgentStep {

	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	public AddUserAgentPageObject userAgentPageObject = new AddUserAgentPageObject(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();
	Logger log = (Logger) LogManager.getLogger(AddUserAgentStep.class);

	@Then("Click on Add User Button")
	public void clickOnAddUserButton()  {
		log.info("Click on Add User Button : ");
		Assert.assertTrue(userAgentPageObject.clickOnAddUserButton(), "Sarvatra e-HUB");
	}

	@Then("Enter Login Id {string}")
	public void enterLoginId(String login_id)  {
		log.info("Enter Login Id : " + login_id);
		Assert.assertTrue(userAgentPageObject.enterLoginId(login_id), "Sarvatra e-HUB");
	}

	@Then("Enter Display Name {string}")
	public void enterDisplayName(String display_Name)  {
		log.info("Enter Display Name : " + display_Name);
		Assert.assertTrue(userAgentPageObject.enterDisplayName(display_Name), "Sarvatra e-HUB");
	}

	@Then("Enter Mobile Number for new admin user {string}")
	public void enterMobileNumber(String mobileNo)  {
		log.info("Enter Display Name : " + mobileNo);
		Assert.assertTrue(userAgentPageObject.enterMobileNumber(mobileNo), "Sarvatra e-HUB");
	}

	@Then("Enter Email {string}")
	public void enterEmail(String email_id)  {
		log.info("Enter Display Name : " + email_id);
		Assert.assertTrue(userAgentPageObject.enterEmail(email_id), "Sarvatra e-HUB");
	}

	@Then("Click on Active Dropdown and Select Value {string}")
	public void clickOnActiveDropdown(String value) throws InterruptedException {
		log.info("Click on Active Dropdown and Select Value : " + value);
		Assert.assertTrue(userAgentPageObject.clickOnActiveDropdown(value), "Sarvatra e-HUB");
	}

	@Then("Click on Admin Checkbox")
	public void clickOnAdminCheckbox()  {
		log.info("Click on Admin Checkbox");
		Assert.assertTrue(userAgentPageObject.clickOnAdminCheckbox(), "Sarvatra e-HUB");
	}
	
	@Then("Click on Default Permission for new admin user")
	public void clickOnDefaultPermission()  {
		log.info("Click on Default Permission for new admin user");
		Assert.assertTrue(userAgentPageObject.clickOnDefaultPermission(), "Sarvatra e-HUB");
	}
	
	@Then("Click on Save Button")
	public void clickOnSaveButton() throws InterruptedException {
		log.info("Click on Save Button");
		Assert.assertTrue(userAgentPageObject.clickOnSaveButton(), "Sarvatra e-HUB");
	}
}