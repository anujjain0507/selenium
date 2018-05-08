package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ActionUtilities.ManageDrivers;

public class ScrollToElement {
	public static void ScrollToFindElement(String Locator){
		WebDriver driver = ManageDrivers.GetDriver();
		WebElement element = driver.findElement(By.xpath(Locator));
		Actions builder = new Actions(driver);
    	builder.moveToElement(element);
	}

}
