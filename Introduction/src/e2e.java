import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// Selecting FROM address DROPDOWN
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		// Selecting the city
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		Thread.sleep(2000);
		// Selecting TO address Dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		// selecting city from To ADdress using parent child xpath attributes because we
		// have 2 instances[ Hyderabad is there in from and To address]
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']"))
				.click();
		// WE CAN SELECT USING INDEX ALSO [ALTERNATE TO ABOVE XPATH]
		// driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();

		// IN cssSelector if class value has space then replace it with dot(.)
		// Ex: class name: ui-state-default ui-state-highlight---> In cssSelector->
		// .ui-state-default.ui-state-highlight
		// Selecting TOday's Date in Depart date Calender
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		// selecting ONe_WAY trip
		driver.findElement(By.cssSelector("label[for='ctl00_mainContent_rbtnl_Trip_0']")).click();

		// checking Return date is disabled or not because One way is selected which
		// means return calender should be disabled
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("Its Disabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);// if Return date calender is enabled then test will fail because ONE WAY trip
										// is selected
		}
		// selecting Passengers dropdown
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(2000);

		// Selecting 4 Adults from Passengers dropdown
		for (int j = 1; j < 5; j++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			// 5
		}

		// selecting 4 child from Passengers dropdown
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncChd")).click();
			// 5
		}

		// Decrementing 2 adults from Passengers dropdown
		for (int j = 9; j > 7; j--) {
			driver.findElement(By.id("hrefDecAdt")).click();
		}

		// Printing Passengers dropdown count
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());

		// clicking on Done button
		driver.findElement(By.id("btnclosepaxoption")).click();

		// Selecting Currency Dropdown
		Select items = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		items.selectByVisibleText("USD");

		//Selecting Country from autoSuggestive Dropdown
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}

		// clicking on search button
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
