package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	WebElement emailTextBox=driver.findElement(By.id("email"));
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	WebElement passwordTextBox=driver.findElement(By.id("pass"));
	driver.findElement(By.id("pass")).sendKeys("abc@gmail.com");
	driver.findElement(By.name("login")).click();
	WebElement loginButton=driver.findElement(By.name("login"));
	if(loginButton.isDisplayed()==true) {
		System.out.println("pass");
	}
	else {
		
			System.out.println("fail");
	}
	if(loginButton.isEnabled()==true) {
		System.out.println("pass");
	}
	else {
		System.out.println("pass");
	}
	}

}
