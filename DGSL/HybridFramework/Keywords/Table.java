package Keywords;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ActionUtilities.ManageDrivers;

public class Table {
	
	public static void GetDataFromTable(String Locator,String TestData1,String TestData2){
		
	
		WebDriver driver= ManageDrivers.GetDriver();
		List<WebElement> TableContains = driver.findElements(By.xpath(Locator));
		
//		for(int i =0;i<TableContains.size();i++){
//        System.out.println("Value are : " + TableContains.get(i).getText());
//		}
    
		List<WebElement> alllinks = driver.findElements(By.xpath(TestData1));
		
		for(int i =0;i<alllinks.size();i++)
		{
        System.out.println("Link is  : " + alllinks.get(i).getText());
		}   
    
		for(int i =0;i<TableContains.size();i++)
		{
        System.out.println("Value are : " + TableContains.get(i).getText() + "== Corresponding link is : " + alllinks.get(i).getText());
        // now on the basis of column value click the corresponding link
        if(TableContains.get(i).getText().equals(TestData2)){
            alllinks.get(i).click();
            break;
        }
    }
	}
}
