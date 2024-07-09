package assignment4;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment4_1 {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver ();
		driver.manage().window().maximize();
		 driver.get("http://demo.guru99.com/V4/");
		   Thread.sleep(2000);
		String filepath="C:\\Users\\sanil\\OneDrive\\Desktop\\Book1.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		int rows=sheet.getLastRowNum();
        System.out.println("Total no of rows:"+rows);
	
	    for (int r=1;r<=rows;r++) {
	    	try {
	    	XSSFRow row=sheet.getRow(r);
	    	XSSFCell userId=row.getCell(0);
	    	XSSFCell password=row.getCell(1);
	    	 System.out.println("userId---->"+userId+"  password---->"+password);
	    	 driver.findElement(By.name("uid")).sendKeys(userId.toString());
	    	 driver.findElement(By.name("password")).sendKeys(password.toString());
	    	 driver.findElement(By.name("btnLogin")).click();
	    	 
	    	}catch (Exception e) {
	    		 System.out.println("invalid");
	    	}
	    	
	    	Alert alert=driver.switchTo().alert();
	    	alert.accept();
	    	 
	    }
}
}