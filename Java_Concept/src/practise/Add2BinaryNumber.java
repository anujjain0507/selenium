package practise;

import java.util.Scanner;

public class Add2BinaryNumber {

	public static void main(String[] args) {
		
		long Binary1;
		long Binary2;
		int i=0;
		int remainder = 0;
		int[] sum = new int [20];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first number");
		Binary1 = sc.nextLong();
		
		System.out.println("Please enter the second binary");
		Binary2 = sc.nextLong();
		
		while(Binary1 != 0 || Binary2 != 0) {
			sum[i++] = (int)((Binary1 % 10 + Binary2 % 10 + remainder) % 2);
			remainder =(int)((Binary1 % 10 + Binary2 % 10 + remainder)/2);
			Binary1= Binary1/10;
			Binary2= Binary2/10;
		}
		
		if (remainder != 0) {
			sum[i++]= remainder;
		}
		--i;
		System.out.print("Sum of the Two Binary Number : ");
		while(i>= 0) {
			System.out.print(sum[i--]);
		}
		System.out.print("\n");
		sc.close();
	}

}
