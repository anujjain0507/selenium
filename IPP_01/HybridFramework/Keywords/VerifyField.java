package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import ActionUtilities.ManageDrivers;

public class VerifyField {
	
	public static void VerifyInboxField(String Locator,String TestData1){
		WebDriver driver= ManageDrivers.GetDriver();
		WebElement readOnly = driver.findElement(By.xpath(Locator));
		Assert.assertTrue(readOnly.getAttribute("readonly").equals("true"),TestData1);
	}
	
	public static void VerifyInvoice(String Locator,String TestData1,String TestData2){
		WebDriver driver= ManageDrivers.GetDriver();
		if (driver.findElement(By.xpath(Locator)).isDisplayed()) {
			System.out.println(" Invoice are Present");
			WebElement Invoicenumber = driver.findElement(By.xpath(TestData1));
			String InvNum = Invoicenumber.getText();
			String Expected = TestData2;
			if (InvNum==Expected) {
				System.out.println("Test case is Fail");
			}
			else
				System.out.println(InvNum + ": found");
		}
		else{
			System.out.println(" Invoice are not Present");
		}
		
	}
	
}
