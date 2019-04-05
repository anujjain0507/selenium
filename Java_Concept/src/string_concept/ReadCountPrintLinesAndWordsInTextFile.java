package string_concept;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCountPrintLinesAndWordsInTextFile {

	public static void main(String[] args) throws IOException {
		countAndPrintLineWord("C:\\Users\\jain.anuj\\Desktop\\Java_Pattern.docx");
	}
	
	public static void countAndPrintLineWord(String filename) throws IOException{
		String line ="";
		int linecount = 0;
		int wordCount = 0;
		BufferedReader br = new BufferedReader(new FileReader(filename));
		while((line = br.readLine())!= null) {
			linecount++;
			String[] words = line.split(" ");
			wordCount += words.length;
		}
		System.out.println("Number of lines is : " +linecount);
		System.out.println("Number of words is : " +wordCount);
	}

}
