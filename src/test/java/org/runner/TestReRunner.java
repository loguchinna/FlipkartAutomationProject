package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@C:\\Users\\logan\\eclipse-workspace\\FlipkartProject\\src\\test\\resources\\FailedScenarios\\failed.txt",glue="org.stepdefinition")
public class TestReRunner {

}
