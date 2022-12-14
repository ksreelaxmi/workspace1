package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Day4 {
	@Parameters({"URL","Key"})
	@Test
	public void APIHomeLoan(String url,String Key) {
		System.out.println("APICarLoan");
		System.out.println(url);
		System.out.println(Key);
		
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}  
	
	@BeforeTest
	public void before() {
		System.out.println("I will execut first");
	}
	@Test
	public void WebHomeLoanLogin() {
		System.out.println("WebCarLoanLogin");
	}
	
	@Test(groups= {"Smoke"})
	public void WebHomeLoanLogout() {
		System.out.println("WebHomeLoanLogout");
	}
	@Parameters({"URL","Key"})
	@Test
	public void MobileHomeLoan(String url,String Key) {
		System.out.println("MobileHomeLoan");
		System.out.println(url);
		System.out.println(Key);
	}

}
