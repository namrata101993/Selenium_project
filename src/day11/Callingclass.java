package day11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Callingclass {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		PomHRMSLogin p=new PomHRMSLogin(driver);
		
		
		//p.url();
	//	p.username("Admin");
	//	p.password("admin123");
	//	p.login();
		
	}
	PageFactLogin p1=new PageFactLogin(driver);
	p1.url();
	p1.username("Admin");
	p1.password("admin123");
	p1.login();
	
}
