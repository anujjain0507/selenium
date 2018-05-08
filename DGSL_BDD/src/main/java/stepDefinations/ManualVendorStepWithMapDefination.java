package stepDefinations;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ManualVendorStepWithMapDefination {
	
WebDriver driver;
	
	@Given("^User go in login page$")
	public void user_is_already_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anuj.jain\\workspace\\henniges\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://172.1.254.215:90/DGSL");   
	}

	@When("^login page titlt is IPP$")
	public void tilte_of_login_page_is_IPP() throws Throwable {
		 String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("IPM", title);
	    
	}

	@Then("^enters username and password$")
	public void user_enters_username_and_password(DataTable credentials){
		
		
		for(Map<String,String> data : credentials.asMaps(String.class, String.class)){
			
			driver.findElement(By.xpath(".//*[@id='User_Name']")).sendKeys(data.get("username"));
			driver.findElement(By.xpath(".//*[@id='User_Password']")).sendKeys(data.get("password"));
			}
	}

	@Then("^click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='login']")).click();
	}
	
	@Then ("^wait for Inbox Page$")
	public void Then_wait_for_the_Inbox_Page() throws Exception{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
	}

	@Then("^Click on vendor Registration page$")
	public void user_moves_on_vendor_Registration_page() {
		driver.findElement(By.xpath(".//*[text()='Vendor Registration']")).click();

	}
	
	@Then("^wait for the add button$")
	public void user_wait_for_the_add_button() throws Exception{
		Thread.sleep(3000);
	}

	@Then("^click on the add button$")
	public void user_click_on_the_add_button(){
		driver.findElement(By.xpath(".//*[@id='AddTrnasaction']")).click();
	}

	@Then("^enters Vendor data$")
	public void User_enters_Vendor_data(DataTable vendordata){
//		With Parametrized
		for(Map<String,String> data : vendordata.asMaps(String.class, String.class)){
		
		driver.findElement(By.xpath(".//*[@id='FileSaveVendor_Name']")).sendKeys(data.get("vendorname"));
		driver.findElement(By.xpath(".//*[@id='FileSaveVendor_Commodity']")).sendKeys(data.get("Commodity"));
		driver.findElement(By.xpath(".//*[@id='FileSaveVendor_Contact_Person']")).sendKeys(data.get("ContactPerson"));
		driver.findElement(By.xpath(".//*[@id='FileSaveVendor_Email_ID']")).sendKeys(data.get("Email"));
		driver.findElement(By.xpath(".//*[@id='FileSaveVendor_Phone_No']")).sendKeys(data.get("PhoneNumber"));
		}
//		Without parametrized
//		List<List<String>> Vendorvalue = vendordata.raw();
//		driver.findElement(By.xpath(".//*[@id='FileSaveVendor_Name']")).sendKeys(Vendorvalue.get(0).get(0));
//		driver.findElement(By.xpath(".//*[@id='FileSaveVendor_Commodity']")).sendKeys(Vendorvalue.get(0).get(1));
//		driver.findElement(By.xpath(".//*[@id='FileSaveVendor_Contact_Person']")).sendKeys(Vendorvalue.get(0).get(2));
//		driver.findElement(By.xpath(".//*[@id='FileSaveVendor_Email_ID']")).sendKeys(Vendorvalue.get(0).get(3));
//		driver.findElement(By.xpath(".//*[@id='FileSaveVendor_Phone_No']")).sendKeys(Vendorvalue.get(0).get(4));
	}

	@Then("^select the activity name$")
	public void user_select_the_activity_name(){
		driver.findElement(By.xpath(".//*[@id='DrpActivityList']/span/span/span[2]/span")).click();
		driver.findElement(By.xpath(".//*[@id='Activity_Code_listbox']/li")).click();
		driver.findElement(By.xpath(".//*[@id='Update2']")).click();


	}

	@Then("^click on the submit button$")
	public void user_click_on_the_submit_button() throws Exception {
		driver.findElement(By.xpath(".//*[@id='Update2']")).click();
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='RedirectonClose2']")).click();
		driver.findElement(By.xpath("")).click();

	}

	@Then("^Close browser$")
	public void close_the_browser() {

	}

}
