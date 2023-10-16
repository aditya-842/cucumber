package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.ConfirmPaymentPage;

import io.cucumber.java.en.Then;


public class ConfirmPaymentStep {
	
	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	private ConfirmPaymentPage ConfirmPayment = new ConfirmPaymentPage(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();

	Logger log = (Logger) LogManager.getLogger("LoginPageTest.java");
	
	@Then("Verify Confirm Payment Header")
	public void verify_Confirm_Payment_Header() throws InterruptedException {
		log.info("Verify Confirm Payment Header");
		Assert.assertTrue(ConfirmPayment.verify_Confirm_Payment_Header());
	}
	
	@Then("click On Radio Button On Confirm Payment page {string}")
	public void click_On_Radio_Button_On_Confirm_Payment_page(String Option) throws InterruptedException {
		log.info("click On Radio Button On Confirm Payment page");
		ConfirmPayment.click_On_Radio_Button_On_Confirm_Payment_page(Option);
	}
	
	@Then("Verify Cash Receipt Number On Confirm Payment page")
	public void verify_Cash_Receipt_Number_On_Confirm_Payment_page() throws InterruptedException {
		log.info("Verify Cash Receipt Number On Confirm Payment page");
		Assert.assertTrue(ConfirmPayment.verify_Cash_Receipt_Number_On_Confirm_Payment_page());
	}
	
	@Then("enter Cash Receipt Number On Confirm Payment page {string}")
	public void enter_Cash_Receipt_Number_On_Confirm_Payment_page(String Receipt_Number) throws InterruptedException {
		log.info("enter Cash Receipt Number On Confirm Payment page");
		ConfirmPayment.enter_Cash_Receipt_Number_On_Confirm_Payment_page(Receipt_Number);
	}
	
	@Then("click On Confirm Button On Confirm Payment page")
	public void click_On_Confirm_Button_On_Confirm_Payment_page() throws InterruptedException {
		log.info("click On Confirm Button On Confirm Payment page");
		ConfirmPayment.click_On_Confirm_Button_On_Confirm_Payment_page();
	}
	
	@Then("click On Cancel Button On Confirm Payment page")
	public void click_On_Cancel_Button_On_Confirm_Payment_page() throws InterruptedException {
		log.info("click On Cancel Button On Confirm Payment page");
		ConfirmPayment.click_On_Cancel_Button_On_Confirm_Payment_page();
	}
	
	@Then("Verify Eorror Msg On Confirm Payment Page {string}")
	public void verify_EorrorMsg_On_Confirm_Payment_Page(String Msg) throws InterruptedException {
		log.info("Verify Confirm Payment Header");
		Assert.assertTrue(ConfirmPayment.verify_EorrorMsg_On_Confirm_Payment_Page(Msg));
	}
	
	@Then("enter Amount On Confirm Payment page {string}")
	public void enter_Amount_On_Confirm_Payment_page(String Amount) throws InterruptedException {
		log.info("enter Amount On Confirm Payment page");
		ConfirmPayment.enter_Amount_On_Confirm_Payment_page(Amount);
	}
	
	@Then("click On Yes or No Button On Confirm Payment page For Popup {string}")
	public void click_On_Yes_No_Button_On_Confirm_Payment_page_For_Popup(String Option) throws InterruptedException {
		log.info("click On Yes or No Button On Confirm Payment page For Popup");
		ConfirmPayment.click_On_Yes_No_Button_On_Confirm_Payment_page_For_Popup(Option);
	}

	@Then("verify Radio Button On Confirm Payment page {string}")
	public void verify_Radio_Button_On_Confirm_Payment_page(String radioButton) throws InterruptedException {
		log.info("verify Radio Button On Confirm Payment page");
		Assert.assertTrue(ConfirmPayment.verify_Radio_Button_On_Confirm_Payment_page(radioButton));
	}
	
	@Then("Verify_Amount_field_On_Confirm_Payment_page")
	public void verify_Amount_field_On_Confirm_Payment_page() throws InterruptedException {
		log.info("verify_Amount_field_On_Confirm_Payment_page");
		Assert.assertTrue(ConfirmPayment.verify_Amount_field_On_Confirm_Payment_page());
	}
	
	@Then("Verify account number field On Confirm Payment page")
	public void verify_account_number_field_On_Confirm_Payment_page() throws InterruptedException {
		log.info("verify_account_number_field_On_Confirm_Payment_page");
		Assert.assertTrue(ConfirmPayment.verify_account_number_field_On_Confirm_Payment_page());
	}
	
	@Then("enter account number On Confirm Payment page {string}")
	public void enter_account_number_On_Confirm_Payment_page(String accountNumber) throws InterruptedException {
		log.info("enter_account_number_On_Confirm_Payment_page");
		ConfirmPayment.enter_account_number_on_confirm_payment_page(accountNumber);
	}
	
	@Then("Verify Account Number Field On Confirm Payment page")
	public void verify_Account_Number_Field_On_Confirm_Payment_page() throws InterruptedException {
		log.info("Verify Account Number Field On Confirm Payment page");
		Assert.assertTrue(ConfirmPayment.verify_account_number_field_On_Confirm_Payment_page());
	}
	
	@Then("Verify Msg On Confirm Payment Page {string}")
	public void verify_Msg_On_Confirm_Payment_Page(String Msg) throws InterruptedException {
		log.info("Verify Confirm Payment Header");
		Assert.assertTrue(ConfirmPayment.verify_Msg_On_Confirm_Payment_Page(Msg));
	}
	
	@Then("Verify the Amount Field Is Not Empty")
	public void verify_the_amount_field_is_not_empty()  {
		log.info("Verify the Amount Field Is Not Empty");
		ConfirmPayment.verify_the_amount_field_is_not_empty();
	}	
	
	@Then("verify Radio Button On Confirm Payment page {string} is disable")
	public void verify_other_radio_button_disable(String radioButton) throws InterruptedException {
		log.info("click On Radio Button On Confirm Payment page");
		Assert.assertTrue(ConfirmPayment.verify_other_radio_button_disable(radioButton));
	}
	
	@Then("Verify AdditionalInfo Field {string}")
	public void verify_AdditionalInfo_Field(String name) throws InterruptedException {
		log.info("Verify AdditionalInfo Field with its value");
		Assert.assertTrue(ConfirmPayment.verify_AdditionalInfo_Field(name));
	}
	
	@Then("Verify AdditionalInfo Field {string} with its null value")
	public void verify_AdditionalInfo_Field_with_its_value(String name) throws InterruptedException {
		log.info("Verify AdditionalInfo Field with its value");
		Assert.assertTrue(ConfirmPayment.verify_AdditionalInfo_Field_with_its_null_value(name));
	}	

	@Then("Verify wallet present on confirmation page with Amount {string}")
	public void verify_Wallet(String amount) throws Exception {
		log.info("Verify wallet present on confirmation page");
		Assert.assertTrue(ConfirmPayment.verify_Wallet_with_Amount(amount));	
	}	
	
	@Then("Verify Field Avialble On Confirm Payment Page {string}")
	public void verify_Field_Avialble_On_Confirm_Payment_Page(String Field) throws InterruptedException {
		log.info("Verify Field Avialble On Confirm Payment Page");
		Assert.assertTrue(ConfirmPayment.verify_Field_Avialble_On_Confirm_Payment_Page(Field));
	}
	
	@Then("Enter Other value On Confirm Payment page {string}")
	public void enter_Other_value_on_confirm_payment_page(String Value) throws InterruptedException {
		log.info("Enter Other value On Confirm Payment page");
		ConfirmPayment.enter_Other_value_on_confirm_payment_page(Value);
	}
	
	@Then("Verify Other Field Avialble On Confirm Payment Page")
	public void verify_Other_Field_On_Confirm_Payment_Page() throws InterruptedException {
		log.info("Verify Other Field Avialble On Confirm Payment Page");
		Assert.assertTrue(ConfirmPayment.verify_Other_Field_On_Confirm_Payment_Page());
	}
	
	@Then("Verify Other Field not Avialble On Confirm Payment Page")
	public void verify_Other_value_On_Confirm_Payment_Page() throws InterruptedException {
		log.info("Verify Other Field not Avialble On Confirm Payment Page");
		Assert.assertTrue(ConfirmPayment.verify_Other_value_Not_On_Confirm_Payment_Page());
	}
	@Then("Verify Error Msg On Comfirm Payment Page {string}")
	public void Verify_Error_Msg_On_Comfirm_Payment_Page(String Error_Msg) throws InterruptedException {
		log.info("Verify Error Msg On Comfirm Payment Page");
		Assert.assertTrue(ConfirmPayment.verify_Error_Msg_On_Confirm_Payment_Page(Error_Msg));
	}
	@Then("Enter Cheque Account Number On Confirm Payment page {string}")
	public void Enter_Cheque_Account_Number(String Value) throws InterruptedException {
		log.info("Enter Other value On Confirm Payment page");
		ConfirmPayment.Enter_Cheque_Account_Number(Value);
	}
	@Then("Enter Cheque Number On Confirm Payment page {string}")
	public void Enter_Cheque_Number(String Value) throws InterruptedException {
		log.info("Enter Other value On Confirm Payment page");
		ConfirmPayment.Enter_Cheque_Number(Value);
	}
	
}
