package com.qa.runner;

import org.junit.runner.RunWith;

import com.qa.utill.TestBase;
import com.relevantcodes.extentreports.ExtentReports;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\jain.anuj\\workspace\\IRCTC_BDD\\src\\main\\java\\com\\qa\\features\\login.feature",
			glue = ("C:\\Users\\jain.anuj\\workspace\\IRCTC_BDD\\src\\main\\java\\com\\qa\\stepDefination"),
			plugin = {"pretty","com.cucumber.listner.ExtentCucumberFormatter:test-output\reports.html","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber"},
			monochrome = true,
			strict = true,
			dryRun = true
			)
	
	
	public class TestRunner extends TestBase 
	{
		public static void ExtentReport() 
		{
		extent = new ExtentReports("C:\\Users\\anuj.jain\\workspace\\CucumberPOM\\test-output",true);
		extent.addSystemInfo("Browser", "Chrome");
		extent.addSystemInfo("SyStem-Config", "Win-7,64Bit");
		extent.addSystemInfo("HostName", "Anuj Jain");
		}
	}
