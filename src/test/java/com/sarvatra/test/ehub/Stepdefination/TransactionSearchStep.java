package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.TransactionSearchPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

/**
 * @author anand_tajne
 *
 */
public class TransactionSearchStep {

	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	public TransactionSearchPageObject transactionSearchPageObject = new TransactionSearchPageObject(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();
	Logger log = (Logger) LogManager.getLogger(TransactionSearchStep.class);

	@Given("Click on transaction search Icon")
	public void clickTransactionHistoryIcon() {
		log.info("Click on Transaction Search Icon");
		Assert.assertTrue(transactionSearchPageObject.clickOnTransactionSearchIcon(), "Sarvatra e-HUB");
	}

	@Then("Select Radio Button Transaction")
	public void clickOnTransactionRadioButton() throws InterruptedException {
		log.info("Select Radio Button Transaction : ");
		Assert.assertTrue(transactionSearchPageObject.clickOnTransactionRadioButton(), "Sarvatra e-HUB");
	}
	
	@Then("Enter TransactionId {string}")
	public void clickOnComplaintType(String txnId) throws InterruptedException {
		log.info("Snter TransactionId : " + txnId);
		Assert.assertTrue(transactionSearchPageObject.enterTransactionID(txnId), "Sarvatra e-HUB");
	}
	
	@Then("Click on Proceed Button")
	public void click_on_proceed_button() {
		log.info("Click on Proceed Button : ");
		Assert.assertTrue(transactionSearchPageObject.clickOnProceedButton(), "Sarvatra e-HUB");
	}
	
	@Then("Click on Print Icon")
	public void clickOnPrintIcon() {
		log.info("Click on Print Icon : ");
		Assert.assertTrue(transactionSearchPageObject.clickOnPrintIcon(), "Sarvatra e-HUB");
	}
	
	@Then("Viery Print Icon On Transaction Search Page")
	public void clickOnPrintIcon_Transaction_Search_Page() {
		log.info("Viery Print Icon On Transaction Search Page");
		Assert.assertTrue(transactionSearchPageObject.Verify_OnPrintIcon(), "Sarvatra e-HUB");
	}
}
