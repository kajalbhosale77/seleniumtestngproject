package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass1 {
	
	// browser code -- 
	
	public WebDriver driver;
	 
	 public void driverInitilization() throws IOException {
	
		 //properties file data reading--
FileInputStream fis = new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\SeleniumTestngFramework\\src\\main\\java\\resources\\data.properties");   
   
	//access the data from properties file--


Properties prop = new Properties();

prop.load(fis);   //loading file prop which is already read
 
String browserName = prop.getProperty("browser");

if(browserName.equalsIgnoreCase("chrome")) {
	
	 driver= new ChromeDriver();
	
	}else if (browserName.equalsIgnoreCase("firefox")) {
		
	 driver= new FirefoxDriver();
		
}else if (browserName.equalsIgnoreCase("edge")) {
			
	 driver= new EdgeDriver();
			
	}

else {
	System.out.println("please choose proper driver valuse"); 			 
}
	 
      }
	 	 
	  
} 

