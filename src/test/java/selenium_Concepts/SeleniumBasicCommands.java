package selenium_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//use shortcut- cntrl+shift+o


public class SeleniumBasicCommands {
	
	public static void main(String[] args) {
	
	//reference       //obj
	//interface       //class
		
	WebDriver driver=new ChromeDriver();

	
	//1.To launch driver
	driver.get("http://www.amazon.in/");
	
	
	//2.To get the current url
	
	String url=driver.getCurrentUrl();
	
	System.out.println(url);
	
	//3.To print he title
	
	System.out.println(driver.getTitle());
	
	driver.navigate().back()	;
	
	driver.navigate().forward();
	
	driver.navigate().refresh();
	
	driver.close();
	
	}

}