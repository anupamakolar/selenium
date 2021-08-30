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

public class Mod5cs1 {

	public static void main(String[] args) throws InterruptedException {

				//Launch Chrome browser using Selenium Webdriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\Anu\\Selenium\\Training\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe"
				);
		
		WebDriver driver = new ChromeDriver();

				//Navigate to :https://www.edureka.co/"
				driver.get("https://www.edureka.co");		
				
				//Maximize the Browser Window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				//Go to Login screen

				driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/a[2]")).click();
	
				//Enter login details
				Thread.sleep(2000);		 
				WebDriverWait wait = new WebDriverWait(driver,50);
				WebElement nameLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"si_popup_email\"]")));
				nameLink.sendKeys("anupama.kolar@gmail.com");
				WebElement passLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"si_popup_passwd\"]")));
				passLink.sendKeys("testing1");
				WebElement clickLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"new_sign_up_mode\"]/div/div/div[2]/div[3]/form/button")));
				clickLink.click();

				//Navigate to my Profile
			    driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[8]/div/button/img")).click();
			    WebElement profile=driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[8]/div/ul/li[1]/a"));
			    Actions action=new Actions(driver);
			    action.moveToElement(profile).perform();
			    profile.click();
			    
			  //Update personal details
			    WebElement edit=driver.findElement(By.xpath("//*[@id=\"personal_details\"]/i"));
			    edit.click();
			    WebElement desig=driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/form/div[4]/input"));
			    Thread.sleep(5000);
			    desig.clear();
			    desig.sendKeys("Sr. Test Lead");
			    
			 
			    Thread.sleep(5000);
			    
			    WebElement click=driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/form/button"));
			    click.click();
			    Thread.sleep(5000);
			    click.click();
			    
			  //Update professional details
			    
			    
		        WebElement loc=driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-professional-details/accordion/accordion-group/div/div[2]/div/form/div[1]/input"));
		        loc.clear();
		        loc.sendKeys("Edureka");
		        Thread.sleep(10000);

		    	
			    //Navigate to Main Page	     
		        
		        driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-professional-details/accordion/accordion-group/div/div[2]/div/form/button[2]")).click();
		        driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-career-interests/accordion/accordion-group/div/div[2]/div/form/button[2]")).click();
		        driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-other-details/accordion/accordion-group/div/div[2]/div/form/div/button[1]")).click();


			    //Explore the blogs
		        
		        WebElement community=driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[3]/div/button"));
			    community.click();
			    Thread.sleep(10000);	
	
			    WebElement blog=driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[3]/div/ul/li[2]/a"));
			    blog.click();
			    Thread.sleep(5000);	
			    driver.navigate().back();

			            
			    //Logout of the portal
				driver.close();
				driver.quit();
			
	}

}
