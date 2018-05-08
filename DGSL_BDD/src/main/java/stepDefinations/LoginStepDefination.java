package stepDefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import excelUtility.ExcelRead;

public class LoginStepDefination {
	
	WebDriver driver;
	ExcelRead ER = new ExcelRead();
	
	
	@Given("^User is already login page$")
	public void user_is_already_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anuj.jain\\workspace\\henniges\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://172.1.254.215:90/DGSL");   
	}

	@When("^tilte of login page is IPP$")
	public void tilte_of_login_page_is_IPP() throws Throwable {
		 String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("IPM", title);
	    
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials){
		List<List<String>> data = credentials.raw();
		driver.findElement(By.xpath(".//*[@id='User_Name']")).sendKeys(data.get(0).get(0));
	    driver.findElement(By.xpath(".//*[@id='User_Password']")).sendKeys(data.get(0).get(1));
	}

	@Then("^User click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='login']")).click();
	}
	
	@Then ("^wait for the Inbox Page$")
	public void Then_wait_for_the_Inbox_Page() throws Exception{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
	}

	@Then("^user moves on vendor Registration page$")
	public void user_moves_on_vendor_Registration_page() {
		driver.findElement(By.xpath(".//*[text()='Vendor Registration']")).click();

	}
	
	@Then("^user wait for the add button$")
	public void user_wait_for_the_add_button() throws Exception{
		Thread.sleep(3000);
	}

	@Then("^user click on the add button$")
	public void user_click_on_the_add_button(){
		driver.findElement(By.xpath(".//*[@id='AddTrnasaction']")).click();
	}

	@Then("^User enters Vendor data$")
	public void User_enters_Vendor_data(DataTable vendordata){
		List<List<String>> Vendorvalue = vendordata.raw();
		driver.findElement(By.xpath(".//*[@id='FileSaveVendor_Name']")).sendKeys(Vendorvalue.get(0).get(0));
		driver.findElement(By.xpath(".//*[@id='FileSaveVendor_Commodity']")).sendKeys(Vendorvalue.get(0).get(1));
		driver.findElement(By.xpath(".//*[@id='FileSaveVendor_Contact_Person']")).sendKeys(Vendorvalue.get(0).get(2));
		driver.findElement(By.xpath(".//*[@id='FileSaveVendor_Email_ID']")).sendKeys(Vendorvalue.get(0).get(3));
		driver.findElement(By.xpath(".//*[@id='FileSaveVendor_Phone_No']")).sendKeys(Vendorvalue.get(0).get(4));
	}

	@Then("^user select the activity name$")
	public void user_select_the_activity_name(){
		driver.findElement(By.xpath(".//*[@id='DrpActivityList']/span/span/span[2]")).click();
		List<WebElement> TableContains = driver.findElements(By.xpath(".//*[@id='Activity_Code-list']"));

		for(WebElement element :TableContains)
		{
        if(element.getText().equals("Self Registration"))
        {
        	System.out.println(element.getText());
        	Actions builder = new Actions(driver);
        	builder.doubleClick(element).build().perform();
            break;
        }
	}

	}

	@Then("^user click on the submit button$")
	public void user_click_on_the_submit_button() {
		driver.findElement(By.xpath(".//*[@id='Update2']")).click();

	}

	@Then("^Close the browser$")
	public void close_the_browser() {

	}
	
	@When("^Read The Excel Sheet$")
	public void Excel_Sheet_Read(){
		
	}


}
