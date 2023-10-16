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
public class RegisterComplaintPageObject {

	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions c;

	public RegisterComplaintPageObject(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		c = new CommonFunctions(driver);
	}

	// click on register complaint icon
	@FindBy(xpath = "//label[text()='Register Complaint']")
	@CacheLookup
	WebElement registerComplaint;

	// complaint type dropdown
	@FindBy(xpath = "//*[@id='complaintType']")
	@CacheLookup
	WebElement complaintTypeDropdown;

	// enter customer Mobile Number
	@FindBy(xpath = "//input[@id='mobile']")
	@CacheLookup
	WebElement customerMobileNumber;

	// enter Transaction Id
	@FindBy(xpath = "//input[@id='transactionId']")
	@CacheLookup
	WebElement transactionID;

	// reason dropdown
	@FindBy(xpath = "//*[@id='reason']")
	@CacheLookup
	WebElement reasonDropdown;

	// Description
	@FindBy(xpath = "//input[@id='description']")
	@CacheLookup
	WebElement description;

	// submit button
	@FindBy(xpath = "//button[contains(text(),'SUBMIT')]")
	@CacheLookup
	WebElement submitButton;

	// print button
	@FindBy(xpath = "//button[contains(text(),'PRINT')]")
	@CacheLookup
	WebElement printButton;

	public boolean clickOnRegisterComplaintIcon() {
		try {
			wait.until(ExpectedConditions.visibilityOf(registerComplaint));
			registerComplaint.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean selectComplaintType(String complaintType) throws InterruptedException {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(complaintTypeDropdown));
		complaintTypeDropdown.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-option//div[contains(text(),'" + complaintType + "')]")).click();
		return true;
	}

	public boolean enterCustomerMobileNO(String customerMobileNo) {
		wait.until(ExpectedConditions.visibilityOf(customerMobileNumber));
		customerMobileNumber.sendKeys(customerMobileNo);
		return true;
	}

	public boolean enterTransactionID(String transcationId) {
		wait.until(ExpectedConditions.visibilityOf(transactionID));
		transactionID.sendKeys(transcationId);
		return true;
	}

	public boolean selectReason(String reason) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(reasonDropdown));
		reasonDropdown.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-option//div[contains(text(),'" + reason + "')]")).click();
		return true;
	}

	public boolean enterDescription(String descriptionText) {
		wait.until(ExpectedConditions.visibilityOf(description));
		description.sendKeys(descriptionText);
		return true;
	}

	public boolean clickOnSubmitButton() {
		try {
			wait.until(ExpectedConditions.visibilityOf(submitButton));
			submitButton.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean clickOnPrintButton() {
		try {
			wait.until(ExpectedConditions.visibilityOf(printButton));
			printButton.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean Verify_Print_Button_On_Register_Complaint_Page() {
		wait.until(ExpectedConditions.visibilityOf(printButton));
		return printButton.isDisplayed();
		
	}

}