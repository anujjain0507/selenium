package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, Exception, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\jain.anuj\\\\workspace\\\\FreeCRM\\\\Driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath(".//input[@type='submit']")).click();
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		linkList.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Size of the total link and images--->"+linkList.size());
		
		List<WebElement>ActiveLink = new ArrayList<WebElement>();
		for(int i = 0; i<linkList.size();i++) {
			System.out.println(linkList.get(i).getAttribute("href"));
			if(linkList.get(i).getAttribute("href") != null && (!linkList.get(i).getAttribute("href").contains("javascript"))) {
				ActiveLink.add(linkList.get(i));
			}
		}
		System.out.println("Size of the active link and Images---->" + ActiveLink.size());
		for(int j=0; j<ActiveLink.size();j++) {
			HttpURLConnection connection = (HttpURLConnection)new URL(ActiveLink.get(j).getAttribute("href")).openConnection();
			String response = connection.getResponseMessage();
			int responsecode= connection.getResponseCode();
			connection.disconnect();
			System.out.println(ActiveLink.get(j).getAttribute("href")+"---->"+responsecode+"="+response);
		}
		driver.close();

	}
}
