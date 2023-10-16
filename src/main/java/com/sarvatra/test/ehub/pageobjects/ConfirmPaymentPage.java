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

import com.aventstack.extentreports.util.Assert;
import com.qa.util.CommonFunctions;

public class ConfirmPaymentPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions c;

	public ConfirmPaymentPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		c = new CommonFunctions(driver);
	}
	
	@FindBy(xpath = "//input[@id='cashReceiptNumber']")
	WebElement CashReceiptNumber;
	
	@FindBy(xpath = "//button[contains(text(),'Confirm')]")
	WebElement Confirm_button;
	
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement Cancel_button;
	
	@FindBy(id = "Amount")
	WebElement Amount_Field;
	
	@FindBy(id = "accNo")
	WebElement accountNumber;
	
	@FindBy(id = "otherAmount")
	WebElement otherAmount;
	
	@FindBy(xpath = "//input[@id='chequeAccNumber']")
	WebElement chequeAccNumber;
	
	@FindBy(xpath = "//input[@id='chequeNumber']")
	WebElement chequeNumber;
	
	@FindBy(xpath = "//h2[contains(text(),'Confirm Payment')]")
	WebElement Confirmation_Page_Header;
	
	public boolean verify_Confirm_Payment_Header() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(Confirmation_Page_Header));
		return driver.findElement(By.xpath("//h2[contains(text(),'Confirm Payment')]")).isDisplayed();
	}
	
	public void click_On_Radio_Button_On_Confirm_Payment_page(String Option) {
		driver.findElement(By.xpath("//md-radio-button[@aria-label='"+Option+"']")).click();
	}
	
	public boolean verify_Cash_Receipt_Number_On_Confirm_Payment_page() throws InterruptedException {
		Thread.sleep(1000);
		return CashReceiptNumber.isDisplayed();
	}
	
	public void enter_Cash_Receipt_Number_On_Confirm_Payment_page(String Cash) throws InterruptedException {
		CashReceiptNumber.clear();
		Thread.sleep(1000);
		CashReceiptNumber.sendKeys(Cash);;
	}
	
	public void click_On_Confirm_Button_On_Confirm_Payment_page() {
		Confirm_button.click();
	}
	
	public void click_On_Cancel_Button_On_Confirm_Payment_page() {
		Cancel_button.click();
	}
	
	public boolean verify_EorrorMsg_On_Confirm_Payment_Page(String Msg) throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(By.xpath("//div[contains(text(),'"+Msg+"')]")).isDisplayed();
	}
	
	public void enter_Amount_On_Confirm_Payment_page(String Amount) throws InterruptedException {
		Thread.sleep(1000);
		Amount_Field.sendKeys(Amount);;
	}
	
	public void click_On_Yes_No_Button_On_Confirm_Payment_page_For_Popup(String Option) {
		driver.findElement(By.xpath("//button[contains(text(),'"+Option+"')]")).click();
	}
	
	public boolean verify_Radio_Button_On_Confirm_Payment_page(String radioButton) {
		return driver.findElement(By.xpath("//md-radio-button[@aria-label='"+radioButton+"']")).isDisplayed();
	}

	public boolean verify_Amount_field_On_Confirm_Payment_page() throws InterruptedException {
		Thread.sleep(2000);
		return Amount_Field.isDisplayed();
	}
	
	public boolean verify_account_number_field_On_Confirm_Payment_page() throws InterruptedException {
		Thread.sleep(2000);
		return accountNumber.isDisplayed();
	}
	
	public void enter_account_number_on_confirm_payment_page(String account_Number) throws InterruptedException {
		accountNumber.clear();
		Thread.sleep(1000);
		accountNumber.sendKeys(account_Number);
	}
	
	public boolean verify_Msg_On_Confirm_Payment_Page(String Msg) throws InterruptedException {
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'"+Msg+"')]"));
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.isDisplayed();
	}
	
	public void verify_the_amount_field_is_not_empty() {
		Assert.notNull(Amount_Field.getText(), "amount is not populate in amount field");
	}

	public boolean verify_other_radio_button_disable(String radioButton) {
		return driver.findElement(By.xpath("//md-radio-button[@aria-label='"+radioButton+"' and @disabled='disabled']")).isDisplayed();
	}
	
	public boolean verify_AdditionalInfo_Field(String name) {
		return driver.findElement(By.xpath("//dt[contains(text(),'"+name+"')]")).isDisplayed();
	}

	public boolean verify_AdditionalInfo_Field_with_its_null_value(String name) {
		String additionalInfoValue = driver.findElement(By.xpath("//dt[contains(text(),'"+name+"')]//following::dd[1]")).getText();
			if (additionalInfoValue.isEmpty()) {
				return true;
			}else {
				return false;
			}
	}
	
	public boolean verify_Wallet_with_Amount(String amount) throws Exception {			
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//span[@Class='fa fa-wallet ng-binding' and @aria-label='₹"+amount+"']"));
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.isDisplayed();
	}
	
	public boolean verify_Field_Avialble_On_Confirm_Payment_Page(String Field) throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(By.xpath("(//h2[contains(text(),'Confirm Payment')]/ancestor::div[2]/following-sibling::div[1]//dt[contains(text(),'"+Field+"')])[1]")).isDisplayed();
	}
	
	public void enter_Other_value_on_confirm_payment_page(String value) throws InterruptedException {
		otherAmount.clear();
		Thread.sleep(1000);
		otherAmount.sendKeys(value);
	}
	
	public boolean verify_Other_Field_On_Confirm_Payment_Page() throws InterruptedException {
		Thread.sleep(1000);
		otherAmount.isDisplayed();
		return true;
	}
	
	public boolean verify_Error_Msg_On_Confirm_Payment_Page(String Error_Msg) throws InterruptedException {
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'"+Error_Msg+"')]"));
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.isDisplayed();
	}
	
	public boolean verify_Other_value_Not_On_Confirm_Payment_Page() throws InterruptedException {
		Thread.sleep(1000);
		try {
			otherAmount.isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	public void Enter_Cheque_Account_Number(String value) throws InterruptedException {
		chequeAccNumber.clear();
		Thread.sleep(1000);
		chequeAccNumber.sendKeys(value);
	}
	public void Enter_Cheque_Number(String value) throws InterruptedException {
		chequeNumber.clear();
		Thread.sleep(1000);
		chequeNumber.sendKeys(value);
	}
}
