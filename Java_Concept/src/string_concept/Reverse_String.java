package string_concept;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reverse_String {
	
	public static void main(String[] args)  throws Exception{
		
		//First way to revese String
		String input = "";
		System.out.println("Please enter the String");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//create the object of StringBuffer class and stringbuffer is mutable class
		input = br.readLine();
		char[] Reverse = input.toCharArray();
		for (int i = Reverse.length-1; i >=0 ; i--) {
			System.out.print(Reverse[i]);
		}
	
		//Second Way to revese String
		
		/*String str = "Selenium";
		String rev ="";//string is immutable class
		int len = str.length();
		for(int i = len-1; i>=0 ;i--) {
			rev = rev+str.charAt(i);//appended the char convert with rev
		}
		System.out.println(rev);*/
		}

}
