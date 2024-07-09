package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifysearchbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bag");
		
		WebElement searchTextBox=driver.findElement(By.id("twotabsearchtextbox"));
		if(searchTextBox.isDisplayed()){
			System.out.println("Search button is display");
		}
		else {
			System.out.println("Search button not display");
		}
        
       
		WebElement searchTextBox1=driver.findElement(By.id("twotabsearchtextbox"));
		if(searchTextBox1.isEnabled()){
			System.out.println("Search button is enable");
		}
		else {
			System.out.println("Search button not enable");
		}
        
	}

}
