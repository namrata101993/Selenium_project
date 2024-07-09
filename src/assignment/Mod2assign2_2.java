package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mod2assign2_2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("Abc@gmail.com");
        driver.findElement(By.name("submit")).click();
        
        Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		 Alert alert1=driver.switchTo().alert();
			System.out.println(alert1.getText());
			alert.accept();
	}

}
