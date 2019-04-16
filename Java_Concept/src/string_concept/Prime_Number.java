package string_concept;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N:");
		int num = sc.nextInt();

		for (int i = 2; i <= num; i++) {
			if(PrimeNumber(i)==true) {
				System.out.print(i + " ");
			}

		}

	}

	public static boolean PrimeNumber(int num) {
		boolean flag = true;
		for (int i = 2; i <=( num / 2); i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;

	}

}
