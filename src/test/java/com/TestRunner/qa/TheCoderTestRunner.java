package com.TestRunner.qa;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.qa.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"src/test/resources/TheCoderFeatures"},
                  plugin= {"json:target/cucumber.json"},                    
                  glue="StepDepp", tags={"@test"})

public class TheCoderTestRunner extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void startURL() {
		
		BaseClass test = new BaseClass(); 
		test.initBrowser();
		
	}
	
	
	@AfterTest
	public void closeURL() {
		BaseClass test = new BaseClass(); 
		test.driver.quit();
	}
	
	
	
}
