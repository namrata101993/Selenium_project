package module3assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class mod3assign2 {
	WebDriver driver;
	@BeforeSuite
	public void openBrowser() {
		System.out.println("browser is open");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.findElement(By.id("email")).sendKeys("namrata");	
		driver.findElement(By.id("passwd")).sendKeys("123456789");
	}
  @Test(dataProvider="getdata")
	public void Logintest(String username,String password){
		System.out.println("Loggedin using: "+username+" and "+password);
}
		
	
	@DataProvider(name= "getdata")
  	public Object[][] getdataMethod(){
              Object[][] data= {{"namrata","123456789"}};
            	return data;  
	}
            	@AfterSuite
            	public void ClosedBrowser() {
            		System.out.println("browser is closed");
            		driver.close(); 	
  	}
}
	

