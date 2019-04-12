package string_concept;

import java.util.Scanner;

public class FrequencyCharacter {
	
	public static void freq() {
		int Frequency =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine().toLowerCase();
		System.out.println("Enter the Character");
		char c = sc.next().charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				Frequency = Frequency + 1;
			}
		}
		System.out.println("Frequency of " + c + " is : " + Frequency);

	}

	public static void main(String[] args) {
		freq();

	}

}
