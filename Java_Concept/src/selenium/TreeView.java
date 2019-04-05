package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TreeView {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\jain.anuj\\\\workspace\\\\FreeCRM\\\\Driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/jain.anuj/Downloads/HelpManual/HelpManual/TruBI%20User%20Manual.html");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//i[@class='fa fa fa-caret-down']")).click();

	}

}
