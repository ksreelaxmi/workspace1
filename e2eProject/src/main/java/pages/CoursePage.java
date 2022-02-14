package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CoursePage {

	WebDriver driver;
	By user=By.xpath("//a/span[@class='navbar-current-user']");
	
	public CoursePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getUser() {
		return driver.findElement(user);
	}

}
