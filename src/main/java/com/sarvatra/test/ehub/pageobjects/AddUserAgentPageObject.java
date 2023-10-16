package com.sarvatra.test.ehub.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.CommonFunctions;

/**
 * @author anand_tajne
 *
 */
public class AddUserAgentPageObject {

	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions c;

	public AddUserAgentPageObject(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		c = new CommonFunctions(driver);
	}

	// add user button
	@FindBy(xpath = "//button[@ng-click='addUser()']")
	@CacheLookup
	WebElement addUserButton;

	// login id
	@FindBy(xpath = "//input[@id='userID']")
	@CacheLookup
	WebElement LoginID;

	// display name
	@FindBy(xpath = "//input[@id='name']")
	@CacheLookup
	WebElement displayName;

	// mobile number
	@FindBy(xpath = "//input[@id='mobile']")
	@CacheLookup
	WebElement mobileNumber;

	// email
	@FindBy(xpath = "//input[@id='email']")
	@CacheLookup
	WebElement email;

	// active
	@FindBy(xpath = "//md-select[@id='active']")
	@CacheLookup
	WebElement active;

	// checkbox for admin
	@FindBy(xpath = "//md-checkbox")
	@CacheLookup
	WebElement adminCheckbox;

	// save button
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	@CacheLookup
	WebElement saveButton;

	// default permission
	// md-checkbox[@ng-change='toggleSelectKey(key)']
	@FindBy(xpath = "//md-checkbox//div//strong[contains(text(),'DEFAULT')]")
	@CacheLookup
	WebElement defaultPermission;

	public boolean clickOnAddUserButton() {
		try {
			wait.until(ExpectedConditions.visibilityOf(addUserButton));
			addUserButton.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean enterLoginId(String loginId) {
		wait.until(ExpectedConditions.visibilityOf(LoginID));
		LoginID.sendKeys(loginId);
		return true;
	}

	public boolean enterDisplayName(String display_Name) {
		wait.until(ExpectedConditions.visibilityOf(displayName));
		displayName.sendKeys(display_Name);
		return true;
	}

	public boolean enterMobileNumber(String mobileNo) {
		wait.until(ExpectedConditions.visibilityOf(mobileNumber));
		mobileNumber.sendKeys(mobileNo);
		return true;
	}

	public boolean enterEmail(String email_id) {
		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys(email_id);
		return true;
	}

	public boolean clickOnActiveDropdown(String value) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(active));
		active.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-option[@ng-value='status.id']//div[contains(text(),'" + value + "')]"))
				.click();
		return true;
	}

	public boolean clickOnAdminCheckbox() {
		wait.until(ExpectedConditions.visibilityOf(adminCheckbox));
		adminCheckbox.click();
		return true;
	}

	public boolean clickOnDefaultPermission() {
		wait.until(ExpectedConditions.visibilityOf(defaultPermission));
		defaultPermission.click();
		return true;
	}

	public boolean clickOnSaveButton() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(saveButton));
		saveButton.click();
		Thread.sleep(1000);
		return true;
	}

}