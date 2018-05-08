package Keywords;

import org.openqa.selenium.WebDriver;

import ActionUtilities.ManageDrivers;

public class Refresh {
	
	WebDriver driver;
	
	public static void Refresh() throws InterruptedException
	{
		WebDriver driver= ManageDrivers.GetDriver();
		try{   
			Thread.sleep(5000);
			driver.switchTo().alert().dismiss();  
			}catch(Exception e){ 
			   System.out.println("unexpected alert not present");
			   driver.navigate().refresh();
			  }
		Thread.sleep(1000);
	}
}
