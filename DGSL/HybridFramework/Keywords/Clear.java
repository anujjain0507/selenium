package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ActionUtilities.ManageDrivers;

public class Clear {
	
	public static void clearTheField(String Locator) throws InterruptedException
	{
		
		WebDriver driver= ManageDrivers.GetDriver();
		driver.findElement(By.xpath(Locator)).clear();
		Thread.sleep(1000);
	}

}
