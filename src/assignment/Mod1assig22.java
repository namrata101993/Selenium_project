package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mod1assig22 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.findElement(By.name("country")).click();
		
		WebElement country=driver.findElement(By.name("country"));
		Select se=new Select(country);
		se.selectByVisibleText("KUWAIT");
	}

}
