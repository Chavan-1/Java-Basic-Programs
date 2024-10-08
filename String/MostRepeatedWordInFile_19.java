package String;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//most repeated word present in given text file
/*This can be done by opening a file in read mode using file pointer. 
 * Read the file line by line. Split a line at a time and store in an array. 
 * Iterate through the array and find the frequency of each word and compare the frequency with maxcount. 
 * If frequency is greater than maxcount then store the frequency in maxcount and corresponding word that in variable word. 
 * The content of data.txt file used in the program is shown below.
 * 
 * */
public class MostRepeatedWordInFile_19 {

	public static void main(String[] args) throws IOException {
		
		String line, word="";
		int count=0, maxCount=0;
		ArrayList<String> words = new ArrayList<String>();
		
		//Opens file in read mode    
		FileReader file = new FileReader("/data.txt");
		BufferedReader br = new BufferedReader(file);
		
		 //Reads each line
		while((line = br.readLine()) != null) {
			String string[] = line.toLowerCase().split("([,.\\s]+)");
			
			//Adding all words generated in previous step into words    
			for(String s: string)
				words.add(s);
		}
		
		//Determine the most repeated word in a file   
		for(int i=0; i<words.size(); i++) {
			count=1;
			for(int j=i+1; j<words.size(); i++) {
				if(words.get(i).equals(words.get(j))){
					count++;
				}
			}
			
			 //If maxCount is less than count then store value of count in maxCount     
            //and corresponding word to variable word 
			if(count > maxCount) {
				maxCount = count;
				word = words.get(i);
			}
		}
		System.out.println("Most repeated word: "+word);
		br.close();

	}

}
