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

public class SystemConfigPage {

	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions c;

	public SystemConfigPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		c = new CommonFunctions(driver);
	}

	@FindBy(xpath = "//input[@ng-model='searchConfig']")
	@CacheLookup
	WebElement searchBox;
	
	@FindBy(xpath = "//md-icon [@aria-label='Edit']")
	@CacheLookup
	WebElement editButton;
	
	@FindBy(id = "value")
	@CacheLookup
	WebElement textBox;
	
	@FindBy(id = "id")
	@CacheLookup
	WebElement idBox;

	public boolean searchFor(String key) throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(searchBox));
		searchBox.sendKeys(key);
		Thread.sleep(2000);
		return true;
	}

	public boolean editClick() throws InterruptedException {
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOf(editButton));
		editButton.click();
		Thread.sleep(2000);
		return true;
	}
	
	public boolean changeSysConfigValue(String value) throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(textBox));
		textBox.clear();
		textBox.sendKeys(value);
		Thread.sleep(2000);
		return true;
	}
	
	public boolean clickSaveButton() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		return true;
	}
	
	public boolean addConfig() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='fa fa-plus-square ng-scope']")).click();
		Thread.sleep(2000);
		return true;
	}
	
	public boolean clickOnDelete() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//md-icon [@aria-label='Delete']")).click();
		Thread.sleep(2000);
		return true;
	}
	
	public boolean enterIdAndValue(String id, String value) throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(textBox));
		idBox.sendKeys(id);
		textBox.sendKeys(value);
		Thread.sleep(2000);
		return true;
	}
}