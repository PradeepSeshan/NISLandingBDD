package MyRunner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;

@Test
@CucumberOptions(
		features= {"C:\\Users\\1187335\\Documents\\Eclipse-Rewrite\\NISLanding\\src\\main\\java\\NISLanding\\NISLanding\\NISLanding.feature"},
	    glue= {"C:\\Users\\1187335\\Documents\\Eclipse-Rewrite\\NISLanding\\src\\main\\java\\Stepdefinition\\Stepdefinition.java"},
		format = {
        "pretty",
        "html:target/cucumber-reports/cucumber-pretty",
        "json:target/cucumber-reports/CucumberTestReport.json",
        "rerun:target/cucumber-reports/rerun.txt"
},
plugin = "json:target/cucumber-reports/CucumberTestReport.json")


public class MyRunner 
{
	
}
