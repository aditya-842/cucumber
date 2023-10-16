package com.sarvatra.test.ehub.Stepdefination;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.HomePage;
import com.sarvatra.test.ehub.pageobjects.ViewEntityDetailsPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ViewEntityDetailsStep {

	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	private HomePage homePage = new HomePage(DriverFactory.driver);
	private ViewEntityDetailsPage EntDPage = new ViewEntityDetailsPage(DriverFactory.driver);
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

	@Then("Click on Home icon")
	public void click_on_home_icon() {
		log.info("Clicked on Home icon");
		Assert.assertTrue(EntDPage.clickOnHomeIcon());
	}

	@Then("Click on logout button")
	public void click_on_logout_button() {
		log.info("Click on logout button");
		Assert.assertTrue(homePage.clickOnLogOut());
	}

	@Then("Enter {string} in Child Entities Search Entity search box")
	public void enter_in_child_entities_search_entity_search_box(String string) {
		log.info("Enter <" + string + "> in Child Entities Search Entity search box");
//		cf.waitforSometime(1200);
		Assert.assertTrue(EntDPage.enterValueinChild(string));
	}

	@Then("Verify that user can see {string} in Child entity section")
	public void verify_that_user_can_see_in_Child_entity_section(String string) throws Exception {
		log.info("Verify that user can see '" + string + "' in serached results");
		Assert.assertEquals(EntDPage.viewPPIentityInChildEntity(), string);
		System.out.println("Selected searched value: " + string);
	}

	@Then("Select or click on entity by checking {string} in Child entity")
	public void select_or_click_on_entity_by_checking_in_Child_entity(String string) throws InterruptedException {
		log.info("Select or click on entity by checking " + string);
		Assert.assertEquals(EntDPage.selectSearchResultinChild(string), string);
		System.out.println("Selected searched value: " + string);
	}

	@Then("Select or click on entity by checking {string} & {string} in Child entity")
	public void select_or_click_on_entity_by_checking_in_child(String string, String string2)
			throws InterruptedException {
		log.info("Click on entity by checking ID & Name in Child Enitity section");
		Assert.assertEquals(EntDPage.selectEntityInChildSearchedResult(string, string2), string);
	}

	@Then("Click on Search entity by Name hypertext link")
	public void click_on_search_entity_by_name_hypertext_link() {
		log.info("Click on Search entity by Name hypertext link");
		Assert.assertTrue(EntDPage.clickEntityByNameLink());
	}

	@Then("Verify that user can see {string} & {string} on View Entity Detail screen")
	public void verify_that_user_can_see_on_view_entity_detail_screen(String string, String string2) {
		log.info("Verify that user can see " + string + " on View Entity Detail screen");
		sa.assertEquals(EntDPage.viewProduct(), string, string + " Product is visible");
		log.info("Verify that user can see " + string2 + " on View Entity Detail screen");
		sa.assertEquals(EntDPage.viewRole(), "Role: " + string2, string2 + " Role is visible");
		sa.assertAll();
	}

	@Then("Verify that user can see Active_deactive on View Entity Detail screen in Product details")
	public void verify_that_user_can_see_active_deactive_on_view_entity_detail_screen_in_product_details() {
		log.info("Verify that user can see Active/deactive switch on View Entity Detail screen in Product details");
		Assert.assertTrue(EntDPage.verifyActivatDeactiveSwitch());
	}

	@Then("Verify that user can see Add New hypertext link on View Entity Detail screen in Product details")
	public void verify_that_user_can_see_add_new_hypertext_link_on_view_entity_detail_screen_in_product_details() {
		log.info("Verify that user can see Add New hypertext link on View Entity Detail screen in Product details");
		Assert.assertTrue(EntDPage.verifyAddNewHypertectLink());
	}

	@Then("Verify that user can not see History and Edit button on View Entity Detail screen in Product details")
	public void verify_that_user_can_not_see_historyand_Edit_button_on_view_entity_detail_screen_in_product_details() {
		log.info("Verify that user can not see History button on View Entity Detail screen in Product details");
		sa.assertFalse(EntDPage.prod_HistroyButton());
		log.info("Verify that user can not see Edit button on View Entity Detail screen in Product details");
		sa.assertFalse(EntDPage.editButton());
		sa.assertAll();
	}

	@Then("Verify that user can not see History button on View Entity Detail screen in Product details")
	public void verify_that_user_can_not_see_history_button_on_view_entity_detail_screen_in_product_details() {
		log.info("Verify that user can not see History button on View Entity Detail screen in Product details");
		Assert.assertFalse(EntDPage.prod_HistroyButton());
	}

	@Then("Verify that user can not see Edit button on View Entity Detail screen in Product details")
	public void verify_that_user_can_not_see_edit_button_on_view_entity_detail_screen_in_product_details() {
		log.info("Verify that user can not see Edit button on View Entity Detail screen in Product details");
		Assert.assertFalse(EntDPage.editButton());
	}

	@Then("Verify ADD NEW button should be disable for PPI institution NSDL")
	public void Verify_ADD_NEW_button_should_be_disable_for_PPI_institution() {
		log.info("Clicked on 'Add New' hypertext link");
		Assert.assertFalse(EntDPage.verifyAddNewHypertectLink());
	}

	// Sprint-5

	@Then("Click on ADD USER button on View Entity Detail screen and Verify user navigate to User Management Details screen")
	public void click_on_add_user_button_on_view_entity_detail_screen_and_user_isOn_UserManmentScreen() {
		Assert.assertEquals(EntDPage.clickOnAddUser(), "User Management Details");
	}

	@Then("User navigate to View Entity Details screen for {string} and view {string} message popup")
	public void user_navigate_to_view_entity_details_screen_for_and_view_message_popup(String string, String string2) {
		log.info("User navigate to View Entity Details screen of " + string);
		sa.assertTrue(EntDPage.getID_EntityName().contains(string));
		log.info("User should View '" + string2 + "' message popup on View Entity Details screen of " + string);
		sa.assertEquals(EntDPage.getUserCreatedMessage(), string2);
		sa.assertAll();
	}

	@Then("User navigate to View Entity Details screen for {string}")
	public void user_navigate_to_view_entity_details_screen_for(String string) {
		log.info("User navigate to View Entity Details screen for " + string);
		Assert.assertTrue(EntDPage.getID_EntityName().contains(string));
	}

	/*
	 * ####################- Owner --> Srihari kovvuri -###########################
	 * 
	 */
	@Then("Verify the top lefthand side title displayed as {string}")
	public void Verify_the_top_lefthand_side_title_displayed_as(String title) {
		log.info("verify the titles");
		Assert.assertEquals(title, EntDPage.getrightToptitle());
	}

	@Then("Verify ADD NEW link should be disable for PPI institution NSDL")
	public void Verify_ADD_NEW_link_should_be_disable_for_PPI_institution() {
		log.info("Clicked on 'Add New' hypertext link");
		Assert.assertTrue(EntDPage.verifyAvailabilityofAddNewHypertectLink());
	}

	@And("Verify addnew button")
	public void Verify_addnew_button() {
		log.info("addNew button verify");
		Assert.assertTrue(EntDPage.addUser_Button());
	}
	
	/*
	 * ####################- Owner --> Vivek Nichal -###########################
	 * 
	 */
	
	@Then("Enter Entity Name in Search Entity Text field {string}")
	public void enterEntityNameInSearchEntityTextField(String EntityName) throws InterruptedException {
		log.info("Enter Entity Name in Search Entity Text field");
		Assert.assertTrue(EntDPage.enterEntityNameInSearchEntityTextField(EntityName));
	}
	
	@Then("Verify Search result {string}")
	public void verifySearchResult(String EntityName) throws InterruptedException {
		log.info("Verify Search result");
		Assert.assertTrue(EntDPage.verifySearchResultEntityName(EntityName));
	}
	
	@Then("Verify ID Entity Name On View Details Page {string}")
	public void verifyIDEntityNameOnViewDetailsPage(String EntityName) throws InterruptedException {
		log.info("Verify ID Entity Name On View Details Page");
		Assert.assertTrue(EntDPage.verifyIDEntityName(EntityName));
	}
	
	@Then("Verify ID Entity Created By On View Details Page {string}")
	public void verifyIDEntityCreatedByOnViewDetailsPage(String EntityName) throws InterruptedException {
		log.info("Verify ID Entity Created By On View Details Page");
		Assert.assertTrue(EntDPage.verifyIDEntityCreatedBy(EntityName));
	}
	
	@Then("Verify Entity Type On View Details Page {string}")
	public void verifyEntityTypeOnViewDetailsPage(String EntityType) throws InterruptedException {
		log.info("Verify Entity Type On View Details Page");
		Assert.assertTrue(EntDPage.verifyEntityType(EntityType));
	}
	
	@Then("Verify Entity Created Date On View Details Page {string}")
	public void verifyEntityCreatedDateOnViewDetailsPage(String CreatedDate) throws InterruptedException {
		log.info("Verify Entity Created Date On View Details Page");
		Assert.assertTrue(EntDPage.verifyEntityCreatedDate(CreatedDate));
	}
	
	@Then("Verify Entity Below Line Details")
	public void verifyEntityBelowLineDetails() throws InterruptedException {
		log.info("Verify Entity Below Line Details");
		Assert.assertTrue(EntDPage.verifyBelowLine());
	}
	
	@Then("Click On Searched Entity {string}")
	public void verifyEntityBelowLineDetails(String EntityName) throws InterruptedException {
		log.info("Click On Searched Entity");
		Assert.assertTrue(EntDPage.clickOnSearchResultEntityName(EntityName));
	}
	
	@Then("Verify Manage permission Link")
	public void verifyManagePermissionLink() throws InterruptedException {
		log.info("Virify Manage permission Link");
		Assert.assertTrue(EntDPage.verifyManagePermisions_Link_Available());
	}
	
	@Then("Verify Add Logo Link")
	public void verifyAddLogoLink() throws InterruptedException {
		log.info("Virify Add Logo Link");
		Assert.assertTrue(EntDPage.verifyAddLogo_Link_Available());
	}
	
	@Then("Verify Add User Button")
	public void verifyAddUserButton() throws InterruptedException {
		log.info("Virify Add User Button");
		Assert.assertTrue(EntDPage.verifyAddUser_Button_Available());
	}
	
	@Then("Verify Add Product Button")
	public void verifyAddProductButton() throws InterruptedException {
		log.info("Virify Add Product Button");
		Assert.assertTrue(EntDPage.verifyAddPRODUCT_Button_Available());
	}
	
	@Then("Verify Active Toggle Button")
	public void verifyActiveToggleButton() throws InterruptedException {
		log.info("Virify Active Toggle Button");
		Assert.assertTrue(EntDPage.verifyActive_Toggle_Button_Available());
	}
	
	@Then("Verify History Button")
	public void verifyHistoryButton() throws InterruptedException {
		log.info("Virify History Button");
		Assert.assertTrue(EntDPage.verifyHistory_Button_Available());
	}
	
	@Then("Click On Entity From List On View Entity Details Page For Flow {string}")
	public void Click_On_Entity_From_List_On_View_Entity_Details_Page(String Entity) throws InterruptedException {
		log.info("Click On Entity From List On View Entity Details Page For Flow");
		EntDPage.Click_On_Entity_From_List_On_View_Entity_Details_Page_For_Flow(Entity);
	}
	
	@Then("Click On Back Button For View Entity page")
	public void Click_On_Back_Button() throws InterruptedException {
		log.info("Click On Back Button For View Entity page");
		EntDPage.Click_On_Back_Button();
	}
	
	@Then("Click On First Entity From List On View Entity Details Page For Flow")
	public void Click_On_First_Entity_From_List_On_View_Entity_Details_Page_For_Flow() throws InterruptedException {
		log.info("Click On First Entity From List On View Entity Details Page For Flow");
		EntDPage.Click_On_First_Entity_From_List_On_View_Entity_Details_Page_For_Flow();
	}
	
	@Then("Click On Edit Icon")
	public void clickOnEditIcon() {
		log.info("Click On Edit Icon");
		EntDPage.clickOnEditIcon();
	}
	
	@Then("Verify Agent Institution Details page")
	public void verifyToolbarAIdetails() {
		log.info("Verify Agent Institution Details page");
		Assert.assertTrue(EntDPage.verifyToolbarAIdetails());
	}
	
	@Then("Verify edit icon is displayed")
	public void verify_Edit_Icon_Is_Displayed_View_Entity_Details_Page() {
		log.info("Verify edit icon is displayed");
		Assert.assertTrue(EntDPage.verifyEditIconISDisplayed());
	}
	
	@Then("Verify Entity {string} is displayed")
	public void verifyentity(String viewentity) throws InterruptedException {
		log.info("Verify edit icon is displayed");
		Assert.assertTrue(EntDPage.verifyentity(viewentity));
	}
	@Then("Get Entity count")
	public void getentitycount() {
		log.info("Get Entity count");
		EntDPage.getentitycount();
	}
	
	@Then("verify AI ID Is visible On View Entity Details Page")
	public void verifyAIIDIsvisibleOnViewEntityDetailsPage() throws InterruptedException {
		log.info("verify AI ID Is visible On View Entity Details Page");
		Assert.assertTrue(EntDPage.verifyAIIDIsvisibleOnViewEntityDetailsPage());
	}
	
	@Then("verify AI Type Is visible On View Entity Details Page")
	public void verifyAITypeIsvisibleOnViewEntityDetailsPage() throws InterruptedException {
		log.info("verify AI Type Is visible On View Entity Details Page");
		Assert.assertTrue(EntDPage.verifyAITypeIsvisibleOnViewEntityDetailsPage());
	}
	
	@Then("verify AI Acquiring Entity Is visible On View Entity Details Page")
	public void verifyAIAcquiringEntityIsvisibleOnViewEntityDetailsPage() throws InterruptedException {
		log.info("verify AI Acquiring Entity Is visible On View Entity Details Page");
		Assert.assertTrue(EntDPage.verifyAIAcquiringEntityIsvisibleOnViewEntityDetailsPage());
	}
	
	@Then("verify AI Agent Institution Name Is visible On View Entity Details Page")
	public void verifyAIAgentInstitutionNameIsvisibleOnViewEntityDetailsPage() throws InterruptedException {
		log.info("verify AI Agent Institution Name Is visible On View Entity Details Page");
		Assert.assertTrue(EntDPage.verifyAIAcquiringEntityIsvisibleOnViewEntityDetailsPage());
	}
	
	@Then("verify OU ID Is visible On View Entity Details Page")
	public void verifyOUIDIsvisibleOnViewEntityDetailsPage() throws InterruptedException {
		log.info("verify AI ID Is visible On View Entity Details Page");
		Assert.assertTrue(EntDPage.verifyOUIDIsvisibleOnViewEntityDetailsPage());
	}
	
	@Then("verify OU Type Is visible On View Entity Details Page")
	public void verifyOUTypeIsvisibleOnViewEntityDetailsPage() throws InterruptedException {
		log.info("verify AI Type Is visible On View Entity Details Page");
		Assert.assertTrue(EntDPage.verifyOUTypeIsvisibleOnViewEntityDetailsPage());
	}
	
	@Then("Click On Child Entity {string}")
	public void childentity(String EntityName) throws InterruptedException {
		log.info("Click On Searched Entity");
		Assert.assertTrue(EntDPage.childentity(EntityName));
	}
	
	@Then("verify AG {string} Is visible On View Entity Details Page")
	public void verifyAGDetailsOnViewEntityDetailsPage(String details) throws InterruptedException {
		log.info("verify AG ID Is visible On View Entity Details Page");
		Assert.assertTrue(EntDPage.verifyAGDetailsOnViewEntityDetailsPage(details));
	}
	
	@Then("verify AG Detail {string} Is visible On View Entity Details Page")
	public void verifyAGDetailOnViewEntityDetailsPage(String details) throws InterruptedException {
		log.info("verify AG ID Is visible On View Entity Details Page");
		Assert.assertTrue(EntDPage.verifyAGDetailOnViewEntityDetailsPage(details));
	}
	
	@Then("Check Status On View Entity Details Page {string}")
	public void CheckStatusOnViewEntityDetailsPage(String status) throws InterruptedException {
		log.info("Check Status On View Entity Details Page {string}");
		Assert.assertTrue(EntDPage.CheckStatusOnViewEntityDetailsPage(status));
	}
	
	@Then("verify {string} wallet ID On View Entity Details Page")
	public void verifywalletIDOnViewEntityDetailsPage(String details) throws InterruptedException {
		log.info("verify {string} wallet ID On View Entity Details Page");
		Assert.assertTrue(EntDPage.verifywalletIDOnViewEntityDetailsPage(details));
	}
	
	@Then("Click On Products")
	public void ClickOnProducts() throws InterruptedException {
		log.info("Click On Products");
		Assert.assertTrue(EntDPage.ClickOnProducts());
	}
	
	@Then("Select product {string}")
	public void SelectProduct(String product) throws InterruptedException {
		log.info("Select product {string}");
		Assert.assertTrue(EntDPage.SelectProduct(product));
	}
	
	@Then("Select product role {string}")
	public void SelectProductRole(String productrole) throws InterruptedException {
		log.info("Select product role {string}");
		Assert.assertTrue(EntDPage.SelectProductRole(productrole));
	}
	
	@Then("Click On Search Button On Popup for Search By Entity Name")
	public void ClickOnSearchButtonOnPopupforSearchByEntityName( ) throws InterruptedException {
		log.info("Click On Search Button On Popup for Search By Entity Name");
		Assert.assertTrue(EntDPage.ClickOnSearchButtonOnPopupforSearchByEntityName( ));
	}
	
	@Then("Click On child Enity {string} On Popup for Search By Entity Name")
	public void ClickOnChildEntityOnPopupforSearchByEntityName(String entity) throws InterruptedException {
		log.info("Click On child Enity {string} On Popup for Search By Entity Name");
		Assert.assertTrue(EntDPage.ClickOnChildEntityOnPopupforSearchByEntityName(entity));
	}
	
	@Then("Verify Disabled icons for Bill Pay Enabled and Wallet Enabled")
	public void verifyEnabledandDispaledOnViewEntityDetailsPage() throws InterruptedException {
		log.info("Verify Disabled icons for Bill Pay Enabled and Wallet Enabled");
		Assert.assertTrue(EntDPage.verifyEnabledandDispaledOnViewEntityDetailsPage());
	}
	
	@Then("Click On Manage permission Link On View Entity Details Page")
	public void click_On_Manage_Permission_Link() throws InterruptedException {
		log.info("Click On Manage permission Link On View Entity Details Page");
		EntDPage.click_On_Manage_Permission_Link();
	}
	
	@Then("Verify Permission Available On Manage Permission Popup {string} {string}")
	public void verify_Permission_Available_On_Manage_Permission_Popup(String Product, String Permission) throws InterruptedException {
		log.info("Verify Permission Available On Manage Permission Popup");
		Assert.assertTrue(EntDPage.verify_Permission_Available_On_Manage_Permission_Popup(Product, Permission));
	}
	
	@Then("Verify Permission Not Available On Manage Permission Popup {string} {string}")
	public void verify_Permission_Not_Available_On_Manage_Permission_Popup(String Product, String Permission) throws InterruptedException {
		log.info("Verify Permission Not Available On Manage Permission Popup");
		Assert.assertTrue(EntDPage.verify_Permission_Not_Available_On_Manage_Permission_Popup(Product, Permission));
	}
	
	@Then("Verify Key and value filed On View Entity Page {string} {string}")
	public void verify_Key_And_Value_Filed_On_View_Entity_Page(String Key, String Value) throws InterruptedException {
		log.info("Verify Key and value filed On View Entity Page");
		Assert.assertTrue(EntDPage.verify_Key_And_Value_Filed_On_View_Entity_Page(Key, Value));
	}
	
	
}
