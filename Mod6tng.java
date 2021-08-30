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

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class Mod6tng {
	
	static WebDriver driver;

	@Parameters({"user", "pass"})
	@Test(priority = 1, groups = {"A"})
	public void Login(String username, String passwd) throws InterruptedException{
		System.out.println("This is the Test Case 1");
		
		//Log in to the account
		
		driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/a[2]")).click();
		
		//Enter login details
		Thread.sleep(2000);		 
		WebDriverWait wait = new WebDriverWait(driver,50);
		WebElement nameLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"si_popup_email\"]")));
		nameLink.sendKeys(username);
		WebElement passLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"si_popup_passwd\"]")));
		passLink.sendKeys(passwd);
		WebElement clickLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"new_sign_up_mode\"]/div/div/div[2]/div[3]/form/button")));
		clickLink.click();
	}
	
	@Test(priority = 2, groups = {"A"})
	public void Browse() throws InterruptedException{
		
		//Browse for all the courses
		
		driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-mycourse-main/section/app-header-breadcrumb/section/div/div/div[1]/span[2]/a")).click();

	}	
	
	@Test(priority = 3, dependsOnMethods = "Browse", groups = {"A"})
	public void Goback() throws InterruptedException{
		driver.navigate().back();
	}
	
	
	@Test(priority = 10, dependsOnMethods = "Login", groups = {"A"})
	public void Logout() throws InterruptedException{
		
		//Logout of the account
		driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[8]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[8]/div/ul/li[12]/a")).click();
	}	
	
	@Test(priority = 4, groups = {"B"})
	public void Grouping() {
		System.out.println("This will execute as part of Group B");
	}
	
	
	@Test(priority = 5, enabled = false)
	public void Enabled() {
		System.out.println("This will not execute as it is NOT ENABLED");
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
		System.out.println("This will execute before every Class");
		
		//Maximize the Browser Window
		driver.manage().window().maximize();

	}

	@AfterClass
	public void afterClass() {
		System.out.println("This will execute after every Class");
		

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This will execute before the Test");
		
		//Navigate to https://www.edureka.co/"
		driver.get("https://www.edureka.co");	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterTest
	public void afterTest() {
		System.out.println("This will execute after the Test");
		//Close the browser 
		driver.close();

	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This will execute before the Test Suite");

		//Launch Chrome browser using Selenium Webdriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\Anu\\Selenium\\Training\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This will execute after the Test Suite");
		
		//Quit the browser 
		driver.quit();
	}
}
