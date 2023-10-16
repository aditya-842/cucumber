package com.sarvatra.test.ehub.pageobjects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.util.CommonFunctions;

import io.reactivex.rxjava3.functions.Action;

public class HomePage {
	/*
	 * #######################- Owner --> Mayur Kale -##############################
	 * 
	 */
	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions cf;
	LoginPage lp;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		cf = new CommonFunctions(driver);
		lp = new LoginPage(driver);
	}

// #Elements on Top-Right-Corner Section

	@FindBy(xpath = "//div[@style='text-align: right;']//div[@class='ng-binding']")
	@CacheLookup
	WebElement userNameText;

// #Elements in Left-Side Bar Section

	@FindBy(xpath = "//md-sidenav[@md-component-id='left']//md-toolbar/*")
	@CacheLookup
	WebElement sarvatraEhubIcon;

	@FindBy(xpath = "//button[@aria-label='Logout']")
	@CacheLookup
	WebElement logout;

// #Elements in Bharat BillPay Section

	@FindBy(xpath = "//tr[@check-module='BBPS']//label[contains(.,'Transaction History')]")
	@CacheLookup
	WebElement bbpsTxnHistory;

	@FindBy(xpath = "")
	@CacheLookup
	WebElement bbpsWalletStatement;

// #Elements in Sarvatra ATM Section

	@FindBy(xpath = "//tr[@check-module='SRVT_MN_ATM']//label[contains(.,'Transaction History')]")
	@CacheLookup
	WebElement miniatmTxnHistory;

	@FindBy(xpath = "")
	@CacheLookup
	WebElement miniatmBulkUpload;

	@FindBy(xpath = "")
	@CacheLookup
	WebElement miniatmSettlementReport;

	@FindBy(xpath = "")
	@CacheLookup
	WebElement miniatmMerchantOnboard;

	@FindBy(xpath = "")
	@CacheLookup
	WebElement miniatmReconDashboard;

// #Elements in microATM Section

	@FindBy(xpath = "//tr[@check-module='MICRO_ATM']//label[contains(.,'Transaction History')]")
	@CacheLookup
	WebElement microatmTxnHistory;

	@FindBy(xpath = "//tr[@check-module='MICRO_ATM']//label[contains(.,'BulkUpload')]")
	@CacheLookup
	WebElement microatmBulkUpload;

	@FindBy(xpath = "")
	@CacheLookup
	WebElement miniatmReconData;

	@FindBy(xpath = "")
	@CacheLookup
	WebElement microatmReconDashboard;

// #Elements in Configurations Section

	@FindBy(xpath = "//div[@role='button'][contains(.,'Entities')]//md-icon")
	@CacheLookup
	WebElement entitiesIcon;

	@FindBy(xpath = "//div[@role='button'][contains(.,'Services')]")
	@CacheLookup
	WebElement servicesIcon;

	@FindBy(xpath = "//div[@role='button'][contains(.,'Channels')]")
	@CacheLookup
	WebElement channelsIcon;

	@FindBy(xpath = "//div[@role='button'][contains(.,'Users')]")
	@CacheLookup
	WebElement usersIcon;

	@FindBy(xpath = "//div[@role='button'][contains(.,'System Conf')]")
	@CacheLookup
	WebElement sysstemConfigIcon;

	@FindBy(xpath = "//div[@role='button'][contains(.,'Migration')]")
	@CacheLookup
	WebElement migrationIcon;

