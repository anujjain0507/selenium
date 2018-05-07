package Keywords;

import ActionUtilities.ManageDrivers;

public class LaunchBrowser {
	
	
	public static void LaunchTheBrowser(String TestData2, String TestData1) throws Exception
	{
		System.out.println("Launching the Browser ");
		ManageDrivers.OpenUrl(TestData2, TestData1);
		
		
	}

}
