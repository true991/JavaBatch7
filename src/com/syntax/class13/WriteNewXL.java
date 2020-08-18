package com.syntax.class13;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteNewXL {
	public static void main(String[] args) throws IOException {
		
		Workbook wbook = new XSSFWorkbook();
		Sheet sheet = wbook.createSheet("My Sheet");
		sheet.createRow(0).createCell(0).setCellValue("I am writing");
		
		String path = System.getProperty("user.dir") + "\\testdata\\JVCR.xlsx";
		
		FileOutputStream fos = new FileOutputStream(path);
		
		wbook.write(fos);
		wbook.close();
		fos.close();
		
			
		
	}

}