// #Elements on Other Page (View Entity Details Page)

	@FindBy(xpath = "//h2[contains(text(),'View Entity Details')]")
	@CacheLookup
	WebElement entityDetailsTitle;

	/*
	 * ####################- Owner --> Srihari Kovvuri -###########################
	 * 
	 */
	@FindBy(xpath = "//h2[contains(text(),'User Management')]")
	@CacheLookup
	WebElement UserManagementDetailsTitle;

	@FindBy(xpath = "//button[@aria-label='Entities']")
	WebElement EntitiesLMenu;

	@FindBy(xpath = "//button[@aria-label='Users']")
	WebElement UsersLMenu;

	@FindBy(xpath = "//div//button[@aria-label='Reports']")
	WebElement ReportsMenu;

	@FindBy(xpath = "//div//button[@aria-label='Change Password']")
	WebElement ChangePasswordMenu;

	@FindBy(xpath = "//div//span[@class='bgwhite' and contains(text(),'Configurations')]")
	WebElement ConfigurationLMenu;

	/*
	 * ####################- Owner --> Vivek Nichal -###########################
	 * 
	 */
	@FindBy(xpath = "//a[@class='navbar-brand']")
	@CacheLookup
	WebElement HomeButton;

	@FindBy(xpath = "//img[@src='assets/img/bbps-dashboard.png']")
	@CacheLookup
	WebElement BBPSLogo;

	@FindBy(xpath = "//label[text()='Pay Bill']")
	@CacheLookup
	WebElement PayBill;

	@FindBy(xpath = "//label[text()='Register Complaint']")
	@CacheLookup
	WebElement RegisterComplaint;

	@FindBy(xpath = "//label[text()='Complaint Tracking']")
	@CacheLookup
	WebElement ComplaintTracking;

	@FindBy(xpath = "//label[text()='Txn Search']")
	@CacheLookup
	WebElement TxnSearch;

	@FindBy(xpath = "//label[text()='Wallet Statement']")
	@CacheLookup
	WebElement WalletStatement;

	@FindBy(xpath = "//label[text()='Entities']")
	@CacheLookup
	WebElement EntitiesButton;

	@FindBy(xpath = "//label[text()='Users']")
	@CacheLookup
	WebElement UsersButton;

	@FindBy(xpath = "//span[text()='BBPS']")
	@CacheLookup
	WebElement LeftBBPSMenu;

	@FindBy(xpath = "//span[text()='Transaction History']")
	@CacheLookup
	WebElement LeftTransactionHistoryMenu;

	@FindBy(xpath = "//span[text()='Wallet Statement']")
	@CacheLookup
	WebElement LeftWalletStatementMenu;

	@FindBy(xpath = "//span[text()='Configurations']")
	@CacheLookup
	WebElement LeftConfigurationsMenu;

	@FindBy(xpath = "//span[text()='Entities']")
	@CacheLookup
	WebElement LeftEntitiesMenu;

	@FindBy(xpath = "//md-tab-item[@class='md-tab']//span[contains(text(),'Housing Society')]")
	@CacheLookup
	WebElement HousingSocietyBillIcon;

	@FindBy(xpath = ".//*[@class='md-raised srvt-btn md-button md-ink-ripple']")
	@CacheLookup
	WebElement SubmitStateCitySelection;

	@FindBy(xpath = ".//button[contains(text(),'Fetch Bill')]")
	@CacheLookup
	WebElement fetchBillButton;

	@FindBy(xpath = ".//button[contains(text(),'Validate Bill')]")
	@CacheLookup
	WebElement validateBillButton;

	@FindBy(xpath = ".//button[contains(text(),'Pay Bill')]")
	@CacheLookup
	WebElement payBillButton;

	@FindBy(id = "cashReceiptNumber")
	@CacheLookup
	WebElement recieptNumberField;

	@FindBy(xpath = ".//button[contains(text(),'Print')]")
	@CacheLookup
	WebElement printButton;
	@FindBy(id = "selectedPayMode")
	@CacheLookup
	WebElement paymentModeDropdown;

	@FindBy(xpath = ".//button[contains (text(),'Confirm')]")
	@CacheLookup
	WebElement confirmButton;

	@FindBy(xpath = ".//*[contains(text(),'Confirm Payment')]")
	@CacheLookup
	WebElement paymentPageHeader;

	@FindBy(xpath = ".//*[@class='md-autocomplete-suggestions']/li[1]")
	@CacheLookup
	WebElement SelectState;

	@FindBy(xpath = ".//input[@name='searchStateText']")
	@CacheLookup
	WebElement SelectStateTextBox;

	@FindBy(xpath = ".//input[@name='searchBillerText']")
	@CacheLookup
	WebElement SelectBillerTextBox;

	@FindBy(xpath = ".//*[@class='md-autocomplete-suggestions']/li[1]")
	@CacheLookup
	WebElement SelectBillerFromLIst;

	@FindBy(xpath = ".//*[@id='Flat Number' or @id='Flat No']")
	@CacheLookup
	WebElement flatNumber;

	@FindBy(xpath = ".//*[@id='Mobile Number' or @id='mobile']")
	@CacheLookup
	WebElement mobileNumber;

	@FindBy(xpath = ".//input[@id='email']")
	@CacheLookup
	WebElement payeeEmail;

	@FindBy(id = "quickAmount")
	@CacheLookup
	WebElement amountField;

	@FindBy(xpath = ".//button[(contains(text(),'Validate Bill') and @disabled='disabled') or text()='Pay Bill']")
	@CacheLookup
	WebElement validateBillClickCheck;

	@FindBy(xpath = ".//*[@class='md-input-message-animation ng-binding ng-scope']")
	@CacheLookup
	WebElement mobileNumberErrorMessage;
	String invalidMobileNumberErrorMessge = "Mobile number does not meet the requirements. Please try again.";

	@FindBy(xpath = ".//md-next-button[@class='ng-scope']")
	@CacheLookup
	WebElement scrollRightArrowIcon;

	@FindBy(xpath = "//span[text()='Users']")
	@CacheLookup
	WebElement LeftUsersMenu;

	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement LeftReportsMenu;

	@FindBy(xpath = "//span[text()='Change Password']")
	@CacheLookup
	WebElement ChangePassword;

	@FindBy(xpath = "//span[text()='Logout']")
	@CacheLookup
	WebElement LogoutButton;

	@FindBy(xpath = "//a[contains(text(),'New Framework')]")
	@CacheLookup
	WebElement NewFrameWork;

	@FindBy(xpath = "//label[contains(text(),'System Configs')]")
	@CacheLookup
	WebElement SystemConfig;

	@FindBy(xpath = "//button[text()='Yes']")
	@CacheLookup
	WebElement YesButton;

	@FindBy(xpath = "//span[contains(text(),'Resend OTP in')]")
	@CacheLookup
	WebElement Timer;

	/*
	 * #######################- Owner --> Mayur Kale -##############################
	 * 
	 */

	// #Configurations Section
	public boolean clickOnEntitiesIcon() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(entitiesIcon));
			entitiesIcon.click();
		} catch (Exception e) {
			cf.waitforSometime(2500);
			entitiesIcon.click();
		}
		wait.until(ExpectedConditions.visibilityOf(entityDetailsTitle));
		return entityDetailsTitle.isDisplayed();
	}

	public boolean clickOnUserIcon() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(usersIcon));
			usersIcon.click();
		} catch (Exception e) {
			cf.waitforSometime(3000);
			usersIcon.click();
		}
		wait.until(ExpectedConditions.visibilityOf(UserManagementDetailsTitle));
		return UserManagementDetailsTitle.isDisplayed();
	}

	// #Left-Side Bar Section

	public boolean clickOnLogOut() {
		try {
			wait.until(ExpectedConditions.visibilityOf(logout));
			logout.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public String getUserNameAfterLogin() {
		wait.until(ExpectedConditions.visibilityOf(userNameText));
		return userNameText.getText();
	}

	public boolean verifyUserIsOnHomePage() {
		wait.until(ExpectedConditions.visibilityOf(entitiesIcon));
		return entitiesIcon.isDisplayed();
	}

	public boolean clickOnSarvatraEhubIcon() {
		sarvatraEhubIcon.click();
		wait.until(ExpectedConditions.visibilityOf(entitiesIcon));
		return entitiesIcon.isDisplayed();
	}

	/*
	 * ####################- Owner --> Srihari Kovvuri -###########################
	 * 
	 */
	public boolean entities_LeftMenu() {
		boolean flag = EntitiesLMenu.isDisplayed();
		if (flag == false) {
			ConfigurationLMenu.isDisplayed();
			ConfigurationLMenu.click();
			boolean flag1 = EntitiesLMenu.isDisplayed();
			return flag1;
		} else {
			return true;
		}
	}

	public boolean users_leftMenu() {
		boolean flag = UsersLMenu.isDisplayed();
		if (flag == false) {
			ConfigurationLMenu.isDisplayed();
			ConfigurationLMenu.click();
			boolean flag1 = UsersLMenu.isDisplayed();
			return flag1;
		} else {
			return true;
		}
	}

	public boolean reports() {
		cf.waitforSometime(1500);
		return ReportsMenu.isDisplayed();
	}

	public boolean changePassword() {
		cf.waitforSometime(1500);
		return ChangePasswordMenu.isDisplayed();

	}

	/*
	 * ####################- Owner --> Vivek Nichal -###########################
	 * 
	 */

	public boolean verifyServatraeHub() {
		wait.until(ExpectedConditions.visibilityOf(HomeButton));
		return HomeButton.isDisplayed();
	}

	public boolean verifyBBPSLogo() {
		wait.until(ExpectedConditions.visibilityOf(BBPSLogo));
		return BBPSLogo.isDisplayed();
	}

	public boolean verifyPayBill() {
		wait.until(ExpectedConditions.visibilityOf(PayBill));
		return PayBill.isDisplayed();
	}

	public boolean verifyRegisterComplaint() {
		wait.until(ExpectedConditions.visibilityOf(RegisterComplaint));
		return RegisterComplaint.isDisplayed();
	}

	public boolean verifyComplaintTracking() {
		wait.until(ExpectedConditions.visibilityOf(ComplaintTracking));
		return ComplaintTracking.isDisplayed();
	}

	public boolean verifyTxnSearch() {
		wait.until(ExpectedConditions.visibilityOf(TxnSearch));
		return TxnSearch.isDisplayed();
	}

	public boolean verifyWalletStatement() {
		wait.until(ExpectedConditions.visibilityOf(WalletStatement));
		return WalletStatement.isDisplayed();
	}

	public boolean verifyEntitiesButton() {
		wait.until(ExpectedConditions.visibilityOf(EntitiesButton));
		return EntitiesButton.isDisplayed();
	}

	public boolean verifyUserButton() {
		wait.until(ExpectedConditions.visibilityOf(UsersButton));
		return UsersButton.isDisplayed();
	}

	public boolean verifyLeftBBPSMenu() {
		wait.until(ExpectedConditions.visibilityOf(LeftBBPSMenu));
		return LeftBBPSMenu.isDisplayed();
	}

	public boolean verifyLeftConfigurationsMenu() {
		wait.until(ExpectedConditions.visibilityOf(LeftConfigurationsMenu));
		return LeftConfigurationsMenu.isDisplayed();
	}

	public boolean verifyLeftReportsMenu() {
		wait.until(ExpectedConditions.visibilityOf(LeftReportsMenu));
		return LeftReportsMenu.isDisplayed();
	}

	public boolean verifyChangePassword() {
		wait.until(ExpectedConditions.visibilityOf(ChangePassword));
		return ChangePassword.isDisplayed();
	}

	public boolean verifyLogoutButton() {
		wait.until(ExpectedConditions.visibilityOf(LogoutButton));
		return LogoutButton.isDisplayed();
	}

	public void Click_on_NewFrameWork() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(NewFrameWork));
		NewFrameWork.click();
	}

	public void ClickChangePassword() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(ChangePassword));
		ChangePassword.click();
	}

	public void Click_on_LeftBBPS_Menu() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(LeftBBPSMenu));
		LeftBBPSMenu.click();
	}

	public void Click_on_LeftConfigurationsMenu() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(LeftConfigurationsMenu));
		LeftConfigurationsMenu.click();
	}

	public boolean verifyLeftTransactionHistoryMenu() {
		wait.until(ExpectedConditions.visibilityOf(LeftTransactionHistoryMenu));
		return LeftTransactionHistoryMenu.isDisplayed();
	}

	public boolean verifyLeftWalletStatementMenu() {
		wait.until(ExpectedConditions.visibilityOf(LeftWalletStatementMenu));
		return LeftWalletStatementMenu.isDisplayed();
	}

	public boolean verifyLeftEntitiesMenu() {
		wait.until(ExpectedConditions.visibilityOf(LeftEntitiesMenu));
		return LeftEntitiesMenu.isDisplayed();
	}

	public boolean verifyLeftUsersMenu() {
		wait.until(ExpectedConditions.visibilityOf(LeftUsersMenu));
		return LeftUsersMenu.isDisplayed();
	}

	public boolean clickOnLogOutButton() {
		try {
			// ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
			wait.until(ExpectedConditions.visibilityOf(LogoutButton));
			Actions action = new Actions(driver);
			action.moveToElement(LogoutButton).click().perform();
			// LogoutButton.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnLeftEntitiesMenu() {
		wait.until(ExpectedConditions.visibilityOf(LeftEntitiesMenu));
		LeftEntitiesMenu.click();
	}

	public void clickOnPayBill() {
		verifyPayBill();
		PayBill.click();
	}

	public void checkHousingSocietyBillicon() {
		wait.until(ExpectedConditions.visibilityOf(scrollRightArrowIcon));
		scrollRightArrowIcon.click();
		wait.until(ExpectedConditions.visibilityOf(HousingSocietyBillIcon));
		Assert.assertTrue(HousingSocietyBillIcon.isDisplayed());
	}

	public void clickHousingSocietyBillicon() {
		wait.until(ExpectedConditions.visibilityOf(HousingSocietyBillIcon));
		HousingSocietyBillIcon.click();
	}

	public void selectState(String state) {
		cf.waitforSometime(2000);
		wait.until(ExpectedConditions.visibilityOf(SelectStateTextBox));
		SelectStateTextBox.sendKeys(state);
		wait.until(ExpectedConditions.visibilityOf(SelectState));
		SelectState.click();
	}

	public void submitStateCitySelection() {
		wait.until(ExpectedConditions.visibilityOf(SubmitStateCitySelection));
		SubmitStateCitySelection.click();
		cf.waitforSometime(5000);
	}

	public void selectBillers(String societyname) {
		wait.until(ExpectedConditions.visibilityOf(SelectBillerTextBox));
		SelectBillerTextBox.sendKeys(societyname);
		;
		wait.until(ExpectedConditions.visibilityOf(SelectBillerFromLIst));
		SelectBillerFromLIst.click();
		wait.until(ExpectedConditions.visibilityOf(flatNumber));
		Assert.assertTrue(flatNumber.isDisplayed());
		cf.waitforSometime(2000);
	}

	public void enterFlatNumber(String flatnumber) {
		wait.until(ExpectedConditions.visibilityOf(flatNumber));
		flatNumber.sendKeys(flatnumber);
	}

	public void mobileNumberValidation(String number) {
		wait.until(ExpectedConditions.visibilityOf(mobileNumber));
		mobileNumber.clear();
		mobileNumber.sendKeys(number);
		Pattern p = Pattern.compile("[6-9]?[0-9]");
		Matcher m = p.matcher(number);
		Boolean check = m.find();
		if (!check) {
			wait.until(ExpectedConditions.visibilityOf(mobileNumberErrorMessage));
			System.out.println(mobileNumberErrorMessage.getText());
			System.out.println(invalidMobileNumberErrorMessge);
			Assert.assertEquals(mobileNumberErrorMessage.getText().trim(), invalidMobileNumberErrorMessge);
		}
	}

	public void enterPayerEmail(String emailid) {
		wait.until(ExpectedConditions.visibilityOf(payeeEmail));
		payeeEmail.sendKeys(emailid);
	}

	public void enterAmount(String amount) {
		wait.until(ExpectedConditions.visibilityOf(amountField));
		amountField.sendKeys(amount);
	}

	public void clickOnFetchBill() {
		wait.until(ExpectedConditions.visibilityOf(fetchBillButton));
		fetchBillButton.click();
		wait.until(ExpectedConditions.visibilityOf(paymentPageHeader));
		if (!paymentPageHeader.isDisplayed()) {
			Assert.fail("Not able to click on Fetch Bill Button please check");
		}
	}

	public void clickOnValidateBill() {
		wait.until(ExpectedConditions.visibilityOf(validateBillButton));
		validateBillButton.click();
		wait.until(ExpectedConditions.visibilityOf(validateBillClickCheck));
		if (!validateBillClickCheck.isDisplayed()) {
			Assert.fail("Not able to click on Validate Bill Button please check");
		}
	}

	public void clickOnPayBillAfterValidateBillClick() {
		wait.until(ExpectedConditions.visibilityOf(payBillButton));
		payBillButton.click();
		wait.until(ExpectedConditions.visibilityOf(recieptNumberField));
		if (!recieptNumberField.isDisplayed()) {
			Assert.fail("Not able to click on Pay Bill Button please check");
		}
	}

	public void clickOnConfirmButton() {
		wait.until(ExpectedConditions.visibilityOf(confirmButton));
		confirmButton.click();
		wait.until(ExpectedConditions.visibilityOf(printButton));
		if (!printButton.isDisplayed()) {
			Assert.fail("Not able to click on Print Button please check");
		}

	}

	public void enterRecieptNumber(String num) {
		wait.until(ExpectedConditions.visibilityOf(recieptNumberField));
		recieptNumberField.sendKeys(num);
	}

	public void clickOnPrintButton() {
		wait.until(ExpectedConditions.visibilityOf(printButton));
		printButton.click();
		// cf.definingDownloadPath();
		// Assert.assertTrue(cf.isFileDownloaded("BBPS_Receipt_9610.pdf"));

	}

	public void selectPayementMode(String modeOfPayment) throws InterruptedException {
		Thread.sleep(1000);
		paymentModeDropdown.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-option//div[contains(text(),'" + modeOfPayment + "')]")).click();
		;
	}

	public void selectBillerfromDropDown(String societyname) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(SelectBillerTextBox));
		SelectBillerTextBox.sendKeys(societyname);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(SelectBillerFromLIst));
		SelectBillerFromLIst.click();
		Thread.sleep(2000);
	}

	public void clickOnSystemConfig() {
		wait.until(ExpectedConditions.visibilityOf(SystemConfig));
		SystemConfig.click();
	}

	public boolean dashPage() {
		wait.until(ExpectedConditions.visibilityOf(EntitiesButton));
		return EntitiesButton.isDisplayed();
	}

	public void clickOnYes() {
		wait.until(ExpectedConditions.visibilityOf(YesButton));
		YesButton.click();
	}

	public boolean OTPPage() {
		wait.until(ExpectedConditions.visibilityOf(EntitiesButton));
		return Timer.isDisplayed();
	}

	public void clickOnTxnSearch() {
		wait.until(ExpectedConditions.visibilityOf(TxnSearch));
		TxnSearch.click();
	}
	
	public boolean Verify_Tiles_Available_For_Product(String Product, String Tiles) throws InterruptedException {
		Thread.sleep(500);
		return driver.findElement(By.xpath("//img[@title='"+Product+"']/parent::td/following-sibling::td//label[contains(text(),'"+Tiles+"')]")).isDisplayed();
	}
	
	public boolean Verify_Tiles_Not_Available_For_Product(String Product, String Tiles) throws InterruptedException {
		Thread.sleep(500);
		try {
			driver.findElement(By.xpath("//img[@title='"+Product+"']/parent::td/following-sibling::td//label[contains(text(),'"+Tiles+"')]")).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean Verify_Left_Side_SubMenu_Available_For_Product(String Product, String Tiles) throws InterruptedException {
		Thread.sleep(500);
		return driver.findElement(By.xpath("//span[contains(text(),'"+Product+"')]/ancestor::div/following-sibling::md-list//p[contains(text(),'"+Tiles+"')]")).isDisplayed();
	}
	
	public boolean Verify_Left_Side_SubMenu_Not_Available_For_Product(String Product, String Tiles) throws InterruptedException {
		Thread.sleep(500);
		try {
			driver.findElement(By.xpath("//span[contains(text(),'"+Product+"')]/ancestor::div[2]/following-sibling::md-list//p[contains(text(),'"+Tiles+"')]")).isDisplayed();
			} 
		catch (Exception e) {
			e.printStackTrace();
			}
		return true;
	}
	
	public void Click_on_Left_AEPS_Menu() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='AEPS']")).click();
	}
	
	public void Click_on_Left_MicroATM_Menu() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Micro ATM']")).click();
	}
	
	public void Click_on_Left_Sarvatra_ATM_Menu() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sarvatra ATM']")).click();
	}
	
	public void click_On_Tiles(String Product, String Tiles) throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(By.xpath("//img[@title='"+Product+"']/parent::td/following-sibling::td//label[contains(text(),'"+Tiles+"')]")).click();
	}
}
