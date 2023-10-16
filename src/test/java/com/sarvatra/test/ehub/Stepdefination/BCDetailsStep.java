package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.BCDetailsPage;
import com.sarvatra.test.ehub.pageobjects.HomePage;

import io.cucumber.java.en.Then;

public class BCDetailsStep {
	
	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	private HomePage homePage = new HomePage(DriverFactory.driver);
	private BCDetailsPage BCDPage = new BCDetailsPage(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();

	Logger log = (Logger) LogManager.getLogger("LoginPageTest.java");
	
	@Then("Enter BC Name On BC Details page {string}")
	public void enter_BC_Name_On_BC_Details_page(String BC_name) throws InterruptedException {
		log.info("Enter BC Name On BC Details page");
		BCDPage.enter_BC_Name_On_BC_Details_page(BC_name);
	}
	
	@Then("Enter shortCode On BC Details page {string}")
	public void enter_shortCode_On_BC_Details_page(String BC_name) throws InterruptedException {
		log.info("Enter shortCode On BC Details page");
		BCDPage.enter_shortCode_On_BC_Details_page(BC_name);
	}
	
	@Then("Click On GSTNumber Not Available On BC Details page")
	public void click_On_GSTNumber_Not_Available_On_BC_Details_page() throws InterruptedException {
		log.info("Click On GSTNumber Not Available On BC Details page");
		BCDPage.click_On_GSTNumber_Not_Available_On_BC_Details_page();
	}
	
	@Then("Enter mobile On BC Details page {string}")
	public void enter_mobile_On_BC_Details_page(String mobile) throws InterruptedException {
		log.info("Enter mobile On BC Details page");
		BCDPage.enter_mobile_On_BC_Details_page(mobile);
	}
	
	@Then("Enter address1 On BC Details page {string}")
	public void enter_address1_On_BC_Details_page(String address1) throws InterruptedException {
		log.info("Enter address1 On BC Details page");
		BCDPage.enter_address1_On_BC_Details_page(address1);
	}
	
	@Then("Enter city On BC Details page {string}")
	public void enter_city_On_BC_Details_page(String city) throws InterruptedException {
		log.info("Enter city On BC Details page");
		BCDPage.enter_city_On_BC_Details_page(city);
	}
	
	@Then("Select State On BC Details page {string}")
	public void Select_State_On_BC_Details_page(String state) throws InterruptedException {
		log.info("Select State On BC Details page");
		BCDPage.Select_State_On_BC_Details_page(state);
	}
	
	@Then("Enter pin On BC Details page {string}")
	public void enter_pin_On_BC_Details_page(String pin) throws InterruptedException {
		log.info("Enter pin On BC Details page");
		BCDPage.enter_pin_On_BC_Details_page(pin);
	}
	
	@Then("Enter email On BC Details page {string}")
	public void enter_email_On_BC_Details_page(String email) throws InterruptedException {
		log.info("Enter email On BC Details page");
		BCDPage.enter_email_On_BC_Details_page(email);
	}


}
