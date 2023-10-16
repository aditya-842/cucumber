package com.sarvatra.test.ehub.pageobjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.CommonFunctions;

public class MobilePrepaidPageObject {
	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions c;

	public MobilePrepaidPageObject(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		c = new CommonFunctions(driver);
	}

	/*
	 * ####################- Owner --> Prachi Kante -###########################
	 * 
	 */

// #Elements on pay bill icon
	@FindBy(xpath = "//label[contains(text(),'Pay Bill')]")
	@CacheLookup
	WebElement iconPayBill;

// #Elements On pay bill page to scroll right
	@FindBy(xpath = "//*[@aria-label='Next Page']")
	@CacheLookup
	WebElement scrollRight;

// #Elements select mobile prepaid
	@FindBy(xpath = "//md-tab-item/span[contains(text(),'Mobile Prepaid')]")
	@CacheLookup
	WebElement mobilePrepaid;

//  #Element enter biller name //*[@name='searchBillerText']
	@FindBy(xpath = "//*[@name='searchBillerText']")
	@CacheLookup
	WebElement enterBiller;

// #Select biller from list //*[@role='listbox']/li or	//li[@class='md-autocomplete-suggestion ng-scope'] //*[@md-highlight-text='searchBillerText']
	@FindBy(xpath = "//*[@md-highlight-text='searchBillerText']")
	@CacheLookup
	WebElement selectBiller;

	// Select Other biller
	@FindBy(xpath = "//li[@aria-posinset='26']")
	@CacheLookup
	WebElement selectOtherBiller;

	// Select Other biller NPCI
	@FindBy(xpath = "//li[@aria-posinset='11']")
	@CacheLookup
	WebElement selectNPCIBiller;

// //*[@class='md-virtual-repeat-container md-autocomplete-suggestions-container md-whiteframe-z1 md-orient-vertical']
	@FindBy(xpath = "//div[@class='md-virtual-repeat-scroller']")
	@CacheLookup
	WebElement scrollDownBiller;

	// #Enter Mobile number
	@FindBy(xpath = "//input[@id='Id']")
	@CacheLookup
	WebElement textPlanID;

// #Enter Mobile number
	@FindBy(xpath = "//*[@id='Mobile Number']")
	@CacheLookup
	WebElement textMobileNumber;

	// #Click on Circle
	@FindBy(xpath = "//*[@id='Circle']")
	@CacheLookup
	WebElement textCircle;

	// #Click on Circle
	@FindBy(xpath = "//*[@role='listbox']/md-option[@value='Andhra Pradesh']")
	@CacheLookup
	WebElement selectCircle;

	// #Click on Payment mode
	@FindBy(xpath = "//*[@id='selectedPayMode']")
	@CacheLookup
	WebElement textPaymentMode;

	// #Click on Circle
	@FindBy(xpath = "//*[@aria-label='Payment Mode']/md-option")
	@CacheLookup
	WebElement dropdownPaymentMode;

	@FindBy(xpath = "//*[contains(text(),'Fetch Plans')]")
	@CacheLookup
	WebElement buttonFetchPlan;

	@FindBy(xpath = "//tbody/tr/td/input")
	@CacheLookup
	WebElement selectSmartRecharge;

//	#Element Mobile Prepaid Pay Bill
	@FindBy(xpath = "//span[contains(text(),'Pay')]")
	@CacheLookup
	WebElement buttonPayBill;

//	#Element Mobile Prepaid Pay Bill
	@FindBy(xpath = "//*[@type='submit']")
	@CacheLookup
	WebElement maditoryTrue_PayBill;

//	#Element Payment Confirmation page
	@FindBy(xpath = "//*[contains(text(),'Confirm Payment')]")
	@CacheLookup
	WebElement textConfirmPayment;

//  Payment mode
	@FindBy(xpath = "//*[contains(text(),'Payment Mode')]//parent::dl/dd")
	@CacheLookup
	WebElement getPaymentModeType;

//	#Element Payment Confirmation page
	@FindBy(xpath = "//*[@name='cashReceiptNumber']")
	@CacheLookup
	WebElement textCashReceiptNumber;

//	#Element Payment Confirmation page
	@FindBy(xpath = "//input[@id='accNo']")
	@CacheLookup
	WebElement textAccountNumber;

//	#Element Payment Confirmation page
	@FindBy(xpath = "//button[contains(text(),'Confirm')]")
	@CacheLookup
	WebElement buttonConfirm;

	@FindBy(xpath = "//div[@aria-live='assertive']/div")
	@CacheLookup
	WebElement invalidData;

//	#Element Payment Confirmation page
	@FindBy(xpath = "//*[contains(text(),'Transaction Status')]//parent::dl/dd")
	@CacheLookup
	WebElement transactionDetails;

	/*
	 * #######################- Owner - Prachi Kante -##############################
	 * 
	 */

