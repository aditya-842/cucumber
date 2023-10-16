package com.sarvatra.test.ehub.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.CommonFunctions;

public class TerminalDetailsPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions cf;

	public TerminalDetailsPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		cf = new CommonFunctions(driver);
	}
	
	public void enter_POSNumber_On_Terminal_Details_page(String POS_Number) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='posSrNo']")).sendKeys(POS_Number);
	}
	
	public void enter_address1_On_Terminal_Details_page(String address1) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(address1);
	}
	
	public void enter_city_On_Terminal_Details_page(String city) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);
	}
	
	public void Select_State_On_Terminal_Details_page(String State) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-select[@id='state']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-option/div[contains(text(),'"+State+"')]")).click();
	}
	
	public void enter_pin_On_Terminal_Details_page(String pin) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pinCode']")).sendKeys(pin);
	}

}
