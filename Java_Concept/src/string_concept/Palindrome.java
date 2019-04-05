package string_concept;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String str2= "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter word to verify that word is palindrome or not");
		String str = sc.nextLine();
//		char[] word = str.toCharArray();
		for (int i = str.length()-1;i>= 0;i--) {
//			System.out.print(word[i]);
			str2 = str2 + str.charAt(i);
//			System.out.println();
		}
		if(str2.equals(str)) {
			System.out.println("Is a palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}

}
