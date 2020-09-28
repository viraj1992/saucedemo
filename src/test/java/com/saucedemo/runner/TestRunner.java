package com.saucedemo.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src\\test\\java\\com\\saucedemo\\features\\test.feature" }, 
		glue = { "com\\saucedemo\\stepDefinations" }, 
		tags = { "@regression" }, 
		plugin = { "pretty" }, 
		strict = true, 
		dryRun = false
		)

public class TestRunner {
	
}
