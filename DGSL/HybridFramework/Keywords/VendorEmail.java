package Keywords;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;

import ActionUtilities.ManageDrivers;

public class VendorEmail {
	static Connection con = null;
	static Statement stmt = null;	
	
	public static void EmailSentVerification(String Locator,String stepNo) throws ClassNotFoundException, SQLException, IOException
	{
		String query = Locator;	
		WebDriver driver= ManageDrivers.GetDriver();
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		System.out.println("Driver Loaded");
		Connection con = DriverManager.getConnection("jdbc:sqlserver://172.1.254.214:1433","sa","$pass$123");
		System.out.println("Connection Estabilished");
		Statement stmt = con.createStatement();
		ResultSet rs= stmt.executeQuery(query);
		System.out.println(query);
		String Invoice_No=null;
		while (rs.next())
		{
		 Invoice_No = rs.getString(3);								        
		 System. out.println(Invoice_No);	
		}			
		int row = Keywords.getText.getnumber(stepNo);
		ActionUtilities.ExcelWrite.WriteTheExcel(Invoice_No, row);
		con.close();	
	}

}
