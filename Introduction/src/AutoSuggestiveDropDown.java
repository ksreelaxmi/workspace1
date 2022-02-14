import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("aus");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		for(WebElement option: options) {
			if(option.getText().equalsIgnoreCase("Austria")) {
				option.click();
				break;
			}
		}

	}

	
}
