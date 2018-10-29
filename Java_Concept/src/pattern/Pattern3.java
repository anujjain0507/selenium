package pattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = sc.nextInt();
		while (num > 0) {
			sum = (num % 10) + sum;
			num = num / 10;
		}
		System.out.println("count of the number: " + sum);
		sc.close();
	}
}
