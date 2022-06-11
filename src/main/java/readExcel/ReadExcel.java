package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Open WorkBook
		XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx");
		
		//Get Sheet
		XSSFSheet sheet = wb.getSheet("Data");
		
		//Get Row Count
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
	    
	    //Get Column Count
	    int cellCount = sheet.getRow(0).getLastCellNum();
	    System.out.println(cellCount);
		
		for (int i = 1; i <= rowCount; i++) {
			
			for (int j = 0; j < cellCount; j++) {
				//Get Row
				XSSFRow row = sheet.getRow(i);
				//Get Cell
				XSSFCell cell = row.getCell(j);
				//Read data in this particular cell
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
			}
		}
		
	}

}
