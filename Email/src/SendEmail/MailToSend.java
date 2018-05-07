package SendEmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MailToSend {
	WebDriver driver;
	@BeforeClass
	public void setup() throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jain.anuj\\Downloads\\geckodriver-v0.16.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		driver.get("https://webmail.datamatics.com");
		driver.findElement(By.id("username")).sendKeys("anuj.jain");
		driver.findElement(By.id("password")).sendKeys("pass@111");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
	}
	
	@Test
	public void EmailTest() throws Exception
	{
		
		driver.findElement(By.xpath(".//*[text()='New']")).click();
		driver.findElement(By.xpath("")).sendKeys("adtzurich.apinvoices@datamatics.co.in");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[text()='Enter message subject']")).sendKeys("Invoice");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[contains(text(),'Add attachments')]")).click();
	}

}
