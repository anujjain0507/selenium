package dbConnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connectDB {
	
	
	public static void  main(String[] args) throws  ClassNotFoundException, SQLException {													
	//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
    String dbUrl = "jdbc:sqlserver://172.1.254.214:1433";					

	//Database Username		
	String username = "sa";	
    
	//Database Password		
	String password = "$pass$123";	
	

	//Query to Execute		
	String query = "select * from [ipm-master-audit].[ipm-core].[IPM_User_Master]";	
    
	    //Load mysql jdbc driver		
	    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");			

		//Create Connection to DB		
	Connection con = DriverManager.getConnection(dbUrl,username,password);

		//Create Statement Object		
   Statement stmt = con.createStatement();					

		// Execute the SQL Query. Store results in ResultSet		
		ResultSet rs= stmt.executeQuery(query);							

		// While Loop to iterate through all data and print results		
	while (rs.next()){
        		String User_Name = rs.getString(19);								        
                String User_Password = rs.getString(20);					                               
                System. out.println(User_Name+"             "+User_Password);		
        }		
		 // closing DB Connection		
		con.close();			
}
}