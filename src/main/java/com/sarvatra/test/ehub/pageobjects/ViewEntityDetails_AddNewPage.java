package com.sarvatra.test.ehub.pageobjects;

import java.util.List;

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
import com.qa.util.DriverFactory;

public class ViewEntityDetails_AddNewPage {

	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions cf;
//	private ViewEntityDetails_AddNew addNew = new ViewEntityDetails_AddNew(DriverFactory.driver);
//	private ViewEntityDetailsPage EntDPage = new ViewEntityDetailsPage(DriverFactory.driver);

	public ViewEntityDetails_AddNewPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		cf = new CommonFunctions(driver);
	}

	/*
	 * ####################- Owner --> Mayur Kale -###########################
	 * 
	 */
//// #Child Entities Section
//	@FindBy(xpath = "//a[@ng-click='assignProductRole(true)' and contains(text(),'Add New')]")
//	@CacheLookup
//	WebElement addNewHypertectLink;

// #Assign Product Role Pop-Up
	@FindBy(xpath = "//h2[contains(text(),'Assign Product Role')]")
	@CacheLookup
	WebElement assignProductRolePopUp;

	@FindBy(xpath = "//md-dialog-actions/button[contains(text(),'Close')]")
	@CacheLookup
	WebElement CLoseButtonOnAssignProductPopUp;

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	@CacheLookup
	WebElement nextButtonOnAssignProductPopUp;
//	@FindBy(xpath = "//md-dialog-actions//button[@ng-click='assignProductRoleNext(frmProductRole.$valid)']")
//	@CacheLookup
//	WebElement nextButton;

	@FindBy(xpath = "//md-checkbox//div[contains(text(),'As Acquirer')]")
	@CacheLookup
	WebElement asAcquirerCheckBox;

//	@FindBy(xpath = "//md-select[@aria-label='Product']//span[@class='md-select-icon']")
	@FindBy(xpath = "//md-select[@aria-label='Product']")
	@CacheLookup
	WebElement productDropDown;

