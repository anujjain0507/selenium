package com.test.automation.uiAutomation.homePage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.HomePages;

public class TC_001_VerifyLoginWithInvalidCredentials extends TestBase {
	
	HomePages homepage;
	@BeforeTest
	public void setup(){
		init();
	}
	@Test
	public void verifyLoginWithInvalidCredentials(){
		homepage = new HomePages(driver);
		homepage.LoginToApplication("abc@gmail.com","pass@123");
		Assert.assertEquals(homepage.getInvalidLoginText(), "Authentication failed.");
	}
	@AfterClass
	public void endTest(){
		driver.close();
	}

}
