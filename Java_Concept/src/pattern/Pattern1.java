/*
** printing the pattern...*

1 
0 1 
0 0 1 
0 0 0 1 
0 0 0 0 1 

*/
package pattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern");
		int row = sc.nextInt();
		System.out.println("** printing the pattern...*");
		for(int i = 0; i <= row; i++) {
			for(int j = 1; j <= i; j++) {
//				System.out.print(((i+j)%2) + " ");
			if(i==j) {
				System.out.print(1 + " ");
			}else {
				System.out.print(0 + " ");
			}
			
			}
			System.out.println();
		}
		sc.close();

	}

}
