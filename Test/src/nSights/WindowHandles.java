package nSights;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	
	public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anuj.jain\\workspace\\IPP_01\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String vUrl="http://192.168.4.209/trubi/";
        String vUsername="Pratham";
        String vPassword="Dgsl@123";
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        driver.get(vUrl);
        
        driver.findElement(By.id("txt-userName")).sendKeys(vUsername);
        driver.findElement(By.xpath("//*[@id='txt-pwd']")).sendKeys(vPassword);
        driver.findElement(By.xpath("//*[@id='btnlogin']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='alert-modal-confirm-ok']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='divDashboardPartialList1']/div/div[1]/div[2]/a/span/i[2]")).click();
        Thread.sleep(5000);

        String mainWindow=driver.getWindowHandle();
        Set<String>s1=driver.getWindowHandles();
        Iterator<String> I1= s1.iterator();
        
        while(I1.hasNext())
        {
         
           String child_window=I1.next();
           if(!mainWindow.equals(child_window))
           {
           driver.switchTo().window(child_window);
            
           System.out.println(driver.switchTo().window(child_window).getTitle());
            Thread.sleep(10000);
           driver.findElement(By.xpath(".//*[@class = 'dx-button-text'][text()='Create']")).click();
           }
            
           }
//        driver.switchTo().window(mainWindow);
        
	}
        

 }
