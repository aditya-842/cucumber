package com.sarvatra.test.ehub.pageobjects;

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
public class TransactionSearchPageObject {

	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions c;

	public TransactionSearchPageObject(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		c = new CommonFunctions(driver);
	}

	// transaction search icon
	@FindBy(xpath = "//label[text()='Txn Search']")
	@CacheLookup
	WebElement TxnSearch;

	// Transaction Radio Button
	@FindBy(xpath = "//md-radio-button[@value='Transaction']")
	@CacheLookup
	WebElement transactionRadioButton;

	// Transaction Id field
	@FindBy(xpath = "//input[@id='transactionId']")
	@CacheLookup
	WebElement transactionId;

	// Proceed Button
	@FindBy(xpath = "//button[contains(text(),'Proceed')]")
	@CacheLookup
	WebElement proceedButton;

	// print icon
	@FindBy(xpath = "(//tbody//td[6]//a)[1]")
	@CacheLookup
	WebElement printIcon;

	public boolean clickOnTransactionSearchIcon() {
		try {
			wait.until(ExpectedConditions.visibilityOf(TxnSearch));
			TxnSearch.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean clickOnTransactionRadioButton() {
		try {
			wait.until(ExpectedConditions.visibilityOf(transactionRadioButton));
			transactionRadioButton.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean enterTransactionID(String transactionID) {
		wait.until(ExpectedConditions.visibilityOf(transactionId));
		transactionId.sendKeys(transactionID);
		return true;
	}

	public boolean clickOnProceedButton() {
		try {
			wait.until(ExpectedConditions.visibilityOf(proceedButton));
			proceedButton.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean clickOnPrintIcon() {
		try {
			wait.until(ExpectedConditions.visibilityOf(printIcon));
			printIcon.click();
			Thread.sleep(1000);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean Verify_OnPrintIcon() {
		wait.until(ExpectedConditions.visibilityOf(printIcon));
		return printIcon.isDisplayed();
			
	}

}
