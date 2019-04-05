package selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDown {
	
	WebDriver driver;
	
	@Test(enabled = false)
	public void Select_dropdown() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jain.anuj\\Desktop\\chromedriver_win32\\chromedriver.exe");	
		driver= new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(".//a[@class = 'login']")).click();
//		driver.findElement(By.xpath(".//input[@id = 'email_create']")).sendKeys("anuj.jain@datamatics.com");
//		driver.findElement(By.xpath(".//button[@id = 'SubmitCreate']")).click();
		List<WebElement> RadioButton = driver.findElements(By.xpath(".//*[@name = 'lang' and @type ='radio']"));
		for(int i =0;i<RadioButton.size();i++) {
			WebElement local_Radio = RadioButton.get(i);
			String value = local_Radio.getAttribute("value");
			System.out.println("The values are : " + value);
			if(value.equalsIgnoreCase("PYTHON")) {
				local_Radio.click();
			}
		}
		
	}
	@Test
	public void Hidden_Element() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jain.anuj\\Desktop\\chromedriver_win32\\chromedriver.exe");	
		driver= new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		int x = driver.findElement(By.xpath(".//*[@id= 'male']")).getLocation().getX();
//		int y = driver.findElement(By.xpath(".//*[@id= 'male']")).getLocation().getY();
//		System.out.println("X card " + x);
//		System.out.println("Y card " + y);
		
		List<WebElement> Radio = driver.findElements(By.id("male"));
		System.out.println("Total Radio Button "+Radio.size());
		
		for(int i = 0;i<Radio.size();i++) {
			int x = Radio.get(i).getLocation().getX();
			if(x!=0) {
				Radio.get(i).click();
				break;
			}
		}
		
		
	}

}
