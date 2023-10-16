package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.HomePage;
import com.sarvatra.test.ehub.pageobjects.MerchantDetailsPage;

import io.cucumber.java.en.Then;

public class MerchantDetailsStep {
	
	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	private HomePage homePage = new HomePage(DriverFactory.driver);
	private MerchantDetailsPage MerchantDPage = new MerchantDetailsPage(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();

	Logger log = (Logger) LogManager.getLogger("LoginPageTest.java");
	
	@Then("Enter Merchant Name On Merchant Details page {string}")
	public void enter_Merchant_Name_On_Merchant_Details_page(String Merchant_name) throws InterruptedException {
		log.info("Enter Merchant Name On Merchant Details page");
		MerchantDPage.enter_Merchant_Name_On_Merchant_Details_page(Merchant_name);
	}
	
	@Then("Click On GSTNumber Not Available On Merchant Details page")
	public void click_On_GSTNumber_Not_Available_On_Merchant_Details_page() throws InterruptedException {
		log.info("Click On GSTNumber Not Available On Merchant Details page");
		MerchantDPage.click_On_GSTNumber_Not_Available_On_Merchant_Details_page();
	}
	
	@Then("Enter mobile On Merchant Details page {string}")
	public void enter_mobile_On_Merchant_Details_page(String mobile) throws InterruptedException {
		log.info("Enter mobile On Merchant Details page");
		MerchantDPage.enter_mobile_On_Merchant_Details_page(mobile);
	}
	
	@Then("Enter address1 On Merchant Details page {string}")
	public void enter_address1_On_Merchant_Details_page(String address1) throws InterruptedException {
		log.info("Enter address1 On Merchant Details page");
		MerchantDPage.enter_address1_On_Merchant_Details_page(address1);
	}
	
	@Then("Enter city On Merchant Details page {string}")
	public void enter_city_On_Merchant_Details_page(String city) throws InterruptedException {
		log.info("Enter city On Merchant Details page");
		MerchantDPage.enter_city_On_Merchant_Details_page(city);
	}
	
	@Then("Select State On Merchant Details page {string}")
	public void Select_State_On_Merchant_Details_page(String state) throws InterruptedException {
		log.info("Select State On Merchant Details page");
		MerchantDPage.Select_State_On_Merchant_Details_page(state);
	}
	
	@Then("Enter pin On Merchant Details page {string}")
	public void enter_pin_On_Merchant_Details_page(String pin) throws InterruptedException {
		log.info("Enter pin On Merchant Details page");
		MerchantDPage.enter_pin_On_Merchant_Details_page(pin);
	}
	
	@Then("Enter email On Merchant Details page {string}")
	public void enter_email_On_Merchant_Details_page(String email) throws InterruptedException {
		log.info("Enter email On Merchant Details page");
		MerchantDPage.enter_email_On_Merchant_Details_page(email);
	}

}
