package ipp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class table {
	
	WebDriver driver;

	@BeforeMethod
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anuj.jain\\workspace\\henniges\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/anuj.jain/Desktop/test.html");
		
	}
	
	@Test
	public void Table() throws Exception
	{
		String beforeXpath = ".//*[@id='Emp']/tbody/tr[";
		String afterXpath = "]/td[1]";
		for (int i = 1; i <= 10; i++) {
		 String value = driver.findElement(By.xpath(beforeXpath + i + afterXpath)).getText();
		 System.out.println(value);
			if (value.contains("Sagar"))
			{
				WebElement val = driver.findElement(By.xpath(".//*[@id='Emp']/tbody/tr[" + i +"]/td[2]/button"));
				val.click();		
		}
		}
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.close();
	}

}
