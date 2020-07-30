package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import core.DriverFactory;
import pages.HotelHomepage;

public class TestBase extends DriverFactory {
	
	//Objects for pages
	HotelHomepage home = null;
	
	//TestMethod
	@Test
	public void Executapplication()
	{
		home = new HotelHomepage(getDriver("chrome"));
		Assert.assertEquals(home.LaunchApplication("https://www.camdencourthotel.com/"), true, "Unable to load");
	}
	
	
	
	

}
