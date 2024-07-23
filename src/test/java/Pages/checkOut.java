package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkOut 

{
	WebDriver driver;
	By productName= By.xpath("//p[contains(text(),'Tomato')]");
	By applyButton= By.xpath("//button[text()='Apply']");
	By orderButton= By.xpath("//button[text()='Place Order']");
	
	public checkOut(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getTheCount(String item)
	{
		return driver.findElement(By.xpath("//tbody/tr/td/p[contains(text(),"+item+")]/../following-sibling::td/p")).getText().toString();
	}
	
	public void placeOrder()
	{
		driver.findElement(applyButton).isDisplayed();
		driver.findElement(orderButton).isDisplayed();
		driver.findElement(orderButton).click();
		
	}
	

}
