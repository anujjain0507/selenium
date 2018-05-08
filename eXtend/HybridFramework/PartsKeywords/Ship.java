package PartsKeywords;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import ActionUtilities.ManageDrivers;
import Keywords.click;

public class Ship {
	
	public static void ShipTheParts() throws InterruptedException, AWTException
	{
		WebDriver driver= ManageDrivers.GetDriver();
		int tabSeq = GetSessionSeq.GetTabSeq();
		
		click.clickTheButton("tdtre4101m002-"+tabSeq+"-button-std:action");
		click.clickTheButton("tdtre4101m002-"+tabSeq+"-menu-std:action-form-pick.and.pack-label");
		click.clickTheButton("dlg-tdtre4101m002-"+tabSeq+"-input-button-1-label");
		//Keywords.wait.waitForTime("20000");
		System.out.println("parts has been shipped");
		
//		Robot r = new Robot();
//		r.mousePress(InputEvent.BUTTON3_MASK);
//		r.mouseRelease(InputEvent.BUTTON3_MASK);
//		
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_Q);
//		Thread.sleep(2000);
		
		
		
		
		
		
//		Actions action = new Actions(driver);
//		action.contextClick().build().perform();
//		
//		List<WebElement> iframes = driver.findElements(By.xpath("//iframe"));
//        // print your number of frames
//        System.out.println(iframes.size());
//        int i =0;
//        // you can reach each frame on your site
//        for (WebElement iframe : iframes) {
//             i++;
//            // switch to every frame
//             try{
//            driver.switchTo().frame(iframe);
//             }
//             catch(StaleElementReferenceException e)
//             {
//            	 System.out.println("StaleElementReferenceException exception on frame "+i);
//             }
//             if(elem.size()>0)
//             
//            	 System.out.println("Found");
//             
//             else
//            	 System.out.println("Not found");
//           
//            
//        }
		Thread.sleep(2000);
//		System.out.println("handles :"+driver.getWindowHandles().size());
//
//		System.out.println(driver.findElement(By.xpath(".//*[contains(text(),'Or-No')]/following::div[2]")).getText());
		
		
			
		
	}

}
