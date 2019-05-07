package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath = ".//input[@id = 'User_Name']") WebElement UserName;
	
	@FindBy(xpath = ".//input[@id = 'User_Password']") WebElement Userpassword;
	
	@FindBy (xpath = ".//input[@id = 'login']") WebElement SignUp;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle() {
		return driver.getTitle();
	}
	public  InboxPage login(String uname,String pwd) {
		UserName.sendKeys(uname);
		Userpassword.sendKeys(pwd);
		SignUp.click();
		return new InboxPage();
	}

}
