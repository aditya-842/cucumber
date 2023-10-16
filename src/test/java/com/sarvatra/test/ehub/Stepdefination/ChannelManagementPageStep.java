package com.sarvatra.test.ehub.Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;

import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.ChannelManagementPage;

import io.cucumber.java.en.Then;

public class ChannelManagementPageStep {
	
	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	private ChannelManagementPage channelmanagementpage = new ChannelManagementPage(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();

	Logger log = (Logger) LogManager.getLogger("LoginPageTest.java");
	
	@Then("Verify Header On Channel Management Page")
	public void Verify_Header_On_ChannelManagementPage() throws InterruptedException {
		log.info("Verify Header On Channel Management Page");
		channelmanagementpage.Verify_Header_On_ChannelManagementPage();
	}
	
	@Then("Click on Add Channel On Channel Management Page")
	public void Click_on_Add_Channel() throws InterruptedException {
		log.info("Click on Add Channel On Channel Management Page");
		channelmanagementpage.Click_on_Add_Channel();
	}
	
	@Then("Enter Channel Name On Channel Management Page {string}")
	public void Enter_Channel_Name_On_ChannelManagementPage(String ChannelName) throws InterruptedException {
		log.info("Enter Channel Name On Channel Management Page");
		channelmanagementpage.Enter_Channel_Name_On_ChannelManagementPage(ChannelName);
	}
	
	@Then("Select Product On Channel Management Page {string}")
	public void Select_Product_On_ChannelManagementPage(String Product) throws InterruptedException {
		log.info("Select Product On Channel Management Page");
		channelmanagementpage.Select_Product_On_ChannelManagementPage(Product);
	}
	
	@Then("Select ProductRole On Channel Management Page {string}")
	public void Select_ProductRole_On_ChannelManagementPage(String Role) throws InterruptedException {
		log.info("Select ProductRole On Channel Management Page");
		channelmanagementpage.Select_ProductRole_On_ChannelManagementPage(Role);
	}
	
	@Then("Select Agent Role On Channel Management Page {string}")
	public void Select_Agent_Role_On_ChannelManagementPage(String Role) throws InterruptedException {
		log.info("Select Agent Role On Channel Management Page");
		channelmanagementpage.Select_Agent_Role_On_ChannelManagementPage(Role);
	}
	
	@Then("Verify PaymentRefId On Channel Management Page")
	public void Verify_PaymentRefId_On_ChannelManagementPage() throws InterruptedException {
		log.info("Verify PaymentRefId On Channel Management Page");
		channelmanagementpage.Verify_PaymentRefId_On_ChannelManagementPage();
	}
	
	@Then("Click On PaymentRefId On Channel Management Page")
	public void click_On_PaymentRefId_On_ChannelManagementPage() throws InterruptedException {
		log.info("Click On PaymentRefId On Channel Management Page");
		channelmanagementpage.click_On_PaymentRefId_On_ChannelManagementPage();
	}
	
	@Then("Verify PaymentRefId Dropdown Option On Channel Management Page {string}")
	public void Verify_PaymentRefId_Dropdown_Option_On_ChannelManagementPage(String Option) throws InterruptedException {
		log.info("Verify PaymentRefId Dropdown Option On Channel Management Page");
		channelmanagementpage.Verify_PaymentRefId_Dropdown_Option_On_ChannelManagementPage(Option);
	}
	
	@Then("Click On PaymentRefId Dropdown Option On Channel Management Page {string}")
	public void click_On_PaymentRefId_Dropdown_Option_On_ChannelManagementPage(String Option) throws InterruptedException {
		log.info("Click On PaymentRefId Dropdown Option On Channel Management Page");
		channelmanagementpage.click_On_PaymentRefId_Dropdown_Option_On_ChannelManagementPage(Option);
	}
	
	@Then("Select Entity On Channel Management Page {string}")
	public void Select_Entity_On_ChannelManagementPage(String Entity) throws InterruptedException {
		log.info("Select Entity On Channel Management Page");
		channelmanagementpage.Select_Entity_On_ChannelManagementPage(Entity);
	}
	
	@Then("Enter Password Name On Channel Management Page {string}")
	public void Enter_Password_On_ChannelManagementPage(String Password) throws InterruptedException {
		log.info("Enter Password Name On Channel Management Page");
		channelmanagementpage.Enter_Password_On_ChannelManagementPage(Password);
	}
	
	@Then("Select Validate Token Dropdown Option On Channel Management Page {string}")
	public void Select_Validate_Token_Dropdown_Option_On_ChannelManagementPage(String Option) throws InterruptedException {
		log.info("Select Validate Token Dropdown Option On Channel Management Page");
		channelmanagementpage.Select_Validate_Token_Dropdown_Option_On_ChannelManagementPage(Option);
	}
	
	@Then("Enter OU ID On Channel Management Page {string}")
	public void Enter_OU_ID_On_ChannelManagementPage(String OU_ID) throws InterruptedException {
		log.info("Enter OU ID On Channel Management Page");
		channelmanagementpage.Enter_OU_ID_On_ChannelManagementPage(OU_ID);
	}
	
	@Then("Enter BBPS AGENT REF ID On Channel Management Page {string}")
	public void Enter_BBPS_AGENT_REF_ID_On_ChannelManagementPage(String AGENTID) throws InterruptedException {
		log.info("Enter BBPS AGENT REF ID On Channel Management Page");
		channelmanagementpage.Enter_BBPS_AGENT_REF_ID_On_ChannelManagementPage(AGENTID);
	}
	
	@Then("Click on Save On Channel Management Page")
	public void Click_on_Save() throws InterruptedException {
		log.info("Click on Save On Channel Management Page");
		channelmanagementpage.Click_on_Save();
	}
	
	@Then("Verify Channel Created Successfully Message On Channel Management Page")
	public void Verify_Channel_Created_Successfully_Message_On_ChannelManagementPage() throws InterruptedException {
		log.info("Verify Channel Created Successfully Message On Channel Management Page");
		channelmanagementpage.Verify_Channel_Created_Successfully_Message_On_ChannelManagementPage();
	}
	
	@Then("Click On 1st Row From Channel Table On Channel Management Page")
	public void Click_on_1st_Row_From_Channel_Table() throws InterruptedException {
		log.info("Click On 1st Row From Channel Table On Channel Management Page");
		channelmanagementpage.Click_on_1st_Row_From_Channel_Table();
	}
	
	@Then("Verify PaymentRefId Not Available On Channel Management Page")
	public void Verify_PaymentRefId_Not_Available_On_ChannelManagementPage() throws InterruptedException {
		log.info("Verify PaymentRefId Not Available On Channel Management Page");
		channelmanagementpage.Verify_PaymentRefId_Not_Available_On_ChannelManagementPage();
	}

}
