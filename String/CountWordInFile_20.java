package String;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWordInFile_20 {

	public static void main(String[] args) throws IOException {
		
		String line;
		int count=0;
		
		FileReader file = new FileReader("data.txt");
		BufferedReader br = new BufferedReader(file);
		
		while((line = br.readLine()) != null) {
			String words[] = line.split(" ");
			count += words.length;
		}
		System.out.println("Number of words present in given file: " + count);  
	    br.close();
	}

}
