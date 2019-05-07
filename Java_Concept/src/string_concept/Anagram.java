package string_concept;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter two String for verify that String is Anagram or not?");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		cheskforAnagram(str1, str2);
		sc.close();

	}

	public static void cheskforAnagram(String str1, String str2) {
		String firstString = str1.replaceAll("\\s", "");
		String secondString = str2.replaceAll("\\s", "");
		boolean status = true;

		if (firstString.length() != secondString.length()) {
			status = false;
		} else {
			char[] firstStrArray = firstString.toCharArray();
			char[] secondStrArray = secondString.toCharArray();

			Arrays.sort(firstStrArray);
			Arrays.sort(secondStrArray);
			status = Arrays.equals(firstStrArray, secondStrArray);
		}
		if (status) {
			System.out.println(str1 + " and " + str2 + "---> Both string are Anagram");
		} else {
			System.out.println(str1 + " and " + str2 + "---> Both string are Not Anagram");
		}

	}

}
