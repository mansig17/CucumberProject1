package utilities;

import org.openqa.selenium.WebDriver;

import Pages.OfferPage;
import Pages.SearchPage;
import Pages.checkOut;

public class ObjectFactory

{
	SearchPage sp;
	OfferPage op;
	checkOut ch;
	WebDriver driver;
	
	ObjectFactory(WebDriver driver)
	{
		this.driver=driver;
	}
	public SearchPage searchObject()
			{
				return sp= new SearchPage(driver);
			}
	public OfferPage offerObject()
	{
		return op= new OfferPage(driver);
	}
	
	public checkOut checkOutObject()
	{
		return ch= new checkOut(driver);
	}
}

