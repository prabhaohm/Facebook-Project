package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepdefinition",dryRun=false,snippets=SnippetType.CAMELCASE,
monochrome=true,plugin= {"html:target\\Report",
		"junit:target\\Report\\face.xml",
		"json:target\\Report\\login.json",
		"rerun:src\\test\\resources\\Rerun\\failed.txt"})
public class TestRunnerClass extends JVMReport {
	
	@AfterClass
	public static void smartSkillTechnologies() {
		generateJvmReport(System.getProperty("user.dir") +"\\target\\Report\\login.json");

	}

}
  