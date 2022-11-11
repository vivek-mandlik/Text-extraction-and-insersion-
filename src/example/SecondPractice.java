package example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SecondPractice {

	public static void main(String arg[]) throws Exception {
		List<String> data = new ArrayList<>();
//		ls.add(null);
//		ls.add(null);
//		ls.add(null);
		data.add("vivek");
		data.add("shubham");
		data.add("khirod");
		data.add("Akshay");
		data.add("poonam");
		data.add("siddhesh");
		data.add("soham");
		data.add("harshada");
		data.add("Priya");


		int rowcount = 0;
		int columncount = 0;
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet spreadsheet = wb.createSheet("Name in list");
		XSSFRow row = null;


		for (int i = 0 ; i < data.size() ; i++) {
			System.out.println(" name is :  " + data.get(i));
						
			if(i % 3 == 0)
				{
				rowcount = i / 3 ;
				row = spreadsheet.createRow(rowcount);
				columncount = 0 ;
				}
			
			XSSFCell cell = row.createCell(columncount);
			cell.setCellValue( data.get(i));
			
			columncount++ ;
			
		}
				
		
		
		
//		for (String s : list) {
//			System.out.println(" name is :  " + s);
//			
//			while (columncount < 3) {
//				System.out.print("columncount is :    " + columncount);
//				Cell cell = row.createCell(columncount);
//
//				cell.setCellValue(s);
//				System.out.print("Data inserted is : " + cell.getStringCellValue());
//
//				columncount++;
//				System.out.print(" updated column count is  :      " + columncount);
//				break;
//
//			}
//			System.out.println("out of while loop");
//			
//			if (columncount == 3) {
//				columncount = 0;
//				row = spreadsheet.createRow(rowcount++);
//				System.out.print("updated row count :    " + rowcount);
//			}
//		}

//			System.out.println(rowcount + "             - ------------------------");
//			columncount = 0;
//		}

		OutputStream fileOut = new FileOutputStream("D:\\Vivekapis\\First.xlsx");
		System.out.println("created the file");

		wb.write(fileOut);

	}

}