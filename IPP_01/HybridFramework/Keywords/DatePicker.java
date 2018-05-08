package Keywords;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ActionUtilities.ManageDrivers;

public class DatePicker {
	
	public static void SelectDate(String Locator,String TestData1,String TestData2)
	{
	WebDriver driver = ManageDrivers.GetDriver();
	driver.findElement(By.xpath(Locator)).click();
	List<WebElement> allDates=driver.findElements(By.xpath(TestData1));
	for(WebElement ele:allDates)
	{
		
		String date=ele.getText();
		if(date.equalsIgnoreCase("24"))
		{
			ele.click();
			break;
		}
		
	}
}

}
