package example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//package example;
//
//import java.io.FileOutputStream;
//import java.io.OutputStream;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class SecondPractice {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		List<String> ls = new ArrayList<>();
//
//		ls.add("Vivek");
//		ls.add("Shubham");
//		ls.add("Tas");
//		ls.add("Akk");
//		ls.add("ZZ");
//		ls.add("es");
//		ls.add("asd");
//		ls.add("jhgfd");
//		ls.add("qwdf");
//		ls.add("lkjhgf");
//		ls.add("mhtr");
//
//		String obj[] = new String[15];
//		for (int i = 0; i < ls.size(); i++) {
//			obj[i] = ls.get(i);
//		}
//
//		for (int j = 0; j < obj.length; j++) {
//			System.out.println(obj[j]);
//		}
//
//		/*
//		 * create wb create sheet enter data into cells 3 cols save the excel file
//		 */
//		// creating workbook
//
//		try {
//
//			XSSFWorkbook workbook = new XSSFWorkbook();
//			XSSFSheet spreadsheet = workbook.createSheet("Name in list");
//			XSSFRow row;
//			int rowid = 0;
//			int columnid = 0;
//	   //for (int k = 0; k < obj.length; k++) {
//			
//      for (String s : obj) {
//				if (rowid < 4) {
//					row = spreadsheet.createRow(rowid);
//					columnid =0;
//				}
//					
//						if (columnid < 3 ) {
//
//							Cell cell = row.createCell(columnid);
//							columnid++;
//							cell.setCellValue(s);
//						}
//						
//			       	}
//                 
//
//			OutputStream fileOut = new FileOutputStream("D:\\Vivekapis\\First.xlsx");
//			System.out.println("created the file");
//
//			workbook.write(fileOut);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//}
//
//
//}

public class SecondPractice {

	public static void main(String arg[]) throws Exception {
		List<String> ls = new ArrayList<>();
		ls.add("aaa");
		ls.add("bbb");
		ls.add("ccc");  
		ls.add("ddd");
		ls.add("eee");
		ls.add("fff");
		ls.add("ggg");

		String[] list = new String[ls.size()];
		for (int i = 0; i < ls.size(); i++) {
			list[i] = ls.get(i);
		}

		int rowcount = 0;
		int columncount = 0;
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet spreadsheet = wb.createSheet("Name in list");
		XSSFRow row;
		for (String s : ls) {

			if (rowcount < 6 ) {
				row = spreadsheet.createRow(rowcount);
								
				while (columncount < 3) {
					Cell cell = row.createCell(columncount);
					cell.setCellValue(s);
					System.out.print(s);
					columncount++;
					System.out.println(columncount);
				}
				rowcount++;
				System.out.println(rowcount +"             - ------------------------");
				columncount = 0;

			
			}
		}OutputStream fileOut = new FileOutputStream("D:\\Vivekapis\\First.xlsx");
			System.out.println("created the file");

			wb.write(fileOut);
		
	}

}