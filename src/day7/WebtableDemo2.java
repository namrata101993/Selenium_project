package day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableDemo2 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		List<WebElement> tables =driver.findElements(By.tagName("table"));
		System.out.println("Total Tables:"+tables.size());
		
		List<WebElement> rows =driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("Total rows:"+rows.size());
		
		List<WebElement> columns =driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		System.out.println("Total columns:"+columns.size());
		
		for (int r=1;r>=rows.size();r++);
		for (int c=1;c>=columns.size();c++);
		String data=driver.findElement(By.id("customers")).getText();
		System.out.print(data);
		System.out.println();
	}

}
