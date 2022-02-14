package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LandingPage;
import pages.LoginPage;
import resources.base;

public class Login_TC1 extends base {
	public WebDriver driver;// global var beacuse if we run this class in paarallel mode, all the calsses are pointing to driver in base class, it will be overidden by another class
	//so we are declaring here, no confusion will be there reg which test is holding driver 
	@BeforeMethod
	public void initilize() throws IOException {
		driver=	initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test(dataProvider="getData")
	public void basePageNavigation(String username, String password,String text) throws IOException, InterruptedException {
		
	
	
	//we can access other class methods using inheritance or object creation
	//LandingPage
	
	LandingPage landingPage=new LandingPage(driver);
	landingPage.clickLogin().click();
	
	//Login Page
	LoginPage loginPage=new LoginPage(driver);
	loginPage.enterEmailId().sendKeys(username);
	loginPage.enterPassword().sendKeys(password);
	loginPage.clickLoginButton().click();
	System.out.println(text);
		
	}

	@DataProvider
	public Object[][] getData() {
		//rows number means how many no of scenarios we are testing.
		//Column number how many values are passing per each test.
		//If array size is 2 means it will store it as 0,1 index
		Object[][] data=new Object[2][3];
		//Row0--scenario 1
		data[0][0]="User1";
		data[0][1]="Password1";
		data[0][2]="TestData";
		
		//Row1--sceanrio2
		data[1][0]="User2";
		data[1][1]="Password2";
		data[1][2]="testData2";
		return data;
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}
