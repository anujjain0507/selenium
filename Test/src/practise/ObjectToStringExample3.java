package practise;

public class ObjectToStringExample3 {

	public static void main(String[] args) {
		String str = "radar";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String rev = sb.toString();
		if (str.equals(rev)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}

	}

}
