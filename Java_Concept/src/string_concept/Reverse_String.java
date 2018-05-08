package string_concept;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reverse_String {
	
	public static void main(String[] args)  throws Exception{
		String input = "";
		System.out.println("Please enter the String");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = br.readLine();
		char[] Reverse = input.toCharArray();
		for (int i = Reverse.length-1; i >=0 ; i--) {
			System.out.print(Reverse[i]);
		}
		
		
//		String s="dfdsljfkdsAniketdfhfjkhdksj";  
//		System.out.println(s.substring(10,16));
	
	}

}
