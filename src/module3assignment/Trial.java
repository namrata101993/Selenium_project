package module3assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Trial {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='category-cards']/div[2]/div/div[1]")).click();
		driver.findElement(By.xpath("//div[@class='accordion']/div[2]/div")).click();
		 driver.findElement(By.id("firstName")).sendKeys("namrata");{
 			System.out.println("firstName");}
 			driver.findElement(By.id("lastName")).sendKeys("jain");{
	    			System.out.println("lastName");}
 			driver.findElement(By.id("userEmail")).sendKeys("namrata@gmail.com");{
 				System.out.println("enter user email");}
 		 
 			WebElement radio1 = driver.findElement(By.xpath("//div[@id='genterWrapper']/div[2]/div[2]"));
 			radio1.click();
		    
 			driver.findElement(By.id("userNumber")).sendKeys("9876543210");
		    //driver.findElement(By.id("subjectsInput")).sendKeys("Hi");
		   // Thread.sleep(5000);
		    //driver.findElement(By.id("react-select-2-option-0")).click();	    
		    WebElement checkbox1 = driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div[2]"));
		    checkbox1.click();
	// WebElement uploadElement = driver.findElement(By.id("uploadPicture"));
		 //   uploadElement.sendKeys("C:\\Users\\sanil\\OneDrive\\Desktop\\cow.jpg");
		   // driver.findElement(By.id("file-submit")).click();
		 // driver.findElement(By.id("currentAddress")).sendKeys("Fb22309,Society");
		  //  WebElement dropdown1 = driver.findElement(By.xpath("//div[@class='category-cards']/div[2]/div/div[1]"));
		    
	}

}
