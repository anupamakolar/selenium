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


public class mod4_tmp {
	

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
		 
		 WebDriverWait wait = new WebDriverWait(driver,10);
		 
		 //Set Destination as Lucknow
		 WebElement elementLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='or-dest']")));
		 elementLink.click();
		 elementLink.sendKeys("Lucknow");
		 elementLink.sendKeys(Keys.ENTER);
		 
		 Thread.sleep(3000);
		 
		 //Select the Departure Date element  
		 driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();
		 
		 //Set today's date as Departure Date 
		// driver.findElement(By.xpath("//input[@class='form-control or-return igInitCalendar']")).click();
		 
		 Thread.sleep(4000);	
		 
			/*
		//Launch the browser with "https://www.goindigo.in/?linkNav=home_header
		driver.get("https://www.goindigo.in/?linkNav=home_header");
		
		//Select the OnewayTrip option
		driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[2]/div[1]/label/label")).click();
		System.out.println("One way trip selected");
		//Fill all the details: 5 passengers(3adults+2kids) From Bengaluru(BLR) to Lucknow(LKO) for current date
		
		//Select Bengaluru as Departure City

		driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[1]/div/div/input")).click();

		System.out.println("after clicking on Origin");
		
		String newSet=driver.getWindowHandle();
		System.out.println("Got window handle");
		System.out.println("window"+newSet);
		driver.switchTo().window(newSet);
		System.out.println("In new window");
	
		//Initialize the Select Class and focus on the webelement
		//Select oSelect = new Select(driver.findElement(By.name("orSrcModal")));
		//WebElement selelement = driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[1]/div/div/div/div/div[2]/div[1]"));
		WebElement selelement = driver.findElement(By.xpath("//*[@id=\"orSrcModal\"]/div/div/div[2]/div/div/div/div"));
		Select oSelect = new Select(selelement);
		
		System.out.println("after Select");
		System.out.println("oSelect"+oSelect);
		oSelect.selectByVisibleText("Bengaluru");
		//*[@id="orSrcModal"]/div/div/div[2]/div/div/div/div/div/div[4]/div[1]
		//*[@id="orSrcModal"]/div/div/div[2]/div/div/div/div
	*/	

	}

}
