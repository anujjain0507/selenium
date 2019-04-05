package selenium;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableChromeNotification {

		
	public static void DisableDevModeExtenChrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jain.anuj\\workspace\\FreeCRM\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("---disable-extension");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://172.1.254.215:81/Meritor/");
		driver.findElement(By.id("User_Name")).sendKeys("Sysadmin");
		driver.findElement(By.id("User_Password")).sendKeys("Sysadmin@123");
		driver.findElement(By.xpath(".//input[@id = 'login']")).click();
		driver.close();
	}
	public static void ChromeNotification() {
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions option = new ChromeOptions();
		
		option.setExperimentalOption("prefs", prefs);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jain.anuj\\workspace\\FreeCRM\\Driver\\chromedriver.exe");
		Logger log = Logger.getLogger(DisableChromeNotification.class);
		log.info("Driver initiated");
		WebDriver driver = new ChromeDriver(option);
		driver.get("http://172.1.254.215:81/Meritor/");
		driver.findElement(By.id("User_Name")).sendKeys("Sysadmin");
		driver.findElement(By.id("User_Password")).sendKeys("Sysadmin@123");
		driver.findElement(By.xpath(".//input[@id = 'login']")).click();
		driver.close();
//		driver.findElement(By.xpath(".//*[@class='k-link' and contains(. , 'Inbox')]")).click();
	}

	public static void main(String[] args) {

		ChromeNotification();
		DisableDevModeExtenChrome();
	}

}
