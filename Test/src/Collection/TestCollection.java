package Collection;

import java.util.ArrayList;
import java.util.Iterator;



public class TestCollection {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();//creating ArrayList
		list.add("Ravi");
		list.add("Anuj");
		list.add("amit");
		list.add("Akash");
		
//		by Iterator	
		Iterator itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
//		by For each loop
		for (String list1 : list) {
			System.out.println(list1);
		}

	}

}
