import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// assertFalse()--using isSelected method we can know whether is it selected or not
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).isSelected());
		
		//select the checkbox
		driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).click();
		
		//assertTrue()
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).isSelected());
		
		// count of checkboxes there in page
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		//assertEquals()
		Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), 6);
		

	}

}
