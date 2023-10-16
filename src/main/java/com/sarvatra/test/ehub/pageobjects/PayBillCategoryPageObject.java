package com.sarvatra.test.ehub.pageobjects;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

public class PayBillCategoryPageObject {
	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions c;

	public PayBillCategoryPageObject(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		c = new CommonFunctions(driver);
	}

	// #Elements select housing society
	@FindBy(xpath = "//*[@role='tablist']/md-tab-item")
	@CacheLookup
	WebElement Category;

	@FindBy(xpath = "//input[@id='Distributor ID']")
	@CacheLookup
	WebElement Distributor_ID;

	@FindBy(xpath = "//input[@id='Unique Consumer ID']")
	@CacheLookup
	WebElement Unique_Consumer_ID;

	@FindBy(xpath = "//input[@id='Consumer Number']")
	@CacheLookup
	WebElement ConsumerNumber;

	@FindBy(xpath = "//input[@id='quickAmount']")
	@CacheLookup
	WebElement EnterAmount;

	@FindBy(xpath = "//input[@name='searchStateText']")
	@CacheLookup
	WebElement Please_Select_state;

	@FindBy(xpath = "//*[@id='Flat No']")
	@CacheLookup
	WebElement Flat_Number;

	@FindBy(xpath = "//a[@class='enabled']")
	@CacheLookup
	WebElement Enabled_View_Extra_Details;

	@FindBy(xpath = "//a[@class='disabled']")
	@CacheLookup
	WebElement Disabled_View_Extra_Details;

	@FindBy(xpath = "//input[@name='Customer Reference Field1']")
	@CacheLookup
	WebElement Customer_Reference_Field1;

	@FindBy(xpath = "//input[@name='Customer Reference Field2']")
	@CacheLookup
	WebElement Customer_Reference_Field2;

	@FindBy(xpath = "//button[contains(text(),'Validate Bill')]")
	@CacheLookup
	WebElement Validate_Bill_Button;

	// md-next-button
	@FindBy(xpath = "//md-next-button")
	@CacheLookup
	WebElement categoryNextButton;

	// education Fees Icon
	@FindBy(xpath = "//md-tab-item//span[contains(text(),'Education Fees')]")
	@CacheLookup
	WebElement educationFeesIcon;

	// state field
	@FindBy(xpath = "//input[@name='searchStateText']")
	@CacheLookup
	WebElement stateField;

	// state Dropdown Values
	@FindBy(xpath = "//md-virtual-repeat-container")
	@CacheLookup
	WebElement stateDropdownValues;

	// city field
	@FindBy(xpath = "//input[@id='city']")
	@CacheLookup
	WebElement cityField;

	// submit button
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	@CacheLookup
	WebElement submitButton;

	// education Fees Payment field
	@FindBy(xpath = "//input[@name='searchBillerText']")
	@CacheLookup
	WebElement educationFeesPayment;

	// student unique id field
	@FindBy(xpath = "//input[@id='Student Unique ID']")
	@CacheLookup
	WebElement studentUniqueID;

	// mobile Number Of Parent field
	@FindBy(xpath = "//input[@id='Mobile Number of Parent']")
	@CacheLookup
	WebElement mobileNumberOfParent;

	// DOB of student field
	@FindBy(xpath = "//input[@id='DOB of Student(DDMMYYYY)']")
	@CacheLookup
	WebElement dobOfStudent;

	// payment mode
	@FindBy(xpath = "//md-select[@id='selectedPayMode']")
	@CacheLookup
	WebElement selectPayMode;

	// payer mobile field
	@FindBy(xpath = "//input[@id='mobile']")
	@CacheLookup
	WebElement payerMobile;

	// payer email field
	@FindBy(xpath = "//input[@id='email']")
	@CacheLookup
	WebElement payerEmail;

	// fetch bill button
	@FindBy(xpath = "//button[contains(text(),'Fetch Bill')]")
	@CacheLookup
	WebElement fetchBillButton;

	// cash Receipt Number
	@FindBy(xpath = "//input[@id='accNo']")
	@CacheLookup
	WebElement cashReceiptNumber;

	// confirm button
	@FindBy(xpath = "//button[contains(text(),'Confirm')]")
	@CacheLookup
	WebElement confirmButton;
	
	@FindBy(xpath = "//input[@name='searchBillerText']")
	@CacheLookup
	WebElement searchBillerText;
	
	@FindBy(id = "Tenement No")
	@CacheLookup
	WebElement tenementNo;

	@FindBy(id = "UHID")
	@CacheLookup
	WebElement UHID_field;
	
	@FindBy(id = "Vehicle Registration Number")
	@CacheLookup
	WebElement Vehicle_Registration_No;
	
	@FindBy(xpath = "//input[@id='quickAmount']")
	@CacheLookup
	WebElement Amount_TextField;
	
