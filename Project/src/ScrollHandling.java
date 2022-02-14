import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// driver.findElement(By.className("tableFixHead"));
		
		
// Table is in headless mode, using below JavascriptExecutor browser will scroll to down and then table will be on focus
		// we can perform the actions without scrolling(headless mode) also but sometimes the results are inconsistent
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,600)");

		//scrolling inside a table 
		//scrollTop means the rows are moving to top which means scrolls to down
		executor.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        
		
		driver.findElements(By.cssSelector("div[class='tableFixHead'] td:nth-child(4)"));

		int count = driver.findElements(By.cssSelector("div[class='tableFixHead'] td:nth-child(4)")).size();
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum = sum + Integer.parseInt(
					driver.findElements(By.cssSelector("div[class='tableFixHead'] td:nth-child(4)")).get(i).getText());

		}
		System.out.println(sum);
		driver.findElement(By.cssSelector(".totalAmount")).getText();
		int Total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		System.out.println("The total is  " + Total);
		Assert.assertEquals(sum, Total);
	}

}
