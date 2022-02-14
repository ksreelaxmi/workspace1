import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		// Adding adults 
		for(int i=1;i<8;i++) {
			  driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		// decreasing adults
		for(int j=5;j>1;j--) {
			//5,4,3,
			driver.findElement(By.id("hrefDecAdt")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	

		driver.findElement(By.id("btnclosepaxoption")).click();
		
	}	
}
