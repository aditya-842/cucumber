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

public class TransactionDetailPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions c;

	public TransactionDetailPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		c = new CommonFunctions(driver);
	}
	
	@FindBy(xpath = "//a/u[contains(text(),'View Extra Details')]")
	WebElement ViewExtraDetails;
	
	@FindBy(xpath = "//h2[contains(text(),'Transaction Details')]")
	WebElement Transaction_Page_Header;
	
	public boolean verify_Transaction_Details_Header() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(Transaction_Page_Header));
		return driver.findElement(By.xpath("//h2[contains(text(),'Transaction Details')]")).isDisplayed();
	}
	
	public boolean verify_Field_Avialble_On_Transaction_Details_Page(String Field) throws InterruptedException {
		Thread.sleep(500);
		return driver.findElement(By.xpath("//h2[contains(text(),'Transaction Details')]/ancestor::div[2]/following-sibling::div[1]//dt[contains(text(),'"+Field+"')]")).isDisplayed();
	}
	
	public boolean verify_Transaction_Status_Failed_Avialble_On_Transaction_Details_Page() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(By.xpath("//h2[contains(text(),'Transaction Details')]/ancestor::div[2]/following-sibling::div[1]//dt[contains(text(),'Transaction Status')]/following-sibling::dd/strong[contains(text(),'FAILED')]")).isDisplayed();
	}
	
	public void click_On_Back_Button_On_Transaction_Details_Page() {
		driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
	}
	
	public void click_On_View_Extra_Details_On_Transaction_Details_Page() {
		ViewExtraDetails.click();
	}
	
	public boolean verify_Extra_Details_Popup_Avialble_On_Transaction_Details_Page() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(By.xpath("//h2[contains(text(),'Extra Details')]")).isDisplayed();
	}
	
	public void click_On_Extra_Details_Popup_Close_Button_On_Transaction_Details_Page() {
		driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
	}
	
	public void click_On_Print_Button_On_Transaction_Details_Page() {
		driver.findElement(By.xpath("//button[contains(text(),'Print')]")).click();
	}
	
	public boolean verify_Print_On_Transaction_Details_Page() throws InterruptedException {
		return driver.findElement(By.xpath("//button[contains(text(),'Print')]")).isDisplayed();
	}
	
}
