import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor exe=(JavascriptExecutor)driver;
		exe.executeScript("window.scrollBy(0,600)");
		
		System.out.println("Rows are "+driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr")).size());
		
	System.out.println("The coulmns are  "+	driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr/th")).size());
	System.out.println("The Second Row is  "+driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]")).getText());

	}

}
