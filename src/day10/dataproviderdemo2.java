package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderdemo2 {
	
	static WebDriver driver;
	
	@Test
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@DataProvider (name="mobilesearch")
	public Object [][] dpMethod(){
		return new Object[][] {
			{"vivo","v29"},
			{"Apple","15 pro max"},
			{"vivo","v30"}};
		}
	

	@Test (dataProvider="mobilesearch")
	public void searchmobile(String brand,String model) {
		driver.get("https://www.flipkart.com/");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys(brand +" "+ model);
		search.sendKeys(Keys.ENTER);
	}
	
}
