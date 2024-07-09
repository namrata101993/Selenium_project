package day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG4 {
	WebDriver driver;
	@BeforeMethod
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
	@AfterMethod
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