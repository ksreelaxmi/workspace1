import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven2 {

	public static Object[][] getData() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\user\\Downloads\\demodata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int noOfSheets = workbook.getNumberOfSheets();
		XSSFSheet sheets = workbook.getSheet("testdata");
		int column = sheets.getRow(0).getLastCellNum();
		int lastRow=	sheets.getLastRowNum();
		 Object[][] data = new Object[lastRow+1][column];
		int k = 0;
		int Data1column = 0;
		int Data2column = 0;
		System.out.println("noOfSheets " + noOfSheets);
		for (int i = 0; i < noOfSheets; i++) {
			
			if (workbook.getSheetAt(i).getSheetName().equalsIgnoreCase("testdata")) {
				String s = workbook.getSheetAt(i).getSheetName();
				System.out.println(s);
				XSSFSheet sheet = workbook.getSheetAt(i);
				
				Iterator<Row> rows = sheet.rowIterator();
		//	int lastRow=	sheet.getLastRowNum();
			System.out.println("last row is: "+lastRow);
				Row firstRow = rows.next();
				
				Iterator<Cell> cells = firstRow.cellIterator();
				
				while (cells.hasNext()) {

					Cell c = cells.next();

					if (c.getStringCellValue().equalsIgnoreCase("Data1")) {
						Data1column = k;
						
//						while (rows.hasNext()) {
//							Row r = rows.next();
//						String text=	r.getCell(Data1column).getStringCellValue();
//							System.out.println("Cell vaue is "+text);
//							
//
//						}
					}

					if (c.getStringCellValue().equalsIgnoreCase("Data2")) {
						Data2column = k;
						
						
					}
					k++;
				}
				System.out.println("Data1 coulmn is " + Data1column);
				System.out.println("Data2 coulmn is " + Data2column);
	           
//System.out.println(column);
				
				 for (int j= 1 ; j <=lastRow; j++) {
					 Row r=	sheet.getRow(j);
						for (int m=Data1column; m <= Data2column; m++) {
						String cv=	r.getCell(m).getStringCellValue();
							data[j][m] = cv;
							System.out.println("cv "+cv);
							
						}

					}
	////			for(int j=0;j<=lastRow;j++) {
	//			Row r=	sheet.getRow(j);
//					for(int m=Data1column;m<=Data2column;m++) {
//						Cell cv=r.getCell(m);
//						 DataFormatter formatter = new DataFormatter();
//		                    String val = formatter.formatCellValue(cv);
//						
//						data[j][m]=cv;
//					}
					
			//	}
				//System.out.println("data is "+data);
				
			}
			 
		}
	
		return data;

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	Object[][] a=	getData();
	System.out.println(a[1][2]);
	System.out.println(a[2][2]);

	}

}
