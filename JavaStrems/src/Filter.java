import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.id("search-field")).sendKeys("Tomato");
        
		//capture the list, original filtering data
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
		
        // capture the list and filter the data
		List<WebElement> fliterdVeggis = veggies.stream().filter(veggi -> veggi.getText().contains("Tomato"))
				.collect(Collectors.toList());
        
		//Comparing size of them
		Assert.assertEquals(veggies.size(), fliterdVeggis.size());
		
	}

}
