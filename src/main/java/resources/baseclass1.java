package resources;

	
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
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
	  
	 		// Properties file data reading -- 
	 		FileInputStream fis = new FileInputStream( 
	 				"C:\\Users\\bhagy\\Desktop\\Technogeecks\\10thjan24SeelniumTestngFramework\\src\\main\\java\\resources\\data.properties"); 
	  
	 		// Access the data from properties file -- 
	  
	 		Properties prop = new Properties(); 
	  
	 		prop.load(fis); 
	  
	 		String browserName = prop.getProperty("browser"); 
	  
	 		if (browserName.equalsIgnoreCase("chrome")) { 
	  
	 			  driver = new ChromeDriver(); 
	  
	 		} else if (browserName.equalsIgnoreCase("firefox")) { 
	  
	 			 driver = new FirefoxDriver(); 
	 		} else if (browserName.equalsIgnoreCase("edge")) { 
	  
	 			 driver = new EdgeDriver(); 
	 		} else { 
	  
	 			System.out.println("please choose proper driver value"); 
	 		} 
	  
	 	} 
	  
	 }

