package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	static WebDriver driver;
	

	
	public static void DropdownValueSelection(String Locator, String TestData1) throws InterruptedException
	{
		driver = ActionUtilities.ManageDrivers.GetDriver();
		Thread.sleep(2000);
		
		String value ="";
	    value=	value+TestData1.charAt(0);
		System.out.println("Testdata:  "+TestData1+"value  "+value);
		
		WebElement que_dropdown = driver.findElement(By.xpath(Locator));
		Select question = new Select(que_dropdown);
		question.selectByValue(value);

	}

}
