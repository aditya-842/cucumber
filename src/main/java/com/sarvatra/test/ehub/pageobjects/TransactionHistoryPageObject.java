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
public class TransactionHistoryPageObject {
	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions c;

	public TransactionHistoryPageObject(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		c = new CommonFunctions(driver);
	}

	// #Elements on Transaction History icon
	@FindBy(xpath = "//tr[@check-module='BBPS']//label[contains(.,'Transaction History')]")
	@CacheLookup
	WebElement bbpsTxnHistory;

	// #Click On Select Agent
	@FindBy(xpath = "//*[@id='agentId']")
	@CacheLookup
	WebElement selectAgent;

	// click on user
	@FindBy(xpath = "//*[@id='userId']")
	@CacheLookup
	WebElement selectUser;

	// div[contains(text(),'sg_agent')] -

	// #dropdown to select agent
	@FindBy(xpath = "//*[@id='select_listbox_23']/md-option")
	@CacheLookup
	WebElement dropdownAgentSelect;

	// search duration
	@FindBy(xpath = "//*[@id='duration']")
	@CacheLookup
	WebElement searchDuration;

	// search parameter
	@FindBy(xpath = "//*[@id='selectedParam']")
	@CacheLookup
	WebElement searchParameter;

	// customer mobile no
	@FindBy(xpath = "//*[@id='selectedParam']")
	@CacheLookup
	WebElement customerMobileNo;

	// customer mobile number
	@FindBy(xpath = "//input[@id='mobile']")
	@CacheLookup
	WebElement mobileNo;

	// search button
	@FindBy(xpath = "//button[contains(text(),'Search')]")
	@CacheLookup
	WebElement searchButton;

	public boolean clickTransactionHistoryIcon() {
		try {
			wait.until(ExpectedConditions.visibilityOf(bbpsTxnHistory));
			bbpsTxnHistory.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean selectAgent(String agent) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(selectAgent));
		selectAgent.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'" + agent + "')]")).click();
		return true;
	}

	public boolean selectUser(String user) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(selectUser));
		selectUser.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'" + user + "')]")).click();
		return true;
	}

	public boolean clickOnSearchDurationDropdown(String durationTime) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(searchDuration));
		searchDuration.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-option//div[contains(text(),'" + durationTime + "')]")).click();
		return true;
	}

	public boolean clickOnSearchParameterDropdown(String customerMobile) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(searchParameter));
		searchParameter.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'" + customerMobile + "')]")).click();
		return true;
	}

	public boolean enterCustomerMobileNO(String customerMobile) {
		wait.until(ExpectedConditions.visibilityOf(mobileNo));
		mobileNo.sendKeys(customerMobile);
		return true;
	}

	public boolean clickOnSearchButton() {
		try {
			wait.until(ExpectedConditions.visibilityOf(searchButton));
			searchButton.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
