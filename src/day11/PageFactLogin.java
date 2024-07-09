package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactLogin {

	 WebDriver driver;
		
	 public PageFactLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
	 @FindBy(name="username") WebElement username;
	 @FindBy(name="password") WebElement password;
	 @FindBy(xpath="//button[@type='submit']") WebElement login;

	 public void url() throws InterruptedException {
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   Thread.sleep(2000);
	   }
	      
	   public void username(String un) {
		   username.sendKeys(un);
	   }
	   
	   public void password(String pass) {
		   password.sendKeys(pass);
	   }
	   public void login() {
		   login.click();
	   }
}
