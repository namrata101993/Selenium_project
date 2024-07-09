package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_fb_homepage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		

        // Verify the page title
        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();
        assert actualTitle.equals(expectedTitle) : "Page title is incorrect. Expected: " + expectedTitle + " but got: " + actualTitle;
        System.out.println("Page title is correct: " + actualTitle);
	}

}
