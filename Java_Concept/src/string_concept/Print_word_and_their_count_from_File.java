package string_concept;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;




public class Print_word_and_their_count_from_File {

	public static void main(String[] args) throws FileNotFoundException {
		
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
		
		Scanner sc = new Scanner(new File ("D:\\Test.txt"));
		
		while(sc.hasNext()) {
			String word = sc.next();
			if(wordMap.containsKey(word)) {
				int count = wordMap.get(word) + 1;
				wordMap.put(word, count);
			}
			else {
				wordMap.put(word, 1);
			}
		}
		sc.close();
		
		
		for(Map.Entry<String, Integer> entry : wordMap.entrySet()) {
			System.out.println(entry);
		}
		

	}

}
