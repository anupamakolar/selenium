package mod8withoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogoutPage {

WebDriver driver;
	
	// Constructor
	public LogoutPage(WebDriver driver)
	{
		// "this" keyword is used here to distinguish global and local varaible "driver"
		this.driver=driver;
	}
	
	// Locator for sign out buttons
	By loc_userid= By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div[2]/div/a/span");
	By loc_signout= By.xpath("//*[@id=\"gb_71\"]");
	
	// Click on user id button
	public void clickOnUserIdButton()
	{
		driver.findElement(loc_userid).click();
	}
	
	// Click on email sign in button
	public void clickOnSignOutButton() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(loc_signout).click();
	}

	public void signOut() throws InterruptedException
	{
		clickOnUserIdButton();
		clickOnSignOutButton();
		
	}

}
