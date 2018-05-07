package Keywords;

import java.io.IOException;

import org.testng.Assert;

public class Assertion {
	
	public static void AssertValues(String Locator, String TestData1,String stepNumber) throws IOException, Exception
	{
		String act = getText.getMessage(Locator, stepNumber);
		Assert.assertEquals(act, TestData1);
		System.out.println("Actual result is: "+act);
		System.out.println("Expected result is: "+TestData1);
		
		int row= getText.getnumber(stepNumber);
		
		
		if(act.equals(TestData1))
			ActionUtilities.ExcelWrite.WriteTheExcel("Pass", row);
		else
			ActionUtilities.ExcelWrite.WriteTheExcel("Fail", row);
	}
	

}
