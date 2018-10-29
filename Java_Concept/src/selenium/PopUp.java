package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jain.anuj\\workspace\\FreeCRM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath(".//a[contains(text(),'Click Here')]")).click();
		String MainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext())
		{
			String childWindow  = i1.next();
			if(!MainWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				Thread.sleep(5000);
				driver.findElement(By.xpath(".//input[@name='emailid']")).sendKeys("abc@xyz.com");
				driver.findElement(By.xpath(".//input[@name = 'btnLogin']")).click();
				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);

	}

}
