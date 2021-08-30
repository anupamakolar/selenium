package exercises;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Mod7cs1 {

	public static void main(String[] args)  throws InterruptedException, IOException{
		
		//Launch Chrome browser using Selenium Webdriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\Anu\\Selenium\\Training\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe"
		);

		WebDriver driver = new ChromeDriver();

		//Navigate to :https://www.FlipKart.com/"
		driver.get("https://www.FlipKart.com");		
		
		//Maximize the Browser Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Search for a Selenium book
		WebDriverWait wait = new WebDriverWait(driver,50);
			
		System.out.println("Starting search....");

		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		search.click();
		//System.out.println("Main screen....");
	
		
		search.sendKeys("Mastering Selenium Webdriver 30");
		search.sendKeys(Keys.RETURN);
		
		WebElement booklnk = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div"));
		booklnk.click();
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}

		//Check if it is delivered to the pin code specified
		
		Thread.sleep(5000);		
		WebElement pinlnk = driver.findElement(By.xpath("//*[@id=\"pincodeInputId\"]"));
		pinlnk.sendKeys("560056");

		Thread.sleep(5000);		
		WebElement chklnk = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[5]/div/div/div[1]/div[2]/div/div[2]/div[1]/span"));
		chklnk.click();

		//Print the duration needed
		
		Thread.sleep(5000);	
		WebElement dayslnk = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[1]/ul/div/div/span[1]"));
		String daystxt = dayslnk.getText();
		System.out.println("The book will be delivered in "+daystxt);
		
		//Add to the cart
		
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		
		
		//While checking out, give a random email id and password
		
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}		
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/form/button")).click();

		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}		
		Thread.sleep(5000);	
		WebElement maillnk = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input"));
		maillnk.sendKeys("aaa.bbbb@gmail.com");
		maillnk.sendKeys(Keys.RETURN);
		Thread.sleep(5000);	
		WebElement moblnk = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/input"));
		moblnk.sendKeys("987654321");
		moblnk.sendKeys(Keys.RETURN);
		
		//Capture the error message and capture the screen shot
		
        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver);
        
        //Call getScreenshotAs method to create image file

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File("C:\\Users\\Home\\Desktop\\screenshot.png");
        FileUtils.copyFile(SrcFile, DestFile);
        
        //Close and Quit
        
        driver.close();
        driver.quit();
      


	}

}
