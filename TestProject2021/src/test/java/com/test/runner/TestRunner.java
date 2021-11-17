package com.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = {"src/test/java/com/feature/files/search.feature"},
glue = {"com.step.definitions"},
plugin = {"pretty"},
//tags = "@smoke and @prod"
//tags = "not @prod"
tags= "@All"
)

public class TestRunner {

}
