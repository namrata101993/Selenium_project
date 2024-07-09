package day1_27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		WebElement birthday=driver.findElement(By.id("day"));
		Select se=new Select(birthday);
		se.selectByIndex(24);
		
		WebElement birthmonth=driver.findElement(By.id("month"));
		Select se2=new Select(birthmonth);
		se2.selectByValue("8");
		
		WebElement birthyear=driver.findElement(By.id("year"));
		Select se3=new Select(birthyear);
		se3.selectByVisibleText("2001");
		
	}

}
