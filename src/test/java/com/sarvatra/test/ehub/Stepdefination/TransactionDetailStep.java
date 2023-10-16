package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.TransactionDetailPage;

import io.cucumber.java.en.Then;

public class TransactionDetailStep {
	
	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	private TransactionDetailPage TransactionDetail = new TransactionDetailPage(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();

	Logger log = (Logger) LogManager.getLogger("LoginPageTest.java");
	
	@Then("Verify Transaction Details Header")
	public void verify_Transaction_Details_Header() throws InterruptedException {
		log.info("Verify Transaction Details Header");
		Assert.assertTrue(TransactionDetail.verify_Transaction_Details_Header());
	}
	
	@Then("Verify Transaction Status Failed Avialble On Transaction Details Page")
	public void verify_Transaction_Status_Failed_Avialble_On_Transaction_Details_Page() throws InterruptedException {
		log.info("Verify Transaction Status Failed Avialble On Transaction Details Page");
		Assert.assertTrue(TransactionDetail.verify_Transaction_Status_Failed_Avialble_On_Transaction_Details_Page());
	}
	
	@Then("Verify Field Avialble On Transaction Details Page {string}")
	public void verify_Field_Avialble_On_Transaction_Details_Page(String Field) throws InterruptedException {
		log.info("Verify Field Avialble On Transaction Details Page");
		Assert.assertTrue(TransactionDetail.verify_Field_Avialble_On_Transaction_Details_Page(Field));
	}
	
	@Then("click On Back Button On Transaction Details page")
	public void click_On_Back_Button_On_Transaction_Details_Page() throws InterruptedException {
		log.info("click On Back Button On Transaction Details page");
		TransactionDetail.click_On_Back_Button_On_Transaction_Details_Page();
	}
	
	@Then("click On View Extra Details On Transaction Details page")
	public void click_On_View_Extra_Details_On_Transaction_Details_Page() throws InterruptedException {
		log.info("click On View Extra Details On Transaction Details page");
		TransactionDetail.click_On_View_Extra_Details_On_Transaction_Details_Page();
	}
	
	@Then("verify Extra Details Popup Avialble On Transaction Details Page")
	public void verify_Extra_Details_Popup_Avialble_On_Transaction_Details_Page() throws InterruptedException {
		log.info("verify Extra Details Popup Avialble On Transaction Details Page");
		Assert.assertTrue(TransactionDetail.verify_Extra_Details_Popup_Avialble_On_Transaction_Details_Page());
	}
	
	@Then("click On Extra Details Popup Close Button On Transaction Details page")
	public void click_On_Extra_Details_Popup_Close_Button_On_Transaction_Details_Page() throws InterruptedException {
		log.info("click On Extra Details Popup Close Button On Transaction Details page");
		TransactionDetail.click_On_Extra_Details_Popup_Close_Button_On_Transaction_Details_Page();
	}
	
	@Then("click On Print Button On Transaction Details page")
	public void click_On_Print_Button_On_Transaction_Details_Page() throws InterruptedException {
		log.info("click On Print Button On Transaction Details page");
		TransactionDetail.click_On_Print_Button_On_Transaction_Details_Page();
	}
	
	@Then("verify Print On Transaction Details Page")
	public void verify_Print_On_Transaction_Details_Page() throws InterruptedException {
		log.info("verify Print On Transaction Details Page");
		Assert.assertTrue(TransactionDetail.verify_Print_On_Transaction_Details_Page());
	}
	
}
