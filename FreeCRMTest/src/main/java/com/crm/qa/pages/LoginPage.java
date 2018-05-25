package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//PageFactory --OR
	
	@FindBy(name = "username" )
	WebElement username;
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(xpath = ".//input[@value ='Login']")
	WebElement LoginBtn;
	
	@FindBy(xpath = ".//button[contains(text(),'Sign Up')]")
	WebElement SignUpBtn;
	
	@FindBy(xpath = ".//img[contains(@class ,'img-responsive')]")
	WebElement crmLogo;
	
	
	//initiliazation the object
	public  LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	//Actions:
	public String validateLoginpageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMImage()
	{
		return crmLogo.isDisplayed();
	}
	
	public HomePage Login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		LoginBtn.click();
		
		return new HomePage();
	}
	

}
