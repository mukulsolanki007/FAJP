package JavaProgramsSDET;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {
	public static void main(String[] args) throws IOException {
		
		//Logic 1 --> Using FileReader with BufferReader
		/*
		FileReader fr= new FileReader("D:\\SOFTWARE TESTING\\SDET\\Frequently Asked Java Program\\TextFileReader.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		String str;
		
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();
		*/
		
		//Logic 2
		/*
		File file = new File("D:\\SOFTWARE TESTING\\SDET\\Frequently Asked Java Program\\TextFileReader.txt");
		
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		*/
		
		//Logic 3
		
		File file = new File("D:\\SOFTWARE TESTING\\SDET\\Frequently Asked Java Program\\TextFileReader.txt");
		
		Scanner sc = new Scanner(file);
		
		sc.useDelimiter("\\Z");
		
		System.out.println(sc.next());
		
	}

}
