package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LandingPage;
import resources.base;

public class VeifyTitle_TC2 extends base{
	public WebDriver driver;
	@BeforeMethod
	public void initilize() throws IOException {
		driver=	initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void validateTitle() throws IOException
	{
		
		LandingPage landingPage=new LandingPage(driver);
		Assert.assertEquals(landingPage.getTitle().getText(), "FEATURED COURSES");
		//Assert.assertTrue(landingPage.getContactNavBar().isDisplayed());
		
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}


}
