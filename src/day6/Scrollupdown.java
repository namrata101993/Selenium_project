package day6;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scrollupdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 300)","");
		
		JavascriptExecutor js1=((JavascriptExecutor)driver);
		Thread.sleep(2000);
		js1.executeScript("window.scrollBy(0, -300)","");
		
		

	}

}
