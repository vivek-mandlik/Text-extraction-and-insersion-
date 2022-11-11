package example;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practicefile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> ls = new ArrayList<>();

		ls.add("Vivek");
		ls.add("Shubham");
		ls.add("Tas");
		ls.add("Akk");
		ls.add("ZZ");
		ls.add("es");
		ls.add("asd");
		ls.add("jhgfd");
		ls.add("qwdf");
		ls.add("lkjhgf");
		ls.add("mhtr");

		String obj[] = new String[ls.size()];
		for (int i = 0; i < ls.size(); i++) {
			obj[i] = ls.get(i);
		}

//		for (int j = 0; j < obj.length; j++) {
//			System.out.println(obj[j]);
//		}

		/*
		 * create wb create sheet enter data into cells 3 cols save the excel file
		 */
		// creating workbook

		try {

			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet spreadsheet = workbook.createSheet("Name in list");
			XSSFRow row;
			int rowid = 0;
			int columnid = 0;
			if (rowid < 4) {

				row = spreadsheet.createRow(rowid);
				if (columnid < 3) {

					for (int k = 0; k < obj.length; k++) {

						for (String s : obj) {

							Cell cell = row.createCell(columnid);
							cell.setCellValue(s);
							columnid++;
							System.out.print(columnid);
						}
					}

				} else {
					rowid++;
					columnid = 0;
				}
			}

			OutputStream fileOut = new FileOutputStream("D:\\Vivekapis\\First.xlsx");
			System.out.println("created the file");

			workbook.write(fileOut);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//	 for (String s : ls) {
//		while (columncount < 3) {
//
//			Cell cell = row.createCell(columncount);
//			cell.setCellValue(s);
//			System.out.print(s);
//			columncount++;
//			System.out.println(columncount);
//		}
//	}

}
