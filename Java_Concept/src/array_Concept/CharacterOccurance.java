package array_Concept;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharacterOccurance {

	public static void main(String[] args) {
		printDuplicateCharacters("automation");
		
	}

	public static void printDuplicateCharacters(String word) {
		char [] characters = word.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(char ch : characters) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> setEntry = map.entrySet();
		System.out.println("Repeated character in string :" +word );
		for(Map.Entry<Character, Integer> entry : setEntry) {
			if(entry.getValue()> 1) {
				System.out.printf("%s : %d %n",entry.getKey(),entry.getValue());
			}
		}
	}

}
