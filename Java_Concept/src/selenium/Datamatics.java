package ipp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class Datamatics {
	static WebDriver driver;
	
	public  static void main(String [] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anuj.jain\\workspace\\henniges\\Driver\\chromedriver.exe");	
		driver= new ChromeDriver();
		driver.get("http://172.1.254.215:90/DGSL");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='User_Name']")).sendKeys("puser1");
		driver.findElement(By.xpath(".//*[@id='User_Password']")).sendKeys("Sysadmin@123");
		driver.findElement(By.xpath(".//*[@id='login']")).click();
//		driver.findElement(By.xpath(".//*[@id='choice1']")).click();
//		driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='viewTransaction']")).click();
		
		driver.findElement(By.xpath(".//*[@id='FileSaveTerms_of_Payment']")).sendKeys("20");
		driver.findElement(By.xpath(".//*[@id='DrpActivityList']/span/span/span[2]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='Activity_Code_listbox']/li[4]")).click();
		driver.findElement(By.xpath(".//*[@id='Update2']")).click();
		driver.navigate().refresh();
		
		Thread.sleep(2000);
//		driver.findElement(By.xpath(".//*[@id='RedirectonClose1']")).click();
		driver.findElement(By.xpath(".//*[@id='viewTransaction']")).click();
		driver.findElement(By.xpath(".//*[@id='DrpActivityList']/span/span[1]/span[1]")).click();
		
		List<WebElement> list = driver.findElements(By.xpath(".//*[@id='Activity_Code_listbox']"));
		for (WebElement webElement : list) {
			String myText = driver.findElement(By.xpath(".//*[@id='Activity_Code_listbox']")).getText();
			if (myText.contains("Waiting for Approval1")) {
				
			}
		}
		System.out.println(list);
	}
}
