import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		driver.findElement(By.xpath("//input[@value='user']")).click();
		//Thread.sleep(2000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#okayBtn")));
		driver.findElement(By.cssSelector("#okayBtn")).click();
		Select options=new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		options.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".card-title")));
		List<WebElement> productLst=driver.findElements(By.cssSelector(".card-title"));
		for(int i=0;i<productLst.size();i++) {
			driver.findElements(By.cssSelector(".btn.btn-info")).get(i).click();
			
		}
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
	}

}