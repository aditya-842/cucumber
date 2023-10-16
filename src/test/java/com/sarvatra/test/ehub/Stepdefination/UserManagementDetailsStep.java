package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.UserManagementDetailsPage;
import com.sarvatra.test.ehub.pageobjects.ViewEntityDetailsPage;

import io.cucumber.java.en.Then;

public class UserManagementDetailsStep {

	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	private UserManagementDetailsPage umdpage = new UserManagementDetailsPage(DriverFactory.driver);
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
	
	//owner aditya
	 
 //public void click_on_dafault_selected_admin_checkbox_to_edit_the_admin_non_admin_permission() {
//		log.info("Click on edit button icon in Action column.");
//	Assert.assertTrue(umdpage.ClickOnAdminAndDefaultpermissioncheckbox());
//	}

	@Then("Enter {string} in Login Id - Search box text field to search user")
	public void enter_in_login_id_search_box_text_field_to_search_user(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Click on edit button icon in Action column.")
	public void click_on_edit_button_icon_in_action_column() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Verify that user navigate to User Management Details screen")
	public void verify_that_user_navigate_to_user_management_details_screen() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Enter the user details in {string}, {string}, {string} text fields on UMD via Entity")
	public void enter_the_user_details_in_text_fields_on_umd_via_entity(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Click on Active dropdown and select to {string} on User Management Detail screen")
	public void click_on_active_dropdown_and_select_to_on_user_management_detail_screen(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Click on Admin checkbox to edit the admin\\/Non_admin permission")
	public void click_on_admin_checkbox_to_edit_the_admin_non_admin_permission() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Verify toaster-Validation message {string} should display on View Entity details page")
	public void verify_toaster_validation_message_should_display_on_view_entity_details_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("Verify user is on User Management Details screen")
	public void verify_user_is_on_user_management_details_page() {
		log.info("Verify user is on User Management  Details page");
		Assert.assertEquals(umdpage.verifyUserManagementDetailsPageTitle(), "User Management Details");
	}

	@Then("Verify mandatory text fields-Login Id, Display Name, Mobile Number, Email on User Management Details screen")
	public void verify_mandatory_text_fields_login_id_display_name_mobile_number_email_on_user_management_details_screen() {
		log.info(
				"Verify mandatory text fields-Login Id, Display Name, Mobile Number, Email on User Management Details screen");
		Assert.assertTrue(umdpage.mandatoryTextFieldsOnUMD());
	}

	@Then("Verify Entity dropdown should dislplay and {string} is prepopulated in Entity dropdown on User Management Detail screen")
	public void verify_entityDropdown_isDisplayed_and_EntityName_prepopulated_in_Entity_dropdown(String string) {
		log.info("Verify Entity dropdown should dislplay and " + string
				+ " is prepopulated in Entity dropdown on User Management Detail screen");
		Assert.assertTrue(umdpage.verifyPepopulatedValueInEntityDropdownOnUMD(string));
	}

	@Then("Verify Active dropdown should dislplay and {string} is default selected on User Management Detail screen")
	public void verify_active_dropdown_on_view_entity_detail_screen(String string) {
		log.info("Verify Active dropdown should dislplay and " + string
				+ " is default selected on User Management Detail screen");
		Assert.assertTrue(umdpage.verifyActiveDropdownWithYselectedOnUMD(string));
	}

	@Then("Verify Admin check box is Default checked and not able to uncheck on User Management Detail screen")
	public void verify_admin_check_box_is_default_checked_and_not_able_to_uncheck_on_view_entity_detail_screen() {
		log.info("Verify Admin check box is Default checked and not able to uncheck on User Management Detail screen");
		Assert.assertTrue(umdpage.verifyAdminCheckboxisDefaultCheckedOnUMD());
	}

	@Then("Verify user can view SAVE and BACK button on User Management Details screen")
	public void verify_user_can_view_save_and_back_button_on_user_management_details_screen() {
		log.info("Verify user can view SAVE button on User Management Details screen");
		sa.assertTrue(umdpage.verifyVisibilityofSaveButtonOnUMD());
		log.info("Verify user can view BACK button on User Management Details screen");
		sa.assertTrue(umdpage.verifyVisibilityofBackButtonOnUMD());
		sa.assertAll();
	}

	@Then("Enter the user details in {string}, {string}, {string}, {string} text fields on UMD via Entity")
	public void enter_the_user_details_in_text_fields(String string, String string2, String string3, String string4) {
		log.info("Enter the user details in Login ID text fields on UMD via Entity");
		sa.assertTrue(umdpage.enterLoginIDOnUMD(string));
		log.info("Enter the user details in Display Name text fields on UMD via Entity");
		sa.assertTrue(umdpage.enterDisplayNameOnUMD(string2));
		log.info("Enter the user details in Mobile No text fields on UMD via Entity");
		sa.assertTrue(umdpage.enterMobileNoOnUMD(string3));
		log.info("Enter the user details in Email text fields on UMD via Entity");
		sa.assertTrue(umdpage.enterEmailOnUMD(string4));
		sa.assertAll();
	}

	@Then("Click on SAVE button on User Management Details screen")
	public void click_on_save_button_on_user_management_details_screen() {
		log.info("Click on SAVE button on User Management Details screen");
		Assert.assertTrue(umdpage.clickonSaveButtonOnUMD());
	}

	@Then("CLick on BACK button on User Management Details screen")
	public void c_lick_on_back_button_on_user_management_details_screen() {
		log.info("CLick on BACK button on User Management Details screen");
		Assert.assertTrue(umdpage.clickonBackButtonOnUMD());
	}

	@Then("Verify {string} message for {string} {string} field on User Management Details screen")
	public void verify_message_for_empty_login_id_field_on_user_management_details_screen(String string, String string2,
			String string3) {
		log.info("Verify " + string + " message for " + string2 + " " + string3
				+ " field on User Management Details screen");
		Assert.assertEquals(umdpage.verifyValidationMessagesOnUMD(string3), string);
	}

	/*
	 * #######################- Owner --> Amol Kale ##############################
	 *
	 */

	@Then("Enter the user details in {string}, {string},{string},{string},{string}, {string}, {string} text fields")
	public void enter_the_user_details_in_text_fields(String string, String string2, String string3, String string4,
			String string5, String string6, String string7) throws InterruptedException {
		log.info(
				"Enter the user details in {string}, {string},{string},{string},{string}, {string}, {string} text fields");
		
		log.info("Enter the user details in Login ID text fields on UMD via User");
		sa.assertTrue(umdpage.setLoginId(string));
		log.info("Enter the user details in Display Name text fields on UMD via User");
		sa.assertTrue(umdpage.setDisplayName(string2));
		log.info("Select product dropdown on UMD via User");
		sa.assertTrue(umdpage.selectProductDropdown());
		log.info("Select product from product dropddown on UMD via User");
		sa.assertTrue(umdpage.selectProductInDropdownOnUMD(string3));
		log.info("Select product role dropdown on UMD via User");
		sa.assertTrue(umdpage.selectProductRoleDropdown());
		log.info("select product role from on UMD via User");
		sa.assertTrue(umdpage.selectProductRoleInDropdownOnUMD(string4));
		log.info("Select entity from dropdown on UMD via User");
		sa.assertTrue(umdpage.selectEntityInDropdownOnUMD(string5));
		log.info("Enter the user details in Mobile text fields on UMD via User");
		sa.assertTrue(umdpage.setMobileNumber(string6));
		log.info("Enter the user details in Email text fields on UMD via User");
		sa.assertTrue(umdpage.setEmailId(string7));
		sa.assertAll();
		
		
	}

	@Then("Click on Back button and verify that user should be navigate to User Management page")
	public void click_on_back_button_and_verify_that_user_should_be_navigate_to_user_management_page() {
		log.info("Click on Back button and verify that user should be navigate to User Management page");
		cf.waitforSometime(500);
		Assert.assertEquals(umdpage.clickOnBackbuttonVerifyUserManagementPageTilte(), "User Management");
	}

	@Then("Verify all {int} input and dropdown fields on User Management Details screen")
	public void verify_all_input_and_dropdown_fields_on_user_management_details_screen(int string)
			throws InterruptedException {
		log.info("Verify all {int} input and dropdown fields on User Management Details screen");
		Assert.assertTrue(umdpage.verifyInputAndDropdownFieldsOnUMDScreen(string));
	}

	@Then("Verify that user can see all {int} existing product with PPI in product dropdown")
	public void verify_that_user_can_see_all_existing_product_with_ppi_in_product_dropdown(int count) {
		log.info("Verify that user can see all {int} existing product with PPI in product dropdown");
		umdpage.selectProductDropdown();
		cf.waitforSometime(500);
		Assert.assertTrue(umdpage.VerifyProductInProductDordown(count));
	}

	@Then("Select {string} product from product dropdown")
	public void select_product_from_product_dropdown(String string) throws InterruptedException {
		log.info("Select {string} product from product dropdown");
		Assert.assertTrue(umdpage.selectProductInDropdownOnUMD(string));
	}

	@Then("Verify that user can see  all {int} Product Role in Product role dropdown")
	public void verify_that_user_can_see_all_product_role_in_product_role_dropdown(int count) {
		log.info("Verify that user can see  all {int} Product Role in Product role dropdown");
		umdpage.selectProductRoleDropdown();
		cf.waitforSometime(500);
		Assert.assertTrue(umdpage.VerifyProductRoleInDorpdown(count));
	}

	@Then("Select {string} in product dropdown and role {string} in product role")
	public void select_in_product_dropdown_and_role_in_product_role(String string, String string2)
			throws InterruptedException {
		log.info("Select {string} in product dropdown and role {string} in product role");
		sa.assertTrue(umdpage.selectProductDropdown());
		log.info("Select product from product dropddown on UMD via User");
		sa.assertTrue(umdpage.selectProductInDropdownOnUMD(string));
		cf.waitforSometime(500);
		log.info("Select product role dropdown on UMD via User");
		sa.assertTrue(umdpage.selectProductRoleDropdown());
		cf.waitforSometime(500);
		log.info("select product role from on UMD via User");
		sa.assertTrue(umdpage.selectProductRoleInDropdownOnUMD(string2));
		sa.assertAll();
		
		
	}

	@Then("Verify user can see & select {string} in Search Entity dropdown")
	public void verify_user_can_see_select_in_search_entity_dropdown(String string) throws InterruptedException {
		log.info("Verify user can see & select {string} in Search Entity dropdown");
		Assert.assertTrue(umdpage.selectEntityInDropdownOnUMD(string));
	}

	@Then("Verify Admin checkbox should not be displayed before select entity")
	public void verify_admin_checkbox_should_not_be_displayed_before_select_entity() {
		log.info("Verify Admin checkbox should not be displayed before select entity");
		Assert.assertFalse(umdpage.verifyAdminCheckBoxNotDisplayedOnUMD());
	}

	@Then("Click on Save button")
	public void click_on_save_button() {
		log.info("Click on Save button");
		Assert.assertTrue(umdpage.clickOnSaveButton());
	}

	@Then("Verify that {string} message for  Select Entity dropdown on User Management Details screen")
	public void verify_that_message_for_select_entity_dropdown_on_user_management_details_screen(String string) {
		log.info("Verify that {string} message for  Select Entity dropdown on User Management Details screen");
		Assert.assertEquals(umdpage.ValidationMsgForEmptyEntityField(), string);
	}

	@Then("User navigate to User Management screen and view {string} message popup")
	public void User_navigate_to_User_Management_screen_and_view_message_popup(String string) {
		log.info("User navigate to User Management screen and view " + string + " message popup");
		sa.assertEquals(umdpage.getUserCreatedMessage(), string);
		sa.assertAll();
	}

	@Then("Click on ADD USER button on User Management screen and Verify user navigate to User Management Details screen via Users")
	public void click_on_add_user_button_on_view_entity_detail_screen_and_user_isOn_UserManmentScreen_via_Users() {
		log.info(
				"Click on ADD USER button on User Management screen and Verify user navigate to User Management Details screen");
		sa.assertEquals(umdpage.clickOnAddUser(), "User Management Details");
		sa.assertAll();
	}

	@Then("Click on Users")
	public void clickOnUsers() {
		log.info("Click on Users");
		umdpage.clickOnUsers();;
	}
	
	@Then("Verify Agentid Field")
	public void agentidField() {
		log.info("Verify Agentid Field");
		umdpage.verifyAgentid();
	}
	
	@Then("Verify AgentId input Field")
	public void verifyAgentIdInputField() {
		log.info("Verify AgentId input Field");
		umdpage.verifyAgentIdInputField();
	}
	
	@Then("Click AgentId Dropdown")
	public void verifyAgentIdDropDown() {
		log.info("verify and click AgentId input Field");
		umdpage.clickAgentIdDropDownButton();
	}
	
	@Then("Verify Dropdown Value {string}")
	public void verifyDropdownValue(String option) {
		log.info("Verify Dropdown Value");
		umdpage.verifyDropdwnValue(option);
	}
	

	@Then("Click User Management Grid filter Dropdown")
	public void clickUmGridDropdown() {
		log.info("Click User Management Grid filter Dropdown");
		umdpage.clickUmGridFilterDropdown();
	}
	
	@Then("Verify Agent id in User Management Grid filter Dropdown")
	public void verifyUmGridFilterDropdown() {
		log.info("Verify Agent id in User Management Grid filter Dropdown");
		umdpage.verifyUmGridFilterDropdown();
	}
	
	@Then("Click On Admin CheckBox On User Management Details Page")
	public void click_On_Admin_CheckBox_On_User_Management_Details() {
		log.info("Click On Admin CheckBox On User Management Details Page");
		umdpage.click_On_Admin_CheckBox_On_User_Management_Details();
	}
	
	@Then("Verify Permission Available On User Management Details Page {string} {string}")
	public void verify_Permission_Available_On_User_Management_Details_Page(String Product, String Permission) {
		log.info("Verify Permission Available On User Management Details Page");
		Assert.assertTrue(umdpage.verify_Permission_Available_On_User_Management_Details_Page(Product, Permission));
	}
	
	@Then("Verify Permission Not Available On User Management Details Page {string} {string}")
	public void verify_Permission_Not_Available_On_User_Management_Details_Page(String Product, String Permission) {
		log.info("Verify Permission Not Available On User Management Details Page");
		Assert.assertTrue(umdpage.verify_Permission_Not_Available_On_User_Management_Details_Page(Product, Permission));
	}
	
}
