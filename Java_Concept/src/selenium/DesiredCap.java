package selenium;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DesiredCap {
	
	public static WebDriver driver;
	public static String appURL = "http://172.1.254.215:81/Meritor";
	String node = "http://10.254.19.60:4444/wd/hub";
	
	public static void main (String [] args) throws MalformedURLException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jain.anuj\\workspace\\FreeCRM\\Driver\\chromedriver.exe");	
		DesiredCapabilities capabilities =  DesiredCapabilities.chrome();
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
		driver.manage().window().maximize();
		System.out.println("*** Navigation to Application ***");
		driver.navigate().to(appURL);


	}
	
	public void captureScreenShot() throws Exception {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File fs = new File ("D:\\");
		File filesource = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(filesource, fs);
	}

}
