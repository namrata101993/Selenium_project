package day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Super {

		
		static WebDriver driver;
		@Test
		public void openBrowser() {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
	}


