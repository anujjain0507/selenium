package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArraList {

	public static void main(String[] args) {
		ArraytoArrayListConversion();
		ArrayListToArrayConversion();

	}
	
	public static void ArraytoArrayListConversion() {
		String []str  = {"Anuj","Jain","Amit"};
		List al = Arrays.asList(str);
		System.out.println(al);
	}
	public static void ArrayListToArrayConversion() {
		List<String> list  = new ArrayList<String>();
		list.add("Anuj");
		list.add("Jain");
		list.add("Ashish");
		list.add("Amit");
		
		Object[] objects = list.toArray();
		
		for(Object obj: objects ) {
			System.out.print(obj+ " ");
		} 
	}

}
