package PartsKeywords;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import ActionUtilities.ManageDrivers;
import Keywords.SendText;
import Keywords.click;
import Keywords.getText;
import Keywords.openSession;

public class CreateSalesOrderHeader {
	
	public static void CreatePSOHeader(String stepNumber, String TestData1) throws InterruptedException, IOException
	{
		WebDriver driver= ManageDrivers.GetDriver();
		openSession.openTheSession("tdsls4500m002");
		int tabSeq = GetSessionSeq.GetTabSeq();
		click.clickTheButton("tdsls4500m002-"+tabSeq+"-button-std-file.new");
		SendText.SendTheText("tdtre4101m002-"+(tabSeq+1)+"-tdsls400.ofbp-1-lookup-widget", TestData1);
		click.clickTheButton("tdtre4101m002-"+(tabSeq+1)+"-button-std-file.save");
		getText.getTheText("tdtre4101m002-"+(tabSeq+1)+"-tdsls400.orno-15-lookup-widget", stepNumber);
		
		System.out.println("Part Sales Order is created");
		
		
	}

}
