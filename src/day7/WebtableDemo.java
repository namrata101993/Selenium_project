package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		List<WebElement> tables =driver.findElements(By.tagName("table"));
		System.out.println("Total Tables:"+tables.size());
		
		List<WebElement> rows =driver.findElements(By.tagName("tr"));
		System.out.println("Total rows:"+rows.size());
		
		List<WebElement> columns =driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[1]/td"));
		System.out.println("Total columns:"+columns.size());
		
	}

}
