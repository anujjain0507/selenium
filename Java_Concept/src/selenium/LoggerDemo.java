package selenium;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoggerDemo {
	
	public static void main(String[] args) {
		Logger logger = Logger.getLogger("LoggerDemo");
		PropertyConfigurator.configure("Log4j.properties");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jain.anuj\\workspace\\FreeCRM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("Driver Intilize");
		driver.get("http://172.1.254.215:81/Meritor/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("Waiting for 10 Second");
		driver.manage().window().maximize();
		logger.info("Window Maximize");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.id("User_Name")).sendKeys("Sysadmin");
		logger.info("Enter User name");
		driver.findElement(By.id("User_Password")).sendKeys("Sysadmin@123");
		logger.info("Enter Password");
		driver.findElement(By.xpath(".//input[@id = 'login']")).click();

	}

}
