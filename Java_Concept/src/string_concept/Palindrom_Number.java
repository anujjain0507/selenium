package string_concept;

import java.util.Scanner;

public class Palindrom_Number {

	public static void main(String[] args) {
		int rev = 0;int originalNum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = sc.nextInt();
		originalNum = num;
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num / 10;
		}
		if(originalNum == rev) {
			System.out.println(rev + " is Palindrom");
		}else {
			System.out.println(rev + " is not Palindrom");
		}
		
	}
		

}
