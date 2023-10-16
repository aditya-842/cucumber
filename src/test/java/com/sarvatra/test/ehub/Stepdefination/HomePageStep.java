package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStep {

	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	private HomePage homePage = new HomePage(DriverFactory.driver);
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

	@Then("User logged in as {string}")
	public void user_logged_in_as(String string) {
		log.info("User Logged in as: " + string);
		Assert.assertEquals(homePage.getUserNameAfterLogin(), string, "Logged in as: " + string);
	}

	@Given("User is on Homepage")
	public void user_is_on_homepage() {
		log.info("User is on HomePage");
		Assert.assertTrue(homePage.verifyUserIsOnHomePage());
	}

	@When("Click on Entities in Configurations Menu")
	public void click_on_entities_in_configurations_menu() {
		log.info("Clicked on Entities in Configurations Menu");
		Assert.assertTrue(homePage.clickOnEntitiesIcon());
	}

	/*
	 * ####################- Owner --> Srihari Kovvuri -###########################
	 * 
	 */
	@When("Click on Users in Configurations Menu")
	public void Click_on_Users_in_Configurations_Menu() {
		log.info("Clicked on Users in Configurations Menu");
		Assert.assertTrue(homePage.clickOnUserIcon());

	}

	@Then("Verify leftHand side menu configurations having Entities")
	public void Verify_leftHand_side_menu_configurations_having_Entities() {
		log.info("verify the left hand menu entities in Configurations Menu");
		Assert.assertTrue(homePage.entities_LeftMenu());
	}

	@Then("Verify leftHand side menu configurations having Users")
	public void Verify_leftHand_side_menu_configurations_having_Users() {
		log.info("verify the left hand menu entities in Configurations Menu");
		Assert.assertTrue(homePage.users_leftMenu());
	}

	@And("Verify lefthand side menu showing reports and changepassword options")
	public void Verify_lefthand_side_menu_showing_reports_and_changepassword_options() {
		Assert.assertTrue(homePage.reports());
		Assert.assertTrue(homePage.changePassword());
	}
	
	/*
	 * ####################- Owner --> Srihari Kovvuri -###########################
	 * 
	 */
	
	@Then("verify ServatraeHub Logo")
	public void verifyServatraeHubLogo() {
		log.info("verify ServatraeHub Logo");
		Assert.assertTrue(homePage.verifyServatraeHub());
	}
	
	@Then("verify BBPS Agent user dahboard BHARAT BILLPAY")
	public void verifyBBPSAgentUserDahboardBHARATBILLPAY() {
		log.info("BBPS Agent user dahboard BHARAT BILLPAY");
		Assert.assertTrue(homePage.verifyBBPSLogo());
		Assert.assertTrue(homePage.verifyPayBill());
		Assert.assertTrue(homePage.verifyRegisterComplaint());
		Assert.assertTrue(homePage.verifyComplaintTracking());
		Assert.assertTrue(homePage.verifyTxnSearch());
		Assert.assertTrue(homePage.verifyWalletStatement());
	}
	
	@Then("verify BBPS Agent user dashboard Configurations")
	public void verifyBBPSAgentUserDahboardConfigurations() {
		log.info("BBPS Agent user dahboard Configurations");
		Assert.assertTrue(homePage.verifyEntitiesButton());
		Assert.assertTrue(homePage.verifyUserButton());
	}
	
	@Then("verify BBPS Agent user dahboard Sarvatra eHub")
	public void verifyBBPSAgentUserDahboardSarvatraeHub() throws InterruptedException {
		log.info("verify BBPS Agent user dahboard Sarvatra eHub");
		Assert.assertTrue(homePage.verifyLeftBBPSMenu());
		homePage.Click_on_LeftBBPS_Menu();
		Assert.assertTrue(homePage.verifyLeftTransactionHistoryMenu());
		Assert.assertTrue(homePage.verifyLeftWalletStatementMenu());
		homePage.Click_on_LeftConfigurationsMenu();
		Assert.assertTrue(homePage.verifyLeftEntitiesMenu());
		Assert.assertTrue(homePage.verifyLeftUsersMenu());
		Assert.assertTrue(homePage.verifyLeftConfigurationsMenu());
		Assert.assertTrue(homePage.verifyLeftReportsMenu());
		Assert.assertTrue(homePage.verifyChangePassword());
		Assert.assertTrue(homePage.verifyLogoutButton());
	}
	
	@When("Click on New Framework")
	public void Click_on_NewFrameWork() throws InterruptedException {
		log.info("Click on New Framework");
		homePage.Click_on_NewFrameWork();

	}
	
	@Then("Click on logout button in new framework")
	public void clickOnLogoutButtonInNewFramework() {
		log.info("Click on logout button in new framework");
		Assert.assertTrue(homePage.clickOnLogOutButton());
	}
	
	@Then("Click on change password")
	public void clickOnChangePassword() throws InterruptedException {
		log.info("Click on change password");
		homePage.ClickChangePassword();
	}
	
	@Then("Click on Left Configurations Menu")
	public void click_on_LeftConfigurationsMenu() throws InterruptedException {
		log.info("Click on Left Configurations Menu");
		homePage.Click_on_LeftConfigurationsMenu();
	}
	
	@Then("Click on Left Entities Menu")
	public void click_on_LeftEntitiesMenu() throws InterruptedException {
		log.info("Click on Left Entities Menu");
		homePage.clickOnLeftEntitiesMenu();
	}
	
	@Then("Click on Left BBPS Menu")
	public void click_on_LeftBBPSMenu() throws InterruptedException {
		log.info("Click on Left Entities Menu");
		homePage.Click_on_LeftBBPS_Menu();
	}
	@Then("Click on Pay Bill module")
	public void click_on_paybill_tab() {
		log.info("Clicking on Pay Bill moduelu");
		homePage.clickOnPayBill();
	}
	@Then("Check Housing Society bill icon")
	public void check_Housing_Society_bill_icon() {
		log.info("Checking Housing Society bill icon");
		homePage.checkHousingSocietyBillicon();
	}
	@Then("Click on Housing Society bill icon")
	public void click_Bill_Icon() {
		log.info("Clicking Housing Society bill icon");
		homePage.clickHousingSocietyBillicon();
	}
	@Then("Select state {string} from select state dropdown")
	public void selectState(String state) {
		log.info("Selecting State from select state dropdown");
		homePage.selectState(state);
	}
	@Then("Submit the state and city selection")
	public void submitStateCity() {
		log.info("Submiting the state and city combination to generate biller info");
		homePage.submitStateCitySelection();
	}
	@Then("Select the biller {string} from the list of society billers")
	public void selectSocietyBiller(String billername) {
		log.info("Selecting a biller from the list of society billers list");
		homePage.selectBillers(billername);
	}
	@Then("Enter flat number {string}")
	public void enterflatNumber(String flatnumber) {
		log.info("Entering flat number in flat number text field");
		homePage.enterFlatNumber(flatnumber);
	}
	@Then("Enter mobile number {string}")
	public void mobileNumberValidation(String number) {
		log.info("Entering mobile number in mobile number number text field");
		homePage.mobileNumberValidation(number);
	}
	@Then("Enter payer emailid {string}")
	public void enteremailid(String emailid) {
		log.info("Entering payer email id in email id text field");
		homePage.enterPayerEmail(emailid);
	}
	@Then("Click on Fetch Bill button for Housing")
	public void clickFetchBill() {
		log.info("Clicking on Fetch Bill button");
		homePage.clickOnFetchBill();
	}
	@Then("Enter amount {string}")
	public void enterAmount(String amount) {
		log.info("Entering amount");
		homePage.enterAmount(amount);
		
		}
	@Then("Click on Validate Bill button")
	public void clickValidateBill() {
		log.info("CLicking on Validate bill button");
		homePage.clickOnValidateBill();
	}
	@Then("Click on Pay Bill button Housing")
	public void clickPayBill() {
		log.info("Clicking on Pay Bill button");
	homePage.clickOnPayBillAfterValidateBillClick();	
	}
	
	@Then("Enter valid Reciept number {string}")
	public void enterRecieptNumber(String number) {
		log.info("Entering valid Reciept number");
		homePage.enterRecieptNumber(number);
		
	}
	
	@Then("Click on Confirm button")
	public void clickConfirmButton() {
		log.info("Clicking on Confirm button");
		homePage.clickOnConfirmButton();
	}
	
	@Then("Print the Reciept after successful transaction")
	public void clickPrintButton() {
		log.info("Printing the Reciept after successful transaction");
		homePage.clickOnPrintButton();
	}
	
	@Then("Select mode of payment {string}")
	public void selectPaymentMode(String paymentMode) throws InterruptedException {
		log.info("Selecting mode of paymen");
		homePage.selectPayementMode(paymentMode);
	}
	
	@Then("Select Biller from Dropdown {string}")
	public void selectBillerfromDropDown(String billerName) throws InterruptedException {
		log.info("Select biller from dropdown");
		homePage.selectBillerfromDropDown(billerName);
	}
	
	@Then("Click on system config")
	public void clickOnSystemConfig() {
		log.info("click on system config");
		homePage.clickOnSystemConfig();
	}

	@Then("Verify user is on dashborad page")
	public void userOnDashPage() {
		log.info("Verify user is on dashborad page");
		homePage.dashPage();
	}

	@Then("Click on yes button")
	public void yesButton() {
		log.info("Click on yes button");
		homePage.clickOnYes();
	}
	
	@Then("Verify user is on OTP page")
	public void userOnOtpPage() {
		log.info("Verify user is on dashborad page");
		homePage.OTPPage();
	}
	
	@Then("Verify Tiles Available For Product {string} {string}")
	public void Verify_Tiles_Available_For_Product(String Product, String tile) throws InterruptedException {
		log.info("Verify Tiles Available For Product");
		Assert.assertTrue(homePage.Verify_Tiles_Available_For_Product(Product, tile));
	}
	
	@Then("Verify Tiles Not Available For Product {string} {string}")
	public void Verify_Tiles_Not_Available_For_Product(String Product, String tile) throws InterruptedException {
		log.info("Verify Tiles Not Available For Product");
		Assert.assertTrue(homePage.Verify_Tiles_Not_Available_For_Product(Product, tile));
	}
	
	@Then("Verify Left Side SubMenu Available For Product {string} {string}")
	public void Verify_Left_Side_SubMenu_Available_For_Product(String Product, String tile) throws InterruptedException {
		log.info("Verify Tiles Available For Product");
		Assert.assertTrue(homePage.Verify_Left_Side_SubMenu_Available_For_Product(Product, tile));
	}
	
	@Then("Verify Left Side SubMenu Not Available For Product {string} {string}")
	public void Verify_Left_Side_SubMenu_Not_Available_For_Product(String Product, String tile) throws InterruptedException {
		log.info("Verify Left Side SubMenu Not Available For Product");
		Assert.assertTrue(homePage.Verify_Left_Side_SubMenu_Not_Available_For_Product(Product, tile));
	}
	
	@Then("Click on Left AEPS Menu On Home Page")
	public void Click_on_Left_AEPS_Menu() throws InterruptedException {
		log.info("Click on Left AEPS Menu On Home Page");
		homePage.Click_on_Left_AEPS_Menu();
	}
	
	@Then("Click on Left MicroATM Menu On Home Page")
	public void Click_on_Left_MicroATM_Menu() throws InterruptedException {
		log.info("Click on Left MicroATM Menu On Home Page");
		homePage.Click_on_Left_MicroATM_Menu();
	}
	
	@Then("Click on Left Sarvatra ATM Menu On Home Page")
	public void Click_on_Left_Sarvatra_ATM_Menu() throws InterruptedException {
		log.info("Click on Left Sarvatra ATM Menu On Home Page");
		homePage.Click_on_Left_Sarvatra_ATM_Menu();
	}
	
	@Then("Click on Tiles On Home Page {string} {string}")
	public void click_On_Tiles(String Product, String Tiles) throws InterruptedException {
		log.info("Click on Tiles On Home Page");
		homePage.click_On_Tiles(Product, Tiles);
	}
}
