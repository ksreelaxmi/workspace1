import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/");
	//	driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
		driver.get("http://admin:admin@the-internet.herokuapp.com/");//passing username and password in the url
		driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();

	}

}
