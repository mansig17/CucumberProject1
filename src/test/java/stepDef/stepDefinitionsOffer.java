package stepDef;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.junit.Assert;

import Pages.OfferPage;
import Pages.SearchPage;
import utilities.TestContextSetup;
import io.cucumber.java.en.*;

public class stepDefinitionsOffer {
	String offerPageProduct;
	TestContextSetup tcs;
	
	
	//constructor to initialize the TestContextSetup object 
	public stepDefinitionsOffer(TestContextSetup tcs)
	{
		this.tcs= tcs;
	}
	
	
	@When("^When I search for (.+) in the offers pages$")
	public void when_i_search_for_in_the_offers_pages(String prname) throws InterruptedException 
	{
		
		tcs.obj.searchObject().clickOnLink();
		tcs.helpers.getToChildWindow();
		tcs.obj.offerObject().sendName(prname);
		Thread.sleep(3000);
		//tcs.driver.findElement(By.id("search-field")).sendKeys(prname);
	}
	@Then("^I am able to see (.+) in the offers$")
	public void i_am_able_to_see_in_the_offers(String expectedString)
	{
		tcs.offerPageProduct=tcs.obj.offerObject().getTheText(expectedString);
		System.out.println(tcs.offerPageProduct+"\n"+tcs.LandingPageProduct);
		if(tcs.offerPageProduct.equals(tcs.LandingPageProduct.trim()))
		{
			System.out.println("Product is present in the offers page as well!");
			//Assert.assertTrue(true, "Product is present in the offers page as well!");
			
		}
		else {
			Assert.fail();
		}
		
	}


}
