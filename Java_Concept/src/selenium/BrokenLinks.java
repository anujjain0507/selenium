package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	static WebDriver driver;
	
	public static void main(String [] args) throws MalformedURLException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jain.anuj\\workspace\\FreeCRM\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath(".//input[@type='submit']")).click();
		driver.switchTo().frame("mainpanel");
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		
		
		System.out.println("Size of all link --->"+linklist.size());
		
		List<WebElement> activeList  = new ArrayList<WebElement>();
		
		for(int i = 0 ; i < linklist.size();i++) {
			System.out.println(linklist.get(i).getAttribute("href"));
			if(linklist.get(i).getAttribute("href")!= null && (!linklist.get(i).getAttribute("href").contains("javascript"))) {
				activeList.add(linklist.get(i));
			}
		}
		System.out.println("Size of all link --->"+ activeList.size());
		
		for(int j= 0 ; j< activeList.size();j++) {
			
			HttpURLConnection connection = (HttpURLConnection) new URL(activeList.get(j).getAttribute("href")).openConnection();
			int code = connection.getResponseCode();
			String message = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeList.get(j).getAttribute("href")+"---->"+code+"---->"+message);
		}
	}
	}
	
	
