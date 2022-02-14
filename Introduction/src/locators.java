import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//Id
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		
		//name
		driver.findElement(By.name("inputPassword")).sendKeys("rahul");
		
		//classname
		driver.findElement(By.className("signInBtn")).click();
		
		//Fetching the data using getText() from browser
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//linktext
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		// customized cssSelector i.e, cssSelector with attribute
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Sreelaxmi");
		
		//xpath
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("hhkxhgk");
		
		//xpath with Index
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		//cssSelector with Index
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("John123@gmail.com");
		
		//Traversing from parent to child with tagname,Index using xpath
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("98765894870");
		
		//cssSelector with className
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//Traversing from parent to child using cssSelector 
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		//Traversing from parent to child with atrribute and index using xpath
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		
		//id
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		
		//locating element using partial attribute value using cssSelector regularExpression 
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		//id
		driver.findElement(By.id("chkboxOne")).click();
		
		//locating element using partial attribute value using xpath regularExpression 
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		
	   // driver.close();

	}

}
