package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.LoginPage;
import objectRepository.SignUpPage;

public class LoginApplication {
	@Test
	public void loginPge() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sso.teachable.com/secure/9521/identity/login");
		LoginPage login=new LoginPage(driver);
		login.emailId().sendKeys("Sree");
		login.password().sendKeys("Bhia");
		//login.submit().click();
		Thread.sleep(5000);
		SignUpPage signupPage=new SignUpPage(driver);
		signupPage.signUp().click();
		
	}
	
	
	

}
