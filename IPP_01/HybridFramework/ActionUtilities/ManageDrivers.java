package ActionUtilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Author: Anuj Jain, Date:25sept2017

public class ManageDrivers {
	
	public static WebDriver driver;
	
	public static WebDriver OpenUrl(String browser,String url) throws Exception
	{
		
		if (browser.equalsIgnoreCase("Chrome"))
		{
			driver =LaunchChrome(url);
		}
		if (browser.equalsIgnoreCase("FireFox"))
		{
			driver = LaunchFirefox(url);
		}
		if (browser=="IE")
		{
			driver = LaunchIE(url);
		}
		
		return driver;
		
	}

	public static WebDriver LaunchIE(String url) {

		return null;
	}

	private static WebDriver LaunchFirefox(String url) throws IOException, InterruptedException {
		System.out.println("Opening FF");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	private static WebDriver LaunchChrome(String url) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jain.anuj\\git\\selenium\\IPP_01\\Drivers\\chromedriver.exe");
	    WebDriver  driver = new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	
	public static WebDriver GetDriver()
	{
		return driver;
	}
	
	

}
