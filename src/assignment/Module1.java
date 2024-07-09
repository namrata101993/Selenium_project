package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import graphql.Assert;

public class Module1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		

		 // Verify the search bar is present
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
        assert searchBar.isDisplayed() : "Search bar is not displayed.";
        System.out.println("Search bar is displayed.");
        
       
         // Verify the page title
        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String actualTitle = driver.getTitle();
        assert actualTitle.equals(expectedTitle) : "Page title is incorrect. Expected: " + expectedTitle + " but got: " + actualTitle;
        System.out.println("Page title is correct: " + actualTitle);
        
        //Using Navigator commands to move home page to other page and comeback to homepage. 
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		 // Run the tests in Safari
        System.out.println("Testing in Safari:");
        WebDriver driver2=new SafariDriver();
        // Run the tests in Firefox
        System.out.println("Testing in Firefox:");
        WebDriver driver1=new FirefoxDriver();
}
}