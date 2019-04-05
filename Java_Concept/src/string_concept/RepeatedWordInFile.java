package string_concept;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWordInFile {

	public static void main(String[] args) {
		
			HashMap<String, Integer> wordmap = new HashMap<String,Integer>();
			BufferedReader reader = null;
			try {
			reader = new BufferedReader(new FileReader("C:\\Users\\jain.anuj\\Desktop\\test.txt"));
			String currentLine = reader.readLine();
			while(currentLine != null) {
				String[] words = currentLine.split(" ");
				for(String word : words) {
					if(wordmap.containsKey(word)) {
						wordmap.put(word, wordmap.get(word)+1);
					}else {
						wordmap.put(word, 1);
					}
				}
				currentLine = reader.readLine();
			}
			
			String mostRepeatedword = null;
			int count = 0;
			
			Set<Entry<String, Integer>>setEntry = wordmap.entrySet();
			for(Entry<String, Integer>entry : setEntry) {
				if(entry.getValue()>count) {
					mostRepeatedword = entry.getKey();
					count = entry.getValue();
				}
			}
			System.out.println("The most repeated word in input file is : "+mostRepeatedword);
            System.out.println("Number Of Occurrences : "+count);
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
