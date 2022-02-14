import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Sibing--parent to child traverse using sibling
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		//Traversing from child to parent 
	//	driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a[2]")).click();
		
		//XPATH PARENT TO CHILD PARSING --SIBLING USING XPATH BY ATTRIBUTE
		//driver.findElement(By.xpath("//ul[@role='group']/li[1]/following-sibling::li")).click();
		
		
		//https://rahulshettyacademy.com/dropdownsPractise/


	}

}
