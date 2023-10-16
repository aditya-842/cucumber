package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.ComplaintTrackingPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

/**
 * @author anand_tajne
 *
 */
public class ComplaintTrackingStep {

	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	public ComplaintTrackingPageObject complaintTrackingPageObject = new ComplaintTrackingPageObject(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();
	Logger log = (Logger) LogManager.getLogger(ComplaintTrackingStep.class);

	@Given("Click on Complaint Tracking Icon")
	public void clickTransactionHistoryIcon() {
		log.info("Click on Complaint Tracking Icon");
		Assert.assertTrue(complaintTrackingPageObject.clickOnComplaintTrackingIcon(), "Sarvatra e-HUB");
	}

	@Then("Select BBPS Radio Button")
	public void clickOnBBPSRadioButton() throws InterruptedException {
		log.info("Select BBPS Radio Button : ");
		Assert.assertTrue(complaintTrackingPageObject.clickOnBBPSRadioButton(), "Sarvatra e-HUB");
	}

	@Then("Select Complaint Type for complaint tracking status {string}")
	public void clickOnComplaintType(String complaintType) throws InterruptedException {
		log.info("Select Complaint Type for complaint tracking status : " + complaintType);
		Assert.assertTrue(complaintTrackingPageObject.selectComplaintType(complaintType), "Sarvatra e-HUB");
	}

	@Then("Enter Customer Mobile Number for Complain Tracking {string}")
	public void enterCustomerMobileNumber(String mobileNo) throws InterruptedException {
		log.info("Enter Customer Mobile Number for Complain Tracking : " + mobileNo);
		Assert.assertTrue(complaintTrackingPageObject.enterCustomerMobileNO(mobileNo), "Sarvatra e-HUB");
	}

	@Then("Enter Complaint ID {string}")
	public void enterComplaintId(String complaintId) throws InterruptedException {
		log.info("Enter Complaint ID : " + complaintId);
		Assert.assertTrue(complaintTrackingPageObject.enterComplaintID(complaintId), "Sarvatra e-HUB");
	}

	@Then("Click on View Status Button")
	public void clickOnViewStatusButton() throws InterruptedException {
		log.info("Click on View Status Button : ");
		Assert.assertTrue(complaintTrackingPageObject.clickOnViewStatusButton(), "Sarvatra e-HUB");
	}
}