//	@FindBy(xpath = "//md-select[@aria-label='Role']//span[@class='md-select-icon']")
	@FindBy(xpath = "//md-select[@aria-label='Role']")
	@CacheLookup
	WebElement roleDropDown;

	@FindBy(xpath = "//md-dialog-actions//button[@ng-click='closeDialog()']")
	@CacheLookup
	WebElement closeButton;

	@FindBy(xpath = "//md-content[@aria-label='Product']//div[@class='md-text ng-binding']")
	@CacheLookup
	List<WebElement> selectProductfromDropDown;

	@FindBy(xpath = "//md-content[@aria-label='Role']//div[@class='md-text ng-binding']")
	@CacheLookup
	List<WebElement> selectRolefromDropDown;

	@FindBy(xpath = "(//md-content[@aria-label='Role']//div[@class='md-text ng-binding'])[1]")
	WebElement select1stRolefromDropDown;
	
	@FindBy(xpath = "//input[@id='bcName']")
	@CacheLookup
	WebElement bcName_AEPS;
	
	@FindBy(xpath = ".//span[@class='fa fa-save ng-scope']/parent::button")
	@CacheLookup
	WebElement saveAEPS;
	
	@FindBy(id = "mobile")
	@CacheLookup
	WebElement mobile;
	
	@FindBy(id = "locName")
	@CacheLookup
	WebElement location;
	
	@FindBy(id = "address1")
	@CacheLookup
	WebElement address1;
	
	@FindBy(id = "city")
	@CacheLookup
	WebElement city;
	
	@FindBy(id = "state")
	@CacheLookup
	WebElement state;
	
	@FindBy(id = "zip")
	@CacheLookup
	WebElement zip;
	
	@FindBy(xpath = ".//*[contains(text(),'View Entity Details')]")
	@CacheLookup
	WebElement header;
	
	@FindBy(xpath = "(.//span[@class='fa fa-plus ng-scope']/parent::button)[1]")
	@CacheLookup
	WebElement addUser;
	
	@FindBy(id = "userID")
	@CacheLookup
	WebElement userID;
	
	@FindBy(id = "name")
	@CacheLookup
	WebElement userName;
	
	@FindBy(id = "mobile")
	@CacheLookup
	WebElement userMobile;
	
	@FindBy(id = "email")
	@CacheLookup
	WebElement userEmail;
	
	/*
	 * ####################- Owner --> Mayur Kale -###########################
	 * 
	 */

	public boolean verifyAssignProductRolePopUp() {
//		cf.waitforSometime(1000);
		wait.until(ExpectedConditions.visibilityOf(assignProductRolePopUp));
		if (assignProductRolePopUp.isDisplayed()) {
//			assignProductRolePopUp.getText();
			return true;
		} else {
			return false;
		}
	}

	public boolean clickOnCloseButtonOnAssign() {
		cf.waitforSometime(500);
		wait.until(ExpectedConditions.elementToBeClickable(CLoseButtonOnAssignProductPopUp));
		if (CLoseButtonOnAssignProductPopUp.isDisplayed()) {
			CLoseButtonOnAssignProductPopUp.click();
			return true;
		} else {
			return false;
		}
	}

	public boolean clickOnNextButtonOnAssign() {
		cf.waitforSometime(500);
		wait.until(ExpectedConditions.visibilityOf(nextButtonOnAssignProductPopUp));
		if (nextButtonOnAssignProductPopUp.isDisplayed()) {
			nextButtonOnAssignProductPopUp.click();
			return true;
		} else {
			return false;
		}
	}

	public boolean clickOnAcquirerCheckBox() {
//			cf.waitforSometime(1800);
		wait.until(ExpectedConditions.visibilityOf(asAcquirerCheckBox));
		asAcquirerCheckBox.click();
		return asAcquirerCheckBox.isEnabled();
	}

	public String selectProduct(String product) throws InterruptedException {
//			cf.waitforSometime(1500);
		wait.until(ExpectedConditions.visibilityOf(productDropDown));
		productDropDown.click();
		cf.waitforSometime(500);
		return cf.getValuefromList(selectProductfromDropDown, product);
	}

	public String selectProductRole(String role) throws InterruptedException {
//			cf.waitforSometime(1500);
		wait.until(ExpectedConditions.visibilityOf(roleDropDown));
		roleDropDown.click();
		cf.waitforSometime(500);
		return cf.getValuefromList(selectRolefromDropDown, role);
	}

	public boolean canNotSeePPIrolesWithOtherProduct(String ProdName) throws InterruptedException {

		try {
			cf.waitforSometime(1500);
//				EntDPage.clickOnAddNewHypertectLink();
			wait.until(ExpectedConditions.visibilityOf(productDropDown));
			productDropDown.click();
			WebElement ProductDrop = driver.findElement(
					By.xpath("//md-content[@aria-label='Product']//div[contains(text(),'" + ProdName + "')]"));
			cf.waitforSometime(1500);
			wait.until(ExpectedConditions.visibilityOf(ProductDrop));
			ProductDrop.click();
			wait.until(ExpectedConditions.visibilityOf(roleDropDown));
			roleDropDown.click();
			cf.waitforSometime(2000);

			WebElement PM = driver.findElement(
					By.xpath("//md-content[@aria-label='Product']//div[contains(text(),'Program Manager')]"));
			WebElement PAI = driver.findElement(
					By.xpath("//md-content[@aria-label='Product']//div[contains(text(),'Prepaid Agent Institusion')]"));

			if (PM.isDisplayed()) {
				PM.click();
				return false;
			} else if (PAI.isDisplayed()) {
				PAI.click();
				return false;
			}
		} catch (Exception e) {

		}
		wait.until(ExpectedConditions.visibilityOf(select1stRolefromDropDown));
		select1stRolefromDropDown.click();
		return true;

	}

	public boolean canNotSeeRoleOnAssignProductPopUp() throws InterruptedException {
//		cf.waitforSometm(1500);
		wait.until(ExpectedConditions.visibilityOf(productDropDown));
		roleDropDown.click();
		cf.waitforSometime(500);
		for (WebElement webElement : selectProductfromDropDown) {

			if (webElement.isDisplayed() == true) {
				cf.waitforSometime(500);
				webElement.click();
				return false;
			}
		}
		return true;
	}

	public boolean canNotSeeProductOrRole(String ExpValue) throws InterruptedException {
		cf.waitforSometime(1500);
		productDropDown.click();
		cf.waitforSometime(500);
		// return cf.getValuefromList(selectProductfromDropDown, role);
		boolean value = true;
		for (WebElement webElement : selectProductfromDropDown) {
			if (webElement.getText().matches(ExpValue)) {
				Thread.sleep(500);
				webElement.click();
				value = false;
				break;
			}
		}
		return value;
	}

	public boolean verifyValidationOnAssignProductPopUp(String validation, String dropdownName) {
		WebElement validationMessage = driver.findElement(By.xpath("//span[contains(text(),'" + dropdownName
				+ "')]/parent::md-select-value/parent::md-select/following-sibling::div/div[contains(text(),'"
				+ validation + "')]"));
		wait.until(ExpectedConditions.visibilityOf(validationMessage));
		return validationMessage.isDisplayed();
	}
	
	public void select_OU_On_Assign_OU_Popup(String OU) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//md-select[@id='ouId']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-option/div[contains(text(),'"+OU+"')]")).click();
	}
	
	public void click_On_OU_On_Assign_OU_Popup() {
		driver.findElement(By.xpath("//h2[contains(text(),'Assign OU')]/ancestor::md-toolbar/following-sibling::md-dialog-actions//button[contains(text(),'Save')]")).click();
	}
	
	public void click_On_Institutions_On_AssignInstitutions_Popup() {
		driver.findElement(By.xpath("//h2[contains(text(),'Assign Institution')]/ancestor::md-toolbar/following-sibling::md-dialog-actions//button[contains(text(),'Save')]")).click();

	}
	
	public void select_Institutions_On_AssignInstitutions_Popup(String institutions) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//md-select[@id='institutionId']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-option/div[contains(text(),'"+institutions+"')]")).click();
	}
	
	public void clickBCFromList(String bcname) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@aria-label='"+bcname+"']")).click();
	}
	
	public void clickinstitutionFromList(String institutionname) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@aria-label='"+institutionname+"']")).click();
	}
	
	public void selectAcqBank(String bank) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//md-select[@id='acquiringEntity']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-option/div[contains(text(),'"+bank+"')]")).click();
	}
	
	public void selectSettlementBank(String bank) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//md-select[@id='settlementEntity']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-option/div[contains(text(),'"+bank+"')]")).click();
	}
	
	public void enterBcName(String name) throws InterruptedException {
		Thread.sleep(2000);
		bcName_AEPS.sendKeys(name);
		
	}
	
	public void Click_On_Save_Button_On_BcDetails_AepsPage() throws InterruptedException {
		Thread.sleep(2000);
		saveAEPS.click();
	}
	
	public void selectBC(String bc) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//md-select[@id='entityBCId']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-option/div[contains(text(),'"+bc+"')]")).click();
	}
	
	public void selectTerminal(String type) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//md-select[@id='type']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-option/div[contains(text(),'"+type+"')]")).click();
	}
	
	public void selectBranch(String branch) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//md-select[@id='branch']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-option/div[contains(text(),'"+branch+"')]")).click();
	}
	
	public void enterMobileNumber(String mobileno) throws InterruptedException {
		Thread.sleep(2000);
		mobile.sendKeys(mobileno);
	}
	
	public void enterLocation(String locationname) throws InterruptedException {
		Thread.sleep(2000);
		location.sendKeys(locationname);
	}
	
	public void enterAddress(String address) throws InterruptedException {
		Thread.sleep(2000);
		address1.sendKeys(address);
	}
	
	public void enterCity(String cityname) throws InterruptedException {
		Thread.sleep(2000);
		city.sendKeys(cityname);
	}

	
	public void enterState(String statename) throws InterruptedException {
		Thread.sleep(2000);
		state.sendKeys(statename);
	}
	
	public void enterPincode(String pincode) throws InterruptedException {
		Thread.sleep(2000);
		zip.sendKeys(pincode);
	}
	
	public void selectEntity(String entityname) throws InterruptedException {
		Thread.sleep(2000);
		int size=driver.findElements(By.xpath(".//*[contains(text(),'"+entityname+"')]")).size();
		if(size==0) {
			Assert.fail("No entities found");
		}
		else {
			driver.findElement(By.xpath("(.//*[contains(text(),'"+entityname+"')])[1]")).click();
		}
	}
	
	public void verifyHeader(String headermsg) throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(header.getText(),headermsg);
		
	}
	
	public void addUser() throws InterruptedException {
		Thread.sleep(2000);
        addUser.click();
	}
	
	public void userID(String userid) throws InterruptedException {
		Thread.sleep(2000);
		userID.sendKeys(userid);
	}
	
	public void userName(String username) throws InterruptedException {
		Thread.sleep(2000);
		userName.sendKeys(username);
	}
	
	public void userMobile(String usermobile) throws InterruptedException {
		Thread.sleep(2000);
		userMobile.sendKeys(usermobile);
	}
	
	public void userEmail(String useremail) throws InterruptedException {
		Thread.sleep(2000);
		userEmail.sendKeys(useremail);
	}
	
	public void clickBCName(String name) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[contains(text(),'"+name+"')]")).click();
	}
	
	public void clickBCAgent(String name) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[contains(text(),'"+name+"')]")).click();
	}
	   
}
