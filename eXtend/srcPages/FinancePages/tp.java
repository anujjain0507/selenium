package FinancePages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ActionUtilities.ManageDrivers;

public class tp {

	
	

	@Test
	
	public static void CheckTheExecutionModex() throws Exception
	{
		WebDriver driver= ManageDrivers.GetDriver();
		ManageDrivers.OpenUrl("Chrome", "proxima-ln4.e-emphasys.com:8441/webui/servlet/login", "rgajbhiye", "Robin$123");
		//getFinTransAmt.getFinTransAmount("Parts (Sales)", "PS0049227", "20.00", "issue","0.00");
		
		
	}
		  
		
	
	
	
}
