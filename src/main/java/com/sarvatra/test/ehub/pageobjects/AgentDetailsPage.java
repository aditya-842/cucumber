package com.sarvatra.test.ehub.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.CommonFunctions;

public class AgentDetailsPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions cf;

	public AgentDetailsPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		cf = new CommonFunctions(driver);
	}
	
	public void select_Agent(String agent) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//md-select[@id='agent']")).click();
		cf.waitforSometime(1000);
		driver.findElement(By.xpath("//md-option/div[contains(text(),'" + agent + "')]")).click();

	}

}
