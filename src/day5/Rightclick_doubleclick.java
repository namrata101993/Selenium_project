package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick_doubleclick {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement emailtextBox= driver.findElement(By.id( "email"));

		Actions act=new Actions(driver);
		emailtextBox.sendKeys("abcd");
		
		act.doubleClick(emailtextBox).build().perform();
		act.contextClick(emailtextBox).build().perform();
		
}
}
