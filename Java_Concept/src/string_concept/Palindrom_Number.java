package string_concept;

import java.util.Scanner;

public class Palindrom_Number {

	public static void main(String[] args) {
		int reverse = 0;
		int original_Number = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number for varified the palindrom");
		int number = sc.nextInt();
		original_Number = number;
		while (number != 0) {
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}
		if(original_Number==reverse) {
			System.out.println(reverse +" : is Palindrome" );
		}else {
			System.out.println(reverse + " : is not Palindrome");
		}
	}

}
