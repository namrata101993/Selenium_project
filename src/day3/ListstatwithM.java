package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListstatwithM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		int size= allLinks.size();
		System.out.println(size);
		for(int i=0;i<size;i++) {
			
			String countLinks=allLinks.get(i).getText();
			if(countLinks.startsWith("M")) {
				System.out.println(countLinks);
			}
			
			
		}
	}

}
