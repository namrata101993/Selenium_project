package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hrmlogout {
	 WebDriver driver;
	
	 public Hrmlogout(WebDriver driver)
	{
		this.driver=driver;
		
	}
	 //Repository
	 By dropdownImg=By.className("oxd-userdropdown-img");
     By logout=By.xpath("//ul[@class='oxd-dropdown-menu']/child::li[4]");
     
     public void clickImage() throws InterruptedException {
    	 driver.findElement(dropdownImg).click();
    	 Thread.sleep(2000);
     }
     public void logout() {
    	 driver.findElement(logout).click();
     }
}

