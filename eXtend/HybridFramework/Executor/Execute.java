package Executor;

import org.testng.annotations.Test;

import ActionUtilities.ExcelRead;
import Keywords.getText;

public class Execute extends ExcelRead {
	
	@Test
	(dataProvider="hybridData")
	public void getSteps(String testCase, String stepNumber,String testStep, String keyword, String Locator, String TestData1,String TestData2,String TestData3,String TestData4,String output) throws Exception
	{
		
	
	 boolean runMode =CheckExecutionMode.CheckTheExecutionMode(testCase);
	 
	 if(runMode == true)
	 {
		 int step = getText.getnumber(stepNumber);
		  TestData1= ExcelRead.readCell(step, 5);
		  TestData2= ExcelRead.readCell(step, 6);
		  TestData3= ExcelRead.readCell(step, 7);
		  TestData4= ExcelRead.readCell(step, 8);
		  output= ExcelRead.readCell(step, 9);
		  
		 ExecuteKeywords.ExecuteTheKeywords(testCase, stepNumber, testStep, keyword, Locator, TestData1, TestData2, TestData3, TestData4,output);
	 }
	 else
		 System.out.println("Not running the step");
		

		
	}
	
	
	
	
	
	

}
