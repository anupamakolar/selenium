package module5;

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

public class Mod5cs1tmp {

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
	/*
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\'footauto\']/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[8]/div/button/span")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\'footauto\']/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[8]/div/ul/li[1]/a")).click();

			
				driver.findElement(By.xpath("//*[@id=\"professional_details\"]/i")).click();

	
				//Update personal details
				
				Thread.sleep(2000);	
				
				//driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[1]/app-onboarding-leftnav/ul/li[2]")).click();
				//WebElement persLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[1]/app-onboarding-leftnav/ul/li[2]")));
				//persLink.click();
				oSelect.selectByVisibleText("Personal Details");
				System.out.println("After clicking personal");
				Thread.sleep(2000);	
				WebElement roleLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"collapseOne\"]/div/div/form/div[4]/input")));
				roleLink.clear();
				roleLink.sendKeys("Software");
				System.out.println("After clicking role");
				
				driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/form/button")).click();
	
				System.out.println("After completing personal");
				
				//Update professional details
				
				oSelect.selectByVisibleText("Professional Details");
				System.out.println("Before entering company");
				
				Thread.sleep(2000);	
				//driver.findElement(By.linkText("Professional Details")).click();
				//driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[1]/app-onboarding-leftnav/ul/li[4]")).click();
				//*[@id="onboarding"]/div/div[1]/div[1]/app-onboarding-leftnav/ul/li[4]/a/i
			
				//Thread.sleep(2000);		 
				//driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[1]/app-onboarding-leftnav/ul/li[4]")).click();
	
				/*
				WebElement compLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-professional-details/accordion/accordion-group/div/div[2]/div/form/div[1]/input")));
				compLink.clear();
				compLink.sendKeys("Testing");

				System.out.println("After entering company");
					  
				*/

		/*		 WebDriver driver = new ChromeDriver();
			        driver.manage().window().maximize();
			        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			     driver.get("https://www.edureka.co/");
			     driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/a[2]")).click();
			     Thread.sleep(2000);
			     driver.findElement(By.id("si_popup_email")).sendKeys("vpatel0224@gmail.com");
			     driver.findElement(By.id("si_popup_passwd")).sendKeys("Chandra0*");
			driver.findElement(By.xpath("//*[@id=\"new_sign_up_mode\"]/div/div/div[2]/div[3]/form/button")).click();
		*/	        
			        driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[8]/div/button/img")).click();
			        WebElement profile=driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[8]/div/ul/li[1]/a"));
			        Actions action=new Actions(driver);
			        action.moveToElement(profile).perform();
			        profile.click();
			        WebElement edit=driver.findElement(By.xpath("//*[@id=\"personal_details\"]/i"));
			        edit.click();
			        WebElement desig=driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/form/div[4]/input"));
			        Thread.sleep(5000);
			        desig.clear();
			        desig.sendKeys("Sr. Test Lead");
			    
			         Thread.sleep(5000);
			
			         /*
			          * 
        
        WebElement loc=driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-professional-details/accordion/accordion-group/div/div[2]/div/form/div[1]/input"));
        loc.clear();
        loc.sendKeys("Edureka");
        Thread.sleep(10000);
        
        driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-professional-details/accordion/accordion-group/div/div[2]/div/form/button[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-career-interests/accordion/accordion-group/div/div[2]/div/form/button[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-other-details/accordion/accordion-group/div/div[2]/div/form/div/button[1]")).click();

			          */
//			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"collapseOne\"]/div/div/span")));    
			    //Thread.sleep(3000);
			    
			    WebElement click=driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/form/button"));
			            click.click();
			            
			            Thread.sleep(10000);
			            
			            click.click();
			            
			            //Navigate to Main Page
			            driver.navigate().back();
			            driver.navigate().back();
			            driver.navigate().back();
			            
			            //driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/a")).click();

		
/*
			            System.out.println("Going back now");
			            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-professional-details/accordion/accordion-group/div/div[2]/div/form/button[2]")));
					    WebElement next=driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-professional-details/accordion/accordion-group/div/div[2]/div/form/button[2]"));
	
					    next.click();
			            
			            Thread.sleep(5000);					
			            System.out.println("Careers page now");
			            Thread.sleep(10000);	
			            
			            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"onboarding\\\"]/div/div[1]/div[2]/div[2]/app-onboarding-career-interests/accordion/accordion-group/div/div[2]/div/form/button[2]")));
			            WebElement next1=driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-career-interests/accordion/accordion-group/div/div[2]/div/form/button[2]"));
			            next1.click();
			            Thread.sleep(5000);	
			            System.out.println("Last page now");
			            Thread.sleep(10000);			            
			            WebElement save=driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-other-details/accordion/accordion-group/div/div[2]/div/form/div/button[1]"));
			            save.click();
			            Thread.sleep(10000);	
			            System.out.println("main page now...");	

			            //Explore the blogs
			            
			            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"footauto\"]/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[3]/div/button/text()")));
			
			            */
			            WebElement community=driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[3]/div/button"));
			            community.click();
			            Thread.sleep(5000);	
			            System.out.println("Going to blog..");
			            
			            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"footauto\"]/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[3]/div/ul/li[2]/a")));
					    WebElement blog=driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[3]/div/ul/li[2]/a"));
					    blog.click();
			            Thread.sleep(5000);	
			            System.out.println("In blog..");
			            driver.navigate().back();
			       /*     
			            Thread.sleep(10000);			            
			            WebElement courses=driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[2]/div/button"));
			            courses.click();
			            Thread.sleep(10000);	
			            System.out.println("profile page now...");	
			            
			            Thread.sleep(10000);			            
			            WebElement classroom=driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[2]/div/ul/li[1]/a"));
			            classroom.click();
			            Thread.sleep(10000);	
			            System.out.println("finally 2 main page now...");		
			            
*/
			            
						//Logout of the portal
						driver.close();
						driver.quit();
			
	}

}
