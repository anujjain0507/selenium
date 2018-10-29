package string_concept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse_Para {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the sentence");
		String sentence = br.readLine();
		String [] str = sentence.split(" ");
		for(int i=str.length-1; i>=0;i--) {
			System.out.print(str[i]+ " ");
		}

	}

}
