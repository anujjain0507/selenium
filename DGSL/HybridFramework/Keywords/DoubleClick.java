package Keywords;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ActionUtilities.ManageDrivers;

public class DoubleClick {
	
	public static void DoubleClickTheElement(String Locator,String TestData1) throws InterruptedException{
		WebDriver driver = ManageDrivers.GetDriver();
		List<WebElement> TableContains = driver.findElements(By.xpath(Locator));

		for(WebElement element :TableContains)
		{
			Thread.sleep(2000);
        if(element.getText().equals(TestData1))
        {
        	System.out.println(element.getText());
        	Actions builder = new Actions(driver);
        	builder.doubleClick(element).build().perform();
            break;
        }
	}
	}
	
	public static void SelectApprovalUser(String Locator){
		WebDriver driver = ManageDrivers.GetDriver();
		WebElement ApprovalUser = driver.findElement(By.xpath(Locator));
        Actions builder = new Actions(driver);
        builder.doubleClick(ApprovalUser).build().perform();
        }

}
