package stepDef;

import org.junit.Assert;

import utilities.TestContextSetup;
import io.cucumber.java.en.Then;
//import junit.framework.Assert;

public class stepDefinitionsCart 

{
	TestContextSetup tcs;
	public stepDefinitionsCart(TestContextSetup tcs)
	{
		this.tcs= tcs;
	}
	
	@Then("the cart displays the same number")
	public void the_cart_displays_the_same_number() {
		System.out.println("number check");
	   String num= tcs.obj.checkOutObject().getTheCount(tcs.LandingPageProduct);
	   System.out.println(num);
	   int n= Integer.valueOf(num);
	   System.out.println(n);
	   if(n!=tcs.noOfItems)
	   {
		   //Assert.assertEquals(n, tcs.noOfItems, "No of items are not matching");
		   Assert.fail("No of items are not matching");
	   }
	   
	}
	
	@Then("i am able to place the order")
	public void apply_and_place_order_buttons_are_enabled_in_the_cart_page() {
	    // Write code here that turns the phrase above into concrete actions
	    tcs.obj.checkOutObject().placeOrder();
	}
	

}
