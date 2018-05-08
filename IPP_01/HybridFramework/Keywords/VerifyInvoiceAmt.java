package Keywords;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ActionUtilities.ExcelWrite;
import ActionUtilities.ManageDrivers;

public class VerifyInvoiceAmt {
	
	public static void InvoiceAmt(String Locator,String stepNumber) throws IOException
	{
		WebDriver driver= ManageDrivers.GetDriver();
		String amt = driver.findElement(By.xpath(Locator)).getText();
		System.out.println(amt);
		int amt1= getText.getnumber(amt);
		
		if(amt1>1000)
		{
			ExcelWrite.WriteTheExecutionMode("Y", 31);
			
		}
		else
		{
			ExcelWrite.WriteTheExecutionMode("N", 31);
			
		}
		
	}

}
