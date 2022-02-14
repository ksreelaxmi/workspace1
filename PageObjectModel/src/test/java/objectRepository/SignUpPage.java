package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	WebDriver driver;
	public SignUpPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//By signUp=	By.linkText("Sign Up");
//public WebElement signUp() {
//	return driver.findElement(signUp);
//}

@FindBy(xpath="(//div/a)[2]")
WebElement signUp;

public WebElement signUp() {
	return signUp;
}





}
