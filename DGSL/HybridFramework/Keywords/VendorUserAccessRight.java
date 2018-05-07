package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ActionUtilities.ManageDrivers;

public class VendorUserAccessRight {
	
	
	public static void ToVerifyVendorScreen(String Locator,String TestData1,String TestData2,String TestData3) throws Exception
	{
		WebDriver driver= ManageDrivers.GetDriver();
		int count = 0;
	    for (int i=1;i<=count;i++) {
	        String a=driver.findElement(By.xpath(Locator)).getText(); 
	        if(a.contains(TestData1))
	        {
	            System.out.println(TestData2);
	        }
	        else
	        {
	            System.out.println(TestData3);
	        }
	}
}
}