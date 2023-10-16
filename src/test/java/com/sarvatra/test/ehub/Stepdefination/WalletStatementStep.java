package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.WalletStatementPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


/**
 * @author anand_tajne
 *
 */
public class WalletStatementStep {

	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	public WalletStatementPageObject walletStatementPageObject = new WalletStatementPageObject(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();
	Logger log = (Logger) LogManager.getLogger(WalletStatementStep.class);

	@Given("Click on Wallet Statement Icon")
	public void clickOnTWalletStatementIcon() {
		log.info("Click on Wallet Statement Icon");
		Assert.assertTrue(walletStatementPageObject.clickOnTWalletStatementIcon(), "Sarvatra e-HUB");
	}

	@Then("Select From date {string} {string} {string}")
	public void select_from_date(String day, String month, String year) throws InterruptedException {
		log.info("Click on Wallet Statement Icon");
		Assert.assertTrue(walletStatementPageObject.clickOnTStartDateCalenderIcon(day,month,year), "Sarvatra e-HUB");
	}
	
	@Then("Click on Submit button")
	public void clickOnSubmitButton() throws InterruptedException {
		log.info("Click on Submit button : ");
		Assert.assertTrue(walletStatementPageObject.clickOnSubmitButton(), "Sarvatra e-HUB");
	}
	
	@Then("Click on Download button")
	public void clickOnDownloadtButton() throws InterruptedException {
		log.info("Click on Download button : ");
		Assert.assertTrue(walletStatementPageObject.clickOnDownloadtButton(), "Sarvatra e-HUB");
	}
	
	@Then("Verify {string} MSG On Wallet Statement Page")
	public void VerifyWalletfetchedMSg(String MSG) throws InterruptedException {
		log.info("Click on Download button : ");
		Assert.assertTrue(walletStatementPageObject.VerifyWalletfetchedMSg(MSG), "Sarvatra e-HUB");
	}
	
}
