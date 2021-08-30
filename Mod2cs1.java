package exercises;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class Mod2cs1 {

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

}
