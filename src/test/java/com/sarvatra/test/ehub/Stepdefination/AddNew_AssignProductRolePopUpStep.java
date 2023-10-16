package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.ViewEntityDetailsPage;
import com.sarvatra.test.ehub.pageobjects.ViewEntityDetails_AddNewPage;

import io.cucumber.java.en.Then;

public class AddNew_AssignProductRolePopUpStep {

	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();
	private ViewEntityDetails_AddNewPage addNew = new ViewEntityDetails_AddNewPage(DriverFactory.driver);
	private ViewEntityDetailsPage EntDPage = new ViewEntityDetailsPage(DriverFactory.driver);

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

	@Then("Click on ADD NEW button in Child entity section")
	public void click_on_add_new_button_in_child_entity_section() {
		log.info("Click on ADD NEW button in Child entity section");
		Assert.assertTrue(EntDPage.clickOnAddNewHypertectLink());
	}

	@Then("Select As Acquirer CheckBox on Assign Product Role Pop-Up")
	public void select_Acquirer_CheckBox_on_assign_product_role() {
		log.info("Select As Acquirer CheckBox on Assign Product Role Pop-Up");
		Assert.assertTrue(addNew.clickOnAcquirerCheckBox());
	}

	@Then("Verify that user can see {string} in Product dropdown on Assign Product Role Pop-Up")
	public void verify_that_user_can_see_Product_on_assign_product_role_pop_up(String string)
			throws InterruptedException {
		log.info("Verify that user can see Product:" + string + " in Product dropdown Assign Product Role Pop-Up");
		Assert.assertEquals(addNew.selectProduct(string), string);
	}

	@Then("Verify that user can see {string} & {string} on Assign Product Role Pop-Up")
	public void verify_that_user_can_see_Product_and_role_assign_product_role_pop_up(String string, String string2)
			throws InterruptedException {
		log.info("Verify that user can see Product:" + string + " and Role as: " + string2
				+ " Assign Product Role Pop-Up");
		sa.assertEquals(addNew.selectProduct(string), string);
		Thread.sleep(500);
		sa.assertEquals(addNew.selectProductRole(string2), string2);
		sa.assertAll();
	}

	@Then("Click on Close button on Assign Product Role Pop-Up")
	public void click_on_close_button_on_assign_product_role_pop_up() {
		log.info("Click on Close button on Assign Product Role Pop-Up");
		Assert.assertTrue(addNew.clickOnCloseButtonOnAssign());
	}

	@Then("Verify that user can not see {string} & {string} on Assign Product Role Pop-Up")
	public void verify_that_user_can_Not_see_on_assign_product_role_pop_up(String string, String string2)
			throws InterruptedException {
		log.info("Verify that user can see Product:" + string + " and Role as: " + string2
				+ " Assign Product Role Pop-Up");
		sa.assertTrue(addNew.canNotSeeProductOrRole(string));
		Thread.sleep(500);
		sa.assertTrue(addNew.canNotSeeProductOrRole(string2));
		sa.assertAll();
	}

	@Then("Verify Host admin user can View Assign Product Role popup")
	public void Verify_Host_admin_user_can_View_Assign_Product_Role_popup() {
		log.info("Verify Host admin user can View Assign Product Role popup");
		Assert.assertTrue(addNew.verifyAssignProductRolePopUp());
	}

	@Then("Click on CLOSE button on Assign Product Role popup")
	public void Click_on_CLOSE_button_on_Assign_Product_Role_popup() {
		log.info("Click on CLOSE button on Assign Product Role popup");
		Assert.assertTrue(addNew.clickOnCloseButtonOnAssign());
	}

	@Then("Verify NEXT button should available on Assign Product Role Pop-Up")
	public void Verify_NEXT_button_should_available_on_Assign_Product_Role_popup() {
		log.info("Verify NEXT button should available on Assign Product Role Pop-Up");
		Assert.assertTrue(addNew.clickOnNextButtonOnAssign());
	}

	@Then("Click on Next button on Assign Product Role Pop-Up")
	public void Click_on_NEXT_button_on_Assign_Product_Role_popup() {
		log.info("Click on Next button on Assign Product Role Pop-Up");
		Assert.assertTrue(addNew.clickOnNextButtonOnAssign());
	}

	@Then("Verify {string} message for {string} drpodown on Assign Product Role Pop-Up")
	public void Verify_validation_message_for_drpodown_on_Assign_Product_Role_popup(String string, String string2) {
		log.info("Verify " + string + " message for " + string2 + " drpodown on Assign Product Role Pop-Up");
		Assert.assertTrue(addNew.verifyValidationOnAssignProductPopUp(string, string2));
	}

