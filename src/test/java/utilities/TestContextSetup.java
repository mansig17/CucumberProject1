package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import cucumber.GenericUtilities.GenericHelpers;
import setup.Setup;
import stepDef.Hooks;

public class TestContextSetup 

{
	public WebDriver driver;
	public String LandingPageProduct, offerPageProduct;
	public int a;
	public ObjectFactory obj;
	public Setup setDriver;
	public GenericHelpers helpers;
	public int noOfItems;
	public Hooks hook;
	
	public TestContextSetup() throws InterruptedException, IOException
	{
		setDriver= new Setup();
		driver= setDriver.setUpDriver();
		obj= new ObjectFactory(driver);
		helpers= new GenericHelpers(driver);
		System.out.println("hooks initialization with driver");
		//hook = new Hooks(driver);
	}
}
