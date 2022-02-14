import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ItemsAddToCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j=0;
		String[] itemsArray= {"Cucumber","Carrot","Beans"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		List<WebElement> items=driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i=0;i<items.size();i++) {
			
			String[] itemName=items.get(i).getText().split("-");
			//Strin[0]--> Tomato
			//String[1]--> -1 kg
			String actualVegName=itemName[0].trim();
			//Converting array to arrayList
			List itemsLst = Arrays.asList(itemsArray);
			//comparing the item name is present in above array if its present then it will add to cart.
			if(itemsLst.contains(actualVegName)) {
				j++;
				//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				//If we use above xpath using text(), the values are changing dynamically["add to cart" to "added"] so it couldn't be selected correct item.
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsArray.length) {
					break;
				}
				
			}
			
			
		}

	}

}
