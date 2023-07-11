package ExcelDataExtraction;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelClass {
		String excelpath = "C:\\Users\\Farhad Rashid Reshi\\Desktop";
		String xmlpath = "C:\\Users\\Farhad Rashid Reshi\\Desktop";
		int ColNum = 1;
		try {
		FileInputStream excelFile = new FileInputStream(new File(excelpath));
        WorkB workbook = new XSSFWorkbook(excelFile);
        She sheet = workbook.getSheetAt(0);
		}
		catch(Exception e){
			System.out.println(e.toString());
			
		}
}
