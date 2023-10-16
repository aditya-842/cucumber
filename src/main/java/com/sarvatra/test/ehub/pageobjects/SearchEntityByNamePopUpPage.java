package com.sarvatra.test.ehub.pageobjects;

import java.util.List;

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

public class SearchEntityByNamePopUpPage {

	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions cf;

	public SearchEntityByNamePopUpPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		cf = new CommonFunctions(driver);
	}
	/*
	 * ####################- Owner --> Mayur Kale -###########################
	 * 
	 */
	@FindBy(xpath = "//md-icon[@aria-label='Home']")
	@CacheLookup
	WebElement homeIcon;

	@FindBy(xpath = "//md-dialog[@aria-label='Search Entity']//form")
	@CacheLookup
	WebElement searchPopUp;

	@FindBy(xpath = "//md-radio-group//md-radio-button[@value='ehub']")
	@CacheLookup
	WebElement eHubEntityRadioButton;

	@FindBy(xpath = "//md-radio-button[@aria-label='Product Role & Name']/div[1]")
	@CacheLookup
	WebElement productRoleRadioButton;

	@FindBy(xpath = "//input[@id='searchEntityName']")
	@CacheLookup
	WebElement searchNameInputBox;

	@FindBy(xpath = "//md-select[@id='product']")
	@CacheLookup
	WebElement productDropdown;

	@FindBy(xpath = "//md-select[@id='productRole']")
	@CacheLookup
	WebElement productRoleDropdown;

	@FindBy(xpath = "//md-select-menu[@class='_md md-overflow']//div")
	@CacheLookup
	List<WebElement> dropdownProductOptions;

	// md-select-menu[@class='_md']/md-content/md-option
	@FindBy(xpath = "//md-select-menu[@class='_md']//div")
	@CacheLookup
	List<WebElement> dropdownRoleOptions;

	@FindBy(xpath = "//md-content/md-option/div")
	@CacheLookup
	List<WebElement> dropdownProdOptions;

	@FindBy(xpath = "//button[contains(text(),'Search')]")
	@CacheLookup
	WebElement searchButton;

	@FindBy(xpath = "//md-list[@role='list']/md-list-item//div[@class='layout-row']/div")
	@CacheLookup
	List<WebElement> listOfSearchResults; // Results

	@FindBy(xpath = "//div[@class='md-list-item-text']//a")
	@CacheLookup
	List<WebElement> listOfSearchResultEntityName;

	@FindBy(xpath = "//div[@class='md-list-item-text']//div[@class='ng-binding flex-10']")
	@CacheLookup
	List<WebElement> listOfSearchResultIDandType;

	@FindBy(xpath = "//button[contains(text(),'Close')]")
	@CacheLookup
	WebElement closeButton;

