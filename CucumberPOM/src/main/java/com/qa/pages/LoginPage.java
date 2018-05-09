package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy (xpath=".//*[@id='User_Name']")
	WebElement username;
	
	
	@FindBy (xpath=".//*[@id='User_Password']")
	WebElement password;
	
	@FindBy (xpath=".//*[@id='login']")
	WebElement submit;
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public  InboxPage login (String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		submit.click();
		return new InboxPage();
	}
	

}
