package com.sarvatra.test.ehub.pageobjects;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.CommonFunctions;
import com.qa.util.DBConnection;
import com.qa.util.DriverFactory;

public class DataBasePage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions c;
	private DBConnection DB = new DBConnection(DriverFactory.driver);
	public DataBasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		c = new CommonFunctions(driver);
	}
	
	public boolean Update_Permission_Table(String Permissionname, String Permission) throws InterruptedException, ClassNotFoundException, SQLException {
		String query = "UPDATE ehub.ehub_permissions SET display='"+Permission+"' where product_id =2 and value = '"+Permissionname+"';";				
		System.out.println(query);
		DB.executeUpdate(query);
		Thread.sleep(4000);
		return true;
		
	}
	
	public boolean Update_Permission_Table_Via_Product(String Permission) throws InterruptedException, ClassNotFoundException, SQLException {
		String query = "UPDATE ehub.ehub_permissions SET display='"+Permission+"' where product_id =2;";				
		System.out.println(query);
		DB.executeUpdate(query);
		Thread.sleep(2000);
		return true;
		
	}
	
	public boolean Update_AEPS_Permission_Table(String Permissionname, String Permission) throws InterruptedException, ClassNotFoundException, SQLException {
		String query = "UPDATE ehub.ehub_permissions SET display='"+Permission+"' where product_id =1 and value = '"+Permissionname+"';";				
		System.out.println(query);
		DB.executeUpdate(query);
		Thread.sleep(2000);
		return true;	
	}
	
	public boolean Update_MicroATM_Permission_Table(String Permissionname, String Permission) throws InterruptedException, ClassNotFoundException, SQLException {
		String query = "UPDATE ehub.ehub_permissions SET display='"+Permission+"' where product_id =4 and value = '"+Permissionname+"';";				
		System.out.println(query);
		DB.executeUpdate(query);
		Thread.sleep(2000);
		return true;	
	}
	
	public boolean Update_MiniATM_Permission_Table(String Permissionname, String Permission) throws InterruptedException, ClassNotFoundException, SQLException {
		String query = "UPDATE ehub.ehub_permissions SET display='"+Permission+"' where product_id =3 and value = '"+Permissionname+"';";				
		System.out.println(query);
		DB.executeUpdate(query);
		Thread.sleep(2000);
		return true;	
	}

}
