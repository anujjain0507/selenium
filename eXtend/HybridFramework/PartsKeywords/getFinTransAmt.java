package PartsKeywords;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ActionUtilities.ManageDrivers;
import Keywords.SendText;
import Keywords.click;
import Keywords.getText;
import Keywords.openSession;

public class getFinTransAmt {
	
	
	public static void getFinTransAmount(String stepnumber,String origin,String OrderNo, String position,String FinTrans) throws InterruptedException, IOException
	{
		String amt = null;
		WebDriver driver= ManageDrivers.GetDriver();
		openSession.openTheSession("tfgld4510m000");
		int ss = GetSessionSeq.GetTabSeq();
		System.out.println("Tab Sequence is "+ss);
		click.clickTheButton("tfgld4510m000-"+ss+"-button-std-edit.find");
		System.out.println("----------");
		click.clickTheButton("tfgld4510m000-"+(ss+1)+"-tfgld418.tror-control-trigger-button");
	Thread.sleep(2000);
		click.clickTheButton("tfgld4510m000-"+(ss+1)+"-tfgld418.tror-control-trigger-button");
		List<WebElement> org = driver.findElements(By.xpath(".//*[@class='ListItem']"));
		for(WebElement a:org)
		{
			if(a.getText().equalsIgnoreCase(origin))
			{	a.click();
			     break;
			}
			
			
		}
			
		click.clickTheButton("tfgld4510m000-"+(ss+1)+"-tfgld418.orno-lookup-widget");
		SendText.SendTheText("tfgld4510m000-"+(ss+1)+"-tfgld418.orno-lookup-widget", OrderNo);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[contains(@id,'tfgld4510m000-"+(ss+1)+"-tfgld418.orno-lookup-widget')]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		System.out.println("Done");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.id("tfgld4510m000-"+ss+"-grid-1-tfgld418.pono-7-filter-value")).sendKeys(position);
	 Thread.sleep(2000);
	 System.out.println("Done");
	 
	 driver.findElement(By.id("tfgld4510m000-"+ss+"-grid-1-tfgld418.fitr-8-filter-value-control-widget")).click();
//	 driver.findElement(By.xpath(".//*[contains(@id,'filter-value-control-widget-label')]")).click();
//	 Thread.sleep(2000);
	 driver.findElement(By.xpath(".//*[text()='Issue']")).click();
	 
	 
			 
   String amount = driver.findElement(By.id("tfgld4510m000-"+ss+"-grid-1-form.amount-12-0-widget")).getText();
   System.out.println(amount);
		
		
		click.clickTheButton("tfgld4510m000-"+ss+"-button-std-file.save_and_close");
        int row= getText.getnumber(stepnumber);
		
		ActionUtilities.ExcelWrite.WriteTheExcel(amount, row);
		
	}

}
