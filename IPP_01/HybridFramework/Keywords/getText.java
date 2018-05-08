package Keywords;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ActionUtilities.ManageDrivers;

public class getText {
	
	public static void getText(String Locator,String stepNumber) throws IOException, Exception
	{
		WebDriver driver= ManageDrivers.GetDriver();
		String text = driver.findElement(By.xpath(Locator)).getAttribute("value");
		System.out.println("Your Data is "+text);
		int row= getnumber(stepNumber);
		ActionUtilities.ExcelWrite.WriteTheExcel(text, row);
//		Thread.sleep(1000);
	}
	
	public static String getMessage(String Locator,String stepNumber) throws IOException, Exception
	{
		WebDriver driver= ManageDrivers.GetDriver();
		Thread.sleep(10000);
		String text = driver.findElement(By.xpath(Locator)).getText();
		System.out.println("Your Data is "+text);
		int row= getnumber(stepNumber);
		ActionUtilities.ExcelWrite.WriteTheExcel(text, row);
//		Thread.sleep(1000);
		return text;
	}
	
	public static int getnumber(String Stepnumber)
	{
	
	char[] y =Stepnumber.toCharArray();
	 
	 String x ="";
	  
	  for(int i=0;i<y.length;i++)
	  {
		  if(y[i]!='.')
		  
			  x=x+y[i];
			  
		  else break;
		  
			    
	  }
	 
	  
	  
	  int b =Integer.parseInt(x);
	  
	return b;
	}

	
}
