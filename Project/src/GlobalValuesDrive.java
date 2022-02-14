import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {

		// Properties will read/scan the data in .property files
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\Project\\src\\data.properties");
		prop.load(fis); // will load file in read mode
		System.out.println(prop.getProperty("browser")); //using getProperty(key) will get value of the key.
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "firefox"); // here we are setting/assigning the value from chrome to firefox, browser value could not change in properties folder bcoz its in a read mode
		System.out.println(prop.getProperty("browser"));
       //file is write mode using FileOutputStream
		FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\eclipse-workspace\\Project\\src\\data.properties");
		// To reflect the changes in property file, we need to use store(). 
		prop.store(fos, null);

	}

}
