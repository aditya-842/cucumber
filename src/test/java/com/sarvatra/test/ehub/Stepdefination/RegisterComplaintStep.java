package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.RegisterComplaintPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

/**
 * @author anand_tajne
 *
 */
public class RegisterComplaintStep {

	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	public RegisterComplaintPageObject registerComplaintPageObject = new RegisterComplaintPageObject(
			DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();

	Logger log = (Logger) LogManager.getLogger(RegisterComplaintStep.class);

	@Given("Click on Register Complaint Icon")
	public void clickTransactionHistoryIcon() {
		log.info("Click on Register Complaint Icon ");
		Assert.assertTrue(registerComplaintPageObject.clickOnRegisterComplaintIcon(), "Sarvatra e-HUB");
	}

	@Then("Select Complaint Type {string}")
	public void selectAgent(String complaintType) throws InterruptedException {
		log.info("Select Complaint Type : " + complaintType);
		Assert.assertTrue(registerComplaintPageObject.selectComplaintType(complaintType), "Sarvatra e-HUB");
	}

	@Then("Enter Mobile Number for Register Complaint {string}")
	public void enterCustomerMobileNO(String complaintType) throws InterruptedException {
		log.info("Enter Mobile Number for Register Complaint : " + complaintType);
		Assert.assertTrue(registerComplaintPageObject.enterCustomerMobileNO(complaintType), "Sarvatra e-HUB");
	}

	@Then("Enter Transaction ID {string}")
	public void enterTransactionID(String transactionId) throws InterruptedException {
		log.info("Enter Transaction ID : " + transactionId);
		Assert.assertTrue(registerComplaintPageObject.enterTransactionID(transactionId), "Sarvatra e-HUB");
	}

	@Then("Select the reason {string}")
	public void selectReason(String reason) throws InterruptedException {
		log.info("Select the reason : " + reason);
		Assert.assertTrue(registerComplaintPageObject.selectReason(reason), "Sarvatra e-HUB");
	}

	@Then("Enter the Description {string}")
	public void enterDescription(String descriptionText) throws InterruptedException {
		log.info("Enter the Description : " + descriptionText);
		Assert.assertTrue(registerComplaintPageObject.enterDescription(descriptionText), "Sarvatra e-HUB");
	}

	@Then("Click On Submit button")
	public void clickOnSubmitButton() throws InterruptedException {
		log.info("Click On Submit button :");
		Assert.assertTrue(registerComplaintPageObject.clickOnSubmitButton(), "Sarvatra e-HUB");
	}

	@Then("Click On Print button")
	public void clickOnPrintButton() throws InterruptedException {
		log.info("Click On Print button :");
		Assert.assertTrue(registerComplaintPageObject.clickOnPrintButton(), "Sarvatra e-HUB");
	}
	
	@Then("Verify Print Button On Register Complaint_Page")
	public void Verify_Print_Button_On_Register_Complaint_Page() throws InterruptedException {
		log.info("Verify Print Button On Register Complaint_Page");
		Assert.assertTrue(registerComplaintPageObject.Verify_Print_Button_On_Register_Complaint_Page());
	}
}
