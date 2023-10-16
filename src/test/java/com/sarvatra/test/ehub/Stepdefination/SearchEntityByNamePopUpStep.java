package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.SearchEntityByNamePopUpPage;
import io.cucumber.java.en.Then;

public class SearchEntityByNamePopUpStep {

	private SearchEntityByNamePopUpPage SearchProPage = new SearchEntityByNamePopUpPage(DriverFactory.driver);
	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();

	Logger log = (Logger) LogManager.getLogger("LoginPageTest.java");

	/*
	 * ####################- Owner --> Mayur Kale -###########################
	 * 
	 */

//	@AfterStep
//	public void TakesScreeanShots(io.cucumber.java.Scenario result) throws Exception {
//		if(result.isFailed()==false){
//			TakesScreenshot ts=(TakesScreenshot)driver;
//			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//			result.attach(src, "image/png", "screenshot");
//		}
//	}

	@Then("Select E-hub Entity radio button option on the pop-up window")
	public void select_e_hub_entity_radio_button_option_on_the_pop_up_window() {
		log.info("Select E-hub Entity radio button");
		Assert.assertFalse(SearchProPage.selectEhubEntityRadioButton());
	}

	@Then("Select Product Role and Name radio button option on the pop-up window")
	public void select_product_role_and_name_radio_button_option_on_the_pop_up_window() {
		log.info("Select Product Role and Name radio button option on the pop-up window");
		Assert.assertFalse(SearchProPage.selectProductRoleNameRadioButton());
	}

	@Then("Select the {string} and Product {string} from the dropdown list")
	public void select_the_and_product_from_the_dropdown_list(String string, String string2)
			throws InterruptedException {
		log.info("Select the " + string + " and Product " + string2 + " from the dropdown list");
		SearchProPage.selectProduct(string);
		Thread.sleep(1000);
		SearchProPage.selectProductRole(string2);

	}

	@Then("Enter {string} in Name field")
	public void enter_in_name_field(String string) {
		log.info("Enter the entity name -> " + string);
		Assert.assertTrue(SearchProPage.enterNameInNameInputBox(string));
	}

	@Then("Click on Search button")
	public void click_on_search_button() {
		log.info("Click on Search button");
		Assert.assertTrue(SearchProPage.clickSearchButton());
	}

	@Then("Verify that user can see {string} in serached results")
	public void verify_that_user_can_see_in_serached_results(String string) throws Exception {
		log.info("Verify that user can see '" + string + "' in serached results");
		Assert.assertEquals(SearchProPage.verifySerchedResult(string), string);
		System.out.println("Selected searched value: " + string);
	}

	@Then("Select or click on entity by checking {string} & {string}")
	public void select_or_click_on_entity_by_checking(String string, String string2) throws InterruptedException {
		log.info("Click on entity by checking ID & Name");
		Assert.assertTrue(SearchProPage.selectEntityInSearchedResult(string, string2));
	}

	@Then("Select or click on entity by checking {string}")
	public void select_or_click_on_entity_by_checking(String string) throws InterruptedException {
		log.info("Select or click on entity by checking " + string);
		Assert.assertEquals(SearchProPage.selectSearchResult(string), string);
		System.out.println("Selected searched value: " + string);
	}

	@Then("Click on close button on Search Entity by name pop up")
	public void click_on_close_button_on_search_entity_by_name_pop_up() {
		log.info("Click on close button on Search Entity by name pop up");
		Assert.assertTrue(SearchProPage.ClickCloseButton());
	}

	@Then("Verify {string} message for Empty Name Field")
	public void verify_message_for(String string) {
		log.info("Verify validation message for Empty Name Field");
		Assert.assertEquals(SearchProPage.validation4_EmptyNameField(), string);
	}

	@Then("Verify {string} message for invalid input in Name Field")
	public void verify_message_for_invalid_input(String string) {
		log.info("Verify validation message for Empty Name Field");
		Assert.assertEquals(SearchProPage.validation4_InvalidInputInNameField(), string);
	}

	@Then("Verify {string} message for input which not avilable on eHub")
	public void verify_informative_message_for_input_not_avilable_on_eHub(String string) {
		log.info("Verify validation message for input which not avilable on eHub");
		Assert.assertEquals(SearchProPage.informativeMsg4_EntityNotAvailable(), string);
	}

	@Then("Verify {string} message for Product drpodown on search entity popup")
	public void verify_message_for_product_drpodown_on_search_entity_popup(String string) {
		log.info("Verify validation message for Empty Name Field");
		Assert.assertEquals(SearchProPage.validation4_emptyProductDropdown(), string);
	}

	@Then("Verify {string} message for Role drpodown on search entity popup")
	public void verify_message_for_role_drpodown_on_search_entity_popup(String string) {
		log.info("Verify validation message for Empty Name Field");
		Assert.assertEquals(SearchProPage.validation4_emptyProductRoleDropdown(), string);
	}

	@Then("Select the {string} from the dropdown list")
	public void select_the_something_from_the_dropdown_list(String strArg1) {
		log.info("Select the" + strArg1 + "from the dropdown list");
		if (strArg1.equalsIgnoreCase("BBPS")) {
			Assert.assertTrue(SearchProPage.Select_Product());
		} else if (strArg1.equalsIgnoreCase("Agent Group")) {
			Assert.assertTrue(SearchProPage.Select_Product_Role());
		}
	}

}
