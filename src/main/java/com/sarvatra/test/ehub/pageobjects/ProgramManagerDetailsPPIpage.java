package com.sarvatra.test.ehub.pageobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.util.CommonFunctions;

import io.cucumber.java.en.Then;

public class ProgramManagerDetailsPPIpage {

	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions cf;

	public ProgramManagerDetailsPPIpage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		cf = new CommonFunctions(driver);
	}

	@FindBy(xpath = "//h2[contains(text(),'Program Manager Details | PPI')]")
	@CacheLookup
	WebElement programManagerDetailsTitle;

	@FindBy(xpath = "//input[@aria-required='true']/following-sibling::span/label")
	@CacheLookup
	List<WebElement> mandtoryInputFieldsOnPMRform;
	
	@FindBy(xpath = "//input[@aria-required='false']/following-sibling::span/label")
	@CacheLookup
	WebElement nonMandtoryInputFieldsOnPMRform;
//	List<WebElement> nonMandtoryInputFieldsOnPMRform;

	@FindBy(xpath = "//mat-select[@aria-required='true']/following-sibling::span/label")
	@CacheLookup
	List<WebElement> mandtoryDropdownFieldsOnPMRform;
	
	@FindBy(xpath = "//div[@class='mat-tooltip-trigger username_role']")
	@CacheLookup
	WebElement displayNameOnHeader;
	
	@FindBy(xpath = "//div[@class='mat-tooltip-trigger ng-star-inserted']")
	@CacheLookup
	WebElement dateAndTimeStampOnHeader;
	
//	@FindBy(xpath = "//button[@type='submit']")
	@FindBy(xpath = "//button[contains(text(),'SUBMIT')]")
	@CacheLookup
	WebElement saveButtonOnPMRpage;
	
	@FindBy(xpath = "//button[contains(text(),'CANCEL')]")
	@CacheLookup
	WebElement backButtonOnPMRpage;

	public boolean verifyProgramManagerDetailsPageTitle() {
		wait.until(ExpectedConditions.visibilityOf(programManagerDetailsTitle));
		if (programManagerDetailsTitle.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verifyDisplayNameOnPMRpage() {
		try {
			wait.until(ExpectedConditions.visibilityOf(displayNameOnHeader));
			System.out.println(displayNameOnHeader.getText());
//			cf.waitforSometime(1500);
			return displayNameOnHeader.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean verifyDateAndTimeStampOnPMRpage() {
		try {
			wait.until(ExpectedConditions.visibilityOf(dateAndTimeStampOnHeader));
			System.out.println(dateAndTimeStampOnHeader.getText());
//			cf.waitforSometime(1500);
			return dateAndTimeStampOnHeader.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean verifySaveButtonOnPMRpage() {
		try {
			wait.until(ExpectedConditions.visibilityOf(saveButtonOnPMRpage));
			System.out.println(saveButtonOnPMRpage.getText());
//			cf.waitforSometime(1500);
			return saveButtonOnPMRpage.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean clickOnSaveButtonOnPMRpage() {
		cf.waitforSometime(500);
		try {
			wait.until(ExpectedConditions.visibilityOf(saveButtonOnPMRpage));
			System.out.println(saveButtonOnPMRpage.getText());
			saveButtonOnPMRpage.click();
//			cf.waitforSometime(1500);
			return saveButtonOnPMRpage.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean verifyBackButtonOnPMRpage() {
		try {
			wait.until(ExpectedConditions.visibilityOf(backButtonOnPMRpage));
			System.out.println(backButtonOnPMRpage.getText());
//			cf.waitforSometime(1500);
			return backButtonOnPMRpage.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean closeWindow() {
		try {
			cf.waitforSometime(1000);
			driver.close();
			cf.waitforSometime(1500);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean switchSeleniumFocus(int index) {
		try {
			cf.waitforSometime(1000);
			Set<String> id = driver.getWindowHandles();
			int i = 0;
			for (String st : id) {
				i++;
				if (i == index) {
					driver.switchTo().window(st);
					break;
				}
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifyMandatoryInputeFieldsonPMR() {
		cf.waitforSometime(1500);
		String textFields[] = { "Program Manager ID *", "Program Manager Name *", "Address *", "District *", 
				"PIN Code *", "PM Telephone Number *", "PM Mobile Number *", "PM Email ID *", "Current A/c Number *", 
				"Current A/c with *", "PM Short Code *", "Contact Person Name *", "Contact Person Mobile *", 
				"Processor ID *", "Issuing Entity *", "Prefix *" };
		List<String> ExpTxtFields = new ArrayList<String>(Arrays.asList(textFields));
		
		List<String> ActTxtFields = new ArrayList<String>();

		for (WebElement element : mandtoryInputFieldsOnPMRform) {
			ActTxtFields.add(element.getText());
		}
		System.out.println(ActTxtFields);
		return ActTxtFields.containsAll(ExpTxtFields);
	}
	
	public boolean verifyNon_MandatoryInputeFieldsonPMR() {
		cf.waitforSometime(1500);
		String ActTxtFields = nonMandtoryInputFieldsOnPMRform.getText(), ExpTxtFields = "Settlement Entity";
		
//		String textFields[] = { "Settlement Entity"};
//		List<String> ExpTxtFields = new ArrayList<String>(Arrays.asList(textFields));
//		
//		List<String> ActTxtFields = new ArrayList<String>();
//
//		for (WebElement element : nonMandtoryInputFieldsOnPMRform) {
//			ActTxtFields.add(element.getText());
//		}
		System.out.println(ActTxtFields);
//		return ActTxtFields.containsAll(ExpTxtFields);
		return ActTxtFields.contains(ExpTxtFields);
	}
	
	public boolean verifyMandatoryDropdownFieldsonPMR() {
		
		String dropdowns[] = { "State *", "Product *", "PIN Mode *", "Card Type *" };
		List<String> ExpDropdowns = new ArrayList<String>(Arrays.asList(dropdowns));
		List<String> ActDropFields = new ArrayList<String>();

		for (WebElement element : mandtoryDropdownFieldsOnPMRform) {
			ActDropFields.add(element.getText());
		}
		System.out.println(ActDropFields);
		return ActDropFields.containsAll(ExpDropdowns);
	}

}
