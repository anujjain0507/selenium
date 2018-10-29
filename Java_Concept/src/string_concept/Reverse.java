package string_concept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Reverse {
	public static int sum =0;
	public static int reverse =0;
	public static void reverseString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the String");
		String Rev = sc.nextLine();
		char[] newRev = Rev.toCharArray();
		for(int i =newRev.length-1;i>=0;i--) {
			System.out.print(newRev[i]);
		}
		sc.close();
	}
	
	public static void reverseInterger() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the Number: ");
		int number = sc.nextInt();
		while(number>0){
			reverse = reverse*10;	
			reverse=reverse+number%10;
			number = number/10;
		}
		System.out.println("The Reverse Number is: "+reverse);
		sc.close();
	}
	
	public static void reverseArray() {
		int arr [] = {10,52,68,48,14,20};
		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for(int i = 0; i < arr.length / 2;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1]= temp;
		}
		System.out.println("Array after revese");
		for(int i =0; i<arr.length;i++ ) {
			System.out.print(arr[i] + " ");
		}
		}
	
	public static void Reverse_Paragraph() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the Paragraph");
		String str = br.readLine();
		String[] sentence = str.split(" ");
		for(int i=sentence.length-1;i>=0;i--) {
			System.out.print(sentence[i]+ " ");
		}
	}
	public static void NumberSwap() {
		int a = 15;
		int b = 10;
		System.out.println("Before Swapping value of " +a + " & " +b );
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping value of " +a + " & " +b );
	}
	
	public static void addNumber() {
		int number ;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the Number: ");
		number = sc.nextInt();
		while(number>0){
			int n =  number%10;
			sum = sum+n;
			number = number/10;
		}
		System.out.println("Sum of the all digit is : "+sum);
		sc.close();
	}
	public static void main(String[] args) throws IOException {
//		reverseString();
//		reverseInterger();
//		reverseArray();
//		NumberSwap();
//		addNumber();
		Reverse_Paragraph();
		
		

	}

}
