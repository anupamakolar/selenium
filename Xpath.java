package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {

		// Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		WebDriver driver = new ChromeDriver();

		// Open the AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		// enter into data text box using normal xpath
		driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("30/11/1986");

		//all the below steps I am using customized Xpath using various functions
		
		// Using Date TextBox interacting with Selenium IDE Checkbox
		driver.findElement(By.xpath("//*[@id='datepicker']//following::input[5]")).click();
		Thread.sleep(5000);

		// Using Date TextBox interacting with Male Radio button
		driver.findElement(By.xpath("//*[@id='datepicker']//preceding::input[9]")).click();
		Thread.sleep(5000);

		// interacting with title of the page
		String Heading = driver.findElement(By.xpath("//*[contains(text(), 'n For')]")).getText();

		System.out.println(Heading);
		
		boolean Result = Heading.equals("Practice Automation Form");
		System.out.println(Result);

		// Using Date TextBox interacting with the linktext "Test File to Download"
		driver.findElement(By.xpath("//*[starts-with(text(),'Test')]")).click();

		Thread.sleep(5000);

		//Close the Browser
		//driver.close();

	}

}
