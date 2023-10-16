package com.sarvatra.test.ehub.pageobjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class LoginPage {

	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions c;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		c = new CommonFunctions(driver);
	}
	/*
	 * ####################- Owner --> Mayur Kale -###########################
	 * 
	 */	
	
// #Elements on Top-Right-Corner Section on HomePage
	@FindBy(xpath = "//div[@style='text-align: right;']//div[@class='ng-binding']")
	@CacheLookup
	WebElement userNameText;

// #Elements On Login Page - Login Window
	@FindBy(xpath = "//input[@id='userName']")
	@CacheLookup
	WebElement userNameInputBox;
	
	@FindBy(xpath = "(.//div[@class='md-errors-spacer']//following-sibling::div)[1]")
	@CacheLookup
	WebElement blankUsernamError;
	
	@FindBy(xpath = ".//span[@class='md-toast-text ng-binding']")
	@CacheLookup
	WebElement validUsernamePasswordError;
	
	String validUsernamePasswordErro2r= ".//span[@class='md-toast-text ng-binding']";
	
	
	
	@FindBy(xpath = "(.//div[@class='md-errors-spacer']//following-sibling::div)[2]")
	@CacheLookup
	WebElement blankPasswordError;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement passwordInputBox;

	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	@CacheLookup
	WebElement logInButton;

	@FindBy(xpath = "//button[contains(text(),'Forgot Password')]")
	@CacheLookup
	WebElement forgoatPasswordButton;

// #Elements On Confirmation Pop-Up Window
	@FindBy(xpath = "//md-dialog[@aria-label='Confirm Login']")
	@CacheLookup
	WebElement confirmLoginPopup;

	@FindBy(xpath = "//button[@class='md-primary md-confirm-button md-button md-ink-ripple md-default-theme md-focused'][contains(.,'Yes')]")
	@CacheLookup
	WebElement confirmLoginPopupYes;


	/*
	 * #######################- Owner - Mayur Kale -##############################
	 * 
	 */
	
	public String loginPageTitle() {
		c.waitforSometime(1500);
		return driver.getTitle();
	}

	public boolean userNameTextBox() {
		wait.until(ExpectedConditions.visibilityOf(userNameInputBox));
		return  userNameInputBox.isDisplayed();
	}

	public boolean passwordTextBox() {
		wait.until(ExpectedConditions.visibilityOf(passwordInputBox));
		return passwordInputBox.isDisplayed();
	}

	public String userLogin(String usrName, String password) {
		wait.until(ExpectedConditions.visibilityOf(userNameInputBox));
		userNameInputBox.clear();
		userNameInputBox.sendKeys(usrName);

		wait.until(ExpectedConditions.visibilityOf(passwordInputBox));
		passwordInputBox.clear();
		passwordInputBox.sendKeys(password);
		
		wait.until(ExpectedConditions.visibilityOf(logInButton));
		logInButton.click();
		c.waitforSometime(1000);

		try {
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			confirmLoginPopupYes.click();

		} catch (Exception e) {
			System.out.println("Confirmation Login Pop-up not displayed");
		}

		wait.until(ExpectedConditions.visibilityOf(userNameText));
		System.out.println("After login verify:- "+userNameText.getText());
		return userNameText.getText();
	}
	public void invalidUserLogin(String usrName, String password) {
		//driver.navigate().refresh();
		wait.until(ExpectedConditions.visibilityOf(userNameInputBox));
		userNameInputBox.clear();
		userNameInputBox.sendKeys(usrName);

		wait.until(ExpectedConditions.visibilityOf(passwordInputBox));
		passwordInputBox.clear();
		passwordInputBox.sendKeys(password);
		
		wait.until(ExpectedConditions.visibilityOf(logInButton));
		logInButton.click();
		
	}


	public void forgotPasswordButton() {
		wait.until(ExpectedConditions.visibilityOf(forgoatPasswordButton));
		forgoatPasswordButton.click();
	}
	public void errorMessageValidationsbothBlank(String usernameErrorMessage,String passwordErrorMessage) {
		wait.until(ExpectedConditions.visibilityOf(blankUsernamError));
		Assert.assertEquals(usernameErrorMessage, blankUsernamError.getText());
		wait.until(ExpectedConditions.visibilityOf(blankPasswordError));
		Assert.assertEquals(usernameErrorMessage, blankPasswordError.getText());
	}
	public void errorMessageValidationBlankPassword(String passwordErrorMessage) {
		
		wait.until(ExpectedConditions.visibilityOf(blankPasswordError));
		Assert.assertEquals(passwordErrorMessage, blankPasswordError.getText());
		
	}
	public void errorMessageValidationBlankUsername(String usernameErrorMessage) {
		
		wait.until(ExpectedConditions.visibilityOf(blankUsernamError));
		Assert.assertEquals(usernameErrorMessage, blankUsernamError.getText());
		
	}
	public void errorMessageValidationInvalidUsernamePassword(String invalidErrorMessage) {
		//c.waitforSometime(1000);
		//wait.until(ExpectedConditions.visibilityOf(validUsernamePasswordError));
		String message=null;
		for(int i=0;i<100;i++) {
			int size=driver.findElements(By.xpath(validUsernamePasswordErro2r)).size();
			if(size>=1) {
				message=validUsernamePasswordError.getText();
				break;
			}
		}
		
		if(!(message.startsWith(invalidErrorMessage) || message.equalsIgnoreCase(invalidErrorMessage)) ) {
		Assert.fail("Errors messages no matching for invalid creds");
		}
		//driver.navigate().refresh();
	}
			

}
