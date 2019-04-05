package string_concept;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two string");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();
		cheskforAnagram(str1, str2);

	}

	public static void cheskforAnagram(String str1, String str2) {
		String firstString = str1.replace("\\s", "");
		String SecondString = str2.replace("\\s", "");
		boolean status = true;

		if (firstString.length() != SecondString.length()) {
			status = false;
		} else {
			char[] firststrArr = str1.toCharArray();
			char[] secondstrArr = str2.toCharArray();

			Arrays.sort(firststrArr);
			Arrays.sort(secondstrArr);
			status = Arrays.equals(firststrArr, secondstrArr);
		}
		if (status) {
			System.out.println(str1 +" and "+ str2 + "---> Both string are Anagram");
		} else {
			System.out.println(str1 +" and "+ str2 +"---> Both string are Not Anagram");
		}
	}

}
