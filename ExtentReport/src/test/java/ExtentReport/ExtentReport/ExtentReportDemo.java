package ExtentReport.ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	ExtentReports extent;
	
	@BeforeTest
	public void config() {
		
		//"user.dir" means it will address the current project, in that it will create one folder with reports under that creates a index.html file.
		//if we right click on project-> properties , In properties we can get the where project is stored/created so we use getProperty()
	    String path=System.getProperty("user.dir")+"\\reports\\index.html";
	    //ExtentSparkReporter will create a html file with some configurations.
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		//To set reports name
		reporter.config().setReportName("Web Automation Results");
		//To set Title of the file
		reporter.config().setDocumentTitle("Test Results");
		
	     extent=new ExtentReports();
		//To attach reports to html file(ExtentSparkReporter)
		extent.attachReporter(reporter);
		//can give details
		extent.setSystemInfo("Tester", "Sreelaxmi");
		
	}
	
	@Test
	public void demo() {
		
		extent.createTest("Intial Demo");// will create a test in reports
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		extent.flush();//It will notify test is done and no more monitoring to this test
	}

}
