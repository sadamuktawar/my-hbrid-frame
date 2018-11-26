package fileupload;

import java.io.File;






































import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	public static void main(String[] args) throws Exception {
		File src = new File("Excelread\\src\\com\\testData\\ebay.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet Sheet1 = wb.getSheetAt(0);
		String data = Sheet1.getRow(1).getCell(2).getStringCellValue();
		System.out.println("data from excel sheet" + data);
		wb.close();

	}
}
