package JavaProgramsSDET;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("D:\\SOFTWARE TESTING\\SDET\\Frequently Asked Java Program\\TextFileReader.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Selenium with Java\s");
		bw.write("Selenium with Python");
		
		System.out.println("Finishesd!!!!!");
		
		bw.close();
	}

}
