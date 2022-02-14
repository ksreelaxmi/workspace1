import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class InvokingMulTabsWindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		// Switching new Tab
		driver.switchTo().newWindow(WindowType.TAB);

		Iterator<String> windows = driver.getWindowHandles().iterator();
		String parentId = windows.next();
		String childId = windows.next();

		// Switching child Tab
		driver.switchTo().window(childId);
		driver.navigate().to("https://rahulshettyacademy.com/#/index");

		// Capturing first courseName from child tab using cssSelector
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
				.get(1).getText();

		System.out.println("courseName is " + courseName);

		// Switching parent Tab
		driver.switchTo().window(parentId);
		
		// sending courseName to name element in parent tab
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(courseName);
		
		//Capturing Screenshot
		File file = name.getScreenshotAs(OutputType.FILE);
		
		//Coping ss into .png
		Files.copy(file, new File("NameSS.png"));
		
		//getting dimensions of height
		System.out.println(name.getRect().getHeight());
		
		//getting dimensions of width
		System.out.println(name.getRect().getWidth());
		
	   //	System.out.println(name.getRect().getDimension().getHeight());--->we can also write this way also 

	}

}
