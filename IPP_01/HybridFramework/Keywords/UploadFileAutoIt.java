package Keywords;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import ActionUtilities.ManageDrivers;

public class UploadFileAutoIt {
	
	WebDriver driver;
	
	public static void UploadTheInvoice(String TestData1) throws IOException, InterruptedException
	{
		WebDriver driver= ManageDrivers.GetDriver();
		Thread.sleep(10000);
		Runtime.getRuntime().exec(TestData1);
	}

}
