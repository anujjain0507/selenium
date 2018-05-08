package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ActionUtilities.ManageDrivers;

public class SendNumber {
	public static void SendNumber(String locator,String TestData1)
	{
		WebDriver driver= ManageDrivers.GetDriver();
		driver.findElement(By.xpath(locator)).sendKeys(String.valueOf(TestData1));
	}


}
