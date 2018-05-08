package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utill.TestBase;

public class InboxPage extends TestBase{
	
	@FindBy (xpath = ".//*[@id='menu-top']/li/span")
	@CacheLookup
	WebElement userNameLabel;
	
	
	@FindBy(xpath = ".//a[contains(., 'Activity Matrix')]")
	WebElement ActivityMatrixLink;
	
	
	@FindBy(xpath = ".//a[contains(text(),'Inbox')]")
	WebElement InboxLink;
	
	@FindBy(xpath = ".//a[contains(text(),'Search')]")
	WebElement SearchLink;
	
	@FindBy(xpath = ".//*[text()='Vendor']")
	WebElement VendorLink;
	
	@FindBy(xpath = ".//a[contains(text(),'My Profile')]")
	WebElement MyProfileLink;
	
	
	public InboxPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyInboxPageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName(){
		return userNameLabel.isDisplayed();
	}
	
	public boolean verifyInboxLink(){
		return InboxLink.isDisplayed();
	}
	
	public boolean verifyActivityMatrix(){
		return ActivityMatrixLink.isDisplayed();
	}

}
