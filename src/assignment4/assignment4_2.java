package assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class assignment4_2 {
	
	public WebDriver driver;
	assignment4_2(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	//repositering(storing locators)

    //By username=By.name("username");
   // By password=By.name("password");
    By header=By.xpath("//div[@id='PageList2']/desendent[1]::ul[1]::child::li");
	
    public void url() throws InterruptedException {
 	   driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
 	   Thread.sleep(2000);
    }
       
}
