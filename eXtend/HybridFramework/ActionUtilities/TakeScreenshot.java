package ActionUtilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class TakeScreenshot {
	
	
	public static void TakeScrSht(String file) throws Exception
	{
		WebDriver driver= ManageDrivers.GetDriver();
		String x= ExcelRead.readCell(7, 5);
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File fs = new File(".//Screenshots//"+x+".jpg");
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, fs);
		System.out.println("Screenshot Taken");
	}

}
