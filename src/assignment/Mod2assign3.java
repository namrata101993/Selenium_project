package assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Mod2assign3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/");
        driver.findElement(By.linkText("Draggable")).click();
        
        Actions act=new Actions(driver);	

        driver.switchTo().frame(0);
        //Thread.sleep(2000);
        
        WebElement source=driver.findElement(By.id("draggable"));
     
        act.clickAndHold(source).moveByOffset(80,0).release().perform();
        File screenshot=((TakesScreenshot)driver).getScreenshotAs (OutputType.FILE);
		File target=new File("C:\\Users\\sanil\\eclipse-workspace\\Selenium_project\\src\\assignment\\Assign_Screenshot\\drag.png");
		
		try {
			Files.copy(screenshot, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
