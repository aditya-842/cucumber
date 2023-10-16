package com.sarvatra.test.ehub.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.qa.util.CommonFunctions;

public class BCDetailsPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions cf;

	public BCDetailsPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		cf = new CommonFunctions(driver);
	}
	
	public void enter_BC_Name_On_BC_Details_page(String BC_name) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(BC_name);
	}
	
	public void enter_shortCode_On_BC_Details_page(String shortCode) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='shortCode']")).sendKeys(shortCode);
	}
	
	public void click_On_GSTNumber_Not_Available_On_BC_Details_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-checkbox[@id='isGstNotAvailable']")).click();
	}
	
	public void enter_mobile_On_BC_Details_page(String mobile) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys(mobile);
	}
	
	public void enter_address1_On_BC_Details_page(String address1) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(address1);
	}
	
	public void enter_city_On_BC_Details_page(String city) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);
	}
	
	public void Select_State_On_BC_Details_page(String State) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-select[@id='state']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-option/div[contains(text(),'"+State+"')]")).click();
	}
	
	public void enter_pin_On_BC_Details_page(String pin) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
	}
	
	public void enter_email_On_BC_Details_page(String email) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
	}

}
