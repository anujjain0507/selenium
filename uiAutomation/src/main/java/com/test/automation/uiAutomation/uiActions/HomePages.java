package com.test.automation.uiAutomation.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePages {
	
	WebDriver driver;
	
	@FindBy(id="User_Name") 
	WebElement Login;
	
	
	@FindBy(id="User_Password") 
	WebElement Email;
	
	@FindBy(id="passwd") 
	WebElement Password;
	
	@FindBy(id="SubmitLogin") 
	WebElement Submit;
	
	@FindBy (xpath = ".//*[@id='center_column']/div[1]/ol/li")
	WebElement Authenticationfailed;
	
	public HomePages(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void LoginToApplication(String email,String pass){
		Login.click();
		Email.sendKeys(email);
		Password.sendKeys(pass);
		Submit.click();
	}
	
	public String getInvalidLoginText(){
		return Authenticationfailed.getText();
	}
}
