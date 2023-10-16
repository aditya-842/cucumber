package com.sarvatra.test.ehub.pageobjects;

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

import com.qa.util.CommonFunctions;

public class ElecticityBillPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions c;

	public ElecticityBillPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		c = new CommonFunctions(driver);
	}
	
	/*
	 * ####################- Owner --> Vivek Nichal -###########################
	 * 
	 */
	
	// #Elements select Electricity
		@FindBy(xpath = "//md-tab-item/span[contains(text(),'Electricity')]")
		@CacheLookup
		WebElement Electricity;
		
	//  #Element enter biller name //*[@name='searchBillerText']
		@FindBy(xpath = "//*[@name='searchBillerText']")
		@CacheLookup
		WebElement enterBiller;
		
	// #Select biller from list //*[@role='listbox']/li or	//li[@class='md-autocomplete-suggestion ng-scope'] //*[@md-highlight-text='searchBillerText']
		@FindBy(xpath = "//span[contains(text(),'Adani Electricity Mumbai Limited')]")
		@CacheLookup
		WebElement selectBiller;
		
	// #Enter Cunsumer Number
		@FindBy(xpath = "//input[@id='Consumer number']")
		@CacheLookup
		WebElement consumerNumber;
	
		// #Enter Mobile number
		@FindBy(xpath = "//input[@id='mobile']")
		@CacheLookup
		WebElement textMobileNumber;
		
		// #Enter customer Mobile number
		@FindBy(xpath = "//md-input-container/input[@id='mobile']")
		@CacheLookup
		WebElement customerMobileNumber;
		
		@FindBy(xpath = "//button[contains(text(),'Fetch Bill')]")
		@CacheLookup
		WebElement buttonFetchBill;
		
		@FindBy(xpath = "//input[@id='cashReceiptNumber']")
		@CacheLookup
		WebElement cashReceiptNumber;
		
		@FindBy(xpath = "//input[@id='accNo']")
		@CacheLookup
		WebElement AccountNumber;
		
