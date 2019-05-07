package com.qa.stepDefinations;

import org.junit.Assert;

import com.qa.pages.InboxPage;
import com.qa.pages.LoginPage;
import com.qa.utility.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStep extends TestBase {
	LoginPage loginpage;
	InboxPage inboxpage;
	
	@When("^User open the browser and enter the URL$")
	public void user_open_the_browser_and_enter_the_URL() { 
	    TestBase.initialization();
	}

	@Then("^Enter the user name and Password$")
	public void enter_the_user_name_and_Password() {
		loginpage = new LoginPage();
		inboxpage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}


	@Then("^Verify the Home page Title$")
	public void verify_the_Home_page_Title(){
		String title = loginpage.validateTitle();
		Assert.assertEquals("IPM", title);
		System.out.println(title);
	}

//	@Then("^Signout from the application and close the browser$")
//	public void signout_from_the_application_and_close_the_browser() throws Throwable {
//	    throw new PendingException();
//	}


}
