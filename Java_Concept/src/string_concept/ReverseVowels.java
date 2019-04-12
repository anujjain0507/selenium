package string_concept;

public class ReverseVowels {
	public static boolean isVowel(char c) {
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U');
	}

	public static String reverseVowel(String str1) {
		int j = 0;
		// Storing the vowels separately 
		char[] str = str1.toCharArray();
		String vowel = "";
		for (int i = 0; i < str.length; i++) {
			if (isVowel(str[i])) {
				j++;
				vowel += str[i];
			}
		}
		
		// Placing the vowels in the reverse order in the string 
		
		for(int i = 0;i<str.length;i++) {
			if(isVowel(str[i])) {
				str[i] = vowel.charAt(--j);
			}
		}

		return String.valueOf(str);

	}

	public static void main(String[] args) {
		String str = "hello world"; 
        System.out.println(reverseVowel(str)); 

	}
	
}
