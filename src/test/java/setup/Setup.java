package setup;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Setup 

{
	WebDriver driver;
	
	
	public WebDriver setUpDriver() throws InterruptedException, IOException
	{
		FileInputStream fis= new FileInputStream( System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop= new Properties();
		prop.load(fis);
		String url= prop.getProperty("URL").toString();
		/*String prop_browser= prop.getProperty("BROWSER").toString();
		String cmd_browser= System.getProperty("BROWSER").toString();
		
		String browser= cmd_browser!=null? cmd_browser:prop_browser;*/
		
		String browser= prop.getProperty("BROWSER");
		System.out.println(browser);
		
		
		System.out.println(url);
		if(driver==null)
		{
			if(browser.equals("edge"))
			{
				
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"//src//test//resources//msedgedriver.exe");
			driver= new EdgeDriver();
			System.out.println("in edge");
			}
			else
				if( browser.equalsIgnoreCase("firefox"))
				{
					System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//src//test//resources//geckodriver.exe");
					driver= new FirefoxDriver();
					System.out.println(url);
					
				}
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		}
		return driver;
	}

}
