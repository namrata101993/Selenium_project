package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mod2assign1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> tables =driver.findElements(By.tagName("table"));
		System.out.println("Total Tables:"+tables.size());
		
		List<WebElement> rows =driver.findElements(By.tagName("tr"));
		System.out.println("Total rows:"+rows.size());
		
		List<WebElement> col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	     System.out.println("No of cols are : " +col.size()); 
	   
	     // Locate all the company name elements within the table
         List<WebElement> companyNameElements = driver.findElements(By.xpath("//table[@class='dataTable']//td[1]/a"));

         // Print all company names to the console
         System.out.println("Company Names:");
         for (WebElement companyNameElement : companyNameElements) {
             String companyName = companyNameElement.getText();
             System.out.println(companyName);
         } 
		
        }
	

}