	@FindBy(xpath = "//input[@id='Amount']")
	@CacheLookup
	WebElement Amount;
	
	@FindBy(xpath = "//input[@id='UHID']")
	@CacheLookup
	WebElement UHID;
	

	public Set<String> verifyPayBillCategory() {
		Set<String> hash_Set = new HashSet<String>();
		try {
			List<WebElement> elementName = driver.findElements(By.xpath("//*[@role='tablist']/md-tab-item"));

			for (WebElement we : elementName) {
				if (we.isDisplayed()) {
					hash_Set.add(we.getText());
				}
			}
			return hash_Set;
		} catch (Exception e) {
			e.printStackTrace();
			return hash_Set;
		}
	}

	public void Select_Category(String Category_Option) throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(Category));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("(//span[contains(text(),'"+Category_Option+"')])[1]"));
		je.executeScript("arguments[0].click();",element);
		Thread.sleep(5000);
	}

	public void enter_Distributor_ID(String DistributorID) {
		wait.until(ExpectedConditions.visibilityOf(Distributor_ID));
		Distributor_ID.clear();
		Distributor_ID.sendKeys(DistributorID);
	}

	public void enter_Unique_Consumer_ID(String Unique_ConsumerID) {
		wait.until(ExpectedConditions.visibilityOf(Unique_Consumer_ID));
		Unique_Consumer_ID.clear();
		Unique_Consumer_ID.sendKeys(Unique_ConsumerID);
	}

	public void enter_ConsumerNumber(String Consumer_Number) {
		wait.until(ExpectedConditions.visibilityOf(ConsumerNumber));
		ConsumerNumber.clear();
		ConsumerNumber.sendKeys(Consumer_Number);
	}

	public void enter_EnterAmount(String Enter_Amount) {
		wait.until(ExpectedConditions.visibilityOf(EnterAmount));
		EnterAmount.clear();
		EnterAmount.sendKeys(Enter_Amount);
	}

	public void select_State_from_Dropdown(String DropdownOption) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(Please_Select_state));
		Please_Select_state.sendKeys(DropdownOption);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'" + DropdownOption + "')]")).click();
	}

	public void enter_Flat_Number(String FlatNumber) {
		wait.until(ExpectedConditions.visibilityOf(Flat_Number));
		Flat_Number.clear();
		Flat_Number.sendKeys(FlatNumber);
	}

	public boolean verify_TextViewExtraDetails_Disabled() {
		wait.until(ExpectedConditions.visibilityOf(Disabled_View_Extra_Details));
		Disabled_View_Extra_Details.isDisplayed();
		return true;
	}

	public boolean verify_Key_Value_Pair_On_Confirm_Payment(String Key, String Value) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By
				.xpath("//dt[contains(text(),'" + Key + "')]/following-sibling::dd[contains(text(),'" + Value + "')]"))
				.isDisplayed();
		return true;
	}

	public void enter_Customer_Reference_Field1(String Field1) {
		wait.until(ExpectedConditions.visibilityOf(Customer_Reference_Field1));
		Customer_Reference_Field1.clear();
		Customer_Reference_Field1.sendKeys(Field1);
	}

	public void enter_Customer_Reference_Field2(String Field2) {
		wait.until(ExpectedConditions.visibilityOf(Customer_Reference_Field2));
		Customer_Reference_Field2.clear();
		Customer_Reference_Field2.sendKeys(Field2);
	}

	public void click_On_Validate_Bill_Button() {
		wait.until(ExpectedConditions.visibilityOf(Validate_Bill_Button));
		Validate_Bill_Button.click();
	}

	public boolean clickOnEducationFeesIcon() {
		try {
			wait.until(ExpectedConditions.visibilityOf(categoryNextButton));
			categoryNextButton.click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOf(educationFeesIcon));
			educationFeesIcon.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean clickOnStateField(String state) {
		try {
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOf(stateField));
			stateField.click();
			stateField.sendKeys(state);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[contains(text(),'" + state + "')]")).click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean clickOnCityField(String city) {
		try {
			wait.until(ExpectedConditions.visibilityOf(cityField));
			cityField.click();
			cityField.sendKeys(city);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
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

	public boolean clickOnEducationFeesPayment(String education_FeesPayment) {
		try {
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOf(educationFeesPayment));
			educationFeesPayment.click();
			educationFeesPayment.sendKeys(education_FeesPayment);
			// Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'" + education_FeesPayment + "')]")).click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean enterUniqueStudentID(String studentUniqueId) {
		try {
			wait.until(ExpectedConditions.visibilityOf(studentUniqueID));
			studentUniqueID.sendKeys(studentUniqueId);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean enterMobileNumberOfParent(String mobileNumberOf_Parent) {
		try {
			wait.until(ExpectedConditions.visibilityOf(mobileNumberOfParent));
			mobileNumberOfParent.sendKeys(mobileNumberOf_Parent);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean enterDOBOfStudent(String dobOf_Student) {
		try {
			wait.until(ExpectedConditions.visibilityOf(dobOfStudent));
			dobOfStudent.sendKeys(dobOf_Student);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean selectPaymentMode(String payment_Mode) {
		try {
			wait.until(ExpectedConditions.visibilityOf(selectPayMode));
			selectPayMode.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[contains(text(),'" + payment_Mode + "')]")).click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean enterPayerMobile(String payerNo) {
		try {
			wait.until(ExpectedConditions.visibilityOf(payerMobile));
			payerMobile.sendKeys(payerNo);
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

	public boolean clickOnFetchBill() {
		try {
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].click();",fetchBillButton);
			Thread.sleep(3000);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean enterReceiptNumber(String receiptNumber) {
		try {
			wait.until(ExpectedConditions.visibilityOf(cashReceiptNumber));
			cashReceiptNumber.sendKeys(receiptNumber);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean clickOnConfirmButton() {
		try {
			wait.until(ExpectedConditions.visibilityOf(confirmButton));
			confirmButton.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean verify_Biller_Dropdown() {
		searchBillerText.isDisplayed();
		return true;
	}
	
	public void select_Biller_From_Dropdown(String Biller) throws InterruptedException {
		Thread.sleep(2000);
		searchBillerText.click();
		Thread.sleep(1000);
		searchBillerText.sendKeys(Biller);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'"+Biller+"')]")).click();
	}
	
	public boolean verify_Biller_Available_In_Dropdown(String Biller) throws InterruptedException {
		Thread.sleep(2000);
		searchBillerText.sendKeys(Biller);
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[contains(text(),'"+Biller+"')]")).isDisplayed();
		return true;
	}
	
	public void enter_Value_Of_a(String Value) {
		driver.findElement(By.xpath("//input[@id='a']")).sendKeys(Value);
	}
	
	public void enter_Value_Of_ab(String Value) {
		driver.findElement(By.xpath("//input[@id='a b']")).sendKeys(Value);
	}
	
	public void enter_Value_Of_abc(String Value) {
		driver.findElement(By.xpath("//input[@id='a b c']")).sendKeys(Value);
	}
	
	public void enter_Value_Of_abcd(String Value) {
		driver.findElement(By.xpath("//input[@id='a b c d']")).sendKeys(Value);
	}
	
	public void enter_Value_Of_abcde(String Value) {
		driver.findElement(By.xpath("//input[@id='a b c d e']")).sendKeys(Value);
	}
	
	public boolean verify_Payer_Mobile_Number_Field() throws InterruptedException {
		payerMobile.isDisplayed();
		return true;
	}
	
	public boolean verify_Payer_Email_Field() throws InterruptedException {
		payerEmail.isDisplayed();
		return true;
	}
	
	public void click_On_Payment_Mode_Field() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("selectedPayMode")).click();
	}
	
	public boolean verify_Payment_Mode_Field(String Option) throws InterruptedException {
		driver.findElement(By.xpath("//md-option//div[contains(text(),'"+Option+"')]")).isDisplayed();
		return true;
	}
	
	public void select_Payment_Mode_Field(String Option) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-option//div[contains(text(),'"+Option+"')]")).click();
	}
	
	public boolean verify_Fetch_bill_Button() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'Fetch Bill')]")).isDisplayed();
		return true;
	}
	
	public boolean verify_Registered_Mobile_Number_Field() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='Registered Mobile Number']")).isDisplayed();
		return true;
	}
	
	public boolean verify_UHID_Field() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='UHID']")).isDisplayed();
		return true;
	}
	
	public void enter_Registered_Mobile_Number_Field(String Number) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='Registered Mobile Number']")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='Registered Mobile Number']")).sendKeys(Number);
	}
	
	public boolean enter_UHID_Field(String UHID) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='UHID']")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='UHID']")).sendKeys(UHID);
		return true;
	}
	
	public boolean enter_Payer_Mobile_Number_Field(String Number) throws InterruptedException {
		payerMobile.clear();
		Thread.sleep(500);
		payerMobile.sendKeys(Number);
		return true;
	}
	
	public boolean enter_Payer_Email_Field(String email) throws InterruptedException {
		payerEmail.clear();
		Thread.sleep(500);
		payerEmail.sendKeys(email);
		return true;
	}
	
	public boolean verify_Error_Msg_On_PayBill_Page(String Error_Msg) throws InterruptedException {
		driver.findElement(By.xpath("//div[contains(text(),'"+Error_Msg+"')]")).isDisplayed();
		return true;
	}
	
	public String get_Registered_Mobile_Number_Field() throws InterruptedException {
		String Number = driver.findElement(By.xpath("//input[@id='Registered Mobile Number']")).getAttribute("value");
		return Number;
	}
	
	public String get_Payer_Mobile_Number_Field() throws InterruptedException {
		String Number = driver.findElement(By.xpath("//input[@id='mobile']")).getAttribute("value");
		return Number;
	}
	
	public String get_UHID_Field() throws InterruptedException {
		String Number = driver.findElement(By.xpath("//input[@id='UHID']")).getAttribute("value");
		return Number;
	}
	
	public boolean verify_Cash_Receipt_Number_Field() throws InterruptedException {
		driver.findElement(By.id("cashReceiptNumber")).isDisplayed();
		return true;
	}
	
	public boolean verify_Vehicle_Registration_Number_Wallet_Number_Field_displayed() throws InterruptedException {
		driver.findElement(By.id("Vehicle Registration Number/Wallet Number")).isDisplayed();
		return true;
	}
	
	public boolean verify_amount_Field_displayed() throws InterruptedException {
		driver.findElement(By.id("Amount")).isDisplayed();
		return true;
	}
	
	public void enter_tenementNO(String tenement_no) throws InterruptedException {
		tenementNo.clear();
		Thread.sleep(500);
		tenementNo.sendKeys(tenement_no);
	}

	public void enter_UHID_Number_Field(String UHID) throws InterruptedException {
		UHID_field.clear();
		Thread.sleep(1000);
		UHID_field.sendKeys(UHID);
	}
	
	public boolean verify_Category_Available(String Category) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//md-pagination-wrapper//span[contains(text(),'"+Category+"')])[1]")).isDisplayed();
		return true;
	}
	
	public void enterFieldInput(String no,String value) {
		 WebElement we= driver.findElement(By.xpath("(//md-input-container/bbps-field/input)["+no+"]"));
			we.clear();
			we.sendKeys(value);
	}
	
	public void enter_Vehicle_Registration_Number(String Vehicle_Registration_no) throws InterruptedException {
		Vehicle_Registration_No.clear();
		Thread.sleep(500);
		Vehicle_Registration_No.sendKeys(Vehicle_Registration_no);
	}
	
	public void enter_Amount_In_TextField(String Amount) throws InterruptedException {
		Amount_TextField.clear();
		Thread.sleep(500);
		Amount_TextField.sendKeys(Amount);
	}
	
	public void enter_In_First_TextField(String Value) throws InterruptedException {
		driver.findElement(By.xpath("(//form[@id='form']//bbps-field/input)[1]")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//form[@id='form']//bbps-field/input)[1]")).sendKeys(Value);
	}
	
	public void enter_In_Second_TextField(String Value) throws InterruptedException {
		driver.findElement(By.xpath("(//form[@id='form']//bbps-field/input)[2]")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//form[@id='form']//bbps-field/input)[2]")).sendKeys(Value);
	}
	
	public void enter_In_Third_TextField(String Value) throws InterruptedException {
		driver.findElement(By.xpath("(//form[@id='form']//bbps-field/input)[3]")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//form[@id='form']//bbps-field/input)[3]")).sendKeys(Value);
	}
	
	public void enter_In_Fourth_TextField(String Value) throws InterruptedException {
		driver.findElement(By.xpath("(//form[@id='form']//bbps-field/input)[4]")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//form[@id='form']//bbps-field/input)[4]")).sendKeys(Value);
	}
	
	public void enter_In_Fifth_TextField(String Value) throws InterruptedException {
		driver.findElement(By.xpath("(//form[@id='form']//bbps-field/input)[5]")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//form[@id='form']//bbps-field/input)[5]")).sendKeys(Value);
	}
	
	public void Enter_EnterAmount(String Enter_Amount) {
		wait.until(ExpectedConditions.visibilityOf(EnterAmount));
		Amount.clear();
		Amount.sendKeys(Enter_Amount);
	}
	
	public void Enter_UHID(String UHID1) {
		wait.until(ExpectedConditions.visibilityOf(EnterAmount));
		UHID.clear();
		UHID.sendKeys(UHID1);
	}
	
	public void enter_Biller_On_PayBill_Page(String Biller) throws InterruptedException {
		Thread.sleep(1000);
		searchBillerText.click();
		Thread.sleep(1000);
		searchBillerText.sendKeys(Biller);
	}
	
	public boolean verify_Biller_Not_Available_In_Dropdown_On_PayBill_Page(String Biller) throws InterruptedException {
		try {
			driver.findElement(By.xpath("//span[contains(text(),'"+Biller+"')]")).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean verify_Error_Message_On_PayBill_Page(String Error_Msg) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'"+Error_Msg+"')]")).isDisplayed();
		return true;
	}
}
