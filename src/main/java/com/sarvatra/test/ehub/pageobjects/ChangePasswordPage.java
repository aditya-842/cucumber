package com.sarvatra.test.ehub.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.CommonFunctions;

public class ChangePasswordPage {
	
	/*
	 * #######################- Owner --> Vivek Nichal -##############################
	 * 
	 */
	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions cf;
	LoginPage lp;

	public ChangePasswordPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		cf = new CommonFunctions(driver);
		lp = new LoginPage(driver);
	}
	
	@FindBy(xpath = "//input[@data-placeholder='Enter Current Password']")
	@CacheLookup
	WebElement currentPassword;
	
	@FindBy(xpath = "//input[@data-placeholder='Enter New Password']")
	@CacheLookup
	WebElement newPassword;
	
	@FindBy(xpath = "//input[@data-placeholder='Confirm New password']")
	@CacheLookup
	WebElement confirmPassword;
	
	@FindBy(xpath = "//span[text()='Change']")
	@CacheLookup
	WebElement ChangeButton;
	
	@FindBy(xpath = "//div[contains(text(),'Invalid Old Password. Please try again')]")
	@CacheLookup
	WebElement Invalid_Old_Password;
	 
	 @FindBy(xpath = "//label[contains(text(),'Confirm Password')]/parent::div/following-sibling::mat-form-field//div[contains(text(),'Password and Confirm Password doesn’t match.')]")
	 @CacheLookup
	 WebElement PasswordDoesntMatch;
	 
	 @FindBy(xpath = "//small[contains(text(),'Password must be minimum 8 characters and maximum 16 characters with at least 1 special character, 1 number, 1 uppercase and 1 lowercase character.')]")
	 @CacheLookup
	 WebElement BasicErrorMessage;
	
	 @FindBy(xpath = "//label[contains(text(),'Old Password')]/parent::div/following-sibling::mat-form-field//div[contains(text(),'Password is required.')]")
	 @CacheLookup
	 WebElement OldPasswordrequred;
	 
	 @FindBy(xpath = "//label[contains(text(),'New Password')]/parent::div/following-sibling::mat-form-field//div[contains(text(),'Password is required.')]")
	 @CacheLookup
	 WebElement NewPasswordrequred;
	 
	 @FindBy(xpath = "//span[contains(text(),'Back')]")
		@CacheLookup
		WebElement BackButton;
	 
	public boolean enterCurrentPassword(String Currentpassword) {
		try {
			wait.until(ExpectedConditions.visibilityOf(currentPassword));
			currentPassword.clear();
			Thread.sleep(1000);
			currentPassword.sendKeys(Currentpassword);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean enterNewPassword(String Newpassword) {
		try {
			wait.until(ExpectedConditions.visibilityOf(newPassword));
			newPassword.clear();
			Thread.sleep(1000);
			newPassword.sendKeys(Newpassword);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean enterConfirmPassword(String Confirmpassword) {
		try {
			wait.until(ExpectedConditions.visibilityOf(confirmPassword));
			confirmPassword.clear();
			Thread.sleep(1000);
			confirmPassword.sendKeys(Confirmpassword);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void Click_on_ChangeButton() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(ChangeButton));
		ChangeButton.click();
	}
	
	public void Click_on_BackButton() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(BackButton));
		BackButton.click();
	}
	
	public boolean verifyInvalid_Old_Password_Error_message() {
		try {
			wait.until(ExpectedConditions.visibilityOf(Invalid_Old_Password));
			Invalid_Old_Password.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifyPasswordDoesntMatch_Error_message() {
		try {
			wait.until(ExpectedConditions.visibilityOf(PasswordDoesntMatch));
			PasswordDoesntMatch.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifyBasicErrorMessage() {
		try {
			wait.until(ExpectedConditions.visibilityOf(BasicErrorMessage));
			BasicErrorMessage.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifyOldPasswordRequiredErrorMessage() {
		try {
			wait.until(ExpectedConditions.visibilityOf(OldPasswordrequred));
			OldPasswordrequred.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifyNewPasswordRequiredErrorMessage() {
		try {
			wait.until(ExpectedConditions.visibilityOf(NewPasswordrequred));
			NewPasswordrequred.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