	@Then("Verify user can not view any role in Role dropdown without slecting Product")
	public void Verify_user_can_not_view_any_role_in_Role_dropdown_without_slecting_Product()
			throws InterruptedException {
		log.info("Verify user can not view any role in Role dropdown without slecting Product");
	}

	@Then("Verify PPI roles should not be view in Role dropdown while selecting {string} in product dropdown")
	public void Verify_PPI_roles_should_not_view_in_Role_for_other_products_except_PPI(String string)
			throws InterruptedException {
		log.info(
				"Verify PPI roles should not be view in Role dropdown while selecting other products except PPI in product dropdown");
		sa.assertTrue(addNew.canNotSeePPIrolesWithOtherProduct(string));
		cf.waitforSometime(500);
		sa.assertAll();
	}
	
	/**
	 * 
	 */
	@Then("Select {string} in Product dropdown and role {string} in Role dropdown on Assign Product Role popup")
	public void select_in_product_dropdown_and_role_in_product_role_onAssignProductRolepopup(String string, String string2)
			throws InterruptedException {
		log.info("Select "+string+" in Product dropdown and role "+string2+" in Role dropdown on Assign Product Role popup");
		sa.assertEquals(addNew.selectProduct(string), string);
		cf.waitforSometime(500);
		sa.assertEquals(addNew.selectProductRole(string2), string2);
		sa.assertAll();
	}
//	@Then("Click on NEXT on Assign Product Role popup")
//	public void Click_on_NEXT_onAssignProductRolepopup()
//			throws InterruptedException {
//		log.info("Click on NEXT on Assign Product Role popup");
//		
//	}
	
	@Then("Select OU on Assign OU popup {string}")
	public void select_OU_On_Assign_OU_Popup(String OU)
			throws InterruptedException {
		log.info("Select OU on Assign OU popup");
		addNew.select_OU_On_Assign_OU_Popup(OU);
	}
	
	@Then("Click on Save Button on Assign OU popup")
	public void Click_On_Save_Button_On_Assign_OU_Popup()
			throws InterruptedException {
		log.info("Click on Save Button on Assign OU popup");
		addNew.click_On_OU_On_Assign_OU_Popup();
	}
	
	@Then("Select Institutions on Assign Institutions popup {string}")
	public void select_Institutions_On_AssignInstitutions_Popup(String institutions)
			throws InterruptedException {
		log.info("Select Institutions on Assign Institutions popup");
		addNew.select_Institutions_On_AssignInstitutions_Popup(institutions);
	}
	
	@Then("Click BC from the list {string}")
	public void select_bc(String bcname)
			throws InterruptedException {
		log.info("Click BC from the list");
		addNew.clickBCFromList(bcname);
	}
	
	@Then("Click Institutions from the list {string}")
	public void select_institution(String institutionname)
			throws InterruptedException {
		log.info("Click Institutions from the list");
		addNew.clickinstitutionFromList(institutionname);
	}
	
	@Then("Click on Save Button on Assign Institutions popup")
	public void Click_On_Save_Button_On_Assign_Institutions_Popup()
			throws InterruptedException {
		log.info("Click on Save Button on Assign Institutions popup");
		addNew.click_On_Institutions_On_AssignInstitutions_Popup();
	}
	
	@Then("Select Acquiring Bank {string} on BC Details_AEPS Page")
	public void selectAcqBank(String bank) throws InterruptedException {
		log.info("Select Acquiring Bank on BC Details_AEPS Page");
		addNew.selectAcqBank(bank);
		
	}
	
	@Then("Select Settlement Bank {string} on BC Details_AEPS Page")
	public void selectSettlementBank(String bank) throws InterruptedException {
		log.info("Select Settlement Bank on BC Details_AEPS Page");
		addNew.selectSettlementBank(bank);
		
	}
	
	@Then("Enter BC Name {string} on BC Details_AEPS Page")
	public void enterBcName(String name) throws InterruptedException {
		log.info("Select Acquiring Bank on BC Details_AEPS Page");
		addNew.enterBcName(name);
		
	}
	
	@Then("Click on Save Button on BC Details_AEPS Page")
	public void Click_On_Save_Button_On_BcDetails_AepsPage()
			throws InterruptedException {
		log.info("Click on Save Button on BC Details_AEPS Page");
		addNew.Click_On_Save_Button_On_BcDetails_AepsPage();
	}
	
