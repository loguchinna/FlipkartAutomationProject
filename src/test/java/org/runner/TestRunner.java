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
				
				"html:src\\main\\resources\\Reports\\HtmlReport",
				"json:src\\main\\resources\\Reports\\JSONReport\\jsonreport.json",
				"junit:src\\main\\resources\\Reports\\JUNITReport\\junitreport.xml",
				"rerun:src\\test\\resources\\FailedScenarios\\failed.txt"

		}

)

public class TestRunner {
	@AfterClass
	public static void report() {
		JVMReports.generateJVMReport("src\\\\main\\\\resources\\\\Reports\\\\JSONReport\\\\jsonreport.json");

	}


}
