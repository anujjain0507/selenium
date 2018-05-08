package Keywords;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ActionUtilities.ManageDrivers;

public class CategorySelection {
	WebDriver driver;
	public static void  CategorySelection(String Locator,String TestData1) throws InterruptedException
	{

		WebDriver driver= ManageDrivers.GetDriver();
		List<WebElement> inbox = driver.findElements(By.xpath(Locator));
		for (WebElement options: inbox )
	    	 
	     {
	    	 System.out.println(options.getText());
	    	 if (options.getText().equals(TestData1)) {
	    		 Thread.sleep(50000);
	    		 System.out.println(options.getText());
	    		 options.isEnabled();
	    		 
	    		 	 }
	     }
	
	}

}
