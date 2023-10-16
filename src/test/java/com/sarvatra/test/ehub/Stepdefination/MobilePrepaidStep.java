package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.MobilePrepaidPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MobilePrepaidStep {

	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	public MobilePrepaidPageObject mobileprepaid = new MobilePrepaidPageObject(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();

	Logger log = (Logger) LogManager.getLogger("MobilePrepaid.java");
	
	/*
	 * ####################- Owner --> Prachi Kante -###########################
	 * 
	 */

	@Given("Click on Pay Bill Icon")
	public void clickPayBillIcon() {
		log.info("Click on Pay Bill Icon ");
		Assert.assertTrue(mobileprepaid.clickPayBillIcon(), "Sarvatra e-HUB");
	}
	
	@Then("Scroll right to category")
	public void scrollRight() {
		log.info("Scroll Right 2 times:");
		Assert.assertTrue(mobileprepaid.scrollRight(), "Sarvatra e-HUB");
		
	}
	
	@Then("Select Mobile Prepaid Icon")
	public void selectMobilePrepaid() {
		log.info("Select mobile prepaid category");
		Assert.assertEquals(mobileprepaid.selectMobilePrepaid(), "Mobile Prepaid");
	}
	
	@Then("Select Biller")
	public void selectBiller() {	
		log.info("Select Biller ");
		Assert.assertTrue(mobileprepaid.selectBiller(), "Sarvatra e-HUB");
	}
	
	@Then("Select Optional Biller when Support plan is {string}")
	public void select_Other_Biller(String supportPlan) {	
		log.info("Select Optional Biller when Support plan is "+supportPlan);
		Assert.assertTrue(mobileprepaid.selectOtherBiller(supportPlan), "Sarvatra e-HUB");
	}
	
	@Then("Enter Mobile Number {string}")
	public void enterMobileNumber(String mobileNumber) {
		log.info("Enter Mobile Number ");
		Assert.assertTrue(mobileprepaid.enterMobileNumber(mobileNumber), "Sarvatra e-HUB");
	}
	
	@Then("Select Circle")
	public void selectCircle() {
		log.info("Select Circle: ");
		Assert.assertTrue(mobileprepaid.selectCircle(), "Sarvatra e-HUB");
	}
	
	@Then("Select Payment Mode {string}")
	public void paymentMode(String PaymentMode) {
		log.info("Payment mode: ");
		Assert.assertTrue(mobileprepaid.paymentMode(PaymentMode), "Sarvatra e-HUB");
	}
	
	@Then("Enter Plan ID {string}")
	public void enterPlanId(String planId) {
		log.info("Enter PlanID: ");
		Assert.assertTrue(mobileprepaid.enterPlanId(planId), "Sarvatra e-HUB");
	}
	
	
	@Then("Click on Fetch Plan button")
	public void clickOnFetchPlanButton() {
		log.info("Click on Fetch Plan button ");
		Assert.assertTrue(mobileprepaid.clickOnFetchPlanButton(), "Sarvatra e-HUB");
	}
	
	@Then("Select Smart Recharge")
	public void selectSmartRecharge() {
		log.info("Select Smart Recharge: ");
		Assert.assertTrue(mobileprepaid.selectSmartRecharge(), "Sarvatra e-HUB");
	}
	@Then("Click on Pay Bill button")
	public void clickOnPayBillButton() {
		log.info("Click on Pay Bill button: ");
		Assert.assertTrue(mobileprepaid.clickOnPayBillButton(), "Sarvatra e-HUB");
	}
	@Then("Click on Pay Bill for manditory_true button")
	public void maditoryTrue_PayBill() {
		log.info("Pay Bill for Plan ID");
		Assert.assertTrue(mobileprepaid.maditoryTrue_PayBill(), "PAy Bill button");
	}
	@Then("Validate Confimation Page")
	public void textConfirmPayment() {
		log.info("User is on LoginPage: ");
		Assert.assertEquals(mobileprepaid.textConfirmPayment(), "Confirm Payment");
	}
	
	@When("Validate Payment Confirmation page {string}")
	public void textConfirmPayment(String cashReceiptNumber) {
		log.info("User is on LoginPage: ");
		Assert.assertTrue(mobileprepaid.textCashReceiptNumber(cashReceiptNumber), "Confirm Payment");
	}
	@Then("Click on CONFIRM button")
	public void buttonConfirm() {
		log.info("click on button confirm ");
		Assert.assertTrue(mobileprepaid.buttonConfirm(), "Confirm Payment");
	}
	
	@Then("Validate Transaction Details SUCCESS Page")
	public void transactionDetails() {
		log.info("Transaction Details: ");
		Assert.assertTrue(mobileprepaid.transactionDetails(), "Confirm Payment");
	}
	
	@Then("verify circle")
	public void verifyCircles() {
		log.info("verify circle");
		Assert.assertTrue(mobileprepaid.verifyCircles(), "Confirm Payment");
	}
	
}