package day10;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



	class Super{
		
		static WebDriver driver;
		@Test
		public void openBrowser() {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
	}
		public class Dependsondemo extends Super {	
		@Test(dependsOnMethods= {"openBrowser"})
		public void login()throws InterruptedException{
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		    Thread.sleep(2000);
            driver.findElement(By.name("username")).sendKeys("Admin");
            driver.findElement(By.name("Password")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[@type'submit']")).click();
		}
            
		}
		
		
		
		

		
		
		
		
