package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.CreditCardPageObject;
import com.sarvatra.test.ehub.pageobjects.HomePage;

import io.cucumber.java.en.Then;

public class CreditCardStep {
	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	private CreditCardPageObject creditcardpage = new CreditCardPageObject(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();

	Logger log = (Logger) LogManager.getLogger("LoginPageTest.java");
	
	@Then("Click on Minimum due amount")
	public void click_on_minmumdewamount() {
		log.info("Click on Confirm Button : ");
		Assert.assertTrue(creditcardpage.clickOnMinimumDueAmount());
	}

	@Then("Click on Credit Card")
	public void selectCreditCard() {
		log.info("User Logged in as: ");
		Assert.assertTrue(creditcardpage.selectCreditCard());
	}
	
	@Then ("Verify radio button {string}")
	public void radiobutton(String radio)  throws InterruptedException {
		log.info("User Logged in as: ");
		Assert.assertTrue(creditcardpage.verify_radio_button(radio));
	}

	@Then("Click on Credit Card Payments dropdown")
	public void textCreditCardPayments() {
		log.info("User Logged in as: ");
		Assert.assertTrue(creditcardpage.textCreditCardPayments());
	}

	@Then("Enter Custom Param Last 4 Digit of Card Number {string}")
	public void enterCardNumber(String string) {
		log.info("Enter card number" + string);
		Assert.assertTrue(creditcardpage.enterCardNumber());
	}

	@Then("Verify Custom Params {string}")
	public void verifyCustomParam(String string) {
		log.info("Cuatom Param: " + string);
		Assert.assertTrue(creditcardpage.verifyCustomParam(string));
	}

	@Then("Verify Error message {string} for Custom Param {string}")
	public void verifyErrorMsgCustomParam(String error, String cutomparam) {
		log.info("Verify Error message " + error + " for Custom Param " + cutomparam);
		Assert.assertTrue(creditcardpage.verifyErrorMsgCustomParam(error, cutomparam));
	}

	@Then("Verify error for invalid data {string} , {string} and {string}")
	public void verifyErrorforInvalidData(String data, String error, String cutomparam) throws Exception {
		log.info("Verify error for invalid data " + data + " , " + error + " for Custom Param " + cutomparam);
		Assert.assertTrue(creditcardpage.verifyErrorforInvalidData(data, error, cutomparam));
	}

	@Then("Enter Last 4 Digits of Card Number {string}")
	public void enterValidData(String data, String cutomparam) throws Exception {
		log.info("Verify error for invalid data " + data + " for Custom Param " + cutomparam);
		creditcardpage.enterValidData(data, cutomparam);
	}

	@Then("Verify Biller For Credit Card {string}")
	public void verify_biller_for_Credit_Card(String Biller) {
		log.info("Verify Biller For Credit Card");
		Assert.assertTrue(creditcardpage.verify_biller_for_Credit_Card(Biller));
	}
	
	@Then("Select Biller from Credit Card Category {string}")
	public void select_biller_from_credit_card_category(String Biller) {
		log.info("Select Biller from Credit Card Category");
		creditcardpage.selectBillerfromDropDown(Biller);
	}
	
	@Then("Verify Bill Payer Information Mobile and EamilID")
	public void verify_bill_payer_information_mobile_and_emaild() throws InterruptedException {
		log.info("Verify Bill Payer Information Mobile and EamilID");
		Assert.assertTrue(creditcardpage.verify_payer_information_mobileNumber(), "payer mobile number is not visible");
		Assert.assertTrue(creditcardpage.verify_payer_information_email(), "payer email id is not visible");
	}
	
	@Then("Verify Payment Mode for credit card biller")
	public void verify_payment_mode_for_credit_card_biller() {
		log.info("Verify Payment Mode for credit card biller");
		Assert.assertTrue(creditcardpage.verify_payment_mode_for_credit_card_biller(), "payment mode is not visible");
	}
	
	@Then("Verify Fetch Bill Button for Credit Card Biller")
	public void verify_fetch_bill_button_for_credit_card_biller() {
		log.info("Verify Payment Mode for credit card biller");
		Assert.assertTrue(creditcardpage.verify_fetch_bill_button_for_credit_card_biller(), "fetch bill button is not visible");
	}
	
	@Then("Verify Pay Bill Button for Credit Card Biller")
	public void verify_pay_bill_button_for_credit_card_biller() {
		log.info("Verify Pay Bill Button for Credit Card Biller");
		Assert.assertTrue(creditcardpage.verify_pay_bill_button_for_credit_card_biller(), "pay bill button is not visible");
	}
	
	@Then("Verify Bill Payer Information Mobile EamilID and Amount")
	public void verify_bill_payer_information_mobile_emailid_and_amount() throws InterruptedException {
		log.info("Verify Bill Payer Information Mobile EamilID and Amount");
		Assert.assertTrue(creditcardpage.verify_payer_information_mobileNumber(), "payer mobile number is not visible");
		Assert.assertTrue(creditcardpage.verify_payer_information_email(), "payer email id is not visible");
		Assert.assertTrue(creditcardpage.verify_payer_information_amount(), "payer amount is not visible");
	}
	
	@Then("Verify Validate Bill Button for Credit Card Biller")
	public void verify_validate_bill_button_for_credit_card_biller() {
		log.info("Verify Validate Bill Button for Credit Card Biller");
		Assert.assertTrue(creditcardpage.verify_validate_bill_button_for_credit_card_biller(), "validate bill button is not visible");
	}
	
	@Then("Verify Customer Params two fields")
	public void verify_customer_params_two_fields() {
		log.info("Verify Customer Params two fields");
		Assert.assertTrue(creditcardpage.verify_custom_param_4_digit_no_field(), "biller 4 digit no field not visible");
		Assert.assertTrue(creditcardpage.verify_custom_param_mobile_number_field(), "biller mobile field not visible");
	}
	
	@Then("Verify Customer Params five fields")
	public void verify_customer_params_five_fields() {
		log.info("Verify Customer Params two fields");
		Assert.assertTrue(creditcardpage.verify_custom_param_a_field(), "biller a field not visible");
		Assert.assertTrue(creditcardpage.verify_custom_param_a_b_field(), "biller a b field not visible");
		Assert.assertTrue(creditcardpage.verify_custom_param_a_b_c_field(), "biller a b c field not visible");
		Assert.assertTrue(creditcardpage.verify_custom_param_a_b_c_d_field(), "biller a b c d field not visible");
		Assert.assertTrue(creditcardpage.verify_custom_param_a_b_c_d_e_field(), "biller a b c d e field not visible");
	}
	
	@Then("Enter Mobile Number for Card Number {string}")
	public void Enter_Mobile_Number(String Mobile) throws Exception {
		log.info("Enter Mobile Number for Card Number");
		creditcardpage.Enter_Mobile_Number(Mobile);
	}
	
	@Then("Enter custom param a field {string}")
	public void Enter_custom_param_a_field(String Field_a) throws Exception {
		log.info("Enter custom param a field");
		creditcardpage.Enter_custom_param_a_field(Field_a);
	}
	
	@Then("Enter custom param ab field {string}")
	public void Enter_custom_param_ab_field(String Field_ab) throws Exception {
		log.info("Enter custom param ab field");
		creditcardpage.Enter_custom_param_a_b_field(Field_ab);
	}
	
	@Then("Enter custom param abc field {string}")
	public void Enter_custom_param_abc_field(String Field_abc) throws Exception {
		log.info("Enter custom param abc field");
		creditcardpage.Enter_custom_param_a_b_c_field(Field_abc);
	}
	
	@Then("Enter custom param abcd field {string}")
	public void Enter_custom_param_abcd_field(String Field_abcd) throws Exception {
		log.info("Enter custom param abcd field");
		creditcardpage.Enter_custom_param_a_b_c_d_field(Field_abcd);
	}
	
	@Then("Enter custom param abcde field {string}")
	public void Enter_custom_param_abcde_field(String Field_abcde) throws Exception {
		log.info("Enter custom param abcde field");
		creditcardpage.Enter_custom_param_a_b_c_d_e_field(Field_abcde);
	}
	
	@Then("Enter cardNumber for Card Number {string}")
	public void Enter_cardNumber(String cardNumber) throws Exception {
		log.info("Enter cardNumber for Card Number");
		creditcardpage.Enter_cardNumber(cardNumber);
	}
	
	@Then("Enter Payer Mobile Number for Card Number {string}")
	public void Enter_Payer_Mobile_Number(String Mobile) throws Exception {
		log.info("Enter Payer Mobile Number for Card Number");
		creditcardpage.Enter_Payer_Mobile_Number(Mobile);
	}
	
	@Then("Click on Fetch Bill Button For Credit Card")
	public void click_On_Fetch_Bill_Button() {
		log.info("Click on Fetch Bill Button For Credit Card");
		creditcardpage.click_On_Fetch_Bill_Button();
	}
	
	@Then("Enter Payer Email for Card Number {string}")
	public void Enter_Payer_Email(String email) throws Exception {
		log.info("Enter Payer Email for Card Number");
		creditcardpage.Enter_Payer_Email(email);
	}
}