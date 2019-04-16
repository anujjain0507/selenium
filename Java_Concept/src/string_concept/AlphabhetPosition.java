package string_concept;

import java.util.Scanner;

public class AlphabhetPosition {
	
	

	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		char[] ch  = str.toCharArray();
		for(char c : ch)
		{
		int temp = (int)c;
		int temp_integer = 96; //for lower case
		if(temp<=122 & temp>=97)
		System.out.print(temp-temp_integer+ " ");
			
		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter the letter : ");
//		char letter = sc.next().charAt(0);
//		
//		char inputLetter = Character.toLowerCase(letter);
//		
//		int asciivalue = (int)letter;
//		
//		int position = asciivalue-96;
//		
//		System.out.println(position);

	}

}
