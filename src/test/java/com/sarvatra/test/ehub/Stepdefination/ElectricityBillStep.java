package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.ElecticityBillPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ElectricityBillStep {

	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	public ElecticityBillPage electricityBillPage = new ElecticityBillPage(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();

	Logger log = (Logger) LogManager.getLogger(ElectricityBillStep.class);

	/*
	 * ####################- Owner --> Vivek Nichal -###########################
	 * 
	 */

	@Then("Select Electricity Icon")
	public void selectElectricityBill() {
		log.info("Select Electricity Icon category");
		Assert.assertTrue(electricityBillPage.selectElectricityBill(), "Electricity");
	}

	@Then("Select Biller or provider {string}")
	public void SelectBillerOrProvider(String Biller) {
		log.info("Select Biller or provider");
		Assert.assertTrue(electricityBillPage.selectBillerOrProvider(Biller), "Electricity");
	}

	@Then("Enter Consumer Number {string}")
	public void enterConsumerNumber(String ConsumerNumber) {
		log.info("Enter Consumer Number ");
		Assert.assertTrue(electricityBillPage.enterConsumerNumber(ConsumerNumber), "Sarvatra e-HUB");
	}

	@Then("Enter Payer Mobile Number {string}")
	public void enterPayerMobileNumber(String MobileNumber) {
		log.info("Enter Payer Mobile Number ");
		Assert.assertTrue(electricityBillPage.enterMobileNumber(MobileNumber), "Sarvatra e-HUB");
	}

	@Then("Click on Fetch Bill button")
	public void clickOnFetchBillButton() {
		log.info("Click on Fetch Bill button ");
		Assert.assertTrue(electricityBillPage.clickOnFetchBillButton(), "Sarvatra e-HUB");
	}

	@Then("Enter Cash Receipt Number {string}")
	public void enterCashReceiptNumber(String CashReceiptNumber) {
		log.info("Enter Cash Receipt Number ");
		Assert.assertTrue(electricityBillPage.enterCashReceiptNumber(CashReceiptNumber), "Sarvatra e-HUB");
	}

	@Then("Click on Payment CONFIRM button")
	public void clickOnPaymentConfirmButton() {
		log.info("Click on Payment CONFIRM button");
		Assert.assertTrue(electricityBillPage.clickOnPaymentConfirmButton(), "Sarvatra e-HUB");
	}

	@Then("Verify some fields")
	public void verifySomeFields() {
		log.info("Verify some fields");
		Assert.assertTrue(electricityBillPage.verifyTextExtraDetails(), "Sarvatra e-HUB");
		Assert.assertTrue(electricityBillPage.verifyViewExtraDetailsPopup(), "Sarvatra e-HUB");
	}

	@Then("Enter Account Number {string}")
	public void enterAccountNumber(String AccNumber) {
		log.info("Enter Account Number ");
		Assert.assertTrue(electricityBillPage.enterAccountNumber(AccNumber), "Sarvatra e-HUB");
	}

	@Given("Click on Transaction History")
	public void clickOnTransactionHistory() {
		log.info("Click on Transaction History ");
		Assert.assertTrue(electricityBillPage.clickOnTransactionHistory(), "Sarvatra e-HUB");
	}

	@Then("Select User")
	public void selectUser() {
		log.info("Select User");
		Assert.assertTrue(electricityBillPage.selectUser(), "Sarvatra e-HUB");
	}

	@Then("Select Param")
	public void selectParam() {
		log.info("Select Param");
		Assert.assertTrue(electricityBillPage.selectParam(), "Sarvatra e-HUB");
	}

	@Then("Enter Customer Mobile Number {string}")
	public void enterCustomerMobileNumber(String CustMobileNumber) {
		log.info("Enter Customer Mobile Number");
		Assert.assertTrue(electricityBillPage.enterCustomerMobileNumber(CustMobileNumber), "Sarvatra e-HUB");
	}

	@Then("Click on Searched Mobile Number for Bill")
	public void ClickOnSearchedMobileNumberForBill() {
		log.info("Click on Searched Mobile Number for Bill");
		Assert.assertTrue(electricityBillPage.ClickOnSearchedMobileNumberForBill(), "Sarvatra e-HUB");
	}

	@Then("Click on Search")
	public void ClickOnSearchButton() {
		log.info("Click on Search");
		Assert.assertTrue(electricityBillPage.clickOnSearch(), "Sarvatra e-HUB");
	}

	@Then("Verify View Extra details")
	public void verifyViewExtraDetails() {
		log.info("Verify View Extra details");
		Assert.assertTrue(electricityBillPage.verifyTextViewExtraDetails(), "Sarvatra e-HUB");
	}

	@Then("Enter Service Number {string}")
	public void enterServiceNumber(String ServiceNumber) {
		log.info("Enter Service Number");
		Assert.assertTrue(electricityBillPage.enterServiceNumber(ServiceNumber), "Sarvatra e-HUB");
	}

	@Then("verify city List")
	public void verifyCity() {
		log.info("verify city");
		Assert.assertTrue(electricityBillPage.verifyCity(), "Sarvatra e-HUB");
	}

	@Then("verify Selected City")
	public void verifySelectedCity() {
		log.info("verify Selected City");
		Assert.assertTrue(electricityBillPage.verifySelectedCity(), "Sarvatra e-HUB");
	}

	@Then("Select Torrent Biller {string}")
	public void SelectTorrentBiller(String Biller) {
		log.info("Select Torrent Biller");
		Assert.assertTrue(electricityBillPage.selectTorrentBillerOrProvider(Biller), "Electricity");
	}

	@Then("Enter Payer Email {string}")
	public void enterPayerEmail(String email) {
		log.info("Enter Payer Email " + email);
		Assert.assertTrue(electricityBillPage.enterPayerEmail(email), "Electricity");
	}

	@Then("Enter Amount for payer {string}")
	public void enterPayerAmount(String amount) {
		log.info("Enter Amount for paye " + amount);
		Assert.assertTrue(electricityBillPage.enterAmount(amount), "Electricity");
	}

	@Then("Click on Pay Bill button and View bill details")
	public void clickOnPayBillButton() {
		log.info("Click on Pay Bill button and View bill details ");
		Assert.assertTrue(electricityBillPage.clickOnPayBillButton(), "Electricity");
	}

	@Then("Click on print button for receipt to download the receipt on system")
	public void clickOnPrintlButton() {
		log.info("Click on print button for receipt to download the receipt on system ");
		Assert.assertTrue(electricityBillPage.clickOnPrintlButton(), "Electricity");
	}
	
	@Then("Enter k Number {string}")
	public void enterknumber(String amount) {
		log.info("Enter knumber" + amount);
		Assert.assertTrue(electricityBillPage.enterknumber(amount), "Electricity");
	}
}
