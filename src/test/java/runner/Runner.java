package runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions( 
		features = {"C:\\Users\\lego_bravin\\eclipse-workspace\\SeleniumNOPProject\\src\\test\\resources\\FeatureFiles"},
		glue= {""},tags = "@Regression", dryRun=false, monochrome = true, 
		plugin = {"pretty","html:target/cucumber-reports/report.html","rerun:target1/failedrerun.txt","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})



public class Runner  {
	

}
