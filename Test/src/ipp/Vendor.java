package ipp;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;











public class Vendor {
	
	static Connection con = null;
	static Statement stmt = null;
	

//	public static void main(String[] args) throws Exception {
	@Test
	public void login() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anuj.jain\\workspace\\henniges\\Driver\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://172.1.254.215:90/ippgeneric");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
		driver.findElement(By.id("User_Name")).sendKeys("puser1");
		driver.findElement(By.id("User_Password")).sendKeys("Sysadmin@123");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath(".//*[@id='viewTransaction']")).click();
//		WebElement ele = driver.findElement(By.xpath(".//*[@id='FileSavePurchase_Requisition_Number']"));
//		System.out.println(ele.getAttribute("value"));
		driver.findElement(By.xpath(".//*[@id='DrpActivityList']/span/span/span[2]/span")).click();
		Thread.sleep(3000);
		List<WebElement> dropdown = driver.findElements(By.xpath(".//*[@id='Activity_Code-list']"));
		for(WebElement eachDropdownOption : dropdown){
			System.out.println(eachDropdownOption.getText());
            if(eachDropdownOption.getText().equalsIgnoreCase("Data Review")){
            	System.out.println("fksdfsd");
         	   Thread.sleep(5000);
                  eachDropdownOption.click();
            }
		
		driver.findElement(By.xpath(".//*[@id='Update2']")).click();
//		driver.findElement(By.xpath(".//*[@id='vbasic']/div[7]/ul/li[3]/div[2]/div/span/span/span/span")).click();
//		List<WebElement> allDates=driver.findElements(By.xpath(".//table[@class='k-content k-month']/tbody/tr/td"));
//		
//		for(WebElement ele:allDates)
//		{
//			
//			String date=ele.getText();
//			System.out.println(date);
//			if(date.equalsIgnoreCase("30"))
//			{
//				ele.click();
//				break;
//			}
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.xpath(".//*[text()='MyInbox']")).click();

//		WebElement Invoicenumber = driver.findElement(By.xpath(".//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
//		if (driver.findElement(By.xpath(".//*[@id='grid']/div[3]/table/tbody")).isDisplayed()) {
//			System.out.println(" Invoice are Present");
//			WebElement Invoicenumber = driver.findElement(By.xpath(".//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
//			String InvNum = Invoicenumber.getText();
//			String Expected = "78896456";
//			if (InvNum==Expected) {
//				System.out.println("Test case is Fail");
//			}
//			else
//				System.out.println(InvNum + ": found");
//		}
//		else{
//			System.out.println(" Invoice are not Present");
//		}
//		String InvNunm = Invoicenumber.getText();
//		String Expected = "78896456";
//		if (InvNunm==Expected) {
//			System.out.println("Test case is Fail");
//		}
//		else
//			System.out.println("Testcase is pass");
	}
	}
}
