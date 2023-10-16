package com.sarvatra.test.ehub.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.CommonFunctions;

public class AgentGroupDetailsPageObject {

	// ########################### Divija Jagdale ###############################

	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions cf;

	public AgentGroupDetailsPageObject(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		cf = new CommonFunctions(driver);
	}

	@FindBy(xpath = "//md-select[@name='agentGroup']")
	@CacheLookup
	WebElement agentGroup;

	@FindBy(xpath = "//md-select[@aria-label='Agent Institution']")
	@CacheLookup
	WebElement AgentInstitution;

	@FindBy(xpath = "//button[@class='md-raised srvt-btn md-button ng-isolate-scope md-ink-ripple']")
	@CacheLookup
	WebElement saveBtn;

	@FindBy(xpath = "//input[@id='supportEmail']")
	@CacheLookup
	WebElement SupportEmailID;

	@FindBy(xpath = "//input[@id='supportContact']")
	@CacheLookup
	WebElement SupportContactNumber;

	@FindBy(xpath = "//div[@ng-message='minlength,maxlength,pattern']")
	@CacheLookup
	WebElement Error_validationMessage;

	@FindBy(xpath = "//div[contains(text(),'min length 8 numbers')]")
	@CacheLookup
	WebElement Error_validationMessageforContactNumber;

	public void selectAgentGroup(String agentGroupval) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElements(agentGroup));
		Thread.sleep(2000);
		agentGroup.click();
		cf.waitforSometime(1000);
		driver.findElement(By.xpath("//md-option/div[contains(text(),'" + agentGroupval + "')]")).click();

	}

	public void selectAgentInstitution(String agentInstitutionab) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElements(AgentInstitution));
		Thread.sleep(2000);
		AgentInstitution.click();
		cf.waitforSometime(2000);
		driver.findElement(
				By.xpath("//md-option[@ng-value='agentInst.id']/div[contains(text(),'" + agentInstitutionab + "')]"))
				.click();
	}

	public void selectAgentInstitutionviaAgentInstitution(String agentInstitutionabc) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElements(AgentInstitution));
		Thread.sleep(2000);
		AgentInstitution.click();
		cf.waitforSometime(2000);
		driver.findElement(By.xpath(
				"//md-option[@ng-value='agentInstitution.id']/div[contains(text(),'" + agentInstitutionabc + "')]"))
				.click();
	}

	public boolean clickSave() {
		wait.until(ExpectedConditions.visibilityOf(saveBtn));
		if (saveBtn.isDisplayed() == true) {
			saveBtn.click();
			return true;
		} else {
			return false;
		}
	}

	public boolean enterSupportEmailID(String Name) {
		cf.waitforSometime(1500);
		wait.until(ExpectedConditions.visibilityOf(SupportEmailID));
		SupportEmailID.sendKeys(Name);

		return SupportEmailID.isEnabled();
	}

	public boolean enterSupportContactNumber(String contact) {
		cf.waitforSometime(1500);
		wait.until(ExpectedConditions.visibilityOf(SupportContactNumber));
		SupportContactNumber.sendKeys(contact);
		return SupportContactNumber.isEnabled();
	}

	public String ErrorMessageforSubmitEMailID() {
		wait.until(ExpectedConditions.visibilityOf(Error_validationMessage));
		System.out.println(Error_validationMessage.getText());
		return Error_validationMessage.getText();
	}

	public String ErrorMessageforContactNumber() {
		wait.until(ExpectedConditions.visibilityOf(Error_validationMessageforContactNumber));
		System.out.println(Error_validationMessageforContactNumber.getText());
		return Error_validationMessageforContactNumber.getText();
	}

	public boolean verifySupportEmailID(String emailID) {
		cf.waitforSometime(1500);
		wait.until(ExpectedConditions.visibilityOf(SupportEmailID));
		String emailID_UI = SupportEmailID.getText();

		if (emailID.equals(emailID_UI)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifySupportContactNumber(String contact) {
		cf.waitforSometime(1500);
		wait.until(ExpectedConditions.visibilityOf(SupportContactNumber));
		String contact_UI = SupportContactNumber.getText();
		if (contact.equals(contact_UI)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verify_Agent_Group_Details_Header() {
		cf.waitforSometime(1500);
		return driver.findElement(By.xpath("//h2[contains(text(),'Agent Group Details')]")).isDisplayed();
	}
	
	public void Click_On_Agent_Group_Dropdown_On_Agent_Group_Details() {
		cf.waitforSometime(1500);
		driver.findElement(By.xpath("//md-select[@id='agentGroup']")).click();
	}
	
	public boolean verify_Agent_Group_Option_In_Dropdown_On_Agent_Group_Details(String Option) {
		cf.waitforSometime(1500);
		return driver.findElement(By.xpath("//md-option/div[contains(text(),'"+Option+"')]")).isDisplayed();
	}

}
