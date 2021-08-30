package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mod2_tmp {

	public static void main(String[] args) {
		
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
		
		//Inspect the "Log In" link to get the link text and partial link text
		
		//Close and Quit the browser 
		//driver.close();
		//driver.quit();
		
		//Get Commands
		//driver.get("URL");
		//driver.getCurrentUrl();
		//driver.getTitle();
		
		//Navigation commands
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		//Element Handling
		//driver.findElement(By.id("")).click();
		//driver.findElement(By.id("")).sendKeys("Anu");
		//driver.findElement(By.id("")).getText();
		//driver.findElement(By.id("")).clear();
		
	}

}



