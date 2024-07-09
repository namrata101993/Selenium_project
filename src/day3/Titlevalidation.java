package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titlevalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		
		String expectedResult="Demo Web Shop. Register";
		String actualResult=driver.getTitle();
		if(expectedResult.equals(actualResult)){
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}
}


