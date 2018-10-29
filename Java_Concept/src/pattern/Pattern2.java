package pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern");
		int row = sc.nextInt();
		System.out.println("** printing the pattern **");
		for(int i = 0; i<= row;i++) {
			for(int j=1; j<= i;j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		for (int i=row;i>= 1;i--) {
			for(int j =1; j<i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

}
