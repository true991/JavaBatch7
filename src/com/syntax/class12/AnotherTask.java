package com.syntax.class12;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AnotherTask {
	public static void main(String[] args) throws IOException {
		
		String path = System.getProperty("user.dir") + "\\testdata\\Map.xlsx";
		
		FileInputStream fis = new FileInputStream(path);
		
		Workbook wbook = new XSSFWorkbook(fis);
		
		Sheet sheet = wbook.getSheet("First");
		int row = sheet.getPhysicalNumberOfRows();
		int col = sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int i = 1; i < row; i++) {
			
			for(int j = 0; j < col; j++) {
				
				
				
			}
		}
		
		
		
		
		
		
	}

}
