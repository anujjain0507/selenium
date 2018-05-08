package PartsKeywords;

import org.openqa.selenium.WebDriver;
import ActionUtilities.ManageDrivers;
import Keywords.SendText;
import Keywords.click;

public class PickPackInvoice {

	public static void pickPackInvoice(String stepNumber) throws Exception
	{
		int sesSeq =GetSessionSeq.GetTabSeq();
		
		WebDriver driver= ManageDrivers.GetDriver();
		click.clickTheButton("tdtre4101m002-"+sesSeq+"-button-std:action");
		click.clickTheButton("tdtre4101m002-"+sesSeq+"-menu-std:action-form-pick.pack.and.invoice");
		
		
		click.clickTheButton("dlg-tdtre4101m002-"+sesSeq+"-input-button-1-label");
		
		System.out.println("parts has been shipped");
//		click.clickTheButton("dlg-tdtre4101m002-"+sesSeq+"-input-button-0");
//		
//		click.clickTheButton("dlg-tdtre4101m002-"+sesSeq+"-input-button-1");
		click.clickTheButton("dlg-tdtre4101m002-"+sesSeq+"-input-button-0");
		SendText.SendTheText("ttstpsplopen-"+(sesSeq+4)+"-devc-1-lookup-widget", "D");
		
		click.clickTheButton("ttstpsplopen-"+(sesSeq+4)+"-button-form-exec.cont.process");
		System.out.println("Invoice has been sucessfull");
		Thread.sleep(5000);
//		int size = driver.findElements(By.tagName("iframe")).size();
//		System.out.println("frames : "+size);
//	    driver.switchTo().frame(1);
		
	//	String Invoice = driver.findElement(By.xpath(".//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[8]")).getText();
		//String Invoice = driver.findElement(By.xpath(".//*[contains(text(),'PAGE NO')]/following::div[1]")).getText();
	//	System.out.println("Invoice  :"+Invoice);
		    
		
		
//		//getText.getTheText(".//*[contains(text(),'PAGE NO')]/following::div[1]", stepNumber);
//	   String invoiceNo = driver.findElement(By.xpath(".//*[contains(text(),'PAGE NO')]/following::div[1]")).getAttribute("value");
//	   System.out.println("Got the inv No." +invoiceNo);
//	   int row= getText.getnumber(stepNumber);
//		ActionUtilities.ExcelWrite.WriteTheExcel(invoiceNo, row);
		Keywords.wait.waitForTime("10000");
	
	}
	
}
