package com.test.automation.uiAutomation.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public WebDriver driver=null;
	String url = "http://automationpractice.com/index.php";
	String browser = "Chrome";

	
	public void init(){
		selectBrowser(browser);
		getUrl(url);
//		String log4jConfPath ="log4j.properties";
//		PropertyConfigurator.configure(log4jConfPath);		
	}
	
	public void selectBrowser(String browser){
		if (browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anuj.jain\\workspace\\uiAutomation\\Drivers\\chromedriver.exe");	
		driver= new ChromeDriver();
		}
	}
	
	private void getUrl(String string) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
	}

}
