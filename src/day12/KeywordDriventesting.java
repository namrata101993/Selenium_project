package day12;

import java.io.FileInputStream;
import java.io.FileException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordDriventesting {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		PomHRMSLogin p=new PomHRMSLogin(driver);
		Hrmlogout o=new Hrmlogout(driver);
		
		String filepath="C:\\Users\\sanil\\OneDrive\\Desktop\\Data.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("sheet2");

	int rows=sheet.getLastRowNum();
	System.out.println("Total no of rows:"+rows);
	for(int r=1;r<=rows;r++) {
		XSSFRow row=sheet.getRow(r);
		XSSFCell key=row.getCell(1);
		System.out.println("Keywords---->"+key);
		switch(key.toString()) {
		case "url": p.url();
		break;
		case "username": p.username("Admin");
		break;
		case "password": p.password("admin123");
		break;
		case "login": p.login();
		break;
		case "clickImage": o.clickImage();
		break;
		case "logout": o.logout();
		break;
		default:System.out.println("invalid data");
			
		}
		
		}
	}}
	
	

