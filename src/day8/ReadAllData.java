package day8;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllData {


		public static void main(String[] args) throws Exception {
			//declaring the path
			
			String path="C:\\Users\\sanil\\OneDrive\\Desktop\\Assignment Visaero.xlsx";
			
			//Loading the file
			
			FileInputStream fis=new FileInputStream(path);
			
			//Loading workbook
			
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			
			//getting sheet
			
			XSSFSheet sh=wb.getSheet("Voting Machine");
	}

}
