import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data/createlead.xlsx");

		XSSFSheet SheetAt = wb.getSheetAt(0);
		// XSSFSheet Sheet= wb.getSheet("sheet1");

		XSSFRow row = SheetAt.getRow(2);

		XSSFCell cell = row.getCell(1);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);

		int rowCount = SheetAt.getLastRowNum();
		System.out.println(rowCount);
		int physicalNumberOfRows = SheetAt.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);

		short columnCount = SheetAt.getRow(1).getLastCellNum();
		System.out.println(columnCount);

		for (int i = 0; i <= rowCount; i++) {
			XSSFRow row2 = SheetAt.getRow(i);
			System.out.println(row2);

		}
wb.close();
	}

}
