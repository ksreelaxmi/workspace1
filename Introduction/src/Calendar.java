import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
//		driver.findElements(By.className("day"));
//	int count=	driver.findElements(By.className("day")).size();
//	System.out.println(count);
//	for(int i=0;i<count;i++) {
//		
//		String Text=driver.findElements(By.className("day")).get(i).getText();
//		if(Text.equalsIgnoreCase("30")) {
//			driver.findElements(By.className("day")).get(i).click();
//			break;
//			
//		}
//	}
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("January"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}

		
		List<WebElement> dates= driver.findElements(By.xpath("//td[@class='day']"));
		//Grab common attribute//Put into list and iterate
		int count=driver.findElements(By.xpath("//td[@class='day']")).size();

		for(int i=0;i<count;i++)
		{
		String text=driver.findElements(By.xpath("//td[@class='day']")).get(i).getText();
		if(text.equalsIgnoreCase("30"))
		{
		driver.findElements(By.xpath("//td[@class='day']")).get(i).click();
		break;
		}

		}

		

	}

}
