import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		Thread.sleep(2000);
		
		//Selecting 2nd dropdown using index of dropdown
		//driver.findElement(By.xpath("(//a[contains(@text,'Shirdi')])[2]")).click();
		
		//Alternate to select 2nd dropdown using Parent Xpath attribute , one space and child xapth attribute
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='COK']")).click();
		
	//WE CAN SELECT DYNAMIC DROPDOWN USING INDEXES AND PARENT CHILD XPATH ATTRIBUTES FOR 2ND DROPDOWN OR OTHER DROPDOWNS.
   
	}

}
