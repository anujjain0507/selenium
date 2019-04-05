package string_concept;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate_Element {

	public static void main(String[] args) {

		String[] names = { "Java", "Ruby", "Java", "Python", "Ruby", "C#", ".Net" };
		 Set<String> store = new HashSet<String>();
		 for (String name : names) {
		 if (store.add(name) == false) {
		 System.out.println("Duplicate Element is : " + name);
		 }
		 }
		 
		System.out.println("********************************************");
		
		Map<String, Integer> Storemap = new HashMap<String, Integer>();
		for (String name : names) {
			Integer count = Storemap.get(name);
			if (count == null) {
				Storemap.put(name, 1);
			} else {
				Storemap.put(name, ++count);
			}
		}

		// get value from this HashMap

		Set<Entry<String, Integer>> entryset = Storemap.entrySet();
		for (Entry<String, Integer> entry : entryset) {
			if (entry.getValue() > 1)
			{
				System.out.println("Duplicate element is " + entry.getKey());
			}
		}
	}
}
