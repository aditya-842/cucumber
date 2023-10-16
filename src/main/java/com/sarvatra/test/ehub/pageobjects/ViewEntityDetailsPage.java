package com.sarvatra.test.ehub.pageobjects;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.collections4.map.LinkedMap;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.CommonFunctions;
import com.qa.util.ExcelReader;

public class ViewEntityDetailsPage {

	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions cf;
	private ExcelReader exel = new ExcelReader();

	public ViewEntityDetailsPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		cf = new CommonFunctions(driver);
	}

	/*
	 * ####################- Owner --> Mayur Kale -###########################
	 * 
	 */

// #Entity Details Section

	@FindBy(xpath = "//a[@ng-click='searchEntityByName()']")
	@CacheLookup
	WebElement searchEntityByNameLink;

	@FindBy(xpath = "//button[@ng-click='historyBack()']")
	@CacheLookup
	WebElement backButton;

	@FindBy(xpath = "//button[@ng-click='addUser()']")
	@CacheLookup
	WebElement addUserButton;

	@FindBy(xpath = "//md-icon[@aria-label='Edit']")
	@CacheLookup
	WebElement editIcon;

	@FindBy(xpath = "//label[contains(text(),'12226 - NSDL')]")
	@CacheLookup
	WebElement entityName;

	@FindBy(xpath = "//div[@class='md-toast-content']//span[contains(text(),'User created Successfully')]")
	@CacheLookup
	WebElement userCreatedMessagePopup;

// #Product Details Section
	@FindBy(xpath = "//table//md-icon[@aria-label='Product History']")
	@CacheLookup
	WebElement productHistoryIcon;

	@FindBy(xpath = "//div[@class='md-container']//div[@class='md-bar']")
	@CacheLookup
	WebElement activateORdeactivateicon;

	@FindBy(xpath = "//table[@class='table-product-role-details']//label")
	@CacheLookup
	List<WebElement> productDetailsFieldsName; // -2 = Role & Status

	@FindBy(xpath = "//table[@class='table-product-role-details']//td[@class='ng-binding']")
	@CacheLookup
	List<WebElement> productDetailsValues; //

	@FindBy(xpath = "//span[@ng-if='entityProduct.productDetails.status === true']")
	@CacheLookup
	WebElement productStatusActive;

	@FindBy(xpath = "//table[@class='table-product-role-details']//tr//td/label")
	@CacheLookup
	List<WebElement> productDetailsTable;

	@FindBy(xpath = "//td[contains(text(),'538')]")
	@CacheLookup
	List<WebElement> productDetailFieldName;
	
	@FindBy(xpath = "//label[contains(text(),'Status')]/parent::td/following-sibling::td/span")
	@CacheLookup
	WebElement status;

// #Child Entities Section
	// div[@flex='100']
	@FindBy(xpath = "//div[@class='layout-row flex-100']")
	@CacheLookup
	List<WebElement> searchedResultsInChildEntity;

	@FindBy(xpath = "//md-dummy-tab[@class='md-tab ng-scope ng-isolate-scope ng-binding']")
	@CacheLookup
	WebElement viewProduct;

	@FindBy(xpath = "//div[@class='flex']/label[@class='ng-binding']")
	@CacheLookup
	WebElement viewRole;

	@FindBy(xpath = "//div[@layout-align='center center']//input[@type='text']")
	WebElement childSearchEntityBox;

	@FindBy(xpath = "//md-list[@class='md-dense']")
	List<WebElement> childSearchedName;

	@FindBy(xpath = "//md-list[@class='md-dense']//div[@flex='15']")
	@CacheLookup
	List<WebElement> childSearchedID;

	@FindBy(xpath = "//a[contains(text(),'Add New')]")
	@CacheLookup
	WebElement addNewHypertectLink;

	@FindBy(xpath = "//div[@aria-label='NSDL']")
	@CacheLookup
	WebElement viewPPIentityInChildEntitySection;

// #Top Elements Section
	@FindBy(xpath = "//md-icon[@aria-label='Home']")
	@CacheLookup
	WebElement homeIcon;

