package com.syntax.class13;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLReadingDemo {
	public static void main(String[] args) throws IOException {
		String XLpath = System.getProperty("user.dir") + "\\testdata\\SampleTestData.xlsx";

		FileInputStream fis = new FileInputStream(XLpath);

		Workbook workbook = new XSSFWorkbook(fis);

		Sheet sheet = workbook.getSheet("Sample");

		Row row1 = sheet.getRow(0);

		Cell row1cell3 = row1.getCell(2);

		String value = row1cell3.toString();
		System.out.println(value);
		workbook.close();

	}

}
