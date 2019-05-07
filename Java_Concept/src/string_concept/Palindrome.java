package string_concept;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String str = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to verify that word is palindrom or not?");
		String word = sc.nextLine();
		for (int i = word.length() - 1; i >= 0; i--) {
			str = str + word.charAt(i);
		}
		if(str.equals(word)) {
			System.out.println(word +" : is Palindrom");
		}else {
			System.out.println(word +" : is not Palindrom");
		}
	}

}
