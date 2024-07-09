package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiosvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		
		WebElement male=driver.findElement(By.id("gender-male"));
		male.click();
		if (male.isSelected()==true) {
			System.out.println("male is selected");
			
		}
		else {
			System.out.println("not selected");
		}
			
	}

}
