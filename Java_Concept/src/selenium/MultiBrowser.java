package selenium;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {
	public WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void Inilization(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\jain.anuj\\workspace\\FreeCRM\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
		}
		
		driver.get("http://172.1.254.215:81/Meritor/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}

	@Test
	public void TestCase() throws InterruptedException, Exception {
		driver.findElement(By.name("User_Name")).sendKeys("pruser1");
		driver.findElement(By.name("User_Password")).sendKeys("Sysadmin@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(".//*[@id='toolbar']/span/span/span[2]/span")).click();
//		Thread.sleep(5000);
//		WebElement status = driver.findElement(By.xpath(".//*[@id='selectActivityCode_listbox']"));
//		System.out.println(status.getText());
//		if (status.getText().contains("Indexed-QC Pending")) {
//			WebElement sta = driver
//					.findElement(By.xpath(".//li[@data-offset-index='3' and text()='Indexed-QC Pending']"));
//			Thread.sleep(2000);
//			sta.click();
//		}
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(".//*[@id='viewTransaction']")).click();
	}

	@AfterClass
	public void afterTest() {

		driver.quit();
	}

}
