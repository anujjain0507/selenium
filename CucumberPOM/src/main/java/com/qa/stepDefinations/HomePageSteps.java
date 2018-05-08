package com.qa.stepDefinations;

import junit.framework.Assert;



import com.qa.pages.InboxPage;
import com.qa.pages.LoginPage;
import com.qa.utill.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase {
	
	LoginPage loginpage;
	InboxPage inboxpage;

	
	
	@Given("^user open the browser$")
	public void user_open_the_browser()  {
		TestBase.initialization();
	    
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() {
		loginpage = new LoginPage();
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals("IPM", title);

	}

	@Then("^user log into app$")
	public void user_log_into_app()  {
		inboxpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));	
	}
	
	
	@Then ("^validate logged in user name$")
	public void validate_logged_in_user_name(){
		boolean flag = inboxpage.verifyCorrectUserName();
		Assert.assertTrue(flag);
	}
	
	@Then("^verify the activity matrix link$")
	public void verify_the_activity_matrix_link() throws Throwable {
	    boolean flagA = inboxpage.verifyActivityMatrix();
	    Assert.assertTrue(flagA);
	}

	@Then("^verify the inbox link$")
	public void verify_the_inbox_link() throws Throwable {
		boolean flagB = inboxpage.verifyInboxLink();
	    Assert.assertTrue(flagB);
	}

	@Then("^verify the search link$")
	public void verify_the_search_link() throws Throwable {
	   
	}

	@Then("^verify the vendor tab$")
	public void verify_the_vendor_tab() throws Throwable {
	  
	}

	@Then("^verify the my profile tab$")
	public void verify_the_my_profile_tab() throws Throwable {
	    
	}

}
