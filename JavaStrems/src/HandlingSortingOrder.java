import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingSortingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// clicking on 1st column to sort the items
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// captute all web elements
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));

		// capture text of all web elements into list
		List<String> originalList = veggies.stream().map(s -> s.getText()).collect(Collectors.toList());

		// sort on Original list(its already sorted on webpage)
		List<String> sortedList = veggies.stream().map(s -> s.getText()).sorted().collect(Collectors.toList());

		// comparing original list vs sortedList
		Assert.assertTrue(originalList.equals(sortedList));
		
		List<String> price;
        do {// we are doing do-while because initially we are searching on first page then if its not found then only we are clicking on next button.
		//scan the name coulmn with getText()->Banana--->print of price of that item
        	List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		 price = rows.stream().filter(s -> s.getText().contains("Wheat")).map(s -> getPrice(s))
				.collect(Collectors.toList());
		price.forEach(s -> System.out.println("The price of item is " + s));
		if(price.size()<1) {//doing pagination if item not found or item/price size is 0 then we have to click on "next" button, to search on next pages. If the item is found then it will comeout from loop 
			driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			
		}
        }while(price.size()<1);
		
		}

	
    //method for get the price of item
	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
		
		
	}

}
