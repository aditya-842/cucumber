package com.sarvatra.test.ehub.pageobjects;

import java.util.*;
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

public class CreditCardPageObject {

	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions c;

	public CreditCardPageObject(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		c = new CommonFunctions(driver);
	}

	// Elements select Credit Card
	@FindBy(xpath = "//md-tab-item/span[contains(text(),'Credit Card')]")
	@CacheLookup
	WebElement creditCard;

	//  Credit Card payment input text field
	@FindBy(xpath = "//md-tab-item/span[contains(text(),'Credit Card')]")
	@CacheLookup
	WebElement creditCardPayment;

	//  Last 4 Digit of Card Number input text field
	@FindBy(xpath = "//input[@id='Last 4 Digits of Card Number' or @id='Last 4 digits of Credit Card Number']")
	@CacheLookup
	WebElement cardNumber;

	//credit card dropdown
	@FindBy(xpath = "//input[@name='searchBillerText']")
	@CacheLookup
	WebElement creditCardDropdown;			

	//credit card biller list	
	@FindBy(xpath = "//div[@class='md-virtual-repeat-scroller']//li")
	@CacheLookup
	WebElement creditCardBillerList;

	//payment mode dropdown
	@FindBy(xpath = "//*[@id='selectedPayMode']")
	@CacheLookup
	WebElement paymentMode;

	//payer information email id 
	@FindBy(xpath = ".//input[@id='email']")
	@CacheLookup
	WebElement payeeEmail;

	//payer information mobile number
	@FindBy(xpath = "//input[@id='mobile']")
	@CacheLookup
	WebElement payer_mobileNumber;

	//fetch bill button
	@FindBy(xpath = "//button[contains(text(),'Fetch Bill')]")
	@CacheLookup
	WebElement fetchBillButton;

	//pay bill button
	@FindBy(xpath = "//button//span[contains(text(),'Pay')]")
	@CacheLookup
	WebElement payBillButton;

	//validate bill button
	@FindBy(xpath = "//button[contains(text(),'Validate Bill')]")
	@CacheLookup
	WebElement validateBillButton;

	//Last 4 Digits Card No field
	@FindBy(xpath = "//input[@id='Last 4 Digits Card No']")
	@CacheLookup
	WebElement last4DigitsCardNo_Field;

	//Mobile Number(append 91) field
	@FindBy(xpath = "//input[@id='Mobile Number(append 91)']")
	@CacheLookup
	WebElement mobileNumber_Field;


	@FindBy(xpath = "//input[@id='Mobile Number' or @id='Registered Mobile Number']")
	@CacheLookup
	WebElement mobileNumber;
	
	@FindBy(xpath = "//md-radio-group//div[contains(text(),'\"+Minimum due amount+\"')])[1]")
	@CacheLookup
	WebElement Minimumdueamount;
	
	@FindBy(xpath = "//input[@id='a']")
	@CacheLookup
	WebElement CustomeParamA;
	
	@FindBy(xpath = "//input[@id='a b']")
	@CacheLookup
	WebElement CustomeParamAB;
	
	@FindBy(xpath = "//input[@id='a b c']")
	@CacheLookup
	WebElement CustomeParamABC;
	
	@FindBy(xpath = "//input[@id='a b c d']")
	@CacheLookup
	WebElement CustomeParamABCD;
	
