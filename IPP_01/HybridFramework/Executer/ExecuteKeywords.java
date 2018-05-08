package Executer;

import ActionUtilities.TakeScreenshot;
import Keywords.Alert;
import Keywords.Assertion;
import Keywords.CategorySelection;
import Keywords.Clear;
import Keywords.DBConnection;
import Keywords.DatePicker;
import Keywords.DoubleClick;
import Keywords.ExplicitWait;
import Keywords.LaunchBrowser;
import Keywords.Login;
import Keywords.Logout;
import Keywords.MouseOver;
import Keywords.PageDownAndUp;
import Keywords.Refresh;
import Keywords.ScrollToElement;
import Keywords.SendNumber;
import Keywords.SendText;
import Keywords.Table;
import Keywords.Title;
import Keywords.UploadFileAutoIt;
import Keywords.VendorUserAccessRight;
import Keywords.VerifyField;
import Keywords.VerifyInvoiceAmt;
import Keywords.click;
import Keywords.closeBrowser;
import Keywords.drag;
import Keywords.dropdown;
import Keywords.getPageSource;
import Keywords.getText;


public class ExecuteKeywords {
	
	public static void ExecuteTheKeywords(String testCase, String stepNumber,String testStep, String keyword, String Locator, String TestData1,String TestData2,String TestData3,String TestData4,String output) throws Exception
	{
		System.out.println("Executing step "+"-----"+testCase+"----"+stepNumber +"------"+testStep+"-----------");
        
		
		switch(keyword)
		{
		
		case "LaunchBrowser":
			LaunchBrowser.LaunchTheBrowser(TestData2,TestData1);
			break;
			
		case "CloseBrowser":
		    closeBrowser.closeTheBrowser();
		    break;
			
		case "SendText":
		    SendText.SendTheText(Locator,TestData1);
		    break;
		    
		case "SendNumber":
			SendNumber.SendNumber(Locator, TestData1);
		    break;
		    
		case "VerifyInvoiceAmt":
		    VerifyInvoiceAmt.InvoiceAmt(Locator, stepNumber);
		    break;
		
		case "Click":
		    click.clickTheButton(Locator);
		    break;	
		    
		case "Clear":
		    Clear.clearTheField(Locator);
		    break;	
		    
		case "GetText":
		    getText.getText(Locator,stepNumber);
		    break;
		    
		case "GetMessage":
		    getText.getMessage(Locator, stepNumber);
		    break;
		    
		    
		case "Login":
			Login.LoginVerify(TestData1, TestData2, stepNumber);
			break;
		case "Logout":
			Logout.LoginLogoutVerify(Locator,TestData1);
			break;
		
		case "Dropdown":
			dropdown.DropdownValueSelection(Locator, TestData1);
			break;
			
		case "InvoiceAmt":
			VerifyInvoiceAmt.InvoiceAmt(Locator, stepNumber);
			break;
		
		case "TakeScreenshot":
		    TakeScreenshot.TakeScrSht(testCase+" "+TestData1);
		    break;
		    
		case "Drag":
			drag.dragit();
		    break;
		    
		case "Wait":
		   Keywords.wait.waitForTime(TestData1);
		    break;		    

		case "ExplicitWait":
			ExplicitWait.VerifyToElement(Locator);
			    break;	    
		    
		case "Assert":
			 Assertion.AssertValues(Locator, TestData1,stepNumber);
			    break;	
			    
		case "Alert":
			 Alert.alert();
			    break;	
			    
		case "Refresh":
			Refresh.Refresh();
			    break;	
			    
		case "VendorUserAccessRight":
			VendorUserAccessRight.ToVerifyVendorScreen(Locator, TestData1,TestData2,TestData3);
			    break;	
			    
		case "CategorySelection":
			CategorySelection.CategorySelection(Locator, TestData1);
			    break;	
			    
		case "UploadFileAutoIt":
			UploadFileAutoIt.UploadTheInvoice(TestData1);
			    break;	
			    
		case "getPageSource":
			getPageSource.getPageSource(TestData1, TestData2, TestData3);
			    break;
			    
		case "DBConnection":
			DBConnection.ConnectionToDB(Locator,stepNumber);
			    break;	
			    
		case "EmailSentVerification":
			DBConnection.EmailSentVerification(Locator,stepNumber);
			    break;	
			    
		case "MoveToMouse":
			MouseOver.MoveToMouse(Locator, TestData1);
			    break;	
			    
		case "Table":
			Table.GetDataFromTable(Locator, TestData1, TestData2);
			    break;	
			    
		case "VerifyInboxField":
			VerifyField.VerifyInboxField(Locator, TestData1);
			    break;
			    
		case "VerifyInvoice":
			   VerifyField.VerifyInvoice(Locator, TestData1, TestData2);
			    break;
			    
		case "PageDown":
			PageDownAndUp.PageDown();
			    break;	
			    
		case "PageUp":
			PageDownAndUp.PageUp();
			    break;	
			    
		case "DoubleClickTheElement":
			DoubleClick.DoubleClickTheElement(Locator, TestData1);
			    break;
			    
		case "SelectApprovalUser":
			DoubleClick.SelectApprovalUser(Locator);
		
		case "Title":
			Title.GetPageTitle(TestData1);
			    break;
			    
		case "ScrollToElement":
			ScrollToElement.ScrollToFindElement(Locator);
			    break;	
			    
		case "DatePicker":
			DatePicker.SelectDate(Locator, TestData1, TestData2);
			    break;	
	
			    
		    default:
		    	System.out.println("Invalid step");
		    	
	
		}
	}

	

}
