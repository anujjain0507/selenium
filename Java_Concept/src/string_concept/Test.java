package string_concept;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String str = "Datamatics Global Services";
		String[] words = str.split(" ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Number");
		int a = sc.nextInt();
		if (a >= 0 && a < words.length) {

			for (int i = a; i < words.length; i++) {
				System.out.print(words[i] + " ");
			}

			for (int j = 0; j < a; j++) {
				System.out.print(words[j] + " ");
			}
		} else {
			System.out.println("Please enter the Valid Index Number");
		}

	}
}
