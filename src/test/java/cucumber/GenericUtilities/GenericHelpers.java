package cucumber.GenericUtilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericHelpers
{
	
	WebDriver driver;
	
	public GenericHelpers(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void getToChildWindow() throws InterruptedException
	{

		String parentWindow=  driver.getWindowHandle();

		Set<String> childWindows=  driver.getWindowHandles();
		Iterator<String> iter= childWindows.iterator();

		while(iter.hasNext())
		{
			String child= iter.next();
			Thread.sleep(2000);
			if(!parentWindow.equalsIgnoreCase(child))
			{
				 driver.switchTo().window(child);
				Thread.sleep(2000);}
		}

	}


}
