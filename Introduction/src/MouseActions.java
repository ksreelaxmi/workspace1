import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b"))).
		moveToElement(driver.findElement(By.id("menu_admin_Qualifications"))).
		moveToElement(driver.findElement(By.id("menu_admin_viewLanguages"))).
	//	moveToElement(driver.findElement(By.xpath("(//i[contains(@class,'icp-radio')])[3]"))).click().
		
		
		perform();
		driver.findElement(By.xpath("//tr[@class='odd'][1]/td[1]")).click();

	}

}
