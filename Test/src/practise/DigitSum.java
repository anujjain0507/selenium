package practise;

import java.util.Scanner;

public class DigitSum {

	public static void main(String [] args) {
		int n;
		int sum =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number: ");
		
		int number = sc.nextInt();
		
		while(number > 0) {
			n = number % 10;
			sum = sum + n;
			number = number / 10;
		}
		System.out.println("Sum of Digit : " + sum);
		sc.close();
	}

}
