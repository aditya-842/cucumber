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

public class MobilePostpaidPage {

	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions c;

	public MobilePostpaidPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		c = new CommonFunctions(driver);
	}

	// #Elements select mobile postpaid
	@FindBy(xpath = "//md-tab-item/span[contains(text(),'Mobile Postpaid')]")
	@CacheLookup
	WebElement mobilePostpaid;

	// #Elements select mobile prepaid
	@FindBy(xpath = "//div[contains(text(),'Mobile number does not meet the requirements. Please try again.')]")
	@CacheLookup
	WebElement PayerMobileNumberError;

	// biller / service provider
	@FindBy(xpath = "//input[@name='searchBillerText']")
	@CacheLookup
	WebElement billerOrServiceProvider;

	// customer mobile number
	@FindBy(xpath = "//input[@id='Customer Mobile Number']")
	@CacheLookup
	WebElement customerMobileNumber;

	// payer mobile number
	@FindBy(xpath = "//input[@id='mobile']")
	@CacheLookup
	WebElement payerMobileNumber;

	// payer email
	@FindBy(xpath = "//input[@id='email']")
	@CacheLookup
	WebElement payerEmail;

	// amount field
	@FindBy(xpath = "//input[@id='quickAmount']")
	@CacheLookup
	WebElement amountField;

	// validate bill
	@FindBy(xpath = "//button[contains(text(),'Validate Bill')]")
	@CacheLookup
	WebElement validateBillButton;

	// pay bill button
	@FindBy(xpath = "//button//span[contains(text(),'Pay')]")
	@CacheLookup
	WebElement payBillButton;

	// input[@id='cashReceiptNumber']
	@FindBy(xpath = "//input[@id='cashReceiptNumber']")
	@CacheLookup
	WebElement cashReceiptNumber;

	// confirm Button
	@FindBy(xpath = "//button[contains(text(),'Confirm')]")
	@CacheLookup
	WebElement confirmButton;

	// Print button
	@FindBy(xpath = "//button[contains(text(),'Print')]")
	@CacheLookup
	WebElement PrintButton;

	public boolean selectMobilePostpaid() {
		try {
			wait.until(ExpectedConditions.visibilityOf(mobilePostpaid));
			mobilePostpaid.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean verifyPayerMobileNumberError() {
		try {
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOf(PayerMobileNumberError));
			PayerMobileNumberError.isDisplayed();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean clickOnBillerField(String billerId) {
		try {
			Thread.sleep(15000);
			wait.until(ExpectedConditions.visibilityOf(billerOrServiceProvider));
			billerOrServiceProvider.click();
			billerOrServiceProvider.sendKeys(billerId);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'" + billerId + "')])[1]")).click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean enterCustomerMobileNumber(String mobileNumber) {
		try {
			wait.until(ExpectedConditions.visibilityOf(customerMobileNumber));
			customerMobileNumber.clear();
			customerMobileNumber.sendKeys(mobileNumber);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean enterPayerMobileNumber(String payerNumber) {
		try {
			wait.until(ExpectedConditions.visibilityOf(payerMobileNumber));
			payerMobileNumber.clear();
			payerMobileNumber.sendKeys(payerNumber);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean enterPayerEmail(String payer_Email) {
		try {
			wait.until(ExpectedConditions.visibilityOf(payerEmail));
			payerEmail.sendKeys(payer_Email);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean enterAmount(String amount) {
		try {
			wait.until(ExpectedConditions.visibilityOf(amountField));
			amountField.sendKeys(amount);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean clickOnValidateBill() {
		try {
			wait.until(ExpectedConditions.visibilityOf(validateBillButton));
			validateBillButton.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean clickOnPayBill() {
		try {
			wait.until(ExpectedConditions.visibilityOf(payBillButton));
			payBillButton.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean enterCashReceiptNumber(String receiptNumber) {
		try {
			wait.until(ExpectedConditions.visibilityOf(cashReceiptNumber));
			cashReceiptNumber.sendKeys(receiptNumber);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean clickOnConfirm() {
		try {
			wait.until(ExpectedConditions.visibilityOf(confirmButton));
			confirmButton.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean clickOnPrintButton() {
		try {
			wait.until(ExpectedConditions.visibilityOf(PrintButton));
			PrintButton.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}