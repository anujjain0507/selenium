package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utill.TestBase;

public class LoginPage extends TestBase {
	@FindBy(id = "usernameId")
	WebElement username;
	
	@FindBy(name = "j_password")
	WebElement password;
	
	@FindBy(id = "loginbutton")
	WebElement Login;
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public ReservationPages Login(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		return new ReservationPages();
	}

}
