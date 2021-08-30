package mod8withPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class LoginPage {

WebDriver driver;
	
	// Constructor
	public LoginPage(WebDriver driver)
	{
		// "this" keyword is used here to distinguish global and local varaible "driver"
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// Locator for sign in button
	@FindBy(name="identifier")
	WebElement txtEmailAddress;
	@FindBy(name="password")
	WebElement txtPassword;	
	@FindBy(xpath="//*[@id=\"identifierNext\"]/span")
	WebElement emailInButton;	
	@FindBy(xpath="//*[@id=\"passwordNext\"]/span/span")
	WebElement pwdInButton;
	/*
	By loc_emailAddress= By.name("identifier");
	By loc_password= By.name("password");
	By loc_emailInButton= By.xpath("//*[@id=\"identifierNext\"]/span");
	By loc_pwdInButton= By.xpath("//*[@id=\"passwordNext\"]/span/span");
	*/
	// Type email address
	public void typeEmailAddress(String emailAddress)
	{
		txtEmailAddress.sendKeys(emailAddress);		
	}
	
	
	// Type password
	public void typePassword(String password) throws InterruptedException
	{
		Thread.sleep(3000);
		txtPassword.click();
		txtPassword.sendKeys(password);
	}
	
	// Click on email sign in button
	public void clickOnEmailInButton()
	{
		emailInButton.click();
	}
	
	// Click on password sign in button
	public void clickOnPwdInButton()
	{
		pwdInButton.click();
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