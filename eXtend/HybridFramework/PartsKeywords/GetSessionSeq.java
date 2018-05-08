package PartsKeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ActionUtilities.ManageDrivers;
import Keywords.getText;

public class GetSessionSeq {
	
	public static int GetTabSeq() throws InterruptedException
	{
		WebDriver driver= ManageDrivers.GetDriver();
		Thread.sleep(2000);
		String tab =driver.findElement(By.xpath(".//*[contains(@class,'Tab Selected')]")).getAttribute("id");
		System.out.println(tab);
		int a = 0;
		if(tab.length()==26)
		{
		char tabseq =tab.charAt(tab.length()-1);
		a = Character.getNumericValue(tabseq);
		}
		else
			if(tab.length()==27)
			{
				System.out.println(tab);
				System.out.println(tab.length());
				System.out.println(tab.lastIndexOf(tab));
				String tabseq1 =tab.substring(tab.charAt(tab.length()-3));
				System.out.println("SubString Result: "+tabseq1);	
				a= getText.getnumber(tabseq1);
				
				
			}
	System.out.println("a has value : "+a);
		return a;
	}

}
