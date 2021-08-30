package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class Ex1_copy {

	public static void main(String[] args) throws InterruptedException {

				//Launch Chrome browser using Selenium Webdriver
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\Anu\\Selenium\\Training\\Selenium\\drivers\\chromedriver.exe"
						);
				WebDriver driver = new ChromeDriver();

				//Navigate to :https://www.edureka.co/"
				driver.get("https://www.edureka.co");		
				
				//Maximize the Browser Window
				driver.manage().window().maximize();
				
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
				driver.findElement(By.className("close")).click();

				driver.findElement(By.id("search-inp")).sendKeys(Keys.RETURN);				

				//partial link text
				driver.findElement(By.partialLinkText("Log")).click();	
				//driver.navigate().back();

				//classname

//The className below is not giving any error but the code stops execution at this point.				

				//driver.findElement(By.className("search_inp collapse giTrackElementHeader")).sendKeys("AWS");

				
				//driver.findElement(By.className("new_pgp_category")).click();
				
//The above className was working but then the website was updated (I guess) and this className is no longer working.
//The following code was working when the "new_pgp_category" className was working
				//LinkText
				//driver.findElement(By.linkText("All Courses")).click();				
				
				//partial link text
				//driver.navigate().back();
				
				//driver.findElement(By.partialLinkText("All")).click();								

				//driver.navigate().back();
				//driver.navigate().back();
				
				//Close and Quit the browser 
				driver.close();
				driver.quit();
				

	}


}
