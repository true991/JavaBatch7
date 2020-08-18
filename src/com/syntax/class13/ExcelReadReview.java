package com.syntax.class13;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadReview {
	public static void main(String[] args) throws IOException {
		
		String xlPath = System.getProperty("user.dir") + "\\testdata\\DataTest.xlsx"; // path to file
		
		FileInputStream fis = new FileInputStream(xlPath);							  // new FIS(path)
								
		Workbook wbook = new XSSFWorkbook(fis);                                       // new Workbook(fis)
		
		Sheet sheet = wbook.getSheet("Data1");										  // Sheet --> row --> cell -->toString
				
		String data = sheet.getRow(2).getCell(1).toString();
		
		System.out.println(data);
		int size = sheet.getPhysicalNumberOfRows();
		
		int cellSize = sheet.getRow(0).getLastCellNum();
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < cellSize; j ++) {
				System.out.println(sheet.getRow(i).getCell(j).toString());
			}
			
		}
		
		wbook.close();
		
	}

}
