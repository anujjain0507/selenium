package com.qa.stepDefinations;

import com.qa.pages.VendorManualRegPage;
import com.qa.utill.TestBase;
import com.qa.utill.TestUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RegistrationPageSteps extends TestBase {
	
	VendorManualRegPage vmrg; 
	TestUtil util;
	@Given("^User click on the Vendor Registration Menu$")
	public void user_click_on_the_Vendor_Registration_Menu() {
		vmrg = new VendorManualRegPage();
		vmrg.Vendor_reg_menu();
	}

	@Then("^Click on the add button$")
	public void click_on_the_add_button() throws Throwable {
	   vmrg.vendor_add_menu();
	}

	@Then("^enter the \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and\"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_details(String vendor_name, String vendor_commodity,String vendor_contact, String vendor_emailid, String vendor_phone) {
	   vmrg.Enter_details(vendor_name, vendor_commodity, vendor_contact, vendor_emailid, vendor_phone);
	}

	@Then("^select the \"([^\"]*)\"$")
	public void select_the_activity(String activity)  {
		vmrg.activity_drpdown(activity);
	}
	
	@Then("^submit the record$")
	public void submit_the_record() {
		util = new TestUtil();
		vmrg.submit_button();
		util.refresh_page();
	}
	
	@Then("^close the transaction$")
	public void close_Transaction() {
		vmrg.close_button();
	}
	
	@Then("^Wait for 5 sec$")
	public void wait_for_sec() throws Exception  {
		vmrg.wait_for_element();
	}

	
	@Then("^open the Specific records$")
	public void open_the_Specific_records() {
		vmrg.select_specific_vendor();
	}
	
	@Then("^select the next \"([^\"]*)\">$")
	public void select_the(String activity2)   {
	    vmrg.select_activity2(activity2);
	}
	
	@Then("^submit the transaction$")
	public void submit_the_transaction()  {
		vmrg.submit_button();

	}
	
	@Then("^close transaction$")
	public void close_transaction()  {
		vmrg.close_button();
	}


}
