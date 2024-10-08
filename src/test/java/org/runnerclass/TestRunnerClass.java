package org.runnerclass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "", monochrome = false, dryRun = false, plugin = { "pretty",
		"json:target/JVMReport" }, features = "src//test//resources//FeatureFiles", glue = {
				"org.stepdefinition" })

public class TestRunnerClass {

	@AfterClass
	public static void Report() {

		//JVMReport.GenerateJVMReport("/Users/presidio/eclipse-workspace/DemoBlaze/target/JVMReport.json");

	}

}
