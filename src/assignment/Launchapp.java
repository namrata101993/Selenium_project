package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String title=driver.getTitle();
		System.out.println("Title is :"+title);
		System.out.println("Title length is :"+title.length());
		String Url=driver.getCurrentUrl();
		System.out.println("current Url is:"+Url);
		System.out.println("Url length is :"+Url.length());
		if(title.length()>Url.length()) {
			System.out.println("Title length is greater than Url");
		}
		else {
			System.out.println("Title length is not greater than url");
		}
		}

}

