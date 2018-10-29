package practise;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int reverse = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Number");
		
		int num = sc.nextInt();
		
		while(num>0) {
			reverse= reverse * 10;
			reverse = reverse + num % 10;
			num = num / 10;
		}
		System.out.println(reverse);
		sc.close();

	}

}
