package ActionUtilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

//Author: Robin Gajbhiye, Date:04June2016

public class ManageDrivers {
	
	public static WebDriver driver;
	
	public static WebDriver OpenUrl(String browser,String url, String username, String password) throws Exception
	{
//		File pro = new File(".//configuration//config.property");
//		FileInputStream fs = new FileInputStream(pro);
//		Properties pr = new Properties();
//		pr.load(fs);
//		String username =pr.getProperty("username");
//		String password =pr.getProperty("password");
//		String url =pr.getProperty("url");
		
		
		
		if (browser.equalsIgnoreCase("Chrome"))
		{
			driver =LaunchChrome(url,username,password);
		}
		if (browser.equalsIgnoreCase("FireFox"))
		{
			driver = LaunchFirefox(url,username,password);
		}
		if (browser=="IE")
		{
			driver = LaunchIE(url,username,password);
		}
		
		
		
		
		
		
		return driver;
		
	}

	public static WebDriver LaunchIE(String url,String username, String password) {
		
		
		
		
		return null;
	}

	private static WebDriver LaunchFirefox(String url,String username, String password) throws IOException, InterruptedException {
		System.out.println("Opening FF");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Thread.sleep(5000); 
		//Runtime.getRuntime().exec(".//LogineXtend1.exe"); 
		
		driver.get("https://"+username+":"+password+"@"+url);
		
		//Runtime.getRuntime().exec(".//LogineXtend1.exe"); 
	     Thread.sleep(5000);

	     
	     
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	private static WebDriver LaunchChrome(String url,String username, String password) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",".//chromedriver.exe");
	     ChromeOptions cOptions = new ChromeOptions();

	    cOptions.addArguments("disable-infobars");

	  WebDriver  driver = new ChromeDriver(cOptions);
	  
	  driver.get(url);
	  
     Runtime.getRuntime().exec(".//LogineXtend1.exe");
     Thread.sleep(5000);

     driver.manage().window().maximize();
     
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}

	
	public static WebDriver GetDriver()
	{
		return driver;
	}
	
	

}
