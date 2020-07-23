package com.Runner;

 
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
  

@RunWith(Cucumber.class)

@CucumberOptions(
	//	features="src\\test\\resources\\Features\\login.feature",
	   features="src\\test\\resources\\Features\\dashboard.feature",
		glue= {"com.hrm.stepdefinitions"},
		tags= "@test",
		//reprot
		 plugin = { "pretty","html:target/site/cucumber-html-report",
			        "json:target/cucumber.json",
			        "usage:target/cucumber-usage.json",
			        "junit:target/cucumber-results.xml" }
		)

public class TestRunner {
	

}
