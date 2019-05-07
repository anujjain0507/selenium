package string_concept;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class DuplicateCharacter {
	public static void main(String args[]) {
		repetedCharacter("automation");
	}

	public static void repetedCharacter(String word) {
		char[] character = word.toCharArray();
		Map<Character, Integer>map = new HashMap<Character,Integer>();
		for(char ch : character) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		Set<Map.Entry<Character, Integer>>SetEntry = map.entrySet();
		for(Map.Entry<Character, Integer>entry:SetEntry) {
			if(entry.getValue()>1) {
				System.out.printf("%d : %s %n", entry.getValue(),entry.getKey());
			}
		}
	}
}
