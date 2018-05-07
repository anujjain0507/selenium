package practise;

public class StringToCharExample1 {

	public static void main(String[] args) {
		String str = "ANUJ JAIN";
		
//		converting String to char in java.
		/*char c = str.charAt(0);
		System.out.println(c);*/
		
//		convert all characters of a string into character.
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.println("Char at "+ i + " Index is " +c);
		}

	}

}
