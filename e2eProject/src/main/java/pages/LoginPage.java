package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	By emailId=By.cssSelector("input[type='email']");
	By password=By.id("user_password");
	By login=By.cssSelector("input[name='commit']");
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement enterEmailId() {
		return driver.findElement(emailId);
	}
	
	public WebElement enterPassword() {
		return driver.findElement(password);
	}
	
	public WebElement clickLoginButton() {
		return driver.findElement(login);
	}

}
