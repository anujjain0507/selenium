package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/anuj.jain/workspace/DGSL_BDD/src/main/java/Features/manualVendormap.feature",
		glue={"stepDefinations"},
		plugin= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		monochrome = true,
		strict = true,
		dryRun = true
		)
public class TestRunner {

}
