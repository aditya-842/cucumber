package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.SystemConfigPage;
import com.sarvatra.test.ehub.pageobjects.ViewEntityDetailsPage;
import com.sarvatra.test.ehub.pageobjects.ViewEntityDetails_AddNewPage;

import io.cucumber.java.en.Then;

public class SystemConfigStep {

	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();
	private SystemConfigPage sysConfig = new SystemConfigPage(DriverFactory.driver);

	Logger log = (Logger) LogManager.getLogger("LoginPageTest.java");

	@Then("Search {string} in search box")
	public void searchFor(String key) throws InterruptedException {
		log.info("Search in search box");
		Assert.assertTrue(sysConfig.searchFor(key));
	}
	
	@Then("Click on edit icon")
	public void ClickOnEdit() throws InterruptedException {
		log.info("Click on edit icon");
		Assert.assertTrue(sysConfig.editClick());
	}
	
	@Then("Change the System config value to {string}")
	public void changeSysConfig(String value) throws InterruptedException {
		log.info("Change the System config value to");
		Assert.assertTrue(sysConfig.changeSysConfigValue(value));
	}
	
	@Then("Click on Save button on config details window")
	public void clickOnSave() throws InterruptedException {
		log.info("Click on Save button on config details window");
		Assert.assertTrue(sysConfig.clickSaveButton());
	}
	
	@Then("Click on Add config")
	public void clickOnAddConfig() throws InterruptedException {
		log.info("Click on Add config");
		Assert.assertTrue(sysConfig.addConfig());
	}
	
	@Then("Click on delete icon")
	public void clickOnDelete() throws InterruptedException {
		log.info("Click on delete icon");
		Assert.assertTrue(sysConfig.clickOnDelete());
	}
	
	@Then("Enter parameter id as {string} and value as {string}")
	public void enterSystemConfigIdAndValue(String id, String value) throws InterruptedException {
		log.info("Enter parameter id and value)");
		Assert.assertTrue(sysConfig.enterIdAndValue(id, value));
	}
}
