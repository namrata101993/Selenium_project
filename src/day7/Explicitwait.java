package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		driver.findElement(By.linkText("Create new account")).click();
		//Thread.sleep(2000);
		
		WebElement firstname=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		firstname.sendKeys("namrata");
		driver.findElement(By.name("lastname")).sendKeys("Jain");
		driver.findElement(By.name("reg_email__")).sendKeys("namrata@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("namrata@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("abc@10");
	}

}
