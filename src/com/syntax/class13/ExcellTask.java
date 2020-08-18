package com.syntax.class13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellTask {

	public static void main(String[] args) throws IOException {

		String path = System.getProperty("user.dir") + "\\testdata\\Task.xlsx";

		FileInputStream fis = new FileInputStream(path);

		Workbook wbook = new XSSFWorkbook(fis);

		Sheet sheet = wbook.getSheet("First");

		sheet.createRow(1).createCell(0).setCellValue("Syntax");
		sheet.getRow(1).createCell(1).setCellValue("Syntax12345");

		FileOutputStream fos = new FileOutputStream(path);

		wbook.write(fos);
		wbook.close();
		fis.close();
		fos.close();

	}

}
