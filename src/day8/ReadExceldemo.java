package day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExceldemo {

	public static void main(String[] args) throws Exception {
		//declaring the path
		
		String path="C:\\Users\\sanil\\OneDrive\\Desktop\\Assignment Visaero.xlsx";
		
		//Loading the file
		
		FileInputStream fis=new FileInputStream(path);
		
		//Loading workbook
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//getting sheet
		
		XSSFSheet sh=wb.getSheet("Voting Machine");
		
		XSSFRow row=sh.getRow(0);
		String r0c0=row.getCell(0).getStringCellValue();
		System.out.println(r0c0);
		
		String r0c1=row.getCell(1).getStringCellValue();
		System.out.println(r0c1);
		System.out.println(r0c0+"=="+r0c1);
		
       wb.close();
       fis.close();
	}

}
