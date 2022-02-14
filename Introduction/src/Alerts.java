import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("XYZ");
		driver.findElement(By.cssSelector("[value='Alert']")).click();
		//Capturing data/message from alert
		System.out.println(driver.switchTo().alert().getText());
		//Clicking on OK button using accept()
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		//Clicking on Cancel button using dismiss()
		driver.switchTo().alert().dismiss();
		

	}

}
