package PageObjectModel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterationPageObject {

	public WebDriver driver;
	//this driver is null--this dont have any scope
	
	//we will store locators here i.e xpath
	
	//driver.findElement(By.xpath"").click()
	
	private By myAccount= By.xpath("//a[@title='My Account']");
	private By Register= By.xpath("//a[text()='Register']");
	
	private By FirstName = By.xpath("//input[@name='firstname']"); 
 	private By LastName = By.xpath("//input[@name='lastname']"); 
 	private By email = By.xpath("//input[@name='email']"); 
 	private By telephone = By.xpath("//input[@name='telephone']"); 
 	private By password = By.xpath("//input[@name='password']"); 
 	private By confirmpassword = By.xpath("//input[@name='confirm']"); 
 	private By checkbox = By.xpath("//input[@type='checkbox']"); 
 	private By submit = By.xpath("//input[@type='submit']"); 
	
	
	
	//created constructor
	public RegisterationPageObject(WebDriver driver2) {
		
		this.driver=driver2;
		//we give scope here
	}

	public WebElement clickOnMyAccount() {
		
		return driver.findElement(myAccount);
		
	}
  public WebElement clickOnMyRegister() {
		
		return driver.findElement(Register);
		
	}
	
  public WebElement enterFirstName() { 
		return driver.findElement(FirstName); 
	} 

	public WebElement enterlastName() { 
		return driver.findElement(LastName); 
	} 

	public WebElement enteremailid() { 
		return driver.findElement(email); 
	} 

	public WebElement entertelephoneno() { 
		return driver.findElement(telephone); 
	} 

	public WebElement enterPassword() { 
		return driver.findElement(password); 
	} 

	public WebElement enterconfirmpassword() { 
		return driver.findElement(confirmpassword); 
	} 

	public WebElement clickoncheckbox() { 
		return driver.findElement(checkbox); 
	} 

	public WebElement clickoncontinue() { 
		return driver.findElement(submit); 
	} 

	
}
