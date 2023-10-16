package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.HomePage;
import com.sarvatra.test.ehub.pageobjects.TerminalDetailsPage;

import io.cucumber.java.en.Then;

public class TerminalDetailsStep {
	
	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	private HomePage homePage = new HomePage(DriverFactory.driver);
	private TerminalDetailsPage TerminalDPage = new TerminalDetailsPage(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();

	Logger log = (Logger) LogManager.getLogger("LoginPageTest.java");
	
	@Then("Enter POSNumber On Terminal Details page {string}")
	public void enter_POSNumber_On_Terminal_Details_page(String POSNumber) throws InterruptedException {
		log.info("Enter POSNumber On Terminal Details page");
		TerminalDPage.enter_POSNumber_On_Terminal_Details_page(POSNumber);
	}
	
	@Then("Enter address1 On Terminal Details page {string}")
	public void enter_address1_On_Terminal_Details_page(String address1) throws InterruptedException {
		log.info("Enter address1 On Terminal Details page");
		TerminalDPage.enter_address1_On_Terminal_Details_page(address1);
	}
	
	@Then("Enter city On Terminal Details page {string}")
	public void enter_city_On_Terminal_Details_page(String city) throws InterruptedException {
		log.info("Enter city On Terminal Details page");
		TerminalDPage.enter_city_On_Terminal_Details_page(city);
	}
	
	@Then("Select State On Terminal Details page {string}")
	public void Select_State_On_Terminal_Details_page(String state) throws InterruptedException {
		log.info("Select State On Terminal Details page");
		TerminalDPage.Select_State_On_Terminal_Details_page(state);
	}
	
	@Then("Enter pin On Terminal Details page {string}")
	public void enter_pin_On_Terminal_Details_page(String pin) throws InterruptedException {
		log.info("Enter pin On Terminal Details page");
		TerminalDPage.enter_pin_On_Terminal_Details_page(pin);
	}
}
