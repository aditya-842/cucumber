package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.TransactionHistoryPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

/**
 * @author anand_tajne
 *
 */
public class TransactionHistoryStep {

	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	public TransactionHistoryPageObject transactionHistoryPageObject = new TransactionHistoryPageObject(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();

	Logger log = (Logger) LogManager.getLogger(TransactionHistoryStep.class);
	
	@Given("Click on Transaction History Icon")
	public void clickTransactionHistoryIcon() {
		log.info("Click on Transaction History Icon");
		Assert.assertTrue(transactionHistoryPageObject.clickTransactionHistoryIcon(), "Sarvatra e-HUB");
	}
	
	@Then("Select Agent {string}")
	public void selectAgent(String agent) throws InterruptedException {
		log.info("Select Agent: " + agent);
		Assert.assertTrue(transactionHistoryPageObject.selectAgent(agent), "Sarvatra e-HUB");
	}
	
	@Then("Select User {string}")
	public void selectUser(String user) throws InterruptedException {
		log.info("Select User : " + user);
		Assert.assertTrue(transactionHistoryPageObject.selectUser(user), "Sarvatra e-HUB");
	}
	
	@Then("Select Duration {string}") 
	public void selectDuration(String durationTime) throws InterruptedException {
		log.info("Select Duration: " + durationTime);
		Assert.assertTrue(transactionHistoryPageObject.clickOnSearchDurationDropdown(durationTime), "Sarvatra e-HUB");
	}
	
	@Then("Select Search Parameter {string}") 
	public void SearchParameter(String customerMobile) throws InterruptedException {
		log.info("Select Search Parameter : " + customerMobile);
		Assert.assertTrue(transactionHistoryPageObject.clickOnSearchParameterDropdown(customerMobile), "Sarvatra e-HUB");
	}
	
	@Then("Enter Customer Mobile Number for Search Parameter {string}") 
	public void enterMobileNumber(String customerMobileNo) throws InterruptedException {
		log.info("Enter Customer Mobile Number for Search Parameter : " + customerMobileNo);
		Assert.assertTrue(transactionHistoryPageObject.enterCustomerMobileNO(customerMobileNo), "Sarvatra e-HUB");
	}
	
	@Then("Click on Search Button") 
	public void clickSearchButton() {
		log.info("click on search button : ");
		Assert.assertTrue(transactionHistoryPageObject.clickOnSearchButton(), "Sarvatra e-HUB");
	}
}
