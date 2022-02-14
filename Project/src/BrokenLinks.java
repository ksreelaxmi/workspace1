import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//all links 
	List<WebElement> links=	driver.findElements(By.xpath("//li[@class='gf-li']/a"));
	//SoftAssert will not fail immediately when its condition false, it will store all the failures and reprots it by assertAll()
	SoftAssert a=new SoftAssert();
	
	for(WebElement link:links) {
		String url=	link.getAttribute("href");// to get the url 
		HttpURLConnection con=(HttpURLConnection)new URL(url).openConnection();// To open the conncetion in network
		con.setRequestMethod("HEAD");
		con.connect();
		int responseCode=con.getResponseCode();
		System.out.println(responseCode);
		
		//when condition is false it will print the msg after all links executed
		a.assertTrue(responseCode<400, "The link with the text "+link.getText()+ " and res code is "+responseCode);
		
//		if(responseCode>400) {
//			System.out.println("The link with the text "+link.getText()+ " and res code is "+responseCode);
//			Assert.assertTrue(false);
	//	}
		
		
	}
		
	a.assertAll();

	}

}
