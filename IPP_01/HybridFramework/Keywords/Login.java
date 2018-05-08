package Keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ActionUtilities.ExcelRead;
import ActionUtilities.ExcelWrite;

public class Login {
	static WebDriver driver;
	public static void LoginVerify(String UserName, String Password, String stepno) throws Exception
	{
		
		driver = ActionUtilities.ManageDrivers.GetDriver();
		HomePage.HomePage home = PageFactory.initElements(driver, HomePage.HomePage.class);
		int row = Keywords.getText.getnumber(stepno);
		UserName= ExcelRead.readCell(row, 5);
		System.out.println("username  ="+UserName);
		home.Login.sendKeys(UserName);
		home.Password.sendKeys(Password);
		home.Submit.click();
		
	}

}
