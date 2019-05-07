package string_concept;

import java.util.Scanner;

public class FrequencyCharacter {
	
	public static void freq() {
		int Frequency=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word");
		String str = sc.nextLine().toLowerCase();
		System.out.println("Enter the charcter");
		char word = sc.next().charAt(0);
		for(int i = 0;i<str.length();i++) {
			if(word==str.charAt(i)) {
				Frequency = Frequency + 1;
			}
		}
		System.out.println("The count of " +word +"is : "+Frequency);
	}

	public static void main(String[] args) {
		freq();

	}

}
