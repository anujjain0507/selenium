package com.test.henniges.henniges.login;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.henniges.henniges.testBase.TestBase;
import com.test.henniges.henniges.uiActions.HomePages;


public class TC_001_VerifyLoginWithValidCredentials extends TestBase {
	
	HomePages homepage;
	@BeforeTest
	public void setup(){
		init();
	}
	@Test
	public void verifyLoginWithInvalidCredentials(){
		homepage = new HomePages(driver);
		homepage.LoginToApplication("anujj","Sysadmin@123");
//		Assert.assertEquals(homepage.getInvalidLoginText(), "Invalid Username or Password!!");
	}
//	@AfterClass
//	public void endTest(){
//		driver.close();
//	}

}
