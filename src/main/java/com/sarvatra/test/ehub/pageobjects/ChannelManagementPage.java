package com.sarvatra.test.ehub.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.qa.util.UniqueKeyGenerator;
import com.qa.util.CommonFunctions;

public class ChannelManagementPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions cf;
	LoginPage lp;
	private UniqueKeyGenerator UniqueKey = new UniqueKeyGenerator();

	public ChannelManagementPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		cf = new CommonFunctions(driver);
		lp = new LoginPage(driver);
	}
	
	@FindBy(xpath = "//h2[contains(text(),'Channel Management')]")
	@CacheLookup
	WebElement ChannelManagementPageHeader;
	
	@FindBy(xpath = "//md-select[@id='paymentRefId']")
	@CacheLookup
	WebElement PaymentRefId;
	
	@FindBy(xpath = "//div[contains(text(),'Channel Created Successfully')]")
	@CacheLookup
	WebElement Channel_Created_Successfully;
	
	public boolean Verify_Header_On_ChannelManagementPage() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(ChannelManagementPageHeader));
		return ChannelManagementPageHeader.isDisplayed();
	}
	
	public void Click_on_Add_Channel() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public void Enter_Channel_Name_On_ChannelManagementPage(String ChannelName) throws InterruptedException {
		Thread.sleep(2000);
		String Name = ChannelName+"_"+UniqueKey.getRandomInteger(4);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(Name);
	}
	
	public void Select_Product_On_ChannelManagementPage(String Product) throws InterruptedException {
		driver.findElement(By.xpath("//md-select[@id='product']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//md-option/div[contains(text(),'"+Product+"')]")).click();
	}
	
	public void Select_ProductRole_On_ChannelManagementPage(String Role) throws InterruptedException {
		driver.findElement(By.xpath("//md-select[@id='productRole']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//md-option/div[contains(text(),'"+Role+"')]")).click();
	}
	
	public void Select_Agent_Role_On_ChannelManagementPage(String Role) throws InterruptedException {
		driver.findElement(By.xpath("//md-select[@id='productRole']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//md-option/div[contains(text(),'"+Role+"')])[3]")).click();
	}
	
	public boolean Verify_PaymentRefId_On_ChannelManagementPage() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(PaymentRefId));
		return PaymentRefId.isDisplayed();
	}
	
	public void click_On_PaymentRefId_On_ChannelManagementPage() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(PaymentRefId));
		PaymentRefId.click();
	}
	
	public boolean Verify_PaymentRefId_Dropdown_Option_On_ChannelManagementPage(String Option) throws InterruptedException {
		return driver.findElement(By.xpath("//md-content[@aria-label='Payment Ref Id']//div[contains(text(),'"+Option+"')]")).isDisplayed();
	}
	
	public void click_On_PaymentRefId_Dropdown_Option_On_ChannelManagementPage(String Option) throws InterruptedException {
		driver.findElement(By.xpath("//md-content[@aria-label='Payment Ref Id']//div[contains(text(),'"+Option+"')]")).click();
	}
	
	public void Select_Entity_On_ChannelManagementPage(String Entity) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='selectedEntityText']")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//ul/li//span[contains(text(),'"+Entity+"')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public void Enter_Password_On_ChannelManagementPage(String Password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='textPassword']")).sendKeys(Password);
	}
	
	public void Select_Validate_Token_Dropdown_Option_On_ChannelManagementPage(String Option) throws InterruptedException {
		driver.findElement(By.xpath("//md-select[@aria-label='Validate Token']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//md-content[@aria-label='Validate Token']//div[contains(text(),'"+Option+"')]")).click();
	}
	
	public void Enter_OU_ID_On_ChannelManagementPage(String OU_ID) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='BBPS_OU_ID']")).sendKeys(OU_ID);
	}
	
	public void Enter_BBPS_AGENT_REF_ID_On_ChannelManagementPage(String BBPS_AGENT_REF_ID) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='BBPS_AGENT_REF_ID']")).sendKeys(BBPS_AGENT_REF_ID);
	}
	
	public void Click_on_Save() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public boolean Verify_Channel_Created_Successfully_Message_On_ChannelManagementPage() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(Channel_Created_Successfully));
		return Channel_Created_Successfully.isDisplayed();
	}
	
	public void Click_on_1st_Row_From_Channel_Table() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@id='channelForm']//tbody/tr[1]/td[1]//a[1]")).click();
	}
	
	public boolean Verify_PaymentRefId_Not_Available_On_ChannelManagementPage() throws InterruptedException {
		try {
			PaymentRefId.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

}
