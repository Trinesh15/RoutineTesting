package generic;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	
		// TODO Auto-generated method stub
		
	public static String getCellData(String path , String sheet , int r , int c) {
			
		String v = "";
		try {
			Workbook wb = WorkbookFactory.create(new File(path));
			  v = wb.getSheet(sheet).getRow(r).getCell(c).toString();
			  
			
		}
		catch(Exception e) {
			
		}
		return v;
		
	}

}

