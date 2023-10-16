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

public class HousingSocietyPageObject {

	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions c;

	public HousingSocietyPageObject(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		c = new CommonFunctions(driver);
	}
	
	// #Elements select housing society
		@FindBy(xpath = "//*[@role='tab']/*[contains(text(),'Housing Society')]")
		@CacheLookup
		WebElement HousingSocietyIcon;
		
	// #Elements select housing society from Dropdown
		@FindBy(xpath = "//input[@aria-label='Please Select State']")
		@CacheLookup
		WebElement HousingSocietyState;		
		
	// #Elements Enter City
		@FindBy(xpath = "//input[@id='city']")
		@CacheLookup
		WebElement HousingSocietyCity;
		
	// #Elements Submit button
		@FindBy(xpath = "//button[contains(text(),'Submit')]")
		@CacheLookup
		WebElement HousingSocietySubmit;		
		
	// #Elements Flat Number
		@FindBy(xpath = "//*[@id='Flat Number']")
		@CacheLookup
		WebElement HousingSocietyFlatNumber;
		
	// #Elements Fetch Bill
		@FindBy(xpath = "//*[contains(text(),'Fetch Bill')]")
		@CacheLookup
		WebElement HousingSocietyFetchBill;
		
		
		
	public boolean clickOnHousingSocietyIcon() {
		try {				
		wait.until(ExpectedConditions.visibilityOf(HousingSocietyIcon));
		HousingSocietyIcon.click();
		return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean selectStatefromDropdown(String string) {
		try {				
		wait.until(ExpectedConditions.visibilityOf(HousingSocietyState));
		HousingSocietyState.click();
		HousingSocietyState.sendKeys(string);
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//*[contains(text(),'MAHARASHTRA')]"));
		// now execute query which actually will scroll until that element is not appeared on page.
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		
		System.out.println(element.getText());
		element.click();
		
		return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public boolean enterCityHS(String string) {
		try {				
		wait.until(ExpectedConditions.visibilityOf(HousingSocietyCity));
		HousingSocietyCity.click();
		HousingSocietyCity.sendKeys(string);
		return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean clickOnSubmitHS() {
		try {				
		wait.until(ExpectedConditions.visibilityOf(HousingSocietySubmit));
		HousingSocietySubmit.click();
		return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean enterFlatnumber(String flatnumber) {
		try {				
		wait.until(ExpectedConditions.visibilityOf(HousingSocietyFlatNumber));
		HousingSocietyFlatNumber.sendKeys(flatnumber);
		return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean clickOnFetchBill() {
		try {				
		wait.until(ExpectedConditions.visibilityOf(HousingSocietyFetchBill));
		HousingSocietyFetchBill.click();
		return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	

}
