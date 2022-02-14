package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@Parameters({"URL"})//getting url from xml file
	
	@Test
	public void WebHomeCarLoanLogin(String url) {
		System.out.println("WebCarLoanLogin");
		System.out.println(url);
	}
	@Test(dataProvider="getData")
	public void dataProvider(String uname, String password) {
		System.out.println("WebCarLoanLogin");
		System.out.println(uname);
		System.out.println(password);
	}
	@DataProvider
	//to provide data to the methods
	public Object[][] getData() {
		// We are checking with 3 diff scenarios so 3 and we are passing username and password so secound in array is 2
		Object[][] data=new Object[3][2];
		//1st Combination
		data[0][0]="firstUsername";
		data[0][1]="firstPassword";
		//2nd Combination
		data[1][0]="secondUsername";
		data[1][1]="secondPassword";
		//3rd Combination
		data[2][0]="thirdUsername";
		data[2][1]="thirdPassword";
	return data;
	}
	@Test(enabled=false)// to skip from execution or triggering
	public void WebHomeCarLoanHome() {
		System.out.println("WebCarLoanLogout");
	}
	@BeforeMethod(alwaysRun=true)// if we want to run this method in groups also,then we have set to alwaysRun=true
	public void eachMethod() {
		System.out.println("I will execute before each and every method in this class");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I will execute after each and every method in this class");
	}
	
	@Test(dependsOnMethods= {"WebHomeCarLoanLogout","WebHomeCarLoanLogin"})
	public void APICarLoanHome() {//This method will execute after 2 above methods execution completed
		System.out.println("APICarLoanHome");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I will execute first in this suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I will execute lsst in this suite");
	}
	
	@Test(groups= {"Smoke"})
	public void WebHomeCarLoanLogout() {
		System.out.println("WebCarLoanLogout");
	}
	
	@Test(timeOut=4000)
	public void MobileLoginCarLoan() {
		System.out.println("MobileCarLoan");
	}
	
	@Test
	public void MobileCarLoan() {
		System.out.println("MobileCarLoan");
	}

}
