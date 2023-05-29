package test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\features"},
		glue = {"gluecode"},
		monochrome = true ,
		plugin = {"pretty","html:target/facebook.html","rerun:target/facebook.txt"}
		
		)

public class Runner1 extends AbstractTestNGCucumberTests 
{

}
