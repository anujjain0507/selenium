package string_concept;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void duplicateWords(String inputString) {
		String [] words = inputString.split(" ");
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		for(String str : words) {
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}else {
				map.put(str, 1);
			}
		}
		Set<Map.Entry<String, Integer>>setEntry = map.entrySet();
		for(Map.Entry<String, Integer>entry : setEntry) {
			if(entry.getValue()>1) {
				System.out.printf("%d : %s %n", entry.getValue(),entry.getKey());
			}
		}
	}

	public static void main(String[] args) {

		duplicateWords("bread butter bread");

		duplicateWords("java java again java");

		duplicateWords("super bat man spider man");
	}
}
