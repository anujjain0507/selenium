package string_concept;

import java.util.Scanner;

public class JavaSortNamesInAscendingOrder {

	public static void main(String[] args) {
		String temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of name");
		int num = sc.nextInt();
		sc.nextLine();

		String[] names = new String[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter name [" + (i + 1) + " ]: ");
			names[i] = sc.nextLine();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if (names[j - 1].compareTo(names[j]) > 0) {
					temp = names[j - 1];
					names[j - 1] = names[j];
					names[j] = temp;
				}
			}
		}
		for (int i = 0; i < num; i++) {
			System.out.println(names[i]);
		}
	}

}
