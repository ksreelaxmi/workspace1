import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingSSLCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create instance of ChromeOptions Class
				ChromeOptions handlingSSL = new ChromeOptions();
				//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
				handlingSSL.setAcceptInsecureCerts(true);				
				//Creating instance of Chrome driver by passing reference of ChromeOptions object
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver(handlingSSL);		
				//Launching the URL
				driver.get("https://expired.badssl.com/");
				System.out.println("The page title is : " +driver.getTitle());
				

	}

}
