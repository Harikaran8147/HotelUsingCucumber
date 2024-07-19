package com.omrbranch.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags =("d") ,publish = true,features = "src\\test\\resources\\Features",dryRun = false,glue = "com.omrbranch.stepdef",
plugin = {"pretty","html:target/cucumber.reports/report.html"}

//tags=("@hari")
//plugin = {"pretty","junit:target/cucumber.reports/report.xml"}
		
		)
public class TestRunner {

}
