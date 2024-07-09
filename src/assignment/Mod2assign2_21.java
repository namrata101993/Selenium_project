package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mod2assign2_21 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		//Thread.sleep(2000);
		
		driver.switchTo().frame("a077aa5e");
		System.out.println("********We are switch to the iframe*******");
		
		driver.findElement(By.xpath("/html/body/a/img")).click();
		System.out.println("*********We are done***************");
}
}