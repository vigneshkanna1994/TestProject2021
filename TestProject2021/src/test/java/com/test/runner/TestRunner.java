package com.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/com/feature/files/search.feature" }, glue = { "com.step.definitions",
		"com.myHooks" }, plugin = { "pretty", "json:target/myReports/report.json",
				"junit:target/myReports/report.xml",
				"html:target/myReports/report.html"},
		publish = true,
//tags = "@smoke and @prod"
//tags = "not @prod"
		tags = "@All",
		monochrome = true,
		dryRun = true
		)

public class TestRunner {

}
