package day6;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs (OutputType.FILE);
		File target=new File("C:\\Users\\sanil\\eclipse-workspace\\Excelrjavaproject\\Screenshot_in\\fb.png");
		
		try {
			Files.copy(screenshot, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
