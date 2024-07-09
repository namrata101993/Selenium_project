package day1_27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("namrata");
		driver.findElement(By.name("lastname")).sendKeys("Jain");
		driver.findElement(By.name("reg_email__")).sendKeys("namrata@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("namrata@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("abc@10");
		
		
		
	}

}
