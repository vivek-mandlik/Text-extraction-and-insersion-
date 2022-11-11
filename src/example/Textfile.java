package example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Textfile {

	public static void main(String[] args) throws IOException {
		Textfile tx = new Textfile();

		// how to store text doc in note pad 15 min
		//create a new file
		File f = new File("D:\\Vivekapis\\notepadfile1.txt");
		f.createNewFile();
		//print in new file
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the doc to be loaded in notepad file");
		String doc =sc.nextLine();
		System.out.println(doc);
		BufferedWriter fo = new BufferedWriter(new FileWriter(f));
		for (int i = 0; i < doc.length(); i++) {
			fo.write(doc.charAt(i));
			System.out.println("writing in file.... ");

		}
		fo.close();
//		FileWriter fw = new FileWriter();
//		PrintWriter pw = new PrintWriter(fw);
//		pw.println(args[0]);
//		pw.flush();
//		try {
//			fw.flush();
//			pw.close();
//			fw.close();
//		}
//		catch(Exception e){
//	         e.printStackTrace();
//	     }

		// how to retrive content from notepad 15min
		// how to store content in text doc 15 min

	}

}
