package selenium;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyElementPresent {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jain.anuj\\workspace\\FreeCRM\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		long start = System.currentTimeMillis();
		driver.get("http://172.1.254.215:81/Meritor/");
		long finish = System.currentTimeMillis();
		long total = finish-start;
		System.out.println("Total time taken is: " +total);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Dimension d = new Dimension(300, 1080);
//		driver.manage().window().setSize(d);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	
	@Test(enabled=false)
	public void VerifyElementonLoginPage() {
		driver.findElement(By.id("User_Name")).sendKeys("Anujj");
		driver.findElement(By.id("User_Password")).sendKeys("Sysadmin@123");
		WebElement element = driver.findElement(By.xpath(".//input[@id = 'login']"));
		if(element.isDisplayed()) {
			System.out.println("Element is present in Webpage");
			element.click();
		}else {
			System.out.println("Element is not present in WebPage");
		}
	}
	@Test(priority=1)
	public void FetchAllDataFromDropdown() throws Exception {
//		 driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+ "t");
		driver.findElement(By.id("User_Name")).sendKeys("Sysadmin");
//		 JavascriptExecutor jse = (JavascriptExecutor)driver;
//		 jse.executeScript("arguments[0].value='anujj';", wb);
		driver.findElement(By.id("User_Password")).sendKeys("Sysadmin@123");
		driver.findElement(By.xpath(".//input[@id = 'login']")).click();
		System.out.println("Eaith for 10 Sec");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@class='k-link' and contains(. , 'Inbox')]")).click();
		System.out.println("Elememnt Found");
//		driver.navigate().forward();
//		System.out.println("Page navigate to forword");
//		driver.navigate().back();
//		System.out.println("Page navigate to Backword");
		TakesScreenshot screenshot = (TakesScreenshot)driver;//Convert web driver object to TakeScreenshot
		File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);//Call getScreenshotAs method to create image file
		File destfile = new File("D:\\anuj data\\error.png");//Move image file to new destination
		FileUtils.copyFile(sourcefile, destfile);//Copy file at destination
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath(".//i[@class='fa fa-desktop']"));
		action.moveToElement(ele).perform();
		Thread.sleep(5000);
		System.out.println("Mouse over is perform");
//		WebElement element = driver.findElement(By.xpath(".//*[@id='selectActivityCode']"));
//		Select sel = new Select(element);
//		List<WebElement> dropdown = sel.getOptions();
//		for(int i = 0;i< dropdown.size();i++) {
//			String value = dropdown.get(i).getText();
//			System.out.println(value);
//		}
		

	}
	@AfterMethod
	public void TearDown() {
		driver.close();
	}

}