	@Then("Click on Save Button on BC Agent Details_AEPS Page")
	public void Click_On_Save_Button_On_BcAgentDetails_AepsPage()
			throws InterruptedException {
		log.info("Click on Save Button on BC Agent Details_AEPS Page");
		addNew.Click_On_Save_Button_On_BcDetails_AepsPage();
	}
	
	@Then("Click on Save Button on User Management Details Page")
	public void Click_On_Save_Button_On_User_Management_Details()
			throws InterruptedException {
		log.info("Click on Save Button on User Management Details Page");
		addNew.Click_On_Save_Button_On_BcDetails_AepsPage();
	}
	
	@Then("Select Terminal Type {string} on BC Details_AEPS Page")
	public void selectTerminal(String type) throws InterruptedException {
		log.info("Select Terminal Type on BC Details_AEPS Page");
		addNew.selectTerminal(type);
		
	}
	
	@Then("Select Branch {string} on BC Details_AEPS Page")
	public void selectBranch(String branch) throws InterruptedException {
		log.info("Select Branch on BC Details_AEPS Page");
		addNew.selectBranch(branch);
		
	}
	
	@Then("Select BC {string} on BC Details_AEPS Page")
	public void selectBC(String bc) throws InterruptedException {
		log.info("Select BC on BC Details_AEPS Page");
		addNew.selectBC(bc);
		
	}
	
	@Then("Enter Mobile number {string} on BC Details_AEPS Page")
	public void enterMobileNumber(String mobile) throws InterruptedException {
		log.info("Enter Mobile number on BC Details_AEPS Page");
		addNew.enterMobileNumber(mobile);
	}	
	
	@Then("Enter Loacation Name {string} on BC Details_AEPS Page")
	public void enterLocation(String location) throws InterruptedException {
		log.info("Enter Loacation Name on BC Details_AEPS Page");
		addNew.enterLocation(location);
	}	
	
	@Then("Enter Address {string} on BC Details_AEPS Page")
	public void enterAddress(String address) throws InterruptedException {
		log.info("Enter Address on BC Details_AEPS Page");
		addNew.enterAddress(address);
	}	
	
	@Then("Enter City {string} on BC Details_AEPS Page")
	public void enterCity(String bc) throws InterruptedException {
		log.info("Enter City on BC Details_AEPS Page");
		addNew.enterCity(bc);
	}	
	
	@Then("Enter State {string} on BC Details_AEPS Page")
	public void enterState(String bc) throws InterruptedException {
		log.info("Enter State on BC Details_AEPS Page");
		addNew.enterState(bc);
	}	
	
	@Then("Enter Pincode {string} on BC Details_AEPS Page")
	public void enterPincode(String bc) throws InterruptedException {
		log.info("Enter Pincode on BC Details_AEPS Page");
		addNew.enterPincode(bc);
	}	
	
	@Then("Select entity {string}")
	public void searchEntity(String entity) throws InterruptedException {
		log.info("Select entity");
		addNew.selectEntity(entity);
	}
	
	@Then("Validate the header {string}")
	public void validateHeader(String header) throws InterruptedException {
		log.info("Validate the header");
		addNew.verifyHeader(header);
	}
	
	@Then("click on Add User")
	public void addUser() throws InterruptedException {
		log.info("click on Add User");
		addNew.addUser();
	}
	
	@Then("Enter Login ID {string}")
	public void userID(String userid) throws InterruptedException {
		log.info("Enter Login ID");
		addNew.userID(userid);
	}
	
	@Then("Enter Display name {string}")
	public void userName(String username) throws InterruptedException {
		log.info("Enter Display name");
		addNew.userName(username);
	}
	
	@Then("Enter Mobile number {string}")
	public void userMobile(String usermobile) throws InterruptedException {
		log.info("Enter Mobile number");
		addNew.userMobile(usermobile);
	}
	
	@Then("Enter User Email id {string}")
	public void userEmail(String useremail) throws InterruptedException {
		log.info("click on Add User");
		addNew.userEmail(useremail);
	}
	
	@Then("Click BC Name {string}")
	public void clickBC(String bc) throws InterruptedException {
		log.info("Click BC Name");
		addNew.clickBCName(bc);
	}
	
	@Then("Click BC Agent {string}")
	public void clickBCAgent(String bcagent) throws InterruptedException {
		log.info("Click BC Name");
		addNew.clickBCAgent(bcagent);
	}
	
	
}
