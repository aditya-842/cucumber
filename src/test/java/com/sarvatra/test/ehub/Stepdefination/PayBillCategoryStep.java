package com.sarvatra.test.ehub.Stepdefination;

import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;
import com.qa.util.CommonFunctions;
import com.qa.util.DriverFactory;
import com.sarvatra.test.ehub.pageobjects.MobilePrepaidPageObject;
import com.sarvatra.test.ehub.pageobjects.PayBillCategoryPageObject;

import io.cucumber.java.en.Then;

public class PayBillCategoryStep {

	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	public PayBillCategoryPageObject payBillCategory = new PayBillCategoryPageObject(DriverFactory.driver);
	public SoftAssert sa = new SoftAssert();
	public MobilePrepaidPageObject mobileprepaid = new MobilePrepaidPageObject(DriverFactory.driver);

	Logger log = (Logger) LogManager.getLogger("PayBillCategory.java");

	/*
	 * ####################- Owner --> Prachi Kante -###########################
	 * 
	 */

	@Then("Verify agent user Pay Bill category")
	public void verifyPayBillCategory() {
		Set<String> hash_Set = new HashSet<String>();
		Set<String> category_Set = new HashSet<String>();
		log.info("Verify agent user Pay Bill category");
		hash_Set.addAll(payBillCategory.verifyPayBillCategory());
		mobileprepaid.scrollRight();
		hash_Set.addAll(payBillCategory.verifyPayBillCategory());
		mobileprepaid.scrollRight();
		hash_Set.addAll(payBillCategory.verifyPayBillCategory());
		if (hash_Set.contains(" "))
			hash_Set.remove(" ");
		System.out.println(hash_Set);

		category_Set.add("Water");
		category_Set.add("Clubs & Associations");
		category_Set.add("Fastag");
		category_Set.add("Mobile Prepaid");
		category_Set.add("Cable TV");
		category_Set.add("Municipal Services");
		category_Set.add("Housing Society");
		category_Set.add("LPG Gas");
		category_Set.add("Municipal Taxes");
		category_Set.add("Loan Repayment");
		category_Set.add("Subscription Fees");
		category_Set.add("Credit Card");
		category_Set.add("Broadband Postpaid");
		category_Set.add("Education Fees");
		category_Set.add("Electricity");
		category_Set.add("Insurance");
		category_Set.add("Gas");
		category_Set.add("DTH");
		category_Set.add("Hospital");
		category_Set.add("Mobile Postpaid");
		category_Set.add("Landline Postpaid");
		System.out.println("category set");
		System.out.println(category_Set);

		System.out.println(hash_Set.containsAll(category_Set));

	}

	@Then("Select category {string}")
	public void selectcategory(String Category) throws InterruptedException {
		log.info("Select category");
		payBillCategory.Select_Category(Category);
	}

	@Then("Enter Distributor ID {string}")
	public void enter_Distributor_ID(String Distributor_ID) {
		log.info("Enter Distributor ID");
		payBillCategory.enter_Distributor_ID(Distributor_ID);
	}

	@Then("Enter Unique Consumer ID {string}")
	public void enter_Unique_Consumer_ID(String Unique_Consumer_ID) {
		log.info("Enter Distributor ID");
		payBillCategory.enter_Unique_Consumer_ID(Unique_Consumer_ID);
	}

	@Then("Enter a Consumer Number {string}")
	public void enterConsumerNumber(String ConsumerNumber) {
		log.info("Enter a Consumer Number ");
		payBillCategory.enter_ConsumerNumber(ConsumerNumber);
	}

	@Then("Enter Amount {string}")
	public void enter_EnterAmount(String Enter_Amount) {
		log.info("Enter Amount");
		payBillCategory.enter_EnterAmount(Enter_Amount);
	}

	@Then("Please Select state from dropdown list {string}")
	public void select_State_from_Dropdown(String DropdownOption) throws InterruptedException {
		log.info("Please Select state from dropdown list");
		payBillCategory.select_State_from_Dropdown(DropdownOption);
	}

	@Then("Enter Flat Number {string}")
	public void enter_Flat_Number(String FlatNumber) {
		log.info("Enter Flat Number");
		payBillCategory.enter_Flat_Number(FlatNumber);
	}

