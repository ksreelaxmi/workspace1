import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("//label[@for='honda']/input")).click();
		String s = driver.findElement(By.xpath("//label[@for='honda']")).getText();

		Select options = new Select(driver.findElement(By.id("dropdown-class-example")));
		options.selectByVisibleText(s);

		driver.findElement(By.id("name")).sendKeys(s);
		driver.findElement(By.id("alertbtn")).click();

		String alertText = driver.switchTo().alert().getText();

		if (alertText.contains(s)) {
			System.out.println("text is present");
		} else {
			System.out.println("text is not present");
		}

	}

}
