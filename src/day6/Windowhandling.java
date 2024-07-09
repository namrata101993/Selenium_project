package day6;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("tabButton")).click();
		
		String parentwindow=driver.getWindowHandle();
		System.out.println("parentwindow id :"+parentwindow);
		
		Set<String>allwindows=driver.getWindowHandles();
		System.out.println(allwindows.size());//2
		
		Iterator itr=allwindows.iterator();
		while(itr.hasNext()) {
			String childwindow=(String)itr.next();
			System.out.println("childwindow id :"+childwindow);
			
			if(!parentwindow.equals(childwindow));
			driver.switchTo().window(childwindow);
			WebElement text=driver.findElement(By.id("sampleHeading"));
			System.out.println(text.getText());
		}
		
	}

}
