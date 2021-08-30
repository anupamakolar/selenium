package mod8withPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class LogoutPage {

WebDriver driver;
	
	// Constructor
	public LogoutPage(WebDriver driver)
	{
		// "this" keyword is used here to distinguish global and local varaible "driver"
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locator for sign out buttons
	@FindBy(xpath="//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div[2]/div/a/span")
	WebElement userid;
	@FindBy(xpath="//*[@id=\"gb_71\"]")
	WebElement signout;
	
	/*
	By loc_userid= By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div[2]/div/a/span");
	By loc_signout= By.xpath("//*[@id=\"gb_71\"]");
	*/
	
	// Click on user id button
	public void clickOnUserIdButton()
	{
		userid.click();
	}
	
	// Click on email sign in button
	public void clickOnSignOutButton() throws InterruptedException
	{
		Thread.sleep(3000);
		signout.click();
	}

	public void signOut() throws InterruptedException
	{
		clickOnUserIdButton();
		clickOnSignOutButton();
		
	}

}
