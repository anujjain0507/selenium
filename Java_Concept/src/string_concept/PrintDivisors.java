package string_concept;

import java.util.Scanner;

public class PrintDivisors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any Number");
		int num = sc.nextInt();
		for (int i=1;i<=num;i++) 
            if (num%i==0) 
                System.out.printf(" %d ", i); 

	}

}
