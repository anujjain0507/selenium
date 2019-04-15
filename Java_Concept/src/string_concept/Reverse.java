package string_concept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Reverse {
	public static int sum = 0;
	public static int reverse = 0;

	public static void reverseString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String");
		String rev = sc.nextLine();
		char[] newRev = rev.toCharArray();
		for (int i = newRev.length - 1; i >= 0; i--) {
			System.out.print(newRev[i] + "");
		}
		sc.close();
	}

	public static void Reverse_ForLoop() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		System.out.println("Reverse of a String '" + str + "' is :");
		for (int i = str.length(); i > 0; --i) {
			System.out.print(str.charAt(i - 1));
		}
		sc.close();
	}

	public static void reverseInterger() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the Number: ");
		int number = sc.nextInt();
		while (number > 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		System.out.println("The Reverse Number is: " + reverse);
		sc.close();
	}

	public static void reverseArray() {
		int arr[] = { 10, 52, 68, 48, 14 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		System.out.println("Array after revese");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Reverse_Paragraph() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the paragraph");
		String str = br.readLine();
		String[] sentence = str.split(" ");
		for (int i = sentence.length - 1; i >= 0; i--) {
			System.out.print(sentence[i] + " ");
		}
	}

	public static void NumberSwap() {
		int a = 15;
		int b = 10;
		System.out.println("Before Swapping value of " + a + " & " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping value of " + a + " & " + b);
	}

	public static void addNumber() {
		int number;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the Number: ");
		number = sc.nextInt();
		while (number > 0) {
			int n = number % 10;
			sum = sum + n;
			number = number / 10;
		}
		System.out.println("Sum of the all digit is : " + sum);
		sc.close();
	}

	public static void Duplicate_Number_In_Array() {
		int[] num = { 1, 2, 4, 3, 5, 8, 9, 5, 43, 7, 7 };
		for (int i = 0; i < num.length; i++) {
			// System.out.print(num[i]+ " ");
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println("The duplicate number is : " + num[j]);
				}
			}
		}
	}

	public static void reverseStringWithPreserveSpace(String inputString) {
		char[] str = inputString.toCharArray();
		char[] result = new char[str.length];

		for (int i = 0; i < str.length; i++) {
			if (str[i] == ' ') {
				result[i] = ' ';
			}
		}
		int j = result.length - 1;
		for (int i = 0; i < str.length; i++) {
			if (str[i] != ' ') {
				if (result[j] == ' ') {
					j--;
				}
				result[j] = str[i];
				j--;
			}
		}
		System.out.println(inputString + " ---> " + String.valueOf(result));
	}

	public static void characterPercentage(String input) {
		int totalchars = input.length();
		int uppercase = 0;
		int lowercase = 0;
		int number = 0;
		int other = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				uppercase++;
			} else if (Character.isLowerCase(ch)) {
				lowercase++;
			} else if (Character.isDigit(ch)) {
				number++;
			} else {
				other++;
			}
		}
		double upperCaseLatterPercentage = (uppercase * 100.0) / totalchars;
		double lowerCaseLatterPercentage = (lowercase * 100.0) / totalchars;
		double digitPercentage = (number * 100.0) / totalchars;
		double otherPercentage = (other * 100.0) / totalchars;
		DecimalFormat format = new DecimalFormat("##.##");
		System.out.println("In '" + input + "' : ");
		System.out.println("Uppercase letters are " + format.format(upperCaseLatterPercentage) + "% ");
		System.out.println("Lowercase letters are " + format.format(lowerCaseLatterPercentage) + "%");
		System.out.println("Digits Are " + format.format(digitPercentage) + "%");
		System.out.println("Other Characters Are " + format.format(otherPercentage) + "%");
		System.out.println("-----------------------------");
	}

	public static void ReverseEachWord(String input) {
		String[] words = input.split(" ");
		String ReverseString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String ReverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				ReverseWord = ReverseWord + word.charAt(j);
			}
			ReverseString = ReverseString + ReverseWord + " ";
		}
		System.out.println(ReverseString);
	}

	public static void SortingAlphabet() {
		String mystr = "Program";
		char temp;
		System.out.println("The Input String is :" + mystr);
		String str = mystr.toLowerCase();
		char[] charstr = str.toCharArray();
		int length = charstr.length;
		for (int i = 1; i < length; i++) {
			for (int j = 0; j < length - i; j++) {
				if (charstr[j] > charstr[j + 1]) {
					temp = charstr[j];
					charstr[j] = charstr[j + 1];
					charstr[j + 1] = temp;
				}
			}
		}
		System.out.println(charstr);
	}

	public static void Total_Number_of_the_three_digit_number() {

		int amount = 0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 4; k++) {
					if (k != i && k != j && i != j) {
						amount++;
						System.out.println(i + " " + j + " " + k);
					}
				}
			}
		}
		System.out.println("Total number of three digit is " + amount);
	}

	public static void OddNumber() {
		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void CountNumberSpaceChar() {
		String str = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		char[] ch = str.toCharArray();

		int letter = 0;
		int num = 0;
		int space = 0;
		int other = 0;

		for (int i = 0; i < ch.length; i++) {

			if (Character.isLetter(ch[i])) {
				letter++;
			} else if (Character.isDigit(ch[i])) {
				num++;
			} else if (Character.isSpaceChar(ch[i])) {
				space++;
			} else {
				other++;
			}
		}
		System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);
	}

	public static void CaptalisedFirstWord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Sentance:");
		String str = sc.nextLine();
		String Uppar_case = "";
		Scanner lineScan = new Scanner(str);
		while (lineScan.hasNext()) {
			String word = lineScan.next();
			Uppar_case += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}
		System.out.println(Uppar_case.trim());
		sc.close();
		lineScan.close();
	}

	public static void Factorial() {
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Number");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
		sc.close();
	}

	public static void Characterfrequency() {
		int freq = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine().toLowerCase();
		System.out.println("Enter the Character ");
		char c = sc.next().charAt(0);
		for(int i = 0;i<str.length();i++) {
			if(c==str.charAt(i)) {
				freq = freq+1;
			}
		}
		System.out.println("Frequency of " + c + " is : " + freq);
		sc.close();
	}

	public static void main(String[] args) throws IOException {

//		 reverseString();
//		 Reverse_ForLoop();
//		 reverseInterger();
//		 reverseArray();
//		 Reverse_Paragraph();
//		 NumberSwap();
//		 addNumber();
//		 Duplicate_Number_In_Array();
//		 reverseStringWithPreserveSpace("I am not String");
//		 characterPercentage("Tiger Runs @ The Speed Of 100 km/hour.");
//		 ReverseEachWord("my name is anuj");
//		 SortingAlphabet();
//		 Total_Number_of_the_three_digit_number();
//		 OddNumber();
//		 CountNumberSpaceChar();
		 CaptalisedFirstWord();
//		 Factorial();
//		Characterfrequency();

	}
}
