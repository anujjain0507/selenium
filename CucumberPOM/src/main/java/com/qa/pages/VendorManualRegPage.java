package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utill.TestBase;

public class VendorManualRegPage extends TestBase {

	@FindBy (xpath= ".//*[text()='Vendor Registration']")
	WebElement vendor_regi_menu;
	
	@FindBy(id ="AddTrnasaction")
	WebElement add;
	
	@FindBy(id = "FileSaveVendor_Name")
	WebElement vendor_name;
	
	@FindBy(id = "FileSaveVendor_Commodity")
	WebElement vendor_commodity;
	
	@FindBy(id = "FileSaveVendor_Contact_Person")
	WebElement contact_person;
	
	@FindBy(id = "FileSaveVendor_Email_ID")
	WebElement email_id;
	
	@FindBy (id = "FileSaveVendor_Phone_No")
	WebElement phone_no;
	
	@FindBy(xpath =".//*[@id='Activity_Code']/preceding :: span[4]")
	WebElement activity_button;
	
	@FindBy(xpath = ".//*[@id='Activity_Code-list']//li")
	List<WebElement> select_activity;
	
	@FindBy(id ="Update2" )
	WebElement submit;
	
	@FindBy (id = "RedirectonClose2")
	WebElement close;
	
	@FindBy(xpath = ".//*[@id='grid']/div[3]/table/tbody/tr/td[5]")
	List<WebElement> specific_vendor;
	
	@FindBy(id = "viewTransaction")
	WebElement view_Transaction;
	
	@FindBy(xpath = ".//*[@id='Activity_Code_listbox']/li")
	List<WebElement> select_activity3;

	
	public VendorManualRegPage() {
		PageFactory.initElements(driver, this);
	}
	public void Vendor_reg_menu()
	{
		vendor_regi_menu.click();
	}
	
	public void vendor_add_menu()
	{
		add.click();
	}
	public void Enter_details(String vname,String vcomm, String vcontact,String emailid,String phone)
	{
		vendor_name.sendKeys(vname);
		vendor_commodity.sendKeys(vcomm);
		contact_person.sendKeys(vcontact);
		email_id.sendKeys(emailid);
		phone_no.sendKeys(phone);
	}
	
	public void activity_drpdown(String act) {
		activity_button.click();
		for (WebElement contains : select_activity) {
			if (contains.getText().equals(act)) {
				contains.click();
			}
		}
	}
	
	public void submit_button() {
		submit.click();
	}
	
	public void close_button() {
		close.click();
	}
	
	public void select_specific_vendor() {
		for (WebElement select_vendor : specific_vendor) {
			if (select_vendor.getText().equals("pooja.patil@datamatics.com")) {
				System.out.println(select_vendor.getText());
				select_vendor.click();
				view_Transaction.click();
				activity_button.click();
			}
		}
	}
	
	public void select_activity2(String act) {
		activity_button.click();
		for (WebElement contains : select_activity3) {
			if (contains.getText().equals(act)) {
				System.out.println(contains);
				contains.click();
			}
		}
		submit.click();
		close.click();
	}
	public void wait_for_element() throws Exception {
		Thread.sleep(5000);
	}
	
	
	

}
