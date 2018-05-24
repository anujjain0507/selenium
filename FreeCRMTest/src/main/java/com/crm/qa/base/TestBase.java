package com.crm.qa.base;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;

import com.sun.xml.internal.fastinfoset.sax.Properties;

public class TestBase {
	
	static WebDriver driver;
	static Properties prop;
	
	public TestBase() {
		
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\jain.anuj\\workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		
		
	}
	
	

}
