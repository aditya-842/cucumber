package com.sarvatra.test.ehub.CucumberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
//features = { "@TestRunFiles/testrunningfiles.txt" },
features= {"src\\test\\resources\\features\\LoginPage.feature"}, 
		glue = { "com.sarvatra.test.ehub.Stepdefination", "com.sarvatra.test.ehub.Hooks" }, monochrome = true,
//dryRun=true,
		plugin = { "pretty", "html:target/cucumber_report.html", "json:target/cucmber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:rerun/rerun.txt" })

public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

	/*
	 * @Override
	 * 
	 * @DataProvider public Object[][] scenarios() { return super.scenarios(); }
	 */

}