package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PomHRMSLogin {

	public WebDriver driver;
	PomHRMSLogin(WebDriver driver)
	{
		this.driver=driver;
		
	}
	//repositering(storing locators)

    By username=By.name("username");
    By password=By.name("password");
    By login=By.xpath("//button[@type='submit']");

   public void url() throws InterruptedException {
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   Thread.sleep(2000);
   }
      
   public void username(String un) {
	   driver.findElement(username).sendKeys(un);
   }
   
   public void password(String pass) {
	   driver.findElement(password).sendKeys(pass);
   }
   
   public void login() throws InterruptedException {
	   driver.findElement(login).click();
	   Thread.sleep(2000);
   }
   public void loginOHrm(String un, String pass)throws InterruptedException {
   {
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   Thread.sleep(2000);
	   driver.findElement(username).sendKeys(un);
	   driver.findElement(password).sendKeys(pass);
	   driver.findElement(login).click();
   }}}


