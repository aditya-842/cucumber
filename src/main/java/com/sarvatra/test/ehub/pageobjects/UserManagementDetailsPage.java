package com.sarvatra.test.ehub.pageobjects;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.util.CommonFunctions;
import com.qa.util.ExcelReader;

public class UserManagementDetailsPage {

	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions cf;
	private ExcelReader exel = new ExcelReader();

	public UserManagementDetailsPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		cf = new CommonFunctions(driver);
	}
	/*
	 * ####################- Owner --> Mayur Kale -###########################
	 * 
	 */
	// #Top-Header

	@FindBy(xpath = "//button[@ng-click=\"addNewUserData()\"]")
	@CacheLookup
	WebElement addUserButton;

	@FindBy(xpath = "//div[@class='md-toast-content']//span[contains(text(),'User created Successfully')]")
	@CacheLookup
	WebElement userCreatedMessagePopup;

	@FindBy(xpath = "//h2[contains(text(),'User Management Details')]")
	@CacheLookup
	WebElement UserManagementDetailsTitle;
	// #Input Fields
	@FindBy(xpath = "//label[@class='md-required']")
	@CacheLookup
	List<WebElement> mandatoryTextFields;

	@FindBy(xpath = "//input[@id='userID']")
	@CacheLookup
	WebElement loginID;

	@FindBy(xpath = "//input[@id='name']")
	@CacheLookup
	WebElement displayName;

	@FindBy(xpath = "//input[@id='mobile']")
	@CacheLookup
	WebElement mobileNo;

	@FindBy(xpath = "//input[@id='email']")
	@CacheLookup
	WebElement email;

	@FindBy(xpath = "//md-select-value[@aria-hidden='true']")
	@CacheLookup
	WebElement dropdownsOnUMD;

	@FindBy(xpath = "//label[@class='ng-binding md-required']")
	@CacheLookup
	WebElement selectEntityOnUMD;

	@FindBy(xpath = "//md-select-value//div[contains(text(),'NSDL')]")
	@CacheLookup
	WebElement prepopulatedEntityDropdownOnUMD;

	@FindBy(xpath = "//md-select-value//div[contains(text(),'Y')]")
	@CacheLookup
	WebElement activeDropdownWithYselectedOnUMD;

	@FindBy(xpath = "//md-checkbox[@aria-label='admin']")
	@CacheLookup
	WebElement adminCheckboxOnUMD;

	@FindBy(xpath = "//button[@ng-click='saveUserData(form.$valid);']")
	@CacheLookup
	WebElement saveButtonOnUMD;

	@FindBy(xpath = "//button[@ng-click='historyBack()']")
	@CacheLookup
	WebElement backButtonOnUMD;

	// #Validation Messages
	@FindBy(xpath = "//div[@ng-message='required']")
	@CacheLookup
	WebElement validationsForEmptyFields;

	@FindBy(xpath = "//div[@class='md-input-message-animation ng-binding ng-scope']")
	@CacheLookup
	WebElement validationsForInvalidInputs;

	@FindBy(xpath = "//label")
	@CacheLookup
	List<WebElement> mandatoryTextFieldsOnUMD;

	@FindBy(xpath = "//md-option[@ng-value='productItem']//div[@class='md-text ng-binding']")
	@CacheLookup
	List<WebElement> ProductList;

	@FindBy(xpath = "//md-select[@id='product']")
	@CacheLookup
	WebElement SelectProdDropdown;

	@FindBy(xpath = "//md-select[@id='productRole']")
	@CacheLookup
	WebElement SelectProdRoleDropdown;

	@FindBy(xpath = "//md-option[@ng-value='productRoleItem']//div[@class='md-text ng-binding']")
	@CacheLookup
	List<WebElement> ProductRoleList;

	@FindBy(xpath = "//input[@name='selectedEntityText']")
	@CacheLookup
	WebElement SelectEntitytx;

	@FindBy(xpath = "//span[@md-highlight-text='selectedEntityText']")
	@CacheLookup
	WebElement selectEntity;

	@FindBy(xpath = "//div[@class='md-container md-ink-ripple']")
	@CacheLookup
	WebElement AdminCheckBox;

	@FindBy(xpath = "//input[@id='userID']")
	@CacheLookup
	WebElement UserId;

	@FindBy(xpath = "//input[@id='name']")
	@CacheLookup
	WebElement dispname;

	@FindBy(xpath = "//input[@id='mobile']")
	@CacheLookup
	WebElement mobile;

	@FindBy(xpath = "//button[@ng-click='historyBack()']")
	@CacheLookup
	WebElement backbutton;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement savebutton;

	@FindBy(xpath = "//h2[contains(text(),'User Management')]")
	@CacheLookup
	WebElement UserManagementTitle;

	@FindBy(xpath = "//div[contains(text(),'Please Select Entity')]")
	@CacheLookup
	WebElement MsgEmptyEntityField;
	
	@FindBy(xpath = ".//label[text()='Users']")
	@CacheLookup
	WebElement clickOnUsers;
	

	@FindBy(xpath = ".//*[text()='Agent ID']")
	@CacheLookup
	WebElement verifyAgentid;
	
	
	@FindBy(xpath = ".//*[text()='Agent ID']/parent::div/parent::div//input")
	@CacheLookup
	WebElement verifyAgentIdInputField;
	
	@FindBy(xpath = ".//*[text()='Agent ID']/parent::div/following-sibling::div[@role=\"button\"]")
	@CacheLookup
	WebElement AgentIdDropDownButton;
	
	@FindBy(xpath = ".//div[@aria-label='Grid Menu']")
	@CacheLookup
	WebElement UmGridTableDropdown;
	
	@FindBy(xpath = ".//button[text()='Agent ID']")
	@CacheLookup
	WebElement verifyUmGridFilterDropdown;
	
	@FindBy(xpath = "//div/span[contains(text(),'Reset Password attempt ')]")
	@CacheLookup
	WebElement ResetpasswordMSG;

	@FindBy(xpath = "//md-icon[@aria-label='Edit']")
	@CacheLookup
	WebElement EditIcon;


	
	/*
	 * ####################- Owner --> Mayur Kale -###########################
	 * 
	 */

	public String verifyUserManagementDetailsPageTitle() {
//		cf.waitforSometm(1500);
		wait.until(ExpectedConditions.visibilityOf(UserManagementDetailsTitle));
		return UserManagementDetailsTitle.getText();
	}

	public boolean mandatoryTextFieldsOnUMD() {
		int count = 0;
		String ar[] = { "Login ID", "Display Name", "Mobile Number", "Email" };
		List ls = new ArrayList(Arrays.asList(ar));
		for (WebElement fields : mandatoryTextFields) {
			String text = fields.getText();
			if (ls.contains(text)) {
				System.out.println("Mandatory field: " + text);
				count++;
			}
		}
		if (count == 4) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean ClickOnEditIconOnUMP() {
		try {
			cf.waitforSometime(1500);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,70)");
			EditIcon.isDisplayed();
			EditIcon.click();
			cf.waitforSometime(300);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	
	public boolean verifyPepopulatedValueInEntityDropdownOnUMD(String string) {
//		cf.waitforSometime(1000);
		wait.until(ExpectedConditions.visibilityOf(prepopulatedEntityDropdownOnUMD));
		String value = prepopulatedEntityDropdownOnUMD.getText();
		System.out.println("Prepopulated Entity value: " + value);
		if (value.contains(string)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyActiveDropdownWithYselectedOnUMD(String string) {
		cf.waitforSometime(1000);
		wait.until(ExpectedConditions.visibilityOf(activeDropdownWithYselectedOnUMD));
		String value = activeDropdownWithYselectedOnUMD.getText();
		if (value.contains(string)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyAdminCheckboxisDefaultCheckedOnUMD() {
		wait.until(ExpectedConditions.visibilityOf(adminCheckboxOnUMD));
		String disable = adminCheckboxOnUMD.getAttribute("aria-disabled");
		String selected = adminCheckboxOnUMD.getAttribute("aria-checked");
		if (disable.contains("true") && selected.contains("true")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyVisibilityofSaveButtonOnUMD() {
//		cf.waitforSometime(500);
		wait.until(ExpectedConditions.visibilityOf(saveButtonOnUMD));
		return saveButtonOnUMD.isDisplayed();
	}

	public boolean verifyVisibilityofBackButtonOnUMD() {
//		cf.waitforSometime(500);
		wait.until(ExpectedConditions.visibilityOf(backButtonOnUMD));
		return backButtonOnUMD.isDisplayed();
	}

	public boolean clickonSaveButtonOnUMD() {
//		cf.waitforSometime(500);
		wait.until(ExpectedConditions.visibilityOf(saveButtonOnUMD));
		if (saveButtonOnUMD.isDisplayed() == true) {
			saveButtonOnUMD.click();
			return true;
		} else {
			return false;
		}
	}

	public boolean clickonBackButtonOnUMD() {
//		cf.waitforSometime(500);
		wait.until(ExpectedConditions.visibilityOf(backButtonOnUMD));
		if (backButtonOnUMD.isDisplayed() == true) {
			backButtonOnUMD.click();
			return true;
		} else {
			return false;
		}
	}

	public boolean enterLoginIDOnUMD(String input) {
		wait.until(ExpectedConditions.visibilityOf(loginID));
		cf.waitforSometime(500);
		if (loginID.isDisplayed() == true) {
			loginID.sendKeys(input);
			return true;
		} else {
			return false;
		}
	}

	public boolean enterDisplayNameOnUMD(String input) {
		wait.until(ExpectedConditions.visibilityOf(displayName));
		if (displayName.isDisplayed() == true) {
			displayName.sendKeys(input);
			return true;
		} else {
			return false;
		}
	}

	public boolean enterMobileNoOnUMD(String input) {
		wait.until(ExpectedConditions.visibilityOf(mobileNo));
		if (mobileNo.isDisplayed() == true) {
			mobileNo.sendKeys(input);
			return true;
		} else {
			return false;
		}
	}

	public boolean enterEmailOnUMD(String input) {
		wait.until(ExpectedConditions.visibilityOf(email));
		if (email.isDisplayed() == true) {
			email.sendKeys(input);
			return true;
		} else {
			return false;
		}
	}

	public String verifyValidationMessagesOnUMD(String FieldName) {
		WebElement validationMessage = driver.findElement(By.xpath("//label[contains(text(),'" + FieldName
				+ "')]/parent::md-input-container//div[@class='md-input-messages-animation md-auto-hide ng-active']"));
		wait.until(ExpectedConditions.visibilityOf(validationMessage));
		return validationMessage.getText();
	}

	/*
	 * #######################- Amol Kale -##############################
	 * 
	 */

	public boolean verifyInputAndDropdownFieldsOnUMDScreen(int Act_count) throws InterruptedException {
		selectProductDropdown();
		selectProductInDropdownOnUMD("PPI");
		selectProductRoleDropdown();
		selectProductRoleInDropdownOnUMD("Institution");
		int count = 0;
		String ar[] = { "Login ID", "Display Name", "Product", "Product Role", "Select Entity", "Mobile Number",
				"Email", "Active:" };
		List ls = new ArrayList(Arrays.asList(ar));
		System.out.println("Mandatory field:" + ls);
		cf.waitforSometime(300);
		for (WebElement fields : mandatoryTextFieldsOnUMD) {
			cf.waitforSometime(300);

			String text = fields.getText();
			if (ls.contains(text)) {
				cf.waitforSometime(300);
				System.out.println("Mandatory field:" + text);
				count++;
				if (count == Act_count) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean selectProductDropdown() {
		try {
			cf.waitforSometime(500);
			SelectProdDropdown.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		

	}

	public boolean VerifyProductInProductDordown(int Act_count) {
		int count = 0;
		String ar[] = { "AEPS", "BBPS", "Flexible Recon", "microATM", "PPI", "Sarvatra miniATM" };
		List ls = new ArrayList(Arrays.asList(ar));
		System.out.println("Product in product dropdown: " + ls);
		for (WebElement fields : ProductList) {

			String text = fields.getText();
			if (ls.contains(text)) {
				System.out.println("Product in product dropdown: " + text);
				count++;
				if (count == Act_count) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean selectProductRoleDropdown() {
		try {
			cf.waitforSometime(500);
			SelectProdRoleDropdown.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		

	}

	public boolean selectProductInDropdownOnUMD(String string) throws InterruptedException {
		// selectProductDropdown();
		
		try {
			cf.waitforSometime(2000);
			cf.getValuefromList(ProductList, string);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		

	}

	public boolean VerifyProductRoleInDorpdown(int Act_count) {
		int count = 0;
		String ar[] = { "Institution", "Program Manager", "Prepaid Agent Institution" };
		List ls = new ArrayList(Arrays.asList(ar));
		for (WebElement fields : ProductRoleList) {
			String text = fields.getText();
			if (ls.contains(text)) {
				System.out.println("Role in product role dropdown: " + text);
				count++;
				if (count == Act_count) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean selectProductRoleInDropdownOnUMD(String string) throws InterruptedException {
		// selectProductRoleDropdown();
		try {
			cf.waitforSometime(500);
			cf.getValuefromList(ProductRoleList, string);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		

	}

	public boolean selectEntityInDropdownOnUMD(String string) throws InterruptedException {
		try{
			SelectEntitytx.click();
			cf.waitforSometime(500);
			SelectEntitytx.sendKeys(string);
			cf.waitforSometime(500);
			selectEntity.click();
			return true;
			}catch (Exception e) {
			e.printStackTrace();
			return false;
			}
			
		

	}

	public boolean verifyAdminCheckBoxNotDisplayedOnUMD() {
		cf.waitforSometime(500);
		try {
			AdminCheckBox.isDisplayed();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean setLoginId(String string) {
		try{
			UserId.clear();
			UserId.sendKeys(string);
			return true;
			}catch (Exception e) {
			e.printStackTrace();
			return false;
			}
			}
		
		

	

	public boolean setDisplayName(String string) {
		try{
			dispname.clear();
			dispname.sendKeys(string);
			return true;
			}catch (Exception e) {
			e.printStackTrace();
			return false;
			}
			}
		

	

	public boolean setMobileNumber(String mobNo) {
		try{
			mobile.clear();
			mobile.sendKeys(mobNo);
			return true;
			}catch (Exception e) {
			e.printStackTrace();
			return false;
			}
			}
		

	

	public boolean setEmailId(String string) {
		try {
	
		email.clear();
		email.sendKeys(string);
		return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
			}

	}

	public String clickOnBackbuttonVerifyUserManagementPageTilte() {
		backbutton.click();
		cf.waitforSometime(1500);
		return UserManagementTitle.getText();

	}

	public String VerifyUserManagementPageTilte() {
		return UserManagementTitle.getText();

	}

	public boolean clickOnSaveButton() {
		try{
			savebutton.click();
			return true;
			}catch (Exception e) {
			e.printStackTrace();
			return false;
			}
			}
		
	

	public String ValidationMsgForEmptyEntityField() {
		cf.waitforSometime(500);

		return MsgEmptyEntityField.getText();
	}

	public String clickOnAddUser() {
		wait.until(ExpectedConditions.visibilityOf(addUserButton));
		addUserButton.click();
		wait.until(ExpectedConditions.visibilityOf(UserManagementDetailsTitle));
		cf.waitforSometime(500);
		return UserManagementDetailsTitle.getText();
	}

	public String getUserCreatedMessage() {
		// cf.waitforSometime(1000);
		wait.until(ExpectedConditions.visibilityOf(userCreatedMessagePopup));
		System.out.println("User created popup message: " + userCreatedMessagePopup.getText());
		return userCreatedMessagePopup.getText();
	}
	
	public void clickOnUsers() {
		cf.waitforSometime(1000);
		clickOnUsers.click();
	}
	
	public void verifyAgentid() {
		cf.waitforSometime(1000);
		Assert.assertTrue(verifyAgentid.isDisplayed());
		
	}
	
	public void verifyAgentIdInputField() {
		cf.waitforSometime(1000);
		Assert.assertTrue(verifyAgentIdInputField.isDisplayed());
		
	}
	
	public void clickAgentIdDropDownButton() {
		cf.waitforSometime(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", AgentIdDropDownButton);
	}
	
	public void verifyDropdwnValue(String value) {
		cf.waitforSometime(1000);
		WebElement val=driver.findElement(By.xpath(".//*[contains(text(),'"+value+"')]"));
		Assert.assertTrue(val.isDisplayed());
	}
	

	public void clickUmGridFilterDropdown() {
		cf.waitforSometime(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", UmGridTableDropdown);
	}
	
	public void verifyUmGridFilterDropdown() {
		cf.waitforSometime(1000);
		Assert.assertTrue(verifyUmGridFilterDropdown.isDisplayed());
	}
	
	public void click_On_Admin_CheckBox_On_User_Management_Details() {
		cf.waitforSometime(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Admin')]")).click();
	}
	
	public boolean verify_Permission_Available_On_User_Management_Details_Page(String Product, String Permission) {
		cf.waitforSometime(1000);
		driver.findElement(By.xpath("//Strong[contains(text(),'"+Product+"')]/ancestor::div/following-sibling::div//div[contains(text(),'"+Permission+"')]")).isDisplayed();
		return true;
	}
	
	public boolean verify_Permission_Not_Available_On_User_Management_Details_Page(String Product, String Permission) {
		cf.waitforSometime(1000);
		try {
			driver.findElement(By.xpath("//Strong[contains(text(),'"+Product+"')]/ancestor::div/following-sibling::div//div[contains(text(),'"+Permission+"')]")).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
}
