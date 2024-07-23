package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage 

{
	WebDriver driver;
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By searchName= By.xpath("//input[@type='search']");
	By searchText= By.cssSelector("h4.product-name");
	private By topDealsLink= By.linkText("Top Deals");
	By decre= By.xpath("//div[@class='product']/h4[contains(text(),'Tomato')]/../div[2]/a[@class='decrement']");
	By incre= By.xpath("//div[@class='product']/h4[contains(text(),'Tomato')]/../div[2]/a[@class='increment']");
	By addToCart= By.xpath("//button[text()='ADD TO CART']");
	By cart= By.xpath("//img[@alt='Cart']");
	By checkOut= By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	
	public void clickOnLink()
	{
		driver.findElement(topDealsLink).click();
	}
	
	
	public void sendName(String str)
	{
		driver.findElement(searchName).sendKeys(str);
	}
	
	public String getTheText()
	{
		String str= driver.findElement(searchText).getText();
		return str;
	}
	
	public void addItem(String item, int num)
	{
		for(int i=1;i<num;i++)
			driver.findElement(By.xpath("//div[@class='product']/h4[contains(text(),"+item+")]/../div[2]/a[@class='increment']")).click();;
			
	}
	
	public void reduceItem(String item)
	{
		driver.findElement(By.xpath("//div[@class='product']/h4[contains(text(),"+item+")]/../div[2]/a[@class='decrement']")).click();;
	}
	
	public void addtocart()
	{
		driver.findElement(addToCart).click();
	}
	public void ProceedToBuy()
	{
		
		driver.findElement(cart).click();
		driver.findElement(checkOut).click();
		
	}
	
}