//		#Element Mobile Prepaid Pay Bill
		@FindBy(xpath = "//button[contains(text(),'Confirm')]")
		@CacheLookup
		WebElement PaymentConfirmButton;
		
		@FindBy(xpath = "//*[text()='Extra Details']")
		@CacheLookup
		WebElement TextExtraDetails;
		
		@FindBy(xpath = "//*[text()='View Extra Details']")
		@CacheLookup
		WebElement ViewExtraDetails;
		
		@FindBy(xpath = "//h2[text()='Extra Details']")
		@CacheLookup
		WebElement PopupTextExtraDetails;
		
		@FindBy(xpath = "//button[contains(text(),'Close')]")
		@CacheLookup
		WebElement ClosePopup;
		
		@FindBy(xpath = "//td[text()='VoucherCode']")
		@CacheLookup
		WebElement VoucherCode;
		
		@FindBy(xpath = "//label[text()='Transaction History']")
		@CacheLookup
		WebElement TransactionHistory;
		
		@FindBy(xpath = "//md-select[@id='userId']")
		@CacheLookup
		WebElement UserDropdrop;
		
		@FindBy(xpath = "//md-option/div[contains(text(),'All')]")
		@CacheLookup
		WebElement SelectUser;
		
		@FindBy(xpath = "//md-select[@id='selectedParam']")
		@CacheLookup
		WebElement selectedParam;
		
		@FindBy(xpath = "//md-option/div[contains(text(),'Customer Mobile')]")
		@CacheLookup
		WebElement CustomerMobile;
		
		@FindBy(xpath = "//button[contains(text(),'Search')]")
		@CacheLookup
		WebElement SearchButton;
		
		@FindBy(xpath = "//table[@class='table table-striped table-hover bbps-table']//tr/td[2]")
		@CacheLookup
		WebElement SearchedCustomerMobile;
		
		@FindBy(xpath = "//input[@id='Service Number']")
		@CacheLookup
		WebElement serviceNumber;
		
		@FindBy(xpath = "//*[@id='City']")
		@CacheLookup
		WebElement City_Dropdown;
		
		@FindBy(xpath = "//dd[text()='Ahmedabad']")
		@CacheLookup
		WebElement Selected_City;
		
		@FindBy(xpath = "//dd[text()='Ahmedabad']")
		@CacheLookup
		WebElement payBill;
		
		//pay bill button
		@FindBy(xpath = "//button//span[contains(text(),'Pay')]")
		@CacheLookup
		WebElement payBillButton;
		
		//payer email field
		@FindBy(xpath = "//input[@id='email']")
		@CacheLookup
		WebElement payerEmail;
		
		//amount field
		@FindBy(xpath = "//input[@id='quickAmount']")
		@CacheLookup
		WebElement amountField;
		
		//print button
		@FindBy(xpath = "//button[contains(text(),'Print')]")
		@CacheLookup
		WebElement printButton;
		
		@FindBy(xpath = "//input[@id='K Number']")
		@CacheLookup
		WebElement knumber;
		
		public boolean selectElectricityBill() {
			
			try {				
			wait.until(ExpectedConditions.visibilityOf(Electricity));
			//name=Electricity.getText();
			Electricity.click();
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean selectBillerOrProvider(String Biller) {
			try {
				Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOf(enterBiller));
			enterBiller.sendKeys(Biller);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'"+Biller+"')]")).click();
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean selectTorrentBillerOrProvider(String Biller) {
			try {
				//Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOf(enterBiller));
			enterBiller.sendKeys(Biller);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'"+Biller+"')])[3]")).click();
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean enterConsumerNumber(String ConsumerNumber) {
			try {
			wait.until(ExpectedConditions.visibilityOf(consumerNumber));
			//consumerNumber.clear();
			consumerNumber.sendKeys(ConsumerNumber);	
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean enterMobileNumber(String mobileNumber) {
			try {
			wait.until(ExpectedConditions.visibilityOf(textMobileNumber));
			textMobileNumber.clear();
			textMobileNumber.sendKeys(mobileNumber);
			Thread.sleep(1000);
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean clickOnFetchBillButton() {
			try {	
				((JavascriptExecutor) driver).executeScript("scroll(0,300)");	
			wait.until(ExpectedConditions.visibilityOf(buttonFetchBill));
			buttonFetchBill.click();
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean enterCashReceiptNumber(String CashReceiptNo) {
			try {
			wait.until(ExpectedConditions.visibilityOf(cashReceiptNumber));
			cashReceiptNumber.clear();
			cashReceiptNumber.sendKeys(CashReceiptNo);	
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean clickOnPaymentConfirmButton() {
			try {	
				((JavascriptExecutor) driver).executeScript("scroll(0,300)");	
			wait.until(ExpectedConditions.visibilityOf(PaymentConfirmButton));
			PaymentConfirmButton.click();
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean verifyTextExtraDetails() {
			try {		
			wait.until(ExpectedConditions.visibilityOf(TextExtraDetails));
			TextExtraDetails.isDisplayed();
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean verifyTextViewExtraDetails() {
			try {		
			wait.until(ExpectedConditions.visibilityOf(ViewExtraDetails));
			ViewExtraDetails.isDisplayed();
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
				
		public boolean verifyViewExtraDetailsPopup() {
			try {		
			wait.until(ExpectedConditions.visibilityOf(TextExtraDetails));
			TextExtraDetails.isDisplayed();
			ViewExtraDetails.click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOf(PopupTextExtraDetails));
			PopupTextExtraDetails.isDisplayed();
			VoucherCode.isDisplayed();
			((JavascriptExecutor) driver).executeScript("scroll(0,300)");
			driver.findElement(By.xpath("//a[@href='http://google.com']")).click();
			String ParentWindowHandle = driver.getWindowHandle();
			c.attachToNewBrowser();
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(ParentWindowHandle);
			ClosePopup.click();
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean enterAccountNumber(String Acc_No) {
			try {
			wait.until(ExpectedConditions.visibilityOf(AccountNumber));
			AccountNumber.clear();
			AccountNumber.sendKeys(Acc_No);	
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean clickOnTransactionHistory() {
			try {
			wait.until(ExpectedConditions.visibilityOf(TransactionHistory));
			TransactionHistory.click();;	
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean selectUser() {
			try {
			wait.until(ExpectedConditions.visibilityOf(UserDropdrop));
			UserDropdrop.click();
			wait.until(ExpectedConditions.visibilityOf(SelectUser));
			SelectUser.click();
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean selectParam() {
			try {
			wait.until(ExpectedConditions.visibilityOf(selectedParam));
			selectedParam.click();
			wait.until(ExpectedConditions.visibilityOf(CustomerMobile));
			CustomerMobile.click();
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
			
		public boolean ClickOnSearchedMobileNumberForBill() {
			try {
			wait.until(ExpectedConditions.visibilityOf(SearchedCustomerMobile));
			SearchedCustomerMobile.click();;	
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean clickOnSearch() {
			try {
			wait.until(ExpectedConditions.visibilityOf(SearchButton));
			SearchButton.click();
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean enterCustomerMobileNumber(String mobileNumber) {
			try {
			wait.until(ExpectedConditions.visibilityOf(customerMobileNumber));
			customerMobileNumber.clear();
			Thread.sleep(1000);
			customerMobileNumber.sendKeys(mobileNumber);
			Thread.sleep(1000);
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean enterServiceNumber(String ServiceNumber) {
			try {
				wait.until(ExpectedConditions.visibilityOf(serviceNumber));
				serviceNumber.clear();
				Thread.sleep(1000);
				serviceNumber.sendKeys(ServiceNumber);
				Thread.sleep(1000);
				return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean verifyCity() {
			try {
			wait.until(ExpectedConditions.visibilityOf(City_Dropdown));
			City_Dropdown.click();
			String Citylist[] = {"Ahmedabad", "Agra", "Surat", "Bhiwandi", "Shilmumbrakalwa"};
			for(int i=0;i<Citylist.length-1; i++) {
				System.out.println(Citylist[i]);
				driver.findElement(By.xpath("//div[contains(text(),'"+Citylist[i]+"')]")).isDisplayed();
				Thread.sleep(1000);
			}
			driver.findElement(By.xpath("//div[contains(text(),'Ahmedabad')]")).click();
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean verifySelectedCity() {
			try {
			wait.until(ExpectedConditions.visibilityOf(Selected_City));
			Selected_City.isDisplayed();	
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}	
		
		public boolean clickOnPayBillButton() {
			try {	
			wait.until(ExpectedConditions.visibilityOf(payBillButton));
			payBillButton.click();
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean clickOnPrintlButton() {
			try {	
			wait.until(ExpectedConditions.visibilityOf(printButton));
			printButton.click();
			Thread.sleep(1000);
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}

		public boolean enterPayerEmail(String payer_Email) {
			try {
			wait.until(ExpectedConditions.visibilityOf(payerEmail));
			payerEmail.sendKeys(payer_Email);
			Thread.sleep(1000);
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean enterAmount(String amount) {
			try {
			wait.until(ExpectedConditions.visibilityOf(amountField));
			amountField.sendKeys(amount);
			Thread.sleep(1000);
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean enterknumber(String amount) {
			try {
			wait.until(ExpectedConditions.visibilityOf(knumber));
			knumber.sendKeys(amount);
			Thread.sleep(1000);
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
}