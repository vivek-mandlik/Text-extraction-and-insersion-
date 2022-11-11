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
		// create a new file
		File f = new File("D:\\Vivekapis\\notepadfile1.txt");
		f.createNewFile();
		// print in new file
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the doc to be loaded in notepad file");
		String doc = sc.nextLine();
		System.out.println(doc);
		BufferedWriter fo = new BufferedWriter(new FileWriter(f));
		for (int i = 0; i < doc.length(); i++) {
			fo.write(doc.charAt(i));

		}
		System.out.println("Data inserted in file.... ");
		fo.close();

	}

}