	@Then("Verify View Extra details Disabled")
	public void verify_TextViewExtraDetails_Disabled() {
		log.info("Verify View Extra details Disabled");
		Assert.assertTrue(payBillCategory.verify_TextViewExtraDetails_Disabled());
	}

	@Then("verify Key Value Pair On Confirm Payment {string} {string}")
	public void verify_Key_Value_Pair_On_Confirm_Payment(String Key, String Value) throws InterruptedException {
		log.info("verify Key Value Pair On Confirm Payment");
		Assert.assertTrue(payBillCategory.verify_Key_Value_Pair_On_Confirm_Payment(Key, Value));
	}

	@Then("Enter Customer Reference Field1 {string}")
	public void enter_Customer_Reference_Field1(String Field1) {
		log.info("Enter Customer Reference Field1");
		payBillCategory.enter_Customer_Reference_Field1(Field1);
	}

	@Then("Enter Customer Reference Field2 {string}")
	public void enter_Customer_Reference_Field2(String Field2) {
		log.info("Enter Customer Reference Field2");
		payBillCategory.enter_Customer_Reference_Field2(Field2);
	}

	@Then("Select Education Fees Icon")
	public void select_education_fees_icon() {
		log.info("Select Education Fees Icon");
		Assert.assertTrue(payBillCategory.clickOnEducationFeesIcon(), "Education Fees");
	}

	@Then("Enter The State {string}")
	public void enter_the_state(String state) {
		log.info("Enter The State " + state);
		Assert.assertTrue(payBillCategory.clickOnStateField(state), "Education Fees");
	}

	@Then("Enter The City {string}")
	public void enter_the_city(String city) {
		log.info("Enter The City " + city);
		Assert.assertTrue(payBillCategory.clickOnCityField(city), "Education Fees");
	}

	@Then("Click On Submit Button")
	public void click_on_submit_button() {
		log.info("Click On Submit Button");
		Assert.assertTrue(payBillCategory.clickOnSubmitButton(), "Education Fees");
	}

	@Then("Select Payment Mode as {string}")
	public void select_payment_mode_as(String paymentMode) {
		log.info("Select Payment Mode as " + paymentMode);
		Assert.assertTrue(payBillCategory.selectPaymentMode(paymentMode), "Education Fees");
	}

	@Then("Enter Education Fees Payments {string} - EDU010027MAH01")
	public void enter_education_fees_payments(String educationFeesPayment) {
		log.info("Enter Education Fees Payments " + educationFeesPayment);
		Assert.assertTrue(payBillCategory.clickOnEducationFeesPayment(educationFeesPayment), "Education Fees");
	}

	@Then("Enter Student Unique ID {string}")
	public void enter_student_unique_id(String studentUniqueID) {
		log.info("Enter Student Unique ID " + studentUniqueID);
		Assert.assertTrue(payBillCategory.enterUniqueStudentID(studentUniqueID), "Education Fees");
	}

	@Then("Enter Mobile Number Of Parent {string}")
	public void enter_mobile_number_of_parent(String mobileNumberOfParent) {
		log.info("Enter Mobile Number Of Parent " + mobileNumberOfParent);
		Assert.assertTrue(payBillCategory.enterMobileNumberOfParent(mobileNumberOfParent), "Education Fees");
	}

	@Then("Enter DOB of Student {string}")
	public void enter_dob_of_student(String dobOfStudent) {
		log.info("Enter DOB of Student " + dobOfStudent);
		Assert.assertTrue(payBillCategory.enterDOBOfStudent(dobOfStudent), "Education Fees");
	}

	@Then("Enter Payment Mode")
	public void enter_payment_mode() {

	}

	@Then("Enter Payer Mobile No {string}")
	public void enter_payer_mobile_no(String payerMobileNo) {
		log.info("Enter Payer Mobile No " + payerMobileNo);
		Assert.assertTrue(payBillCategory.enterPayerMobile(payerMobileNo), "Education Fees");
	}

	@Then("Enter Payer Email {string} for the education fees")
	public void enter_payer_email(String payerEmail) {
		log.info("Enter Payer Email " + payerEmail + " for the education fees");
		Assert.assertTrue(payBillCategory.enterPayerEmail(payerEmail), "Education Fees");
	}

