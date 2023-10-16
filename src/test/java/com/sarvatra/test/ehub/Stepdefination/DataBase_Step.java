package com.sarvatra.test.ehub.Stepdefination;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.DataBasePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataBase_Step {
	
	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();
	public DataBasePage DBPage = new DataBasePage(DriverFactory.driver);
	Logger log = (Logger) LogManager.getLogger("LoginPageTest.java");

	/*
	 * ####################- Owner --> Vivek Nichal -###########################
	 * 
	 */
	
	@When("Update Ehub Permission Table {string} {string}")
	public void Update_Permission_Table(String PermissionName, String Permission) throws InterruptedException, ClassNotFoundException, SQLException {
		log.info("Update Ehub Permission Table");
		Assert.assertTrue(DBPage.Update_Permission_Table(PermissionName, Permission));
	}
	
	@When("Update Ehub Permission Table Via Product {string}")
	public void Update_Permission_Table_Via_Product(String Permission) throws InterruptedException, ClassNotFoundException, SQLException {
		log.info("Update Ehub Permission Table Via Product");
		Assert.assertTrue(DBPage.Update_Permission_Table_Via_Product(Permission));
	}
	
	@When("Update AEPS Ehub Permission Table {string} {string}")
	public void Update_AEPS_Permission_Table(String PermissionName, String Permission) throws InterruptedException, ClassNotFoundException, SQLException {
		log.info("Update AEPS Ehub Permission Table");
		Assert.assertTrue(DBPage.Update_AEPS_Permission_Table(PermissionName, Permission));
	}
	
	@When("Update MicroATM Ehub Permission Table {string} {string}")
	public void Update_MicroATM_Permission_Table(String PermissionName, String Permission) throws InterruptedException, ClassNotFoundException, SQLException {
		log.info("Update MicroATM Ehub Permission Table");
		Assert.assertTrue(DBPage.Update_MicroATM_Permission_Table(PermissionName, Permission));
	}
	
	@When("Update MiniATM Ehub Permission Table {string} {string}")
	public void Update_MiniATM_Permission_Table(String PermissionName, String Permission) throws InterruptedException, ClassNotFoundException, SQLException {
		log.info("Update MiniATM Ehub Permission Table");
		Assert.assertTrue(DBPage.Update_MiniATM_Permission_Table(PermissionName, Permission));
	}
}
