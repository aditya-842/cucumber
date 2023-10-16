package com.qa.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.FileHandler;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

public class CommonFunctions {

	public static WebDriver driver;

	public CommonFunctions(WebDriver driver) {
		this.driver = driver;
	}

	/******************************* Drop Down Utils ***************************/

	public void doSelectDropDownByIndex(WebElement locator, int index) {
		Select select = new Select(locator);
		select.selectByIndex(index);
	}

	public void doSelectDropDownByVisibleText(WebElement locator, String visibleText) {
		Select select = new Select(locator);
		select.selectByVisibleText(visibleText);
		;
	}

	public void doSelectDropDownByValue(WebElement locator, String value) {
		Select select = new Select(locator);
		select.selectByValue(value);
	}

	public int getDropDownOptionsCount(WebElement locator) {
		Select select = new Select(locator);
		return select.getOptions().size();
	}

	public void selectValueFromDropDown(By locator, String value) {
		Select select = new Select(driver.findElement(locator));
		List<WebElement> optionsList = select.getOptions();
		for (WebElement e : optionsList) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}
	
	/***************************
	 *Select values from List **************************************
	 * 
	 * @param locator
	 */
	
	public String viewValuefromList(List<WebElement> webElements, String ExpValue) throws InterruptedException {
		String value = "";
		for (WebElement webElement : webElements) {

			if (webElement.getText().matches(ExpValue)) {
				Thread.sleep(2000);
				value = webElement.getText();
				System.out.println(value);
				break;
			}
		}
		return value; // return labelsList;
	}

	public String getValuefromList(List<WebElement> webElements, String ExpValue) throws InterruptedException {
		Thread.sleep(500);
		String value = "";
		for (WebElement webElement : webElements) {

			if (webElement.getText().matches(ExpValue)) {
				Thread.sleep(500);
				value = webElement.getText();
				webElement.click();
				break;
			}
		}
		return value;
	}

	public String selectSearchResultWithNameID(List<WebElement> webElements, String ExpValue, String ID)
			throws InterruptedException {
		waitforSometime(1000);

		for (WebElement webElement : webElements) {

			String st = webElement.getText();

			if (st.contains(ID) && st.contains(ExpValue)) {
				webElement.click();
				return st;
			}
		}
		return "Not Selected";
	}

	/***************************
	 * Actions **************************************
	 * 
	 * @param locator
	 */

	public void doActionsClick(By locator) {
		Actions action = new Actions(driver);
		action.click(driver.findElement(locator)).build().perform();
	}

	public void doActionsSendKeys(By locator, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(driver.findElement(locator), value).build().perform();
	}

	public void doMoveToElement(By locator) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(locator)).build().perform();
	}

	/*************************************************************
	 * Alerts
	 */

	public void alertIsPresent() {
		Alert confirmationAlert = driver.switchTo().alert();
		confirmationAlert.accept();
	}

	/*************************************************************
	 * waits
	 * 
	 */

	public void waitforSometime(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void waitForElementTobeClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitForElementTobeVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/******************************* Alert Utils ***************************/
	
	public void acceptAlert() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Alert is not there");
		}
	}

	public void printElementsText(List<WebElement> locator) {
		int srNo=0;
		for (WebElement e : locator) {
			String text = e.getText();
			srNo++;
			System.out.println(srNo+") "+text);
		}
	}

	/*****************************
	 * Utlils
	 * 
	 * 
	 */
	
	public void takesScreenShotOfFailedTC(ITestResult Result) throws IOException {	
		if(Result.getStatus()== ITestResult.FAILURE){
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("");
			org.openqa.selenium.io.FileHandler.copy(src, dest);
		}	
	}
	

	// This method will return the list of element's text
	public List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = driver.findElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String text = e.getText();
			if (!text.isEmpty()) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}		

//	public void selectSearchResultWithNameIDUsingSwitch(List<WebElement> webElements, String ExpValue, String ID)
//			throws InterruptedException {
//		waitforSometime(1000);
//
////		switch
//
//		for (WebElement webElement : webElements) {
//
//			String st = webElement.getText();
//
//			if (st.contains(ID) && st.contains(ExpValue)) {
//				webElement.click();
//
//				break;
//			}
//		}
//	}
	
	
	public void attachToNewBrowser() throws InterruptedException{
		Set <String> handles =driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
			String sParentWindowHandle = iterator.next();
			String sChildWindowHandle = iterator.next();
			driver.switchTo().window(sChildWindowHandle);
			
		}
		Thread.sleep(2);
	}

}
