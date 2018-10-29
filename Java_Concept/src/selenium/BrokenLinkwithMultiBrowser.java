package selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrokenLinkwithMultiBrowser {
	public static WebDriver driver;

	@Parameters("browser")
	@BeforeTest
	public void initialize(String browser) throws Exception {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\jain.anuj\\\\workspace\\\\FreeCRM\\\\Driver\\\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver.exe");
				driver = new FirefoxDriver();
			}

		}
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void TestCase() throws Exception {

		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath(".//input[@type='submit']")).click();
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);

		List<WebElement> LinkList = driver.findElements(By.tagName("a"));
		LinkList.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Size of total link and image--->" + LinkList.size());
		List<WebElement> activeLink = new ArrayList<WebElement>();
		for (int i = 0; i < LinkList.size(); i++) {
			if (LinkList.get(i).getAttribute("href") != null) {
				activeLink.add(LinkList.get(i));
			}
		}
		System.out.println("Size of the total active links and image---->"+activeLink.size());	
		for(int j = 0;j<activeLink.size();j++) {
		HttpURLConnection connection = (HttpURLConnection)new URL(activeLink.get(j).getAttribute("href")).openConnection();
		int responseCode = connection.getResponseCode();
		String responseMessage = connection.getResponseMessage();
		connection.disconnect();
		System.out.println(activeLink.get(j).getAttribute("href")+"--->"+responseCode+" = "+responseMessage);
		}
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
