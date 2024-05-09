package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import resources.baseclass1;

public class VerifyLoginTestCases extends baseclass1{

	
	@Test
	public void VerifyLoginwithValidData() throws IOException, InterruptedException {
		
		
		driverInitilization();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login"); 
		 
 		
		LoginPageObjects lpo=new LoginPageObjects(driver); 
		
		 
 		lpo.enterEmail().sendKeys("email"); 
 		Thread.sleep(4000); 
 		lpo.enterPassword().sendKeys("secure"); 
 		lpo.clickOnLoginButton().click(); 
 		 
 		  	
	
	
	} 
 	 
}

