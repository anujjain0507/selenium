package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcel {
	
	
	public static String[][] ReadDataFromExcel(String FileLocation,String SheetName) throws IOException{
		String[][] dataset =null;
		File file = new File(FileLocation);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(SheetName);
		int totalRow = sheet.getLastRowNum();
		int totalCell = sheet.getRow(0).getLastCellNum();
		dataset = new String[totalRow][totalCell];
		Iterator<Row> rowIterator = sheet.iterator();
		int i = 0;
		while(rowIterator.hasNext()) {
			i = i++;
		}
		Row row = rowIterator.next();
		
		Iterator<Cell> CellIterator = row.cellIterator();
		int j = 0;
		while(CellIterator.hasNext()) {
			Cell cell = CellIterator.next();
			if(cell.getStringCellValue().contains("Email")) {
				break;
			}
			
		}
		
		return dataset;
	}

	public static void main(String[] args) {
		

	}

}
