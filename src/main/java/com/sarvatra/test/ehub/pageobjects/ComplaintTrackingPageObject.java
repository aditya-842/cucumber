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

public class ComplaintTrackingPageObject {

	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions c;

	public ComplaintTrackingPageObject(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		c = new CommonFunctions(driver);
	}

	@FindBy(xpath = "//label[text()='Complaint Tracking']")
	@CacheLookup
	WebElement complaintTracking;

	// bbps Radio Button
	@FindBy(xpath = "//md-radio-button[@value='BBPS']")
	@CacheLookup
	WebElement bbpsRadioButton;
	
	//complaint Type Dropdown
	@FindBy(xpath = "//*[@id='complaintType']")
	@CacheLookup
	WebElement complaintTypeDropdown;
	
	//Customer Mobile Number
	@FindBy(xpath = "//input[@id='mobile']")
	@CacheLookup
	WebElement customerMobileNumber;
	
	//complaint Id
	@FindBy(xpath = "//input[@id='complaintId']")
	@CacheLookup
	WebElement complaintID;
	
	//VIEW STATUS button
	@FindBy(xpath = "//button[contains(text(),'VIEW STATUS')]")
	@CacheLookup
	WebElement viewStatusButton;

	public boolean clickOnComplaintTrackingIcon() {
		try {
			wait.until(ExpectedConditions.visibilityOf(complaintTracking));
			complaintTracking.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean clickOnBBPSRadioButton() {
		try {
			wait.until(ExpectedConditions.visibilityOf(bbpsRadioButton));
			bbpsRadioButton.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean selectComplaintType(String type) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(complaintTypeDropdown));
		complaintTypeDropdown.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-option//div[contains(text(),'" + type + "')]")).click();
		return true;
	}

	public boolean enterCustomerMobileNO(String customerMobileNo) {
		wait.until(ExpectedConditions.visibilityOf(customerMobileNumber));
		customerMobileNumber.sendKeys(customerMobileNo);
		return true;
	}
	
	public boolean enterComplaintID(String complaintId) {
		wait.until(ExpectedConditions.visibilityOf(complaintID));
		complaintID.sendKeys(complaintId);
		return true;
	}
	
	public boolean clickOnViewStatusButton() {
		wait.until(ExpectedConditions.visibilityOf(viewStatusButton));
		viewStatusButton.click();
		return true;
	}
}
