package Keywords;

import ActionUtilities.ManageDrivers;
import PartsKeywords.CreateSalesOrderHeader;
import PartsKeywords.PickPackInvoice;



public class Test {
public static void main(String[] args) throws Exception {
		
	ManageDrivers.OpenUrl("Firefox", "proxima-ln4.e-emphasys.com:8441/webui/servlet/login", "rgajbhiye", "Robin$123");
	  
	  System.out.println("done"); 
	  Thread.sleep(5000);
       CreateSalesOrderHeader.CreatePSOHeader("2", "M00000182");
       AddLine.AddTheLine("1", "KP3", "1");
       PickPackInvoice.pickPackInvoice("7");
		
	}

}
