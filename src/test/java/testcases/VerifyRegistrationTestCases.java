package testcases;


import java.io.IOException; 

import org.openqa.selenium.By; 
import org.testng.annotations.Test; 
 
import resources.baseClass1; 

public class VerifyRegisterationTestCases extends baseClass1{ 
	 
	 
 	@Test 
 	public void verifyRegisterationWithValidData() throws IOException { 
 		 
 		driverInitilization(); 
 		driver.get("https://naveenautomationlabs.com/opencart/"); 
 		 
 		 
 		//driver.findElement(By.xpath("accountxpath")).click(); 
 		 
 		 
 	 
 		 
 	} 
 	 
 	 
  
 }

