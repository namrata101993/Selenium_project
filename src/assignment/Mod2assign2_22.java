package assignment;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mod2assign2_22 {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/popup.php");
        driver.findElement(By.xpath("/html/body/p/a")).click();
        
        String parentwindowHandle=driver.getWindowHandle();
		
        Set<String> allWindowHandles = driver.getWindowHandles();

     // Iterate over all handles and switch to child window
     for (String handle: allWindowHandles) {
        if (!handle.equals(parentwindowHandle)) {
           driver.switchTo().window(handle);
        }
     }
        driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("btnLogin")).click();
	}

}