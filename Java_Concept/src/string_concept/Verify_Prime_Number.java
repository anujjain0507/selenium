package string_concept;

import java.util.Scanner;

public class Verify_Prime_Number {

	public static void main(String[] args) {
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Number to Verify for Prime or not");
		int num = sc.nextInt();
		int m = num/2;
		if(num==0 ||num==1) {
			System.out.println("Number is not Prime");
		}
		else {
			for (int i= 2;i<=m;i++) {
				if(num%i==0) {
					System.out.println("Number is not Prime");
					flag=1;
					break;
				}
				}
			if(flag==0) {
				System.out.println("Number is Prime");
			}
		}
		
	}

}