	@FindBy(xpath = "//input[@id='a b c d e']")
	@CacheLookup
	WebElement CustomeParamABCDE;
	public boolean clickOnMinimumDueAmount() {
		try {
			wait.until(ExpectedConditions.visibilityOf(Minimumdueamount));
			Minimumdueamount.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean selectCreditCard() {
		try {				
			wait.until(ExpectedConditions.visibilityOf(creditCard));
			creditCard.click();
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean textCreditCardPayments() {
		try {				
			wait.until(ExpectedConditions.visibilityOf(creditCardPayment));
			creditCardPayment.click();
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean enterCardNumber() {
		try {				
			wait.until(ExpectedConditions.visibilityOf(cardNumber));
			cardNumber.click();
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean verifyCustomParam(String customParam) {
		List<WebElement> customparams=driver.findElements(By.xpath("//md-input-container/label"));

		for(int i=0;i<customparams.size();i++) {
			String s=customparams.get(i).getText();
			if(customParam.equalsIgnoreCase(s)) {
				return true;
			}
		}

		return false;			
	}

	public boolean verifyErrorMsgCustomParam(String errorMsg,String customParam) {
		WebElement getErrorMsg=driver.findElement(By.xpath("//md-input-container/label[contains(text(),'"+customParam+"')]/following-sibling::div[@role='alert']"));		
		if(errorMsg.equalsIgnoreCase(getErrorMsg.getText())) {
			return true;
		}			
		return false;			
	}

	public boolean verifyErrorforInvalidData(String data,String errorMsg,String customParam) throws Exception {
		if(customParam.contains("Payer Mobile") ){
			driver.findElement(By.xpath("//md-input-container/label[contains(text(),'"+customParam+"')]/following-sibling::input")).sendKeys(data);;			
		}//input[@id='"+customParam+"']
		else {
			driver.findElement(By.xpath("//md-input-container/label[contains(text(),'"+customParam+"')]/following-sibling::bbps-field/input")).sendKeys(data);				
		}
		Thread.sleep(2000);
		WebElement getErrorMsg=driver.findElement(By.xpath("//md-input-container/label[contains(text(),'"+customParam+"')]/following-sibling::div[@role='alert']/div"));			
		System.out.println("get msg : - "+getErrorMsg.getText() +" ...");
		if(errorMsg.equalsIgnoreCase(getErrorMsg.getText())) {
			return true;
		}			
		return false;			
	}

	public void enterValidData(String data,String customParam) throws Exception {
		if(customParam.contains("Payer Mobile") ){
			driver.findElement(By.xpath("//md-input-container/label[contains(text(),'"+customParam+"')]/following-sibling::input")).sendKeys(data);;			
		}
		else {
			driver.findElement(By.xpath("//md-input-container/label[contains(text(),'"+customParam+"')]/following-sibling::bbps-field/input")).sendKeys(data);				
		}
		Thread.sleep(2000);
	}

	public boolean verify_biller_for_Credit_Card(String biller) {
		driver.findElement(By.xpath("//span[contains(text(),'"+biller+"')]")).isDisplayed();
		return true;

	}

	public boolean verify_payer_information_mobileNumber() throws InterruptedException {
		Thread.sleep(1000);
		boolean verifyMobile =driver.findElement(By.xpath(".//*[@id='mobile']")).isDisplayed();
		return verifyMobile;
	}

	public boolean verify_payer_information_email() throws InterruptedException {
		Thread.sleep(1000);
		boolean verifyEmail =driver.findElement(By.xpath(".//input[@id='email']")).isDisplayed();
		return verifyEmail;
	}

	public boolean verify_payer_information_amount() {
		wait.until(ExpectedConditions.visibilityOf(payeeEmail));
		boolean verifyAmountField =driver.findElement(By.xpath(".//input[@id='quickAmount']")).isDisplayed();
		return verifyAmountField;
	}

	public void selectBillerfromDropDown(String billerName) {
		wait.until(ExpectedConditions.visibilityOf(creditCardDropdown));
		creditCardDropdown.click();
		creditCardDropdown.sendKeys(billerName);
		wait.until(ExpectedConditions.visibilityOf(creditCardBillerList));
		if (billerName.equals("Bank of Baroda")) {
			driver.findElement(By.xpath("//span[(contains(text(),'"+ billerName +"')) and not(contains(text(),'Bank of Baroda test'))]")).click();
		}else {
			driver.findElement(By.xpath("//span[contains(text(),'"+ billerName +"')]")).click();
		}
	}

	public boolean verify_payment_mode_for_credit_card_biller() {
		return paymentMode.isDisplayed();
	}

	public boolean verify_fetch_bill_button_for_credit_card_biller() {
		return fetchBillButton.isDisplayed();
	}

	public boolean verify_pay_bill_button_for_credit_card_biller() {
		return payBillButton.isDisplayed();
	}

	public boolean verify_validate_bill_button_for_credit_card_biller() {
		return validateBillButton.isDisplayed();
	}

	public boolean verify_custom_param_4_digit_no_field() {
		wait.until(ExpectedConditions.visibilityOf(last4DigitsCardNo_Field));
		return last4DigitsCardNo_Field.isDisplayed();
	}

	public boolean verify_custom_param_mobile_number_field() {
		wait.until(ExpectedConditions.visibilityOf(mobileNumber_Field));
		return mobileNumber_Field.isDisplayed();
	}
	
	public boolean verify_radio_button(String radio) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//md-radio-group//div[contains(text(),'"+radio+"')])[1]")).isDisplayed();
		return true;
	}

	public boolean verify_custom_param_a_field() {
		return driver.findElement(By.xpath("//input[@id='a']")).isDisplayed();
	}

	public boolean verify_custom_param_a_b_field() {
		return  driver.findElement(By.xpath("//input[@id='a b']")).isDisplayed();
	}

	public boolean verify_custom_param_a_b_c_field() {
		return driver.findElement(By.xpath("//input[@id='a b c']")).isDisplayed();
	}

	public boolean verify_custom_param_a_b_c_d_field() {
		return driver.findElement(By.xpath("//input[@id='a b c d']")).isDisplayed();
	}

	public boolean verify_custom_param_a_b_c_d_e_field() {
		return driver.findElement(By.xpath("//input[@id='a b c d e']")).isDisplayed();
	}
	
	public void Enter_custom_param_a_field(String Custome_P_A) {
		CustomeParamA.sendKeys(Custome_P_A);
	}

	public void Enter_custom_param_a_b_field(String Custome_P_AB) {
		CustomeParamAB.sendKeys(Custome_P_AB);
	}

	public void Enter_custom_param_a_b_c_field(String Custome_P_ABC) {
		CustomeParamABC.sendKeys(Custome_P_ABC);
	}

	public void Enter_custom_param_a_b_c_d_field(String Custome_P_ABCD) {
		CustomeParamABCD.sendKeys(Custome_P_ABCD);
	}

	public void Enter_custom_param_a_b_c_d_e_field(String Custome_P_ABCDE) {
		CustomeParamABCDE.sendKeys(Custome_P_ABCDE);
	}


	public void Enter_Mobile_Number(String Mobile){
		mobileNumber.sendKeys(Mobile);
	}
	
	public void Enter_cardNumber(String card_Number){
		cardNumber.sendKeys(card_Number);
	}
	
	public void Enter_Payer_Mobile_Number(String Mobile) throws InterruptedException{
		payer_mobileNumber.clear();
		Thread.sleep(500);
		payer_mobileNumber.sendKeys(Mobile);
	}
	
	public void click_On_Fetch_Bill_Button() {
		fetchBillButton.click();
	}
	
	public void Enter_Payer_Email(String email) throws InterruptedException {
		payeeEmail.clear();
		Thread.sleep(500);
		payeeEmail.sendKeys(email);
	}
}