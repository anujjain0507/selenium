package com.test.henniges.henniges.uiActions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePages {
		
		WebDriver driver;
		
		@FindBy(id="User_Name") 
		WebElement Login;
		
		
		@FindBy(id="User_Password") 
		WebElement Password;
		
		@FindBy(id="login") 
		WebElement Submit;
		
		@FindBy(xpath=".//*[@id='project']/div/ul/li[1]/div[2]/span/span[1]/span[2]") 
		WebElement Project;
		
		@FindBy(xpath="(.//*[text()='Henniges-New Havens'])[2]") 
		WebElement projSelection;
		
		@FindBy (xpath = ".//*[@id='signin-box']/div/div[2]/div[2]")
		WebElement Authenticationfailed;
		
		@FindBy (id = "btnSubmit")
		WebElement btnSubmit;
		
		@FindBy (linkText = "Inbox")
		WebElement inbox;
		
		@FindBy(xpath=".//table[@class='k-selectable']/tbody/tr/td")
		List<WebElement> rows;
		
		@FindBy (id ="viewTransaction")
		WebElement tran;
		
		public HomePages(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void LoginToApplication(String email,String pass){
			Login.sendKeys(email);
			Password.sendKeys(pass);
			Submit.click();
			Project.click();
			projSelection.click();
			btnSubmit.click();
			inbox.click();
			tran.click();
		}
		
		public String getInvalidLoginText(){
			return Authenticationfailed.getText();
		}
		
		public void getInvoiceList() throws Exception{
			 for(int i=0;i<rows.size();i++){
		    	    String inv = rows.get(i).getText();
		    	    System.out.println(inv);
		     Thread.sleep(1000);
		     if(inv.contains("1000000131")){
		         rows.get(i).click();   
		     }   
		    }
		}

}
