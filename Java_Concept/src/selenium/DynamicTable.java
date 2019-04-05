package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\jain.anuj\\\\workspace\\\\FreeCRM\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/"); // enter URL

		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

		driver.findElement(By.xpath(
				".//*[text()='Jay Bavan']//parent::td[@class='datalistrow']//following-sibling::td//descendant::i[@title='Edit']"))
				.click();

		// String before_xpath = "//*[@id='vContactsForm']/table/tbody/tr[";
		// String after_xpath = "]/td[2]/a";
		//
		// for(int i=4; i<=7; i++)
		// {
		// String name = driver.findElement(By.xpath(before_xpath + i +
		// after_xpath)).getText();
		// System.out.println(name);
		// if(name.contains("test2 test2")){ //i=6
		// //*[@id='vContactsForm']/table/tbody/tr[6]/td[1]/input
		// driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();
		//
		// }
		// }
	}
}
