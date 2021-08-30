package mod8withoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage {

WebDriver driver;
	
	// Constructor
	public LoginPage(WebDriver driver)
	{
		// "this" keyword is used here to distinguish global and local varaible "driver"
		this.driver=driver;
	}
	
	
	// Locator for sign in button
	By loc_emailAddress= By.name("identifier");
	By loc_password= By.name("password");
	By loc_emailInButton= By.xpath("//*[@id=\"identifierNext\"]/span");
	By loc_pwdInButton= By.xpath("//*[@id=\"passwordNext\"]/span/span");
	
	// Type email address
	public void typeEmailAddress(String emailAddress)
	{
		driver.findElement(loc_emailAddress).sendKeys(emailAddress);		
	}
	
	
	// Type password
	public void typePassword(String password) throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(loc_password).click();
		driver.findElement(loc_password).sendKeys(password);
	}
	
	// Click on email sign in button
	public void clickOnEmailInButton()
	{
		driver.findElement(loc_emailInButton).click();
	}
	
	// Click on password sign in button
	public void clickOnPwdInButton()
	{
		driver.findElement(loc_pwdInButton).click();
	}
	
	// Single method to sign in
	public void signIn(String emailAddress, String password) throws InterruptedException
	{
		typeEmailAddress(emailAddress);
		clickOnEmailInButton();
		typePassword(password);
		clickOnPwdInButton();
		
	}
}