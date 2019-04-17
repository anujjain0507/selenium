/*Recursion is a basic programming technique you can use in Java, 
in which a method calls itself to solve some problem. A method that uses this technique is recursive. 
Many programming problems can be solved only by recursion, 
and some problems that can be solved by other techniques are better solved by recursion.
*/
package string_concept;

import java.util.Scanner;

public class Fibonacci_series_Using_Recursion {

	public static int FibonacciSeries(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return FibonacciSeries(n - 1) + FibonacciSeries(n - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of fibbonacci Series");
		int length = sc.nextInt();
		if (length <= 0) {
			System.out.println("Please enter the valid length");
		} else {
			System.out.printf("Fibonacci serires of length " + FibonacciSeries(length) + " is below: \n");
			for(int i = 1;i<=length;i++) {
				System.out.print(FibonacciSeries(i-1)+ " , ");
			}
		}

	}

}
