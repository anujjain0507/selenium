package array_Concept;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharacterOccurance {

	public static void main(String[] args) {
		printDuplicateCharacters("Programming");
		printDuplicateCharacters("Combination");
		printDuplicateCharacters("Java");

	}

	public static void printDuplicateCharacters(String word) {
		char[] charaters = word.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character ch : charaters) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.printf("List of the duplicate character in string '%s' %n", word);
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
		}
	}

}
