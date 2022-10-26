import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.get("https://rahulshettyacademy.com/loginpagePractise");
		driver.findElement(By.xpath("//body/a[1]")).click();
		driver.close();//It will close parent window i.e the page which is originally opened using selenium
		//driver.quit();// It will close all associated windows
	}

}

