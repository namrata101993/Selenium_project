package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validationcommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	WebElement emailTextBox=driver.findElement(By.id("email"));
		if(emailTextBox.isDisplayed()==true) {
			System.out.println("pass");
			driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
			
		}
		else {
			System.out.println("fail");
		}
		
		WebElement passwordTextBox=driver.findElement(By.id("pass"));
		if(passwordTextBox.isEnabled()==true) {
			System.out.println("pass");
			driver.findElement(By.id("pass")).sendKeys("abc@gmail.com");
			
		}
		else {
			System.out.println("fail");
		}
	}

}
