package clg.college;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static String[][] readExcel(String ExcelFileName) throws IOException {
		XSSFWorkbook excelBook = new XSSFWorkbook("data/+ExcelFileName+");
		XSSFSheet sheet = excelBook.getSheetAt(0);
		// Get the rowCount
		int rowCount = sheet.getLastRowNum();
		System.out.println("The number of row is:" + rowCount);
		// Get the columncount
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("The number of  column is:" + columnCount);
		String data[][] = new String[rowCount][columnCount];

		for (int i = 0; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				data[i - 1][j] = stringCellValue;
			}
		}

		excelBook.close();
		return data;
	}

}
