package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mod2assign2_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/login.html");
		driver.findElement(By.id("email")).sendKeys("Abc@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Abc@123");
		driver.findElement(By.id("SubmitLogin")).click();
	}

}