//Others
	@FindBy(xpath = "//h2[contains(text(),'User Management Details')]")
	@CacheLookup
	WebElement UserManagementDetailsTitle;

	@FindBy(xpath = "//h2[contains(text(),'Search Entity by Name')]")
	@CacheLookup
	WebElement searchEntityByNamePopUp;

	@FindBy(xpath = "//h2[contains(text(),'Assign Product Role')]")
	@CacheLookup
	WebElement assignProductRolePopUp;

	@FindBy(xpath = "//button[contains(text(),'Close')]")
	@CacheLookup
	WebElement CLoseButtonOnAssignProductPopUp;

	@FindBy(xpath = "//md-tab-item[contains(text(),'PPI')]")
	@CacheLookup
	WebElement productName;

	@FindBy(xpath = "//label[contains(text(),'Role: Insistution')]")
	@CacheLookup
	WebElement roleValue;

	@FindBy(xpath = "//button[@aria-label='Logout']")
	@CacheLookup
	WebElement logout;

	// label[contains(text(),'ID -
	// Name')]/parent::td/following-sibling::td[contains(text(),'41 - NSDL')]
	@FindBy(xpath = "//div[@class='flex']//div[contains(text(),'NSDL')]")
	@CacheLookup
	WebElement rightTopText;

	/*
	 * ####################- Owner --> Vivek Nichal -###########################
	 * 
	 */
	@FindBy(xpath = "//label[contains(text(),'Search Entity')]/parent::div/following-sibling::md-input-container//input")
	@CacheLookup
	WebElement Search_Entity_TextField;
	
	@FindBy(xpath = "//a[contains(text(),'Manage Permissions')]")
	@CacheLookup
	WebElement ManagePermisions_Link;
	
	@FindBy(xpath = "//span[contains(text(),'Add Logo')]")
	@CacheLookup
	WebElement AddLogo_Link;
	
	@FindBy(xpath = "//span[contains(text(),'ADD PRODUCT')]")
	@CacheLookup
	WebElement AddPRODUCT_Button;
	
	@FindBy(xpath = "//span[contains(text(),'ADD USER')]")
	@CacheLookup
	WebElement AddUser_Button;
	
	@FindBy(xpath = "//div[@class='fa fa-edit edit-btn']")
	@CacheLookup
	WebElement Edit_logo;
	
	@FindBy(xpath = "//span[@class='mat-slide-toggle-bar']")
	@CacheLookup
	WebElement active_Toggle_Button;
	
	@FindBy(xpath = "//mat-icon[contains(text(),'history')]")
	@CacheLookup
	WebElement History_Button;
	
	@FindBy(xpath = "//table[@class='table-product-role-details']//*[@aria-label='Edit']")
	@CacheLookup
	WebElement product_EditIcon;
	
	@FindBy(xpath = "//div[@class='md-toolbar-tools']/h2[contains(text(),'Agent Institution Details  | BBPS')]")
	@CacheLookup
	WebElement toolbar_AI_details;
	
	
	
	
	/*
	 * ####################- Owner --> Mayur Kale -###########################
	 * 
	 */

	public boolean clickOnHomeIcon() {
//		cf.waitforSometime(500);
		wait.until(ExpectedConditions.visibilityOf(homeIcon));
		homeIcon.click();
		return true;
	}

	public String selectSearchResultinChild(String searchedValue) throws InterruptedException {
		cf.waitforSometime(1500);
		return cf.getValuefromList(childSearchedName, searchedValue);  
	}

