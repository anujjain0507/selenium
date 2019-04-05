package string_concept;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void duplicateWords(String inputString) {
		String[] words = inputString.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String word : words) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			} else {
				map.put(word, 1);
			}
		}

		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		for (Map.Entry<String,Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.printf("%d : %s %n",entry.getValue(),entry.getKey());
			}
		}
	}

	public static void main(String[] args) {

		duplicateWords("bread butter bread");

		duplicateWords("java java again java");

		duplicateWords("super bat man spider man");
	}
}
