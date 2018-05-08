package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ActionUtilities.ManageDrivers;

public class click {
	
	public static void clickTheButton(String Locator) throws InterruptedException
	{
		
		WebDriver driver= ManageDrivers.GetDriver();
		driver.findElement(By.xpath(Locator)).click();


	}

}
