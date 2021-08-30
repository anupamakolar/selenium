package exercises;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Keys;


public class Mod4cs1 {
	

public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\Anu\\Selenium\\Training\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe"
				);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.goindigo.in/?linkNav=home_header");
		
		//Set Origin as Bengaluru
		driver.findElement(By.xpath("//input[@name='or-src']")).click();
		driver.findElement(By.xpath("//input[@name='or-src']")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//input[@name='or-src']")).sendKeys(Keys.RETURN);
		 
		WebDriverWait wait = new WebDriverWait(driver,50);
		 
		 //Set Destination as Lucknow
		WebElement elementLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='or-dest']")));
		elementLink.click();
		elementLink.sendKeys("Lucknow");
		elementLink.sendKeys(Keys.ENTER);
		 
		Thread.sleep(3000);
		 
		 //Select the Departure Date element as today
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();
		 
		 //Set the passengers as 3 Adults and 2 kids
		Thread.sleep(4000);	
		driver.findElement(By.name("passenger")).click();

		 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/ul/li[1]/div/button[2]")).click();
		 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/ul/li[1]/div/button[2]")).click();
		 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/ul/li[2]/div/button[2]")).click();
		 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/ul/li[2]/div/button[2]")).click();
	
		 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/div/button")).click();
		 
		 //Click on Search button and wait for the list of flights
		 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[7]/div[6]/button")).click();
	}
}