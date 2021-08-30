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
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class Mod6cs1 {
	
	WebDriver driver;

	@Test
	public void Test1() {
		System.out.println("This is the Test Case 1");
	}	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This will execute before every Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This will execute after every Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This will execute before the Class");
		//Launch Chrome browser using Selenium Webdriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\Anu\\Selenium\\Training\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@AfterClass
	public void afterClass() {
		System.out.println("This will execute after the Class");
		//Close and Quit the browser 
		driver.close();


	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This will execute before the Test");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("This will execute after the Test");

	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This will execute before the Test Suite");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This will execute after the Test Suite");
		driver.quit();
	}
/*
	public static void main(String[] args) throws InterruptedException {

				//Launch Chrome browser using Selenium Webdriver
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\Anu\\Selenium\\Training\\Selenium\\drivers\\chromedriver.exe"
						);
				WebDriver driver = new ChromeDriver();

				//Navigate to https://www.edureka.co/"
				driver.get("https://www.edureka.co");		
				
				//Maximize the Browser Window
				driver.manage().window().maximize();
				
				//Try registering with an existing account
				
				//Log in to the account
				
				//Browse for all the courses
				
				//Logout of the account
				
				//Inspect the search box with text "Search for a Course"
				
				//Get attributes id, name, xpath, class name, css values
				
				//ID
				driver.findElement(By.id("search-inp")).sendKeys("Selenium");
				
				driver.findElement(By.id("search-inp")).sendKeys(Keys.RETURN);				
				driver.navigate().back();
				
				//name
				driver.findElement(By.name("user_v1[query]")).sendKeys("JAVA");
				
				driver.findElement(By.id("search-inp")).sendKeys(Keys.RETURN);				
				driver.navigate().back();

				//classname
				driver.findElement(By.className("search_inp")).sendKeys("AWS");
				
				driver.findElement(By.id("search-inp")).sendKeys(Keys.RETURN);				
				driver.navigate().back();


				//Xpath
				driver.findElement(By.xpath("//*[@id=\"search-inp\"]")).sendKeys("Sel");
				
				driver.findElement(By.id("search-inp")).sendKeys(Keys.RETURN);				
				driver.navigate().back();
				
				//cssvalues
				driver.findElement(By.cssSelector("#search-inp")).sendKeys("Python");
				
				driver.findElement(By.id("search-inp")).sendKeys(Keys.RETURN);				
				driver.navigate().back();
				
				//Inspect the "Log In" link to get the link text and partial link text
	
				//LinkText
				driver.findElement(By.linkText("Log In")).click();	
				//driver.findElement(By.className("close")).click();

				driver.findElement(By.id("search-inp")).sendKeys(Keys.RETURN);				

				//partial link text
				driver.findElement(By.partialLinkText("Log")).click();	

				driver.findElement(By.id("search-inp")).sendKeys(Keys.RETURN);		
				
				//Close and Quit the browser 
				driver.close();
				driver.quit();
				

	}
*/
}
