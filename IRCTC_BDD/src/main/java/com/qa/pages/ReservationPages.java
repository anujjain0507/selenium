package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.utill.TestBase;

public class ReservationPages extends TestBase{
	
	@FindBy(xpath=".//*[@id='jpform:fromStation']")
	WebElement frmStn;
	
	@FindBy(xpath =".//*[@id='jpform:toStation']")
	WebElement toStn;
	
	@FindBy(xpath =".//*[@id='jpform']/table/tbody/tr[5]/td[2]/img")
	WebElement dateicon;
	
	@FindBy(xpath="")
	WebElement datePicker;
	
	@FindBy(xpath="")
	WebElement AllDates;
	
	
	public void datepicker()
	{
		
	}

}
