import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveAssignmentDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("autocomplete")).sendKeys("Unit");
		Thread.sleep(3000);
		int count = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div")).size();

		for (int i = 0; i < count; i++) {

			String option = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div")).get(i).getText();

			if (option.contains("United Kingdom")) {
				driver.findElements(By.cssSelector("li[class='ui-menu-item'] div")).get(i).click();
				break;
			}
		}

	}

}
