package selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CaptureScreenShot {
	
	WebDriver driver;
	
	@Test
	public void ScreenShot() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anuj.jain\\workspace\\henniges\\Driver\\chromedriver.exe");	
		driver= new ChromeDriver();
		driver.get("http://172.1.254.215:90/IPPGeneric");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='User_Name']")).sendKeys("puser1");
		driver.findElement(By.xpath(".//*[@id='User_Password']")).sendKeys("Sysadmin@123");
		driver.findElement(By.xpath(".//*[@id='login']")).click();
		Thread.sleep(10000);
		List<WebElement> TableContains = driver.findElements(By.xpath(".//*[@id='grid']/div[3]/table/tbody/tr/td"));
		List<WebElement> alllinks = driver.findElements(By.xpath(".//*[@id='grid']/div[3]/table/tbody/tr/td[2]"));
		for(int i =0;i<alllinks.size();i++)
		{
        System.out.println("Link is  : " + alllinks.get(i).getText());
		}   
    
		for(int i =0;i<TableContains.size();i++)
		{
        System.out.println("Value are : " + TableContains.get(i).getText() + "== Corresponding link is : " + alllinks.get(i).getText());
        if(TableContains.get(i).getText().equals("MURE-2-032218")){
            alllinks.get(i).click();
            break;
        }
    }
		driver.findElement(By.xpath(".//*[@id='viewTransaction']")).click();
		driver.findElement(By.xpath(".//*[@id='FileSaveTerms_of_Payment']")).sendKeys("20");
		driver.findElement(By.xpath(".//*[@id='DrpActivityList']/span/span/span[2]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='Activity_Code_listbox']/li[4]")).click();
		driver.findElement(By.xpath(".//*[@id='Update2']")).click();
		driver.navigate().refresh();
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
	
	@AfterMethod 
	 public void screenShot(ITestResult result) throws IOException{			
			if(ITestResult.FAILURE == result.getStatus());
			TakesScreenshot scr = (TakesScreenshot)driver;
			File file =  scr.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file,new File("D:\\"+result+".jpeg"));
		}

}
