package stepDef;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import utilities.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	WebDriver driver;
	TestContextSetup tcs;
	public Hooks(TestContextSetup tcs)
	{
		this.tcs=tcs;
		
	}
	
	@After
	public void shutDown()
	{
		tcs.driver.quit();
		System.out.println("In after");
		System.out.println("New line after cloning the project");
		
	}
	
	@AfterStep
	public void attachScr(Scenario scenario) throws IOException
	{
		if(scenario.isFailed())
		{
			 File src= ((TakesScreenshot)tcs.driver).getScreenshotAs(OutputType.FILE);
			 byte[] arr= FileUtils.readFileToByteArray(src);
			 //scenario.attach(arr,"image/png", "image");
			 
			 
		}
	}
}


