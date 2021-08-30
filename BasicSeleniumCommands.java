package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumCommands {

	public static void main(String[] args) {
		
		//Instantiate Chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\Anu\\Selenium\\Training\\Selenium\\drivers\\chromedriver.exe"
				);
		WebDriver driver = new ChromeDriver();

		//Close and Quit the browser 
		driver.close();
		driver.quit();
		
		//Get Commands
		driver.get("URL");
		driver.getCurrentUrl();
		driver.getTitle();
		
		//Navigation commands
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//Element Handling
		driver.findElement(By.id("")).click();
		driver.findElement(By.id("")).sendKeys("Anu");
		driver.findElement(By.id("")).getText();
		driver.findElement(By.id("")).clear();
		
	}

}
