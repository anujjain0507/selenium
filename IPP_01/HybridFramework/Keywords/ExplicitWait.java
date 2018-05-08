package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ActionUtilities.ManageDrivers;

public class ExplicitWait {
	public static void VerifyToElement(String Locator){
		WebDriver driver = ManageDrivers.GetDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10L);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Locator)));
		
	}

}
