package day12;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Datadriven1 {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver ();
		driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   Thread.sleep(2000);
		String filepath="C:\\Users\\sanil\\OneDrive\\Desktop\\Test_datadriven.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		int rows=sheet.getLastRowNum();
        System.out.println("Total no of rows:"+rows);
	
	    for (int r=1;r<=rows;r++) {
	    	try {
	    	XSSFRow row=sheet.getRow(r);
	    	XSSFCell username=row.getCell(0);
	    	XSSFCell password=row.getCell(1);
	    	 System.out.println("username---->"+username+"  password---->"+password);
	    	 driver.findElement(By.name("username")).sendKeys(username.toString());
	    	driver.findElement(By.name("password")).sendKeys(password.toString());
	    	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	    	 Thread.sleep(2000);
	    	 driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	    	 Thread.sleep(2000);
	    	 driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/child::li[4]")).click();
	    	 System.out.println("valid");
	    	}catch (Exception e) {
	    		 System.out.println("invalid");
	    	}
	    	
	    	
	    	 
	    }
	
	}
}