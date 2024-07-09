package module3assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Mod3assign1 {
	WebDriver driver;
	@BeforeSuite
	public void openBrowser() {
		System.out.println("browser is open");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	@Test (priority=1)
	public void enterurl() {
		System.out.println("URL entered");
		driver.get("https://demo.guru99.com/test/login.html");
		
	}
	@Test (priority=2)
	public void enterusername() {
		System.out.println("username entered");
		driver.findElement(By.id("email")).sendKeys("namrata");	
	}
	
	@Test (priority=3)
	public void enterpassword() {
		System.out.println("password entered");
		driver.findElement(By.id("passwd")).sendKeys("123456789");
	}
	@AfterSuite
	public void ClosedBrowser() {
		System.out.println("browser is closed");
		driver.close(); 
	 }
}
