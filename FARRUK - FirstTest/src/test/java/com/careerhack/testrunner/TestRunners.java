package com.careerhack.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "Feature",
		glue = "com.stepdefinition"
		)

public class TestRunners extends AbstractTestNGCucumberTests{

}