	@Then("Click on Fetch Bill Button to verify details")
	public void click_on_fetch_bill_button_to_verify_details() {
		log.info("Click on Fetch Bill Button to verify details ");
		Assert.assertTrue(payBillCategory.clickOnFetchBill(), "Education Fees");
	}

	@Then("Enter Receipt Number {string}")
	public void enter_receipt_number(String receiptNumber) {
		log.info("Enter Receipt Number :" + receiptNumber);
		Assert.assertTrue(payBillCategory.enterReceiptNumber(receiptNumber), "Education Fees");
	}

	@Then("Click on Confirm Button for the education fees")
	public void click_on_confirm_button() {
		log.info("Click on Confirm Button : ");
		Assert.assertTrue(payBillCategory.clickOnConfirmButton(), "Education Fees");
	}
	
	@Then("Verify Biller Dropdown On PayBill Page")
	public void verify_Biller_Dropdown() {
		log.info("Verify Biller Dropdown On PayBill Page");
		Assert.assertTrue(payBillCategory.verify_Biller_Dropdown());
	}
	
	@Then("select Biller From Dropdown {string}")
	public void select_Biller_From_Dropdown(String biller) throws InterruptedException {
		log.info("select Biller From Dropdown");
		payBillCategory.select_Biller_From_Dropdown(biller);
	}
	
	@Then("Verify Biller Available In Dropdown {string}")
	public void verify_Biller_Available_In_Dropdown(String biller) throws InterruptedException {
		log.info("Verify Biller Available In Dropdown");
		payBillCategory.verify_Biller_Available_In_Dropdown(biller);
	}
	
	@Then("Enter value of a {string}")
	public void enter_Value_Of_a(String Value) {
		log.info("Enter value of a");
		payBillCategory.enter_Value_Of_a(Value);
	}
	
	@Then("Enter value of ab {string}")
	public void enter_Value_Of_ab(String Value) {
		log.info("Enter value of ab");
		payBillCategory.enter_Value_Of_ab(Value);
	}
	
	@Then("Enter value of abc {string}")
	public void enter_Value_Of_abc(String Value) {
		log.info("Enter value of abc");
		payBillCategory.enter_Value_Of_abc(Value);
	}
	
	@Then("Enter value of abcd {string}")
	public void enter_Value_Of_abcd(String Value) {
		log.info("Enter value of abcd");
		payBillCategory.enter_Value_Of_abcd(Value);
	}
	
	@Then("Enter value of abcde {string}")
	public void enter_Value_Of_abcde(String Value) {
		log.info("Enter value of abcde");
		payBillCategory.enter_Value_Of_abcde(Value);
	}
	
	@Then("Verify Payer Mobile Number Field On PayBill Page")
	public void verify_Payer_Mobile_Number_Field() throws InterruptedException {
		log.info("Verify Payer Mobile Number Field On PayBill Page");
		Assert.assertTrue(payBillCategory.verify_Payer_Mobile_Number_Field());
	}
	
	@Then("Verify Payer Email Field On PayBill Page")
	public void verify_Payer_Email_Field() throws InterruptedException {
		log.info("Verify Payer Email Field On PayBill Page");
		Assert.assertTrue(payBillCategory.verify_Payer_Email_Field());
	}
	
	@Then("Verify Payment Mode Field On PayBill Page {string}")
	public void verify_Payment_Mode_Field(String PaymentMode) throws InterruptedException {
		log.info("Verify Payment Mode Field On PayBill Page");
		Assert.assertTrue(payBillCategory.verify_Payment_Mode_Field(PaymentMode));
	}
	
	@Then("Select Payment Mode Field On PayBill Page {string}")
	public void select_Payment_Mode_Field(String PaymentMode) throws InterruptedException {
		log.info("Select Payment Mode Field On PayBill Page");
		payBillCategory.select_Payment_Mode_Field(PaymentMode);
	}
	
	@Then("Click On Payment Mode Field On PayBill Page")
	public void click_On_Payment_Mode_Field() throws InterruptedException {
		log.info("Select Payment Mode Field On PayBill Page");
		payBillCategory.click_On_Payment_Mode_Field();
	}
	
	@Then("Verify Fetch bill Button On PayBill Page")
	public void verify_Fetch_bill_Button() throws InterruptedException {
		log.info("Verify Fetch bill Button On PayBill Page");
		Assert.assertTrue(payBillCategory.verify_Fetch_bill_Button());
	}
	
