package Keywords;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import ActionUtilities.ManageDrivers;

public class PageDownAndUp {
	
	public static void PageDown()
	{
		WebDriver driver = ManageDrivers.GetDriver();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,500)", "");
	}
	
	public static void PageUp()
	{
		WebDriver driver = ManageDrivers.GetDriver();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,-500)", "");
	}

}
