package Keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import ActionUtilities.ManageDrivers;

public class Action {
	
	public static void ActionWithDoubleClick(){
		WebDriver driver = ManageDrivers.GetDriver();
		Actions builder = new Actions(driver);
	}

}
