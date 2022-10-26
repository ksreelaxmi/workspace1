import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
       	
       String downloadPath=	System.getProperty("user.dir");
       	
       	HashMap<String,Object> chromePrefs=new HashMap<String,Object>();
       	chromePrefs.put("profile.default_content_settings.popups", 0);
       	chromePrefs.put("download.default_directory", downloadPath);
       ChromeOptions options=new ChromeOptions();
       options.setExperimentalOption("prefs", chromePrefs);
       	
       WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.adobe.com/in/acrobat/online/word-to-pdf.html");
		Thread.sleep(3000);
		driver.findElement(By.id("lifecycle-nativebutton")).click();
		Thread.sleep(3000);
      	String filePath="C:\\Users\\user\\AutoItUpload\\Upload.exe";
       	Runtime.getRuntime().exec(filePath);
      	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
       	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test-id='download']")));
       	
       	driver.findElement(By.xpath("//button[@data-test-id='download']")).click();
		System.out.println(downloadPath);
		
       	File downloadedFilePath=new File(downloadPath+"\\KSreelaxmi_Resume.pdf");
       	System.out.println(downloadedFilePath+ "  downloadedFilePath");
       	Thread.sleep(3000);
	if(downloadedFilePath.exists()) {
		System.out.println("File found");
		Assert.assertTrue(downloadedFilePath.exists());
		
		if(downloadedFilePath.delete())
		{
			System.out.println("file deleted");
		}
	}
		
		
		
//		driver.findElement(By.xpath("//span[text()='Select WORD files']")).click();
//		Thread.sleep(3000);
//		String filePath="C:\\Users\\user\\AutoItUpload\\Upload.exe";
//		Runtime.getRuntime().exec(filePath);
//		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Convert to PDF']")));
//	driver.findElement(By.xpath("//span[text()='Convert to PDF']")).click();
//		
	//span[text()='Convert to PDF']
		
//	
//	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#processTaskTextBtn")));
//	driver.findElement(By.cssSelector("#processTaskTextBtn")).click();
////	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='pickfiles']")));
////	driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
////	File downloadedFilePath=new File("C:\\Users\\user\\Downloads\\Resume.pdf");
////		if(downloadedFilePath.exists()) {
////			System.out.println("File found");
////		}
		
		

	}

}
