package Keywords;

import org.openqa.selenium.WebDriver;

import ActionUtilities.ManageDrivers;

public class Alert {
	
	WebDriver driver;
	public static void alert()
	{
		WebDriver driver= ManageDrivers.GetDriver();
		driver.switchTo().alert().accept();
		System.out.println(driver.switchTo().alert().getText());
		
	}

}
