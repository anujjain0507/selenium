package HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	
	
	//--------------------------------------Login----------------------------------------------------------//

	@FindBy(how=How.ID,using="User_Name")
	public WebElement Login;
	
	@FindBy(how=How.ID,using="User_Password")
	public WebElement Password;
	
	@FindBy(how=How.ID,using="login")
	public WebElement Submit;
	
	@FindBy(how=How.ID,using="btnSubmit")
	public WebElement btnSubmit;
	


}
