package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.ProgramManagerDetailsPPIpage;
import com.sarvatra.test.ehub.pageobjects.ViewEntityDetailsPage;
import com.sarvatra.test.ehub.pageobjects.ViewEntityDetails_AddNewPage;

import io.cucumber.java.en.Then;

public class ProgramManagerDetailsPPIstep {
	
	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();
	private ProgramManagerDetailsPPIpage pmdpage = new ProgramManagerDetailsPPIpage(DriverFactory.driver);

	Logger log = (Logger) LogManager.getLogger("LoginPageTest.java");
	
	
	@Then("Verify user navigate to Program Manager Details | PPI page")
	public void Verify_user_navigate_to_Program_Manager_Details_page() {
		log.info("Verify user navigate to Program Manager Details | PPI page");
		pmdpage.switchSeleniumFocus(2);
		//	sa.assertTrue(pmdpage.verifyProgramManagerDetailsPageTitle());
	}
	
	@Then("Verify user can see all mandatory input fields Program Manager Details page")
	public void Verify_user_can_see_all_mandatory_input_fields_Program_Manager_Details_page() {
		log.info("Verify user can see all mandatory input fields Program Manager Details page");
		Assert.assertTrue(pmdpage.verifyMandatoryInputeFieldsonPMR());
	}
	
	@Then("Verify user can see all Non-mandatory input fields Program Manager Details page")
	public void Verify_user_can_see_all_Non_mandatory_input_fields_Program_Manager_Details_page() {
		log.info("Verify user can see all Non-mandatory input fields Program Manager Details page");
		Assert.assertTrue(pmdpage.verifyMandatoryInputeFieldsonPMR());
	}
	
	@Then("Verify user can see all mandatory dropdown fields Program Manager Details page")
	public void Verify_user_can_see_all_mandatory_dropdown_fields_Program_Manager_Details_page() {
		log.info("Verify user can see all mandatory dropdown fields Program Manager Details page");
		Assert.assertTrue(pmdpage.verifyMandatoryDropdownFieldsonPMR());
	}
	
	@Then("Verify user can see Username and last login details on header of Program Manager Details page")
	public void Verify_user_can_see_Username_and_last_login_details_on_header_of_Program_Manager_Details_page() {
		log.info("Verify user can see Username/ DisplayName on header of Program Manager Details page");
		sa.assertTrue(pmdpage.verifyDisplayNameOnPMRpage());
		log.info("Verify user can see last login details on header of Program Manager Details page");
		sa.assertTrue(pmdpage.verifyDateAndTimeStampOnPMRpage());
		sa.assertAll();
	}
	
	@Then("Verify user can see SAVE/ SUBMIT & BACK/ CANCEL buttons on Program Manager Details page")
	public void Verify_user_can_see_SAVE_SUBMIT_and_BACK_CANCEL_buttons_on_Program_Manager_Details_page() {
		log.info("Verify user can see SAVE/ SUBMIT button on Program Manager Details page");
		sa.assertTrue(pmdpage.verifySaveButtonOnPMRpage());
		log.info("Verify user can see BACK/ CANCEL button on Program Manager Details page");
		sa.assertTrue(pmdpage.verifyBackButtonOnPMRpage());
		sa.assertAll();
	}
	
	@Then("Close the current window")
	public void Close_the_current_window() {
		log.info("Close the current window");
		Assert.assertTrue(pmdpage.closeWindow());
		pmdpage.switchSeleniumFocus(1);
	}

}
