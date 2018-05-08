package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOver {
	
	static WebDriver driver;
	
	public static void MoveToMouse(String Locator,String TestData1) throws InterruptedException
	{
		driver = ActionUtilities.ManageDrivers.GetDriver();
		HomePage.HomePage home = PageFactory.initElements(driver, HomePage.HomePage.class);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,-250)", "");
	    Thread.sleep(1000);
	    
		WebElement menu= driver.findElement(By.xpath(Locator));
		Actions action = new Actions(driver);
		action.moveToElement(menu).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 3); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestData1)));
		WebElement menuOption = driver.findElement(By.xpath(TestData1));
		menuOption.click();
	}

}