//	public boolean verify_PPI_Insti_FixedProductFieldsAndValues()
//			throws InterruptedException, InvalidFormatException, IOException {
//		boolean value = false;
//		int row = 1, col = 1, colF = 0;
//		Sheet sh = exel.getSheetByName(
//				"D:\\BDD TestFramework (22)\\BDD TestFramework\\Sarvathra.com\\eHub.com\\src\\test\\resources\\eHub_Data.xlsx",
//				"PPI_Institution");
//		for (WebElement webElement : productDetailsTable) {
//			String FieldName = sh.getRow(row).getCell(colF).getStringCellValue();
//			String ExpValue = sh.getRow(row).getCell(col).getStringCellValue();
//			try {
////				WebElement Element = webElement.findElement(By.xpath("//table[@style='width: 100%; text-align: left']//label[contains(text(),'"+FieldName+"')]/parent::td/following-sibling::td[contains(text(),'"+ExpValue+"')]"));
//				WebElement Element = driver.findElement(
//						By.xpath("//table[@style='width: 100%; text-align: left']//label[contains(text(),'" + FieldName
//								+ "')]/parent::td/following-sibling::td[contains(text(),'" + ExpValue + "')]"));
//				String actValue = Element.getText();
//				if (actValue.contains(ExpValue)) {
//					System.out.println(FieldName + " : " + actValue);
//					row++;
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//				System.out.println("Expected Value of " + FieldName + " not matching with actual field value");
//			}
////			if(FieldName.matches("") && row==14) { value=true; break;  }
//			if (FieldName.matches("break")) {
//				value = true;
//				break;
//			}
//		}
//		return value;
//	}

	

	public String viewPPIentityInChildEntity() {
		cf.waitforSometime(1000);
		return viewPPIentityInChildEntitySection.getText().trim();
	}

	public String selectEntityInChildSearchedResult(String Name, String ID) throws InterruptedException {
		cf.waitforSometime(2000);
		return cf.selectSearchResultWithNameID(searchedResultsInChildEntity, Name, ID);
	}

	public String selectSearchResultwithName(String searchedValue) throws InterruptedException {
		cf.waitforSometime(2000);
		return cf.getValuefromList(childSearchedName, searchedValue);
	}

	public boolean enterValueinChild(String Name) {
//		cf.waitforSometime(1500);
		wait.until(ExpectedConditions.visibilityOf(childSearchEntityBox));
		childSearchEntityBox.sendKeys(Name);
		return childSearchEntityBox.isEnabled();
	}

	public String viewProduct() {
//		cf.waitforSometime(2000);
		wait.until(ExpectedConditions.visibilityOf(viewProduct));
		return viewProduct.getText();
	}

	public String viewRole() {
//		cf.waitforSometime(500);
		wait.until(ExpectedConditions.visibilityOf(viewRole));
		return viewRole.getText();
	}

	public boolean clickEntityByNameLink() {
//		cf.waitForWebElement(searchEntityByNameLink);
		wait.until(ExpectedConditions.elementToBeClickable(searchEntityByNameLink));
		searchEntityByNameLink.click();
//		cf.waitforSometime(2000);
		wait.until(ExpectedConditions.visibilityOf(searchEntityByNamePopUp));
		return searchEntityByNamePopUp.isDisplayed();

	}

	public boolean searchEntityByNamePopUpOpened() {
//		cf.waitForWebElement(searchEntityByNamePopUp);
		wait.until(ExpectedConditions.visibilityOf(searchEntityByNamePopUp));
		return searchEntityByNamePopUp.isDisplayed();
	}

	public boolean prod_HistroyButton() {
		try {
			wait.until(ExpectedConditions.visibilityOf(productHistoryIcon));
			cf.waitforSometime(1000);
			productHistoryIcon.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean editButton() {
		try {
			wait.until(ExpectedConditions.visibilityOf(editIcon));
			cf.waitforSometime(1000);
			editIcon.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifyAddNewHypertectLink() {
		cf.waitforSometime(1000);
		wait.until(ExpectedConditions.visibilityOf(addNewHypertectLink));
		try {
			addNewHypertectLink.click();
			wait.until(ExpectedConditions.visibilityOf(CLoseButtonOnAssignProductPopUp));
			CLoseButtonOnAssignProductPopUp.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifyActivatDeactiveSwitch() {
		wait.until(ExpectedConditions.visibilityOf(activateORdeactivateicon));
		return activateORdeactivateicon.isEnabled();
	}

	public boolean clickOnAddNewHypertectLink() {
		cf.waitforSometime(1000);
		wait.until(ExpectedConditions.visibilityOf(addNewHypertectLink));
		addNewHypertectLink.click();
		wait.until(ExpectedConditions.visibilityOf(assignProductRolePopUp));
		return assignProductRolePopUp.isDisplayed();
	}

	public String clickOnAddUser() {
		wait.until(ExpectedConditions.visibilityOf(addUserButton));
		addUserButton.click();
//		cf.waitforSometime(1500);
		wait.until(ExpectedConditions.visibilityOf(UserManagementDetailsTitle));
		return UserManagementDetailsTitle.getText();
	}

	public String getUserCreatedMessage() {
//		cf.waitforSometime(1000);
		wait.until(ExpectedConditions.visibilityOf(userCreatedMessagePopup));
		System.out.println("User created popup message: " + userCreatedMessagePopup.getText());
		return userCreatedMessagePopup.getText();
	}

	public String getID_EntityName() {
//		cf.waitforSometime(1000);
		wait.until(ExpectedConditions.visibilityOf(entityName));
		return entityName.getText();
	}

	/*
	 * ####################- Owner --> Srihari Kovvuri -###########################
	 * 
	 */
	public String getrightToptitle() {
		cf.waitforSometime(1500);
		String title = rightTopText.getText();
		return title;
	}

	public boolean verifyAvailabilityofAddNewHypertectLink() {
		cf.waitforSometime(1000);
		return addNewHypertectLink.isEnabled();
	}

	public boolean addUser_Button() {
		return addUserButton.isDisplayed();

	}
	
	/*
	 * ####################- Owner --> Vivek Nichal -###########################
	 * 
	 */
	
	public boolean enterEntityNameInSearchEntityTextField(String EntityName) throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(Search_Entity_TextField));
		Search_Entity_TextField.sendKeys(EntityName);
		Thread.sleep(2000);
		return true;
	}
	
	public boolean verifySearchResultEntityName(String EntityName) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(text(),'"+EntityName+"')])[1]")).isDisplayed();
		return true;
	}
	
	public boolean clickOnSearchResultEntityName(String EntityName) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[contains(text(),'Search Entity')]/ancestor::div[2]/following-sibling::md-list//button//div[contains(text(),'"+EntityName+"')])")).click();
		return true;
	}
	
	public boolean verifyIDEntityName(String EntityName) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'ID - Entity Name')]/parent::div/following-sibling::div[2]/span[contains(text(),'"+EntityName+"')]")).isDisplayed();
		return true;
	}
	
	public boolean verifyIDEntityCreatedBy(String EntityName) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'ID - Entity Created By')]/parent::div/following-sibling::div[2]/span[contains(text(),'"+EntityName+"')]")).isDisplayed();
		return true;
	}
	
	public boolean verifyEntityType(String Type) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Type')]/parent::div/following-sibling::div[2]/span[contains(text(),'"+Type+"')]")).isDisplayed();
		return true;
	}
	
	public boolean verifyEntityCreatedDate(String CreatedDate) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Created Date')]/parent::div/following-sibling::div[2]/span[contains(text(),'"+CreatedDate+"')]")).isDisplayed();
		return true;
	}
	
	public boolean verifyBelowLine() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Use this Entity for sending SMS by Users of this Entity and for all the Child Entities. Client ID -')]")).isDisplayed();
		return true;
	}
	
	public boolean verifyManagePermisions_Link_Available() {
		wait.until(ExpectedConditions.visibilityOf(ManagePermisions_Link));
		return ManagePermisions_Link.isDisplayed();
	}
	
	public boolean verifyAddLogo_Link_Available() {
		wait.until(ExpectedConditions.visibilityOf(AddLogo_Link));
		return AddLogo_Link.isDisplayed();
	}
	
	public boolean verifyAddUser_Button_Available() {
		wait.until(ExpectedConditions.visibilityOf(AddUser_Button));
		return AddUser_Button.isDisplayed();
	}
	
	public boolean verifyAddPRODUCT_Button_Available() {
		wait.until(ExpectedConditions.visibilityOf(AddPRODUCT_Button));
		return AddPRODUCT_Button.isDisplayed();
	}
	
	public boolean verifyEdit_logo_Available() {
		wait.until(ExpectedConditions.visibilityOf(Edit_logo));
		return Edit_logo.isDisplayed();
	}
	
	public boolean verifyActive_Toggle_Button_Available() {
		wait.until(ExpectedConditions.visibilityOf(active_Toggle_Button));
		return active_Toggle_Button.isDisplayed();
	}
	
	public void Click_On_Entity_From_List_On_View_Entity_Details_Page_For_Flow(String Entity) throws InterruptedException {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//label[contains(text(),'Search Entity')]/ancestor::div[2]/following-sibling::md-list//div[@class='md-list-item-inner']//div[@aria-label='"+Entity+"'])[1]"));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//md-list-item[4]//button/div/div/div[3]\r\n"
				+ "'],'"+Entity+"')]")).click();
	
	}
	
	public void Click_On_Back_Button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public void Click_On_First_Entity_From_List_On_View_Entity_Details_Page_For_Flow() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//label[contains(text(),'Search Entity')]/ancestor::div[2]/following-sibling::md-list//div[@class='md-list-item-inner']//div/div[1])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	

	public boolean verifyHistory_Button_Available() {
		wait.until(ExpectedConditions.visibilityOf(History_Button));
		return History_Button.isDisplayed();
	}
	
	
	public boolean verifyEditIconISDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(product_EditIcon));
		return product_EditIcon.isDisplayed();
	}
	
	public void clickOnEditIcon() {
		wait.until(ExpectedConditions.visibilityOf(product_EditIcon));
		product_EditIcon.click();
	}
	
	public boolean verifyToolbarAIdetails() {
		wait.until(ExpectedConditions.visibilityOf(toolbar_AI_details));
		return toolbar_AI_details.isDisplayed();
	}
	
	public boolean verifyentity(String entitydetail) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'"+entitydetail+"')]")).isDisplayed();
		return true;
	}
	
	
	public void getentitycount() {
		Select s = new Select(driver.findElement(By.tagName("md-list")));
	    List <WebElement> op = s.getOptions();
	    int entitysize = op.size();
	    System.out.println(entitysize);
	}
	
	public boolean verifyAIIDIsvisibleOnViewEntityDetailsPage() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Agent Institution ID')]")).isDisplayed();
		return true;
	}
	
	public boolean verifyAITypeIsvisibleOnViewEntityDetailsPage() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Type')]")).isDisplayed();
		return true;
	}
	
	public boolean verifyAIAcquiringEntityIsvisibleOnViewEntityDetailsPage() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Acquiring Entity')]")).isDisplayed();
		return true;
	}
	
	public boolean verifyAIAgentInstitutionNameIsvisibleOnViewEntityDetailsPage() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Agent Institution Name')]")).isDisplayed();
		return true;
	}
		
	public boolean verifyOUIDIsvisibleOnViewEntityDetailsPage() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'ID - Name')]")).isDisplayed();
		return true;
	}
	
	public boolean verifyOUTypeIsvisibleOnViewEntityDetailsPage() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Business Type')]")).isDisplayed();
		return true;
	}
	
	public boolean childentity(String childentity) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'"+childentity+"')]")).click();
		return true;
	}
	
	public boolean verifyAGDetailsOnViewEntityDetailsPage(String details) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'"+details+"')]")).isDisplayed();
		return true;
	}//label[contains(text(),'381 - Babaji date Bank (BANK)')]
	
	public boolean verifyAGDetailOnViewEntityDetailsPage(String details) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'"+details+"')]")).isDisplayed();
		return true;
	}
	
	public boolean verifywalletIDOnViewEntityDetailsPage(String walletID) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(text(),'"+walletID+"')]")).isDisplayed();
		return true;
	}
	
	public boolean CheckStatusOnViewEntityDetailsPage(String status) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//b[contains(text(),'"+status+"')]")).isDisplayed();
		return true;
	}
	
	public boolean ClickOnProducts() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//md-select[@id='product']")).click();
		return true;
	}
	
	public boolean SelectProduct(String product) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'"+product+"')]")).click();
		return true;
	}
	
	public boolean SelectProductRole(String productrole) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//md-select[@id='productRole']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'"+productrole+"')]")).click();
		return true;
	}
	
	public boolean ClickOnSearchButtonOnPopupforSearchByEntityName() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		return true;
	}
	
	public boolean ClickOnChildEntityOnPopupforSearchByEntityName(String entity) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'"+entity+"')]")).click();
		return true;
	}
	
	public boolean verifyEnabledandDispaledOnViewEntityDetailsPage() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//md-icon[@class='fa material-icons fa-check access-allowed']")).isDisplayed();
		return true;
	}
	
	public void click_On_Manage_Permission_Link() throws InterruptedException {
		Thread.sleep(1000);
		ManagePermisions_Link.click();
	}
	
	public boolean verify_Permission_Available_On_Manage_Permission_Popup(String Product, String Permission) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//Strong[contains(text(),'"+Product+"')]/ancestor::div[2]/following-sibling::div//div[contains(text(),'"+Permission+"')])[1]")).isDisplayed();
		return true;
	}
	
	public boolean verify_Permission_Not_Available_On_Manage_Permission_Popup(String Product, String Permission) throws InterruptedException {
		Thread.sleep(1000);
		try {
			driver.findElement(By.xpath("(//Strong[contains(text(),'"+Product+"')]/ancestor::div[2]/following-sibling::div//div[contains(text(),'"+Permission+"')])[1]")).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean verify_Key_And_Value_Filed_On_View_Entity_Page(String Key, String Value) throws InterruptedException {
		driver.findElement(By.xpath("//label[text()='"+Key+"']/parent::td/following-sibling::td[2][contains(text(),'"+Value+"')]")).isDisplayed();
		return true;
	}
}