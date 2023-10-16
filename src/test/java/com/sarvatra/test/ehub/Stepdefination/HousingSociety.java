package com.sarvatra.test.ehub.Stepdefination;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.HousingSocietyPageObject;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HousingSociety {
	
	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	public HousingSocietyPageObject housingSociety = new HousingSocietyPageObject(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();

	Logger log = (Logger) LogManager.getLogger("HousingSociety.java");
	
	/*
	 * ####################- Owner --> Prachi Kante -###########################
	 * 
	 */

	@Then("Click on Housing Society icon")
	public void clickOnHousingSocietyIcon() {
		log.info("Click on Housing Society icon");
		Assert.assertTrue(housingSociety.clickOnHousingSocietyIcon(), "Sarvatra e-HUB");
	}
	
	@Then("Select state from dropdown list {string}")
	public void selectStatefromDropdown(String string) {
		log.info("Select state from dropdown list");
		Assert.assertTrue(housingSociety.selectStatefromDropdown(string), "Sarvatra e-HUB");
	}

	@Then("Enter City for Housing Society {string}")
	public void enterCityHS(String city) {
		log.info("Click on Housing Society icon");
		Assert.assertTrue(housingSociety.enterCityHS(city), "Sarvatra e-HUB");
		
	}

	@Then("Click on Submit Button Housing Society")
	public void clickOnSubmitHS() {
		log.info("Click on Submit Button Housing Society");
		Assert.assertTrue(housingSociety.clickOnSubmitHS(), "Sarvatra e-HUB");
		
	}
	
	@Then("Enter Flatnumber {string}")
	public void enterFlatnumber(String flatnumber) {
		log.info("Enter Flatnumber");
		Assert.assertTrue(housingSociety.enterFlatnumber(flatnumber), "Sarvatra e-HUB");
	}
//	@Then("Click on Fetch Bill button")
//	public void clickOnFetchBill() {
//		log.info("Click on Fetch Bill button");
//		Assert.assertTrue(housingSociety.clickOnFetchBill(), "Sarvatra e-HUB");
//	}
	
}
