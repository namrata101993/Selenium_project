package day9;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG5 {
	WebDriver driver;
	@BeforeSuite
	public void openBrowser() {
		System.out.println("browser is open");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	@Test (priority=2)
	public void enterurl() {
		System.out.println("URL entered");
		driver.get("https://www.facebook.com/");
		
	}
	@AfterSuite
	public void ClosedBrowser() {
		System.out.println("browser is closed");
		driver.close(); 
	 }
	@Test (priority=1)
	public void enterurl2() {
		System.out.println("Url2");
		driver.get("https://www.google.com/");
		
	}
}
