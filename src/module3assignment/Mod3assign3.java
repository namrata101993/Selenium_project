package module3assignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mod3assign3 {
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		System.out.println("browser is open");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	@Test(groups = "smoke")
	public void enterurl() throws InterruptedException {
		System.out.println("URL entered");
		driver.get("https://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
		
	@Test(groups = "smoke")
		public void clickonform() throws InterruptedException {
			
			driver.findElement(By.xpath("//h5[text()='Forms']/ancestor::div[@class='card mt-4 top-card']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        System.out.println("Successfully clicked on Forms link.");
	    	
	        driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	System.out.println("Successfully clicked on PracticalForms link.");
	    	  
		}
		 @Test(groups = "regression")
		 public void fillPracticeForm() {
		        driver.get("https://demoqa.com/automation-practice-form");

		        // Fill out the form
		        driver.findElement(By.id("firstName")).sendKeys("John");
		        driver.findElement(By.id("lastName")).sendKeys("Doe");
		        driver.findElement(By.id("userEmail")).sendKeys("john.doe@example.com");
		        driver.findElement(By.xpath("//label[text()='Male']")).click();
		        driver.findElement(By.id("userNumber")).sendKeys("1234567890");
		        driver.findElement(By.id("dateOfBirthInput")).click();
		        driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, May 22nd, 1991']")).click();
		        driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
		        driver.findElement(By.xpath("//label[text()='Sports']")).click();
		        driver.findElement(By.id("uploadPicture")).sendKeys("/path/to/file.jpg");
		        driver.findElement(By.id("currentAddress")).sendKeys("123 Main St, Anytown, USA");
		        driver.findElement(By.id("state")).click();
		        driver.findElement(By.xpath("//div[text()='NCR']")).click();
		        driver.findElement(By.id("city")).click();
		        driver.findElement(By.xpath("//div[text()='Delhi']")).click();
		        driver.findElement(By.id("submit")).click();
		    }
	    			
	    	 	    		
		}
	
