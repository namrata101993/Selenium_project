package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPasswordlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		String title=driver.getTitle();
		System.out.println("Title is :"+title);
		
		if(title.contains("account1")==true ) {
		System.out.println("Title contain account1");
		}
		else {
			System.out.println("Title doesn't contain account1");
		}
			
	}

}
