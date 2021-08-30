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


	public class Mod6tng2 {
		
		WebDriver driver1;

		
		@Test()
		public void Register() throws InterruptedException{
			System.out.println("This is the Registration Test Case");
			
			driver1 = exercises.Mod6tng.driver;
			
			//Try to register the account
			//Thread.sleep(2000);
			driver1.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/a[1]")).click();
	
			//Enter registration details	
	
			Thread.sleep(2000);		 
			WebDriverWait wait = new WebDriverWait(driver1,50);
			WebElement nameLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sg_popup_email\"]")));
			nameLink.sendKeys("anupama.kolar@gmail.com");
			WebElement passLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sg_popup_phone_no\"]")));
			passLink.sendKeys("8583429606");
			driver1.findElement(By.xpath("//*[@id=\"new_sign_up_mode\"]/div/div/div[2]/div[1]/form/button")).click();
			
		}

	}

	
