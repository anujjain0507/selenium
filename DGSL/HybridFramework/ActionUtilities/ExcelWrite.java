package ActionUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static void WriteTheExcel(String data, int row) throws IOException
	{
		File src=new File(".//testdata//testdata.xlsx");
		 
		   // load file
		       FileInputStream fis=new FileInputStream(src);
		 
		   // Load workbook
		       XSSFWorkbook wb=new XSSFWorkbook(fis);
		   
		   // Load sheet- Here we are loading first sheet only
		       XSSFSheet sh1= wb.getSheetAt(1);
		       
		       sh1.getRow(row).getCell(9).setCellValue(data);
		       
		        
		       fis.close();
		       XSSFFormulaEvaluator.evaluateAllFormulaCells(wb);
				FileOutputStream outFile =new FileOutputStream(src);
				wb.write(outFile);
				
				outFile.close();
		       
	}
	public static void WriteTheExecutionMode(String data, int row) throws IOException
	{
		File src=new File(".//testdata//testdata.xlsx");
		 
		   // load file
		       FileInputStream fis=new FileInputStream(src);
		 
		   // Load workbook
		       XSSFWorkbook wb=new XSSFWorkbook(fis);
		   
		   // Load sheet- Here we are loading first sheet only
		       XSSFSheet sh1= wb.getSheetAt(0);
		       
		       sh1.getRow(row).getCell(2).setCellValue(data);
		       
		        
		       fis.close();
		       XSSFFormulaEvaluator.evaluateAllFormulaCells(wb);
				FileOutputStream outFile =new FileOutputStream(src);
				wb.write(outFile);
				
				outFile.close();
		       
	}
	

}
