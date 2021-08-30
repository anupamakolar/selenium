package mod8withPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TC_Mod8Gmail {

	@FindBy(tagName="")
	private WebElement id;

	public static void main(String[] args) throws InterruptedException {		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\Anu\\Selenium\\Training\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();

		
		// Creating an object of LoginPage
		LoginPage loginPage= new LoginPage(driver);
		
		// Sign in
		loginPage.signIn("anutest987@gmail.com", "Testing1");
		Thread.sleep(3000);
		
		// Creating an object of ComposeMail
		ComposeMail composeMail = new ComposeMail(driver);
		
		//Compose a mail
		composeMail.compose("anupama.kolar@gmail.com","Hello","Testing mail with PageFactory!!");
		
		// Creating an object of LogoutPage
		LogoutPage logoutPage= new LogoutPage(driver);
		
		//Sign out
		logoutPage.signOut();
		
		//Quit browser
		driver.quit();
		
	}
}