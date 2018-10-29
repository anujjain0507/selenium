package string_concept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicateCharacter {
	public static void main(String [] args) {
		RepeatedCharacter("Automation");
	}
	
	public static void RepeatedCharacter(String word) {
		char[] characters = word.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(Character ch : characters) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		Set<Map.Entry<Character,Integer>>setEntry = map.entrySet();
		for(Entry<Character,Integer>entry : setEntry) {
			if(entry.getValue()>1) {
				System.out.printf("%s : %d %n",entry.getKey(),entry.getValue());
			}
		}
	}
}
