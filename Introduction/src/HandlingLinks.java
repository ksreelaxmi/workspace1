import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		// to count no of links in a page
		System.out.println(driver.findElements(By.tagName("a")).size());
//to locate footer in a page
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		//to count no of links in a footer
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
//locating a first section of coulmn in footer
		WebElement coulmndriver = footerdriver.findElement(By.xpath("//tbody/tr/td/ul"));
		//getting links in that coulmn
		List<WebElement> linkToBeClink = coulmndriver.findElements(By.tagName("a"));
		//count of links in that coulmn
		int count = coulmndriver.findElements(By.tagName("a")).size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			//linkToBeClink.get(i).click();-------it will open in the same tab then other web elements could not be found and we need to navigate back to parent page
				linkToBeClink.get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
				//if we press control+enter then that link will be open in new tab
				Thread.sleep(3000);
			

		}
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while (it.hasNext()) //hasNext()---will checking next index is present or not
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		}
	}


