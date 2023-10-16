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

public class AgentInstitutionDetailsPageObject {

	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions cf;

	public AgentInstitutionDetailsPageObject(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		cf = new CommonFunctions(driver);
	}

	// ########################### Divija Jagdale ###############################

	@FindBy(xpath = "//input[@id='supportEmail']")
	@CacheLookup
	WebElement SupportEmailIDDisplays;

	@FindBy(xpath = "//input[@id='supportContact']")
	@CacheLookup
	WebElement SupportcontactNumberDisplays;

	public boolean Support_Email_ID_Displays() {
		cf.waitforSometime(500);
		wait.until(ExpectedConditions.visibilityOf(SupportEmailIDDisplays));
		return SupportEmailIDDisplays.isDisplayed();
	}

	public boolean Support_contact_Number_Displays() {
		cf.waitforSometime(500);
		wait.until(ExpectedConditions.visibilityOf(SupportcontactNumberDisplays));
		return SupportcontactNumberDisplays.isDisplayed();
	}
	
	public void Select_Acquiring_Bank(String Bank) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-select[@id='acquiringEntity']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-option/div[contains(text(),'"+Bank+"')]")).click();
	}
	
	public void Click_On_Save_on_Agent_Institution() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public void Select_Institution_For_institution_Map(String institution) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-select[@id='institutionId']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-option/div[contains(text(),'"+institution+"')]")).click();
	}
	
	public void Enter_MID_Prifix_On_Assign_Institution_Page(String MID) {
		driver.findElement(By.xpath("//input[@id='midPrefixValue']")).sendKeys(MID);
	}
	
	public void Select_Head_Office_State(String State) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-select[@id='state']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-option/div[contains(text(),'"+State+"')]")).click();
	}
	
	public void Enter_GSTNumber_On_Assign_Institution_Page(String GSTNumber) {
		driver.findElement(By.xpath("//input[@id='entityGSTNumber']")).sendKeys(GSTNumber);
	}
	
	public void Click_On_Next_Assign_Institution_Page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public void Click_On_Save_Assign_Institution_Page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