	@Then("Verify Registered Mobile Number On PayBill Page")
	public void verify_Registered_Mobile_Number_Field() throws InterruptedException {
		log.info("Verify Registered Mobile Number On PayBill Page");
		Assert.assertTrue(payBillCategory.verify_Registered_Mobile_Number_Field());
	}
	
	@Then("Verify UHID On PayBill Page")
	public void verify_UHID_Field() throws InterruptedException {
		log.info("Verify UHID On PayBill Page");
		Assert.assertTrue(payBillCategory.verify_UHID_Field());
	}
	
	@Then("enter UHID On PayBill Page {string}")
	public void enter_UHID_Field(String UHID) throws InterruptedException {
		log.info("enter UHID On PayBill Page");
		payBillCategory.enter_UHID_Field(UHID);
	}
	
	@Then("enter Registered Mobile Number On PayBill Page {string}")
	public void enter_Registered_Mobile_Number_Field(String Mobile_Number) throws InterruptedException {
		log.info("enter Registered Mobile Number On PayBill Page");
		payBillCategory.enter_Registered_Mobile_Number_Field(Mobile_Number);
	}
	
	@Then("enter Payer Mobile Number On PayBill Page {string}")
	public void enter_Payer_Mobile_Number_Field(String Mobile_Number) throws InterruptedException {
		log.info("enter Payer Mobile Number On PayBill Page");
		payBillCategory.enter_Payer_Mobile_Number_Field(Mobile_Number);
	}
	
	@Then("enter Payer Email On PayBill Page {string}")
	public void enter_Payer_Email_Field(String Email) throws InterruptedException {
		log.info("enter Payer Email On PayBill Page");
		payBillCategory.enter_Payer_Email_Field(Email);
	}
	
	@Then("Verify Error Msg On PayBill Page {string}")
	public void verify_Error_Msg_On_PayBill_Page(String Error_Msg) throws InterruptedException {
		log.info("Verify Error Msg On PayBill Page");
		Assert.assertTrue(payBillCategory.verify_Error_Msg_On_PayBill_Page(Error_Msg));
	}
	
	@Then("Verify Registered Mobile Number Not More Then 10 Digit On PayBill Page {string}")
	public void verify_Registered_Mobile_Number_Field(String Number) throws InterruptedException {
		log.info("Verify Registered Mobile Number On PayBill Page");
		String Number_From_Field = payBillCategory.get_Registered_Mobile_Number_Field();
		Assert.assertNotEquals(Number,Number_From_Field);
	}
	
	@Then("Verify Payer Mobile Number Not More Then 10 Digit On PayBill Page {string}")
	public void verify_Payer_Mobile_Number_Field(String Number) throws InterruptedException {
		log.info("Verify Payer Mobile Number On PayBill Page");
		String Number_From_Field = payBillCategory.get_Payer_Mobile_Number_Field();
		Assert.assertNotEquals(Number,Number_From_Field);
	}
	
	@Then("Verify UHID Not More Then 20 Digit On PayBill Page {string}")
	public void get_UHID_Field(String UHID) throws InterruptedException {
		log.info("Verify Payer Mobile Number On PayBill Page");
		String Number_From_Field = payBillCategory.get_UHID_Field();
		Assert.assertNotEquals(UHID,Number_From_Field);
	}
	
	@Then("Verify Vehicle Registration Number Wallet Number custom param field displayed")
	public void vehicle_Registration_Number_Wallet_NumberFieldDisplayed() throws InterruptedException {
		log.info("Verify UHID custom param field displayed");
		payBillCategory.verify_Vehicle_Registration_Number_Wallet_Number_Field_displayed();
	}

	@Then("Verify Amount custom param field displayed")
	public void AmountFieldDisplayed() throws InterruptedException {
		log.info("Verify mobile number custom param field displayed");
		payBillCategory.verify_amount_Field_displayed();
	}
	
	@Then("Enter a Tenement No {string}")
	public void enter_tenementNo(String tenement_no) throws InterruptedException {
		log.info("Enter a Tenement No ");
		payBillCategory.enter_tenementNO(tenement_no);
	}
	