	public boolean clickPayBillIcon() {
		try {
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOf(iconPayBill));
			iconPayBill.click();
			Thread.sleep(3000);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean scrollRight() {
		try {
			wait.until(ExpectedConditions.visibilityOf(scrollRight));
			scrollRight.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public String selectMobilePrepaid() {
		String name = "";
		try {
			wait.until(ExpectedConditions.visibilityOf(mobilePrepaid));
			name = mobilePrepaid.getText();
			mobilePrepaid.click();
			return name;
		} catch (Exception e) {
			e.printStackTrace();
			return name;
		}
	}

	public boolean selectBiller() {
		try {
			Thread.sleep(5000);

			wait.until(ExpectedConditions.visibilityOf(enterBiller));
			enterBiller.click();

			wait.until(ExpectedConditions.visibilityOf(selectBiller));
			JavascriptExecutor je = (JavascriptExecutor) driver;
			WebElement element = driver.findElement(By.xpath("//*[contains(text(),'BSNL')]"));
			// now execute query which actually will scroll until that element is not
			// appeared on page.
			je.executeScript("arguments[0].scrollIntoView(true);", element);

			System.out.println(element.getText());
			element.click();

//		wait.until(ExpectedConditions.visibilityOf(enterBiller));
//		enterBiller.click();
//		
//		wait.until(ExpectedConditions.visibilityOf(selectBiller));
//		List<WebElement> elementName =  driver.findElements(By.tagName("li"));
//		
//		 for (int i=0; i<elementName.size();i++){
//		      System.out.println("Radio button text:" + elementName.get(i).getText()+" Biller no "+i);
//		    }
//		 elementName.get(0).click();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean selectOtherBiller(String supportPlan) {
		try {
			Thread.sleep(7000);
			wait.until(ExpectedConditions.visibilityOf(enterBiller));
			enterBiller.click();

			wait.until(ExpectedConditions.visibilityOf(selectBiller));
			JavascriptExecutor je = (JavascriptExecutor) driver;

			if (supportPlan.equals("Maditory_True")) {
				WebElement element = driver.findElement(By.xpath("//*[contains(text(),'NPCIPREP0NAT01')]"));
				// now execute query which actually will scroll until that element is not
				// appeared on page.
				je.executeScript("arguments[0].scrollIntoView(true);", element);
				element = driver.findElement(By.xpath("//*[contains(text(),'NPCIPREP0NAT02')]"));
				// now execute query which actually will scroll until that element is not
				// appeared on page.
				je.executeScript("arguments[0].scrollIntoView(true);", element);
//		System.out.println(element.getText());
				element.click();
			}
			if (supportPlan.equals("Optional")) {
				WebElement element = driver.findElement(By.xpath("//*[contains(text(),'NPCIPREP0NAT01')]"));
				// now execute query which actually will scroll until that element is not
				// appeared on page.
				je.executeScript("arguments[0].scrollIntoView(true);", element);
				element = driver.findElement(By.xpath("//*[contains(text(),'NPCIADDN0NAT01')]"));
				je.executeScript("arguments[0].scrollIntoView(true);", element);

				element = driver.findElement(By.xpath("//*[contains(text(),'CERT12000NAT41')]"));
				je.executeScript("arguments[0].scrollIntoView(true);", element);
				// now execute query which actually will scroll until that element is not
				// appeared on page.
				element = driver.findElement(By.xpath("//*[contains(text(),'FE1112000NAT01')]"));
				je.executeScript("arguments[0].scrollIntoView(true);", element);
//			System.out.println(element.getText());
				element.click();
			}
			if (supportPlan.equals("Housing_Society")) {
				Thread.sleep(2000);

				WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Amrut')]"));
				Thread.sleep(2000);
				// now execute query which actually will scroll until that element is not
				// appeared on page.
				je.executeScript("arguments[0].scrollIntoView(true);", element);
				element.click();
			}

			return true;
		} catch (Exception e) {
			return false;
		}
	}
//		try {			
//			Thread.sleep(1000);
//		wait.until(ExpectedConditions.visibilityOf(enterBiller));
//		enterBiller.click();
//		
//		wait.until(ExpectedConditions.visibilityOf(selectBiller));
//		if(supportPlan.equals("Optional")) {
//		wait.until(ExpectedConditions.visibilityOf(selectOtherBiller));
//		List<WebElement> elementName =  driver.findElements(By.tagName("li"));
//		 for (int i=0; i<elementName.size();i++){
//		      System.out.println("Radio button text:" + elementName.get(i).getText()+" Biller no "+i);
//		      if(elementName.get(i).getText().contains("AT4112000NAT01")) {
//		 		 elementName.get(i).click();  
//		      }
//		    }
//		}
//		if(supportPlan.equals("Maditory_True")) {
//			wait.until(ExpectedConditions.visibilityOf(selectNPCIBiller));
//			List<WebElement> elementName =  driver.findElements(By.tagName("li"));
//			 for (int i=0; i<elementName.size();i++){
//			      System.out.println("Radio button text:" + elementName.get(i).getText()+" Biller no "+i);
//			      if(elementName.get(i).getText().contains("NPCIPREP0NAT02")) { 
//			 		 elementName.get(i).click();  
//			      }
//			    }
//		}
//		 		 
//			Thread.sleep(3000);
//		return true;
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//			return false;
//		}

	public boolean enterPlanId(String planID) {
		try {
			wait.until(ExpectedConditions.visibilityOf(textPlanID));
			textPlanID.clear();
			textPlanID.sendKeys(planID);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean enterMobileNumber(String mobileNumber) {
		try {
			wait.until(ExpectedConditions.visibilityOf(textMobileNumber));
			textMobileNumber.clear();
			textMobileNumber.sendKeys(mobileNumber);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean selectCircle() {
		try {
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOf(textCircle));
			textCircle.click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOf(selectCircle));
			selectCircle.click();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean paymentMode(String PaymentMode) {
		try {

			wait.until(ExpectedConditions.visibilityOf(textPaymentMode));
			textPaymentMode.click();

			wait.until(ExpectedConditions.visibilityOf(dropdownPaymentMode));

			List<WebElement> elementName = driver.findElements(By.tagName("md-option"));
			for (int i = 0; i < elementName.size(); i++) {
//		      System.out.println("PAyment mode:" + elementName.get(i).getText()+" Biller no "+i);
				if (elementName.get(i).getText().equalsIgnoreCase(PaymentMode)) {
					elementName.get(i).click();
				}
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean clickOnFetchPlanButton() {
		try {
			((JavascriptExecutor) driver).executeScript("scroll(0,300)");
			wait.until(ExpectedConditions.visibilityOf(buttonFetchPlan));
			buttonFetchPlan.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean selectSmartRecharge() {
		try {
			wait.until(ExpectedConditions.visibilityOf(selectSmartRecharge));
			selectSmartRecharge.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean clickOnPayBillButton() {
		wait.until(ExpectedConditions.visibilityOf(buttonPayBill));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", buttonPayBill);
		buttonPayBill.click();
		return true;
	}

	public boolean maditoryTrue_PayBill() {
		try {
			wait.until(ExpectedConditions.visibilityOf(buttonPayBill));
			buttonPayBill.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public String textConfirmPayment() {
		try {
			wait.until(ExpectedConditions.visibilityOf(textConfirmPayment));
			System.out.println(textConfirmPayment.getText());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return textConfirmPayment.getText();
	}

	public boolean textCashReceiptNumber(String cashReceiptNumber) {
		String paymentMode = "";
		try {
			// *[contains(text(),'Payment Mode')]//parent::dl/dd
			wait.until(ExpectedConditions.visibilityOf(getPaymentModeType));
			paymentMode = getPaymentModeType.getText();
			if (paymentMode.equalsIgnoreCase("Cash")) {
				wait.until(ExpectedConditions.visibilityOf(textCashReceiptNumber));
				textCashReceiptNumber.clear();
				textCashReceiptNumber.sendKeys(cashReceiptNumber);
			}
			if (paymentMode.equalsIgnoreCase("Account Transfer")) {
				wait.until(ExpectedConditions.visibilityOf(textAccountNumber));
				textAccountNumber.clear();
				textAccountNumber.sendKeys(cashReceiptNumber);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean buttonConfirm() {
		try {
			wait.until(ExpectedConditions.visibilityOf(buttonConfirm));
			buttonConfirm.click();

//		if(invalidData.isDisplayed()) {
//			System.out.println("Invalid data entered in given TextBox: \n "+invalidData.getText());
//		}

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean transactionDetails() {
		try {
			wait.until(ExpectedConditions.visibilityOf(transactionDetails));
			if (transactionDetails.getText().equalsIgnoreCase("SUCCESS"))
				System.out.println("Transaction Process " + transactionDetails.getText());
			else
				System.out.println("Transaction Process " + transactionDetails.getText());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean verifyCircles() {
		try {

			wait.until(ExpectedConditions.visibilityOf(textCircle));
			textCircle.click();
			String Circlelist[] = { "Andhra Pradesh", "Assam", "Bihar", "Chennai", "Chhattisgarh", "Gujarat", "Haryana",
					"Himachal Pradesh", "Jammu And Kashmir", "Karnataka", "Kerala", "Kolkata", "Madhya" };
			for (int i = 0; i < Circlelist.length - 1; i++) {
				System.out.println(Circlelist[i]);
				driver.findElement(By.xpath("//div[contains(text(),'" + Circlelist[i] + "')]")).isDisplayed();
				Thread.sleep(1000);
			}
			driver.findElement(By.xpath("//div[contains(text(),'Andhra Pradesh')]")).click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
