package stepDef;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.junit.Assert;

import Pages.SearchPage;
import utilities.TestContextSetup;
import io.cucumber.java.en.*;

public class stepDefinitionsSearch   {

	static WebDriver driver;
	String LandingPageProduct, offerPageProduct;
	TestContextSetup tcs;
	
	public stepDefinitionsSearch(TestContextSetup tcs)
	{
		this.tcs= tcs;
	}
	
	
	@Given("i am in the dashboard page of the website")
	public void i_am_in_the_dashboard_page_of_the_website() throws InterruptedException, IOException
	{
		
		tcs.setDriver.setUpDriver();

	}
	@When("^i search for (.+) in search bar$")
	public void i_search_for_in_search_bar(String string) throws InterruptedException
	{
		
		tcs.obj.searchObject().sendName(string);
		Thread.sleep(2000);


	}
	@Then("^i am able to see (.+) in the results$")
	public void i_am_able_to_see_in_the_results(String prname)
	{
		String productName= tcs.obj.searchObject().getTheText();
		String[] s= productName.split("-");
		tcs.LandingPageProduct=s[0];
		if(tcs.LandingPageProduct.equals(prname))
		{
			Assert.assertTrue(true);
		}


	}
	
	@When("add {int} units of the product")
	public void increment_the_count_and_add_to_cart(int n) 
	{
		tcs.noOfItems=n;
	    tcs.obj.searchObject().addItem(tcs.LandingPageProduct, tcs.noOfItems);
	    System.out.print("Added the products");
	    tcs.obj.searchObject().addtocart();
	    System.out.println("Trying to go to the cart");
	    tcs.obj.searchObject().ProceedToBuy();
	}
	//@Then("Product gets added in the cart")
	//public void product_gets_added_in_the_cart()
	//{
		//System.out.print("test");
	    
	//}
	


}
