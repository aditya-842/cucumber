package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.MobilePostpaidPage;

import io.cucumber.java.en.Then;

public class MobilePostpaidStep {

	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	public MobilePostpaidPage mobilepostpaid = new MobilePostpaidPage(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();

	Logger log = (Logger) LogManager.getLogger(MobilePostpaidStep.class);

	@Then("Select Mobile Postpaid Icon")
	public void selectMobilePostpaid() {
		log.info("Select mobile postpaid category");
		Assert.assertTrue(mobilepostpaid.selectMobilePostpaid(), "Mobile Prepaid");
	}

	@Then("Verify Payer Mobile Number error")
	public void verifyPayerMobileNumberError() {
		log.info("Verify Payer Mobile Number error");
		Assert.assertTrue(mobilepostpaid.verifyPayerMobileNumberError(), "Mobile Prepaid");
	}

	@Then("Click on Biller Field and Provide Biller {string} - IDEA00000NAT01")
	public void clickOnBillerField(String biller) {
		log.info("Click on Biller Field and Provide Biller " + biller);
		Assert.assertTrue(mobilepostpaid.clickOnBillerField(biller), "Mobile Postpaid");
	}

	@Then("Enter Consumer Mobile Number {string}")
	public void enter_consumer_mobile_number(String mobileNumber) {
		log.info("Enter Consumer Mobile Number " + mobileNumber);
		Assert.assertTrue(mobilepostpaid.enterCustomerMobileNumber(mobileNumber), "Mobile Postpaid");
	}

	@Then("Enter Payer Mobile Number {string} for mobile postpaid")
	public void enter_payer_mobile_number_for_mobile_postpaid(String payerMobileNumber) {
		log.info("Enter Payer Mobile Number" + payerMobileNumber + " for mobile postpaid ");
		Assert.assertTrue(mobilepostpaid.enterPayerMobileNumber(payerMobileNumber), "Mobile Postpaid");
	}

	@Then("Enter Payer Email {string} for mobile postpaid")
	public void enter_payer_email_for_mobile_postpaid(String payerEmail) {
		log.info("Enter Payer Email " + payerEmail + " for mobile postpaid ");
		Assert.assertTrue(mobilepostpaid.enterPayerEmail(payerEmail), "Mobile Postpaid");
	}

	@Then("Enter Amount for payer {string} for mobile postpaid")
	public void enter_amount_for_payer_for_mobile_postpaid(String amount) {
		log.info("Enter Amount for payer " + amount + "for mobile postpaid");
		Assert.assertTrue(mobilepostpaid.enterAmount(amount), "Mobile Postpaid");
	}

	@Then("Click on Validate Bill button and Bill gets Validate")
	public void click_on_validate_bill_button_and_bill_gets_validate() {
		log.info("Click on Validate Bill button and Bill gets Validate");
		Assert.assertTrue(mobilepostpaid.clickOnValidateBill(), "Mobile Postpaid");
	}

	@Then("Click on Pay Bill Button for mobile postpaid")
	public void click_on_pay_bill_button() {
		log.info("Click on Pay Bill Button for mobile postpaid");
		Assert.assertTrue(mobilepostpaid.clickOnPayBill(), "Mobile Postpaid");
	}

	@Then("Enter cash reciept no {string} for mobile postpaid")
	public void enter_cash_reciept_no_and_click_on_pay_bill_button(String receiptNumber) {
		log.info("Enter cash reciept no "+receiptNumber+" for mobile postpaid");
		Assert.assertTrue(mobilepostpaid.enterCashReceiptNumber(receiptNumber), "Mobile Postpaid");
	}

	@Then("Click on Confirm Button")
	public void click_on_confirm_button_for_reciept() {
		log.info("Click on Confirm Button");
		Assert.assertTrue(mobilepostpaid.clickOnConfirm(), "Mobile Postpaid");
	}
	
	@Then("Click on print button for reciept for mobile postpaid")
	public void click_on_print_button_for_reciept() {
		log.info("Click on Confirm Button");
		Assert.assertTrue(mobilepostpaid.clickOnPrintButton(), "Mobile Postpaid");
	}

}
