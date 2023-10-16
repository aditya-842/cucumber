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

/**
 * @author anand_tajne
 *
 */
public class WalletStatementPageObject {

	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions c;

	public WalletStatementPageObject(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		c = new CommonFunctions(driver);
	}
	
	// wallet statement icon
	@FindBy(xpath = "//label[text()='Wallet Statement']")
	@CacheLookup
	WebElement walletStatement;
	
	//md-datepicker[@id='startDate']/button
	@FindBy(xpath = "//md-datepicker[@id='startDate']/button")
	@CacheLookup
	WebElement startDate;
	
	// submit button
	@FindBy(xpath = "//button[contains(text(),'SUBMIT')]")
	@CacheLookup
	WebElement submitButton;
	
	//download button
	@FindBy(xpath = "//button[contains(text(),'Download')]")
	@CacheLookup
	WebElement downloadButton;

	public boolean clickOnTWalletStatementIcon() {
		try {
			wait.until(ExpectedConditions.visibilityOf(walletStatement));
			walletStatement.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean clickOnTStartDateCalenderIcon(String day, String month, String year) throws InterruptedException {
			wait.until(ExpectedConditions.visibilityOf(startDate));
			startDate.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//td[@class='md-calendar-date' and @id='md-0-month-'"+year+"'-'"+month+"'-'"+day+"']")).click();
			return true;
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
	
	public boolean clickOnDownloadtButton() {
		try {
			wait.until(ExpectedConditions.visibilityOf(downloadButton));
			downloadButton.click();
			Thread.sleep(2000);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}	
	
	public boolean VerifyWalletfetchedMSg(String MSG) throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'"+MSG+"')]")).isDisplayed();
		return true;
	}

}