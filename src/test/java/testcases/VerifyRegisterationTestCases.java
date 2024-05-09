package testcases;


import java.io.IOException; 


import org.testng.annotations.Test; 
 
import PageObjectModel.RegisterationPageObject; 
import resources.baseclass1; 


public class VerifyRegisterationTestCases extends baseclass1 {
	
	
 	@Test 
 	public void verifyRegisterationWithValidData() throws IOException, InterruptedException { 
  
 	 
 		driverInitilization(); 
 		//This driver have scope---  
 		 
 		driver.get("https://naveenautomationlabs.com/opencart/"); 
  
 		RegisterationPageObject rpo = new RegisterationPageObject(driver); 
  
 		rpo.clickOnMyAccount().click(); 
 		rpo.clickOnMyRegister().click(); 
 		rpo.enterFirstName().sendKeys("test"); 
 		rpo.enterlastName().sendKeys("test"); 
 		rpo.enteremailid().sendKeys("email"); 
 		Thread.sleep(4000); 
 		rpo.entertelephoneno().sendKeys("8456780090"); 
 		rpo.enterPassword().sendKeys("secure"); 
 		rpo.enterconfirmpassword().sendKeys("secure"); 
 		rpo.clickoncheckbox().click(); 
 		rpo.clickoncontinue().click(); 
  
 	} 
 	 
}
