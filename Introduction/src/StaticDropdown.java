import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	WebElement dropDown=	driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select selectDropdown=new Select(dropDown);
	
	selectDropdown.selectByIndex(2);
	System.out.println(selectDropdown.getFirstSelectedOption().getText());
	
	selectDropdown.selectByValue("INR");
	System.out.println(selectDropdown.getFirstSelectedOption().getText());
	
	selectDropdown.selectByVisibleText("USD");
	System.out.println(selectDropdown.getFirstSelectedOption().getText());
	
	
	}

}
