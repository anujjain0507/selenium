package string_concept;

public class StringLengthWithoutFunction {

	public static void main(String[] args) {
		String str= "Malayalam";
		char[] words = str.toCharArray();
		int i =0;
		for( char word : words) {
			i++;
		}
		System.out.println("Length of the string--->" +i);
		

	}

}
