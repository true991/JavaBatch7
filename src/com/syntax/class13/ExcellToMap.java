package com.syntax.class13;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.LinkedMap;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellToMap {
	public static void main(String[] args) throws IOException {

		String path = System.getProperty("user.dir") + "\\testdata\\Map.xlsx";

		FileInputStream fis = new FileInputStream(path);

		Workbook wbook = new XSSFWorkbook(fis);

		Sheet sheet = wbook.getSheet("First");

		int rows = sheet.getPhysicalNumberOfRows();

		int col = sheet.getRow(0).getPhysicalNumberOfCells();

		List<Map<String, String>> data = new ArrayList<>();

		for (int i = 1; i < rows; i++) {

			Map<String, String> map = new LinkedHashMap<>();

			for (int j = 0; j < col; j++) {

				String key = sheet.getRow(0).getCell(j).toString();
				String value = sheet.getRow(i).getCell(j).toString();
				map.put(key, value);
			}

			data.add(map);

		}

		for (Map<String, String> x : data) {
			System.out.println(x);
		}

		Map<String,String> y = new LinkedMap<>();
		
		for (Map<String, String> map : data) {
			
			String a = "name";
			String b = map.get("name");
			y.put(a, b);
		}
		
		System.out.println(y);
		
		

		wbook.close();
		fis.close();

	}

}
