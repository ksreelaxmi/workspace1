package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class base {
	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {
		 prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\user\\eclipse-workspace\\e2eProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {

			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\user\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();

		}

		else if (browserName.equals("firefox")) {
			// For firefox browser
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;

	}
	
	public void takeScreenshot(String testCaseName,WebDriver driver) throws IOException {
	TakesScreenshot ss=	(TakesScreenshot)driver;
	File source=ss.getScreenshotAs(OutputType.FILE);
	String destination=System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	Files.copy(source, new File(destination));
	}

}
