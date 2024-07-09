package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mod1assignment2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement option1=driver.findElement(By.id("vfb-7-1"));
		option1.click();
		if (option1.isSelected()==true) {
			System.out.println("option1 is selected");
			
		}
		else {
			System.out.println("not selected");
		}
		WebElement checkbox2=driver.findElement(By.id("vfb-6-1"));
		checkbox2.click();
		if (checkbox2.isSelected()==true) {
			System.out.println("checkbox2 is selected");
			
		}
		else {
			System.out.println("not selected");
		}
		WebElement checkbox3=driver.findElement(By.id("vfb-6-2"));
		checkbox3.click();
		if (checkbox3.isSelected()==true) {
			System.out.println("checkbox3 is selected");
			
		}
		else {
			System.out.println("not selected");
		}
	}

}
