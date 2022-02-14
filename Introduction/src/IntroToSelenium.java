import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IntroToSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setting Chrome Driver
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		
		//Edge
		System.setProperty("webdriver.edge.driver","C:\\Users\\user\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
