package TestRunner;

import org.junit.runner.RunWith;
//import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\SRIJAN\\eclipse-workspace\\RS_Cucumber_Selenium\\src\\test\\java\\cucumber\\features", 
glue="stepDef", monochrome=true,dryRun=false,tags="@Search", plugin= {"pretty","html:target/cucumber.html","json: target/rep.json", 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun: target/failedtests.txt"})
public class TestRunner 
{
	
}
