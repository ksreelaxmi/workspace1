import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class dataDriven {
	

	public ArrayList<String> getData(String testCaseName) throws IOException {
		
		//Identify Testcases coloum by scanning the entire 1st row
		//once coloumn is identified then scan entire testcase coloum to identify purcjhase testcase row
		//after you grab purchase testcase row = pull all the data of that row and feed into test

		FileInputStream fis = new FileInputStream("C:\\Users\\user\\Downloads\\demodata.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheetsCount = workbook.getNumberOfSheets();
		System.out.println(sheetsCount);
		ArrayList<String> arrayLst = new ArrayList<String>();
		for (int i = 0; i < sheetsCount; i++) {

			if (workbook.getSheetAt(i).getSheetName().equalsIgnoreCase("testdata")) {

				XSSFSheet sheet = workbook.getSheetAt(i);//

				Iterator<Row> row = sheet.rowIterator();
				Row firstRow = row.next();
				Iterator<Cell> cell = firstRow.cellIterator();// Row is collections of cells
				int k = 0;
				int column = 0;// To know the column no of testcases then we get to know the Purchase in that
								// column
				while (cell.hasNext()) {

					if (cell.next().getStringCellValue().equalsIgnoreCase("TestCases")) {
						column = k;
					}
					k++;
				}
			////once coloumn is identified then scan entire testcase coloum to identify purchase testcase row

				while (row.hasNext()) {
					Row r = row.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {
					////after you grab purchase testcase row = pull all the data of that row and feed into test
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
							//System.out.println(cv.next().getStringCellValue());
							Cell c=cv.next();
							if(c.getCellType()==CellType.STRING) {
								arrayLst.add(c.getStringCellValue());
								System.out.println("arrayLst is "+arrayLst);
							}
							else {
								arrayLst.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
						}
					}

				}

			}

		}
		return arrayLst;

	}

	public static void main(String[] args) throws IOException {
		dataDriven data=new dataDriven();
	ArrayList lst=	data.getData("Purchase");
	System.out.println(lst.get(0));
	System.out.println(lst.get(1));
	System.out.println(lst.get(2));
	System.out.println(lst.get(3));

	}
}
