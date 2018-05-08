package Keywords;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import ActionUtilities.ManageDrivers;

public class Title {
	
	public static void GetPageTitle(String TestData1)
	{
		WebDriver driver = ManageDrivers.GetDriver();
		Assert.assertEquals(TestData1, driver.getTitle());
		System.out.println(driver.getTitle());
	}

}
