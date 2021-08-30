package mod8withPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComposeMail {


WebDriver driver;
	
	// Constructor
	public ComposeMail (WebDriver driver)
	{
		// "this" keyword is used here to distinguish global and local varaible "driver"
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locator for compose buttons
	@FindBy(xpath="//*[@id=\":3z\"]/div/div")
	WebElement compose_id;	
	@FindBy(xpath="//*[@id=\":9p\"]")
	WebElement recipient_id;	
	@FindBy(xpath="//*[@id=\":9k\"]")
	WebElement to_id;	
	@FindBy(xpath="//*[@id=\":92\"]")
	WebElement subject_id;	
	@FindBy(xpath="//*[@id=\":a7\"]")
	WebElement txt_id;	
	@FindBy(xpath="//*[@id=\":8s\"]")
	WebElement send_id;
	/*
	By loc_compose_id= By.xpath("//*[@id=\":3z\"]/div/div");
	By loc_recipient_id = By.xpath("//*[@id=\":9p\"]");
	By loc_to_id = By.xpath("//*[@id=\":9k\"]");
	By loc_subject_id = By.xpath("//*[@id=\":92\"]");
	By loc_txt_id = By.xpath("//*[@id=\":a7\"]");
	By loc_send_id = By.xpath("//*[@id=\":8s\"]");
	*/
	
	// Click on compose id button
	public void clickOnComposeIdButton() throws InterruptedException
	{
		Thread.sleep(3000);
		compose_id.click();
		
	}
	

	
	// Enter the TO address
	public void typeAddress(String tomailAddress) throws InterruptedException
	{
		Thread.sleep(5000);
		to_id.sendKeys(tomailAddress);
		to_id.sendKeys(Keys.RETURN);
		
	}

	// Click on Subject button
	public void clickOnSubjectButton() throws InterruptedException
	{
		Thread.sleep(3000);
		subject_id.click();
		
	}

	// Enter Subject 
	public void enterSubject(String mailsub) throws InterruptedException
	{
		Thread.sleep(3000);
		subject_id.sendKeys(mailsub);
		subject_id.sendKeys(Keys.RETURN);
		
	}

	// Click on Text button
	public void clickOnTxtButton() throws InterruptedException
	{
		Thread.sleep(3000);
		txt_id.click();
		
	}

	// Enter Subject 
	public void enterTxt(String mailtxt) throws InterruptedException
	{
		Thread.sleep(3000);
		txt_id.sendKeys(mailtxt);
		
	}
	
	// Click on Send button
	public void clickOnSendButton() throws InterruptedException
	{
		Thread.sleep(3000);
		send_id.click();
	
	}
	
	public void compose(String tomailAddress, String mailsub, String mailtxt) throws InterruptedException
	{
		clickOnComposeIdButton();
		typeAddress(tomailAddress);
		clickOnSubjectButton();
		enterSubject(mailsub);
		clickOnTxtButton();
		enterTxt(mailtxt);
		clickOnSendButton();
		
	}
	
}