// #Validation Message
	@FindBy(xpath = "//div[contains(text(),'Entity Name cannot be empty')]")
	@CacheLookup
	WebElement emptyEntityName;

	@FindBy(xpath = "//md-dialog-content//div[@class='layout-align-start-start layout-row']//div[contains(text(),'Only alphanumeric (starting with')]")
	@CacheLookup
	WebElement invalidEntityName;

	@FindBy(xpath = "//div[contains(text(),'Please select Product.')]")
	@CacheLookup
	WebElement emptyProductDropdown;

	@FindBy(xpath = "//div[contains(text(),'Please select Role.')]")
	@CacheLookup
	WebElement emptyProductRoleDropdown;

	@FindBy(xpath = "//md-dialog-content//div[@flex='70']//span[contains(text(),'No entities matching the criteria are Found.')]")
	@CacheLookup
	WebElement informativeMsgForEntityNotAvailable;
	
	@FindBy(xpath = "//md-select[@ng-model='data.productItem']")
	@CacheLookup
	WebElement Product_Dropdown;

	
	@FindBy(xpath = "//md-option[@ng-value='productItem'][1]")
	@CacheLookup
	WebElement Product_from_Dropdown;
	
	
	@FindBy(xpath = "//md-select[@ng-model='data.productRoleItem']")
	@CacheLookup
	WebElement Role_dropdown;

	@FindBy(xpath = "//md-option[@ng-value='productRoleItem'][1]")
	@CacheLookup
	WebElement Role_From_dropdown;

	
	@FindBy(xpath = "//md-input-container[@class='md-auto-horizontal-margin flex md-input-invalid']")
	@CacheLookup
	WebElement click_On_DropDown;

	//md-select-value//span[@class='md-select-icon']
	/*
	 * ####################- Owner --> Mayur Kale -###########################
	 * 
	 */

	public boolean selectEntityInSearchedResult(String Name, String ID) throws InterruptedException {
		cf.waitforSometime(2000);
		for (WebElement webElement : listOfSearchResults) {

			String st = webElement.getText();
			WebElement Element = webElement.findElement(
					By.xpath("//div[contains(text(),'" + ID + "')]/following-sibling::div[@class='flex']/a"));

			if (st.contains(ID)) {
				cf.waitforSometime(1000);
				Element.click();
				return true;
			}
		}
		return false;
	}

	public boolean verifyEhubEntityRadioButtonIsSelected() {
		wait.until(ExpectedConditions.visibilityOf(eHubEntityRadioButton));
		return eHubEntityRadioButton.isSelected();
	}

	public boolean selectEhubEntityRadioButton() {
		wait.until(ExpectedConditions.visibilityOf(eHubEntityRadioButton));
		eHubEntityRadioButton.click();
		return eHubEntityRadioButton.isSelected();
	}

	public boolean selectProductRoleNameRadioButton() {
		wait.until(ExpectedConditions.visibilityOf(productRoleRadioButton));
		productRoleRadioButton.click();
		return productRoleRadioButton.isSelected();
	}

	public boolean enterNameInNameInputBox(String bankName) {
		wait.until(ExpectedConditions.visibilityOf(searchNameInputBox));
		searchNameInputBox.clear();
		searchNameInputBox.sendKeys(bankName);
		return searchNameInputBox.isDisplayed();
	}

	public boolean clickSearchButton() {
		wait.until(ExpectedConditions.visibilityOf(searchButton));
		searchButton.click();

		wait.until(ExpectedConditions.visibilityOf(searchButton));
		return searchButton.isDisplayed();
	}

	public void selectProductRole(String role) throws InterruptedException {
//		cf.waitforSometime(1500);
		wait.until(ExpectedConditions.visibilityOf(productRoleDropdown));
		productRoleDropdown.click();
		
		cf.waitforSometime(1500);
		driver.findElement(By.xpath("//md-option/div[contains(text(),'"+role+"')]")).click();
//		wait.until(ExpectedConditions.visibilityOf((WebElement) dropdownRoleOptions));
	}	

	public void selectProduct(String product) throws InterruptedException {
		cf.waitforSometime(1500);
		wait.until(ExpectedConditions.visibilityOf(productDropdown));
		// click_On_DropDown.click();
		// cf.waitforSometime(1500);
		
		productDropdown.click();
		cf.waitforSometime(1500);
		driver.findElement(By.xpath("//md-option/div[contains(text(),'"+product+"')]")).click();
//		wait.until(ExpectedConditions.visibilityOf((WebElement) dropdownProductOptions));
		
	}

	public boolean ClickCloseButton() {
//		cf.waitforSometime(2000);
		wait.until(ExpectedConditions.visibilityOf(closeButton));
		closeButton.click();
		return true;
	}

	public String selectSearchResult(String searchedValue) throws InterruptedException {
		cf.waitforSometime(2500);
//		wait.until(ExpectedConditions.visibilityOf((WebElement) listOfSearchResultEntityName));
		return cf.getValuefromList(listOfSearchResultEntityName, searchedValue);
	}

	public String verifySerchedResult(String searchedValue) throws InterruptedException {
		cf.waitforSometime(2000);
		for (WebElement webElement : listOfSearchResultEntityName) {

			if (webElement.getText().matches(searchedValue)) {
				Thread.sleep(500);
//				webElement.click();
				return webElement.getText();
			}
		}
		String Return="null";
		return Return;
	}

// ######################## Verify Validation ###########################

	public String validation4_InvalidInputInNameField() {
//		cf.waitforSometime(2000);
		wait.until(ExpectedConditions.visibilityOf(invalidEntityName));
		return invalidEntityName.getText();
	}

	public String validation4_EmptyNameField() {
//		cf.waitforSometime(2000);
		wait.until(ExpectedConditions.visibilityOf(emptyEntityName));
		return emptyEntityName.getText();
	}

	public String validation4_emptyProductDropdown() {
//		cf.waitforSometime(2000);
		wait.until(ExpectedConditions.visibilityOf(emptyProductDropdown));
		return emptyProductDropdown.getText();
	}

	public String validation4_emptyProductRoleDropdown() {
//		cf.waitforSometime(2000);
		wait.until(ExpectedConditions.visibilityOf(emptyProductRoleDropdown));
		return emptyProductRoleDropdown.getText();
	}

	public String informativeMsg4_EntityNotAvailable() {
//		cf.waitforSometime(2000);
		wait.until(ExpectedConditions.visibilityOf(informativeMsgForEntityNotAvailable));
		return informativeMsgForEntityNotAvailable.getText();
	}
	
	
	public boolean Select_Product() {
		cf.waitforSometime(2000);
		Product_Dropdown.click();
		cf.waitforSometime(2000);
		Product_from_Dropdown.click();

		return true;

	}

	public boolean Select_Product_Role() {
		cf.waitforSometime(2000);
		Role_dropdown.click();
		cf.waitforSometime(2000);
		Role_From_dropdown.click();
		return true;

	}

}
