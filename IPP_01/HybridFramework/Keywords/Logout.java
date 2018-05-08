package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Logout {
	static WebDriver driver;
	
	public static void LoginLogoutVerify(String Locator,String TestData1) throws InterruptedException
	{
		driver = ActionUtilities.ManageDrivers.GetDriver();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,-250)", "");
	    
	    driver.findElement(By.xpath(Locator)).click();
	    driver.findElement(By.xpath(TestData1)).click();

//		WebElement menu= driver.findElement(By.xpath(Locator));
//		Actions action = new Actions(driver);
//		action.moveToElement(menu).build().perform();
//		WebDriverWait wait = new WebDriverWait(driver, 5); 
////		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestData1)));
//		WebElement menuOption = driver.findElement(By.xpath(TestData1));
//		menuOption.click();
	}

}
