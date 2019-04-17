package string_concept;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num1 = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num1 * i);
		}
	}

}