	@Then("enter UHID Number On PayBill Page {string}")
	public void enter_UHID_Number_Field(String UHID) throws InterruptedException {
		log.info("enter Registered Mobile Number On PayBill Page");
		payBillCategory.enter_UHID_Number_Field(UHID);
	}
	
	@Then("Verify Category Available On PayBill Page {string}")
	public void verify_Category_Available(String Category) throws InterruptedException {
		log.info("Verify Category Available On PayBill Page");
		Assert.assertTrue(payBillCategory.verify_Category_Available(Category));
	}
	
	@Then("Enter {string} field value {string}")
	public void enterFirstFieldInput(String fieldNo,String value) {
		log.info("Enter input");
		payBillCategory.enterFieldInput(fieldNo,value);
	}
	
	@Then("Enter Vehicle Registration Number On PayBill Page {string}")
	public void enter_Vehicle_Registration_Number(String Vehicle_Registration_no) throws InterruptedException {
		log.info("Enter Vehicle Registration Number On PayBill Page");
		payBillCategory.enter_Vehicle_Registration_Number(Vehicle_Registration_no);
	}
	
	@Then("Enter Amount In TextField On PayBill Page {string}")
	public void enter_Amount_In_TextField(String Amount) throws InterruptedException {
		log.info("Enter Amount In TextField On PayBill Page");
		payBillCategory.enter_Amount_In_TextField(Amount);
	}
	
	@Then("Enter In_First_TextField On PayBill Page {string}")
	public void enter_In_First_TextField(String value) throws InterruptedException {
		log.info("Enter In_First_TextField On PayBill Page");
		payBillCategory.enter_In_First_TextField(value);
	}
	
	@Then("Enter In_Second_TextField On PayBill Page {string}")
	public void enter_In_Second_TextField(String value) throws InterruptedException {
		log.info("Enter In_Second_TextField On PayBill Page");
		payBillCategory.enter_In_Second_TextField(value);
	}
	
	@Then("Enter In_Third_TextField On PayBill Page {string}")
	public void enter_In_Third_TextField(String value) throws InterruptedException {
		log.info("Enter In_Third_TextField On PayBill Page");
		payBillCategory.enter_In_Third_TextField(value);
	}
	
	@Then("Enter In_Fourth_TextField On PayBill Page {string}")
	public void enter_In_Fourth_TextField(String value) throws InterruptedException {
		log.info("Enter In_Fourth_TextField On PayBill Page");
		payBillCategory.enter_In_Fourth_TextField(value);
	}
	
	@Then("Enter In_Fifth_TextField On PayBill Page {string}")
	public void enter_In_Fifth_TextField(String value) throws InterruptedException {
		log.info("Enter In_Fifth_TextField On PayBill Page");
		payBillCategory.enter_In_Fifth_TextField(value);
	}
	
	@Then("Enter Amount on 3rd InputField {string}")
	public void Enter_EnterAmount(String Enter_Amount) {
		log.info("Enter Amount");
		payBillCategory.Enter_EnterAmount(Enter_Amount);
	}
	
	@Then("Enter UHID {string}")
	public void Enter_UHID(String UHID) {
		log.info("Enter UHID");
		payBillCategory.Enter_UHID(UHID);
	}
	
	@Then("Enter Biller On PayBill Page {string}")
	public void enter_Biller_On_PayBill_Page(String Biller) throws InterruptedException {
		log.info("Enter Biller On PayBill Page");
		payBillCategory.enter_Biller_On_PayBill_Page(Biller);
	}
	
	@Then("Verify Biller Not Available In Dropdown On PayBill Page {string}")
	public void verify_Biller_Not_Available_In_Dropdown_On_PayBill_Page(String Biller) throws InterruptedException {
		log.info("Verify Biller Not Available In Dropdown On PayBill Page");
		Assert.assertTrue(payBillCategory.verify_Biller_Not_Available_In_Dropdown_On_PayBill_Page(Biller));
	}
	
	@Then("Verify Error Message On PayBill Page {string}")
	public void verify_Error_Message_On_PayBill_Page(String Error_Msg) throws InterruptedException {
		log.info("Verify Error Message On PayBill Page");
		Assert.assertTrue(payBillCategory.verify_Error_Message_On_PayBill_Page(Error_Msg));
	}
}
