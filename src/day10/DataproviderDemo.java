package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo {
	static WebDriver driver;
	@Test
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@DataProvider (name="mobilesearch")
	public Object [][] dataSet()
	{
		Object [][] data=new Object[3][2];
		data [0][0]="vivo";
		data [0][1]="v29";
		data [1][0]="Apple";
		data [1][1]="15 pro max";
		data [2][0]="Redmi";
		data [2][1]="13";
		return data;
	}
	@Test (dataProvider="mobilesearch")
	public void searchmobile(String brand,String model) {
		driver.get("https://www.flipkart.com/");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Vivo.v29");
		search.sendKeys(Keys.ENTER);
	}
	
}

