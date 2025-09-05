package utils;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcelcopy {

	public static String[][] readData() throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data/createlead.xlsx");

		XSSFSheet SheetAt = wb.getSheetAt(0);
		/*
		  XSSFSheet Sheet= wb.getSheet("sheet1");
		  
		XSSFRow row = SheetAt.getRow(2);
		 
		  XSSFCell cell = row.getCell(1); // String stringCellValue =
		  cell.getStringCellValue(); // System.out.println(stringCellValue);
		 
		  int rowCount = SheetAt.getLastRowNum(); // System.out.println(rowCount);
		  int physicalNumberOfRows = SheetAt.getPhysicalNumberOfRows(); //
		  System.out.println(physicalNumberOfRows);
		  
		  short columnCount = SheetAt.getRow(1).getLastCellNum(); //
		  System.out.println(columnCount);
		 
		 for (int i = 0; i <= rowCount; i++) { // XSSFRow row2 = SheetAt.getRow(i);
		  System.out.println(row2);
		 */
	

	int rowCount = SheetAt.getLastRowNum();
	System.out.println(rowCount);

	
	short columnCount = SheetAt.getRow(1).getLastCellNum();
	System.out.println(columnCount);

	
	String[][] data=new String[rowCount][columnCount];
	for(int i = 1;i<=rowCount;i++)
	{
		for (int j = 0; j < columnCount; j++) {
			String stringCellValue2 = SheetAt.getRow(i).getCell(j).getStringCellValue();

			data[i - 1][j] = stringCellValue2;// [0][0][0][1][0][2]
			// System.out.println(stringCellValue2);
		}

	}

	wb.close();
	return data;

}

}
