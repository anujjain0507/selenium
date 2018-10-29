package practise;

import java.util.Scanner;

public class CaptalisedFirstWord {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Please enter the Sentance:");
		
		String str = sc.nextLine();
		
		String Uppar_case = "";
		Scanner lineScan = new Scanner(str);
		while(lineScan.hasNext()) {
			String word = lineScan.next();
			
			Uppar_case += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}
		System.out.println(Uppar_case.trim());

	}

}
