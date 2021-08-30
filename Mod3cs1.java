package exercises;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;

public class Mod3cs1 {

	public static void main(String[] args) throws InterruptedException {

				//Launch Chrome browser using Selenium Webdriver
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\Anu\\Selenium\\Training\\Selenium\\drivers\\chromedriver.exe"
						);
				WebDriver driver = new ChromeDriver();
				
				//Set the Selenium pageload timeout - this command may be depreciated now
		
				//driver.manage().timeouts().pageLoadTimeout(350, TimeUnit.SECONDS);
							
				//Navigate to https://seleniumautomationpractice.blogspot.com/"
				driver.get("https://seleniumautomationpractice.blogspot.com/");
				
				
				//Maximize the Browser Window
				driver.manage().window().maximize();
				
				
				//Set implicit wait for all the activities
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				//Set selenium script timeout and execute any asynchronous script
				driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
				
				//sleep Wait command
				Thread.sleep(5000);
				
				driver.findElement(By.name("ts_first_name")).sendKeys("Anupama");
			
				driver.findElement(By.name("ts_last_name")).sendKeys("Krishnamurthy");
			
				driver.findElement(By.name("Submit1")).click();
		
				//Add explicit wait for page to navigate to "LinkText-5" and click on the link
				
				WebDriverWait wait = new WebDriverWait(driver, 20);
				  
				wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LinkText-5"))).click();			
				
				//Navigate back to the previous page
				
				driver.navigate().back();
			
				//Wait for the whole page to be loaded amd get the title of the page
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				String Pgtitle = driver.getTitle();
				System.out.println(Pgtitle);
				
				//Validate the page title to be "Selenium 3.0 Webdriver Online Training"
				
				boolean Result = Pgtitle.equals("Selenium Automation Practice");
				
				System.out.println("Validation Result: " + Result);

				//Add a fluent wait script to wait for whole page to be loaded under "All course"
				
				FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
					       .withTimeout(30, TimeUnit.SECONDS)
					       .pollingEvery(5, TimeUnit.SECONDS)
					       .ignoring(NoSuchElementException.class);				
	
				  
				wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LinkText-6"))).click();			
	
				//Navigate back to the previous page
				
				driver.navigate().back();

				
				//Close and Quit the browser 
				driver.close();
				driver.quit();
				

	}

}
