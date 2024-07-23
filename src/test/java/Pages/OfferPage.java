package Pages;

import org.openqa.selenium.*;

public class OfferPage
{
	WebDriver driver;
	public OfferPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	private By prname=By.id("search-field");
	//By expectedText=By.xpath("//td[contains(text(),"+expectedString+")]");
	
	
	
	public void sendName(String name)
	{
		driver.findElement(prname).sendKeys(name);
	}
	
	public String getTheText(String expectedString)
	{
		return driver.findElement(By.xpath("//td[contains(text(),"+expectedString+")]")).getText();
	}

}
