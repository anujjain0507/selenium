package string_concept;

public class IndexWithinTheString {

	public static void main(String[] args) {
		String str = "Anuj Jain";
		System.out.println("Original String = " + str);
		String str1 = str.replace(" ", "");
		System.out.println("New String = " + str1);
		int index =str.charAt(0);
		int index1 = str.charAt(4);
		System.out.println("The character at position 0 is " +  (char)index);
		System.out.println("The character at position 4 is " +  (char)index1);

	}

}
