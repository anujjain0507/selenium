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

public class TreeVerticalDropDownBrokenLink {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jain.anuj\\workspace\\FreeCRM\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://docs.microsoft.com/en-us/windows/desktop/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[text()='Get Started']")).click();
		driver.findElement(By.xpath(".//*[contains(text(),'new')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[text()='Windows 7']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[text()='Desktop Programming']")).click();
		WebElement list1 = driver.findElement(By.xpath(".//*[@id='filterResults']/ul/li/ul/li[1]/ul"));
		System.out.println(list1.getText());
		List<WebElement> ele = list1.findElements(By.tagName("a"));
		System.out.println(ele.size());
		for(WebElement ele1 : ele) {
			System.out.println(ele1.getText());
		}
		System.out.println("Size of the link------------>"+ele.size());
		List<WebElement> activeList  = new ArrayList<WebElement>();
		
		for(int i = 0; i < ele.size();i++) {
			
			System.out.println(ele.get(i).getAttribute("href"));
			
			if(ele.get(i).getAttribute("href")!= null && (!ele.get(i).getAttribute("href").contains("javascript"))) {
				activeList.add(ele.get(i));
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
