package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		WebElement jobs= driver.findElement(By.linkText( "Jobs"));
		
		Actions act=new Actions(driver);
		act.moveToElement(jobs).build().perform();
		driver.findElement(By.linkText("Register")).click();
		
	
	}

}
