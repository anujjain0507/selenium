package Keywords;

import org.openqa.selenium.WebDriver;

import ActionUtilities.ManageDrivers;

public class getPageSource {
	
	public static void getPageSource(String TestData1,String TestData2,String TestData3) throws InterruptedException
	{
		WebDriver driver= ManageDrivers.GetDriver();
		driver.getPageSource().contains(TestData1);
		if(true)
		{
		    System.out.println(TestData2);
		} 
		else  
		    System.out.println(TestData3);
		Thread.sleep(5000);
	}

}
