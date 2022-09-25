package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utility.JVMReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.stepdefinition",dryRun=false,

		tags = "@E2E", 
		plugin = {
				"html:C:\\Users\\logan\\eclipse-workspace\\FlipkartProject\\src\\main\\resources\\Reports\\HtmlReport",
				"json:C:\\Users\\logan\\eclipse-workspace\\FlipkartProject\\src\\main\\resources\\Reports\\JSONReport\\jsonreport.json",
				"junit:C:\\Users\\logan\\eclipse-workspace\\FlipkartProject\\src\\main\\resources\\Reports\\JUNITReport\\junitreport.xml",
				"rerun:C:\\Users\\logan\\eclipse-workspace\\FlipkartProject\\src\\test\\resources\\FailedScenarios\\failed.txt"
		}

)

public class TestRunner {
	@AfterClass
	public static void report() {
		JVMReports.generateJVMReport("C:\\\\Users\\\\logan\\\\eclipse-workspace\\\\FlipkartProject\\\\src\\\\main\\\\resources\\\\Reports\\\\JSONReport\\\\jsonreport.json");

	}


}
