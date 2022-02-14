package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	WebDriver driver;
	By login = By.linkText("Login");
	By title=By.xpath("//div[@class='text-center']/h2");
	By contactNavBar=By.xpath("//ul[@class='nav navbar-nav navbar-right']/li[8]");
	By popup=By.xpath("//button[text()='NO THANKS']");

	//Constructor--driver life will come from Login_TC1, driver is set to chrome.
	//we are not create object for driver so we are getting driver life from Login_TC1
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement clickLogin() {
		return driver.findElement(login);
	}
	
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	
	public WebElement getContactNavBar() {
		return driver.findElement(contactNavBar);
	}
	public WebElement getPopup() {
		return driver.findElement(popup);
	}
	public int getPopupSize() {
		return driver.findElements(popup).size();
	}

}
